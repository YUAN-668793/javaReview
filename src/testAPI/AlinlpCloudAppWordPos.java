package testAPI;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
/*
 * 中文词性分析
 * 参数名	参数值
VA	谓词性形容词
VC	系动词，如：是
VE	存在性动词，如：有，没{有}，无
VV	其他动词
NR	专有名词
NT	时间名词
NN	其他名词
LC	方位词
PN	代词
DT	限定词
CD	基数词
OD	序列词
M	度量词
AD	副词
P	介词
CC	并列连接词
CS	从属连接词
DEC	“的”作为补语标记/名词化标记，如：吃的
DEG	“的”作为关联标记/所有格标记，如：淡淡的花香
DER	“得”，如：穿得好看
DEV	“地”，如：不断地提醒
AS	动词助词，仅包括：着，了，过，的
SP	句末助词，如：了，呢，吧，啊，呀，吗
ETC	“等”，“等等”
MSP	其他助词，如：所，以，来，而
IJ	感叹词，如：啊
ON	拟声词，如：哗啦啦，咯吱
LB	长“被”结构，如：他被我训了一顿
SB	短“被”结构，如：他被训了一顿
BA	把字结构，如：他把你骗了
JJ	其他名词修饰词
FW	外来词
PU	标点
 */
public class AlinlpCloudAppWordPos {
    public static void main( String[] args ) throws Exception {
        // serviceURL: https://dtplus-cn-shanghai.data.aliyuncs.com/{org_code}/nlp/api/WordPos/{Domain}
        String serviceURL = "https://dtplus-cn-shanghai.data.aliyuncs.com/dt_ng_1458611335470551/nlp/api/WordPos/general";
        String akID = "LTAIOsPXjatnH1zO";
        String akSecret = "XtXu5pRgZxNAVYoNwC1L8rSBAcM4Zu";
        // 填充请求body
        // String postBody = "{\"text\":\"习近平关注两岸局势\"}";
        JSONObject postBodyJson = new JSONObject();
        postBodyJson.put("text", "习近平关注两岸局势");
        // Sender代码参考 https://help.aliyun.com/document_detail/shujia/OCR/ocr-api/sender.html
        // String result = Sender.sendPost(serviceURL, postBody, akID, akSecret);
        AESDecode Sender = new AESDecode();
        String result = Sender.sendPost(serviceURL, postBodyJson.toJSONString(), akID, akSecret);
        System.out.println(result);
        try {
            JSONObject resultJson = JSON.parseObject(result);
            JSONArray wordObjs = resultJson.getObject("data", JSONArray.class);
            for(Object wordObj : wordObjs){
                JSONObject wordJson = JSON.parseObject(wordObj.toString());
                String pos = wordJson.getString("pos"); // 词性
                String word = wordJson.getString("word"); // 词
                System.out.printf("pos: %s, word: %s\n", pos, word);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
