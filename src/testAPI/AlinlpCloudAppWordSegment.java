package testAPI;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
/*
 * 中文分词器
 */
public class AlinlpCloudAppWordSegment {
    public static void main( String[] args ) throws Exception {
        // serviceURL: https://dtplus-cn-shanghai.data.aliyuncs.com/{org_code}/nlp/api/WordSegment/{Domain}
        String serviceURL = "https://dtplus-cn-shanghai.data.aliyuncs.com/dt_ng_1458611335470551/nlp/api/WordSegment/general";
        String akID = "LTAIOsPXjatnH1zO";
        String akSecret = "XtXu5pRgZxNAVYoNwC1L8rSBAcM4Zu";
        // 填充请求body
        // String postBody = "{\"text\":\"社会主义核心价值观\"}";
        JSONObject postBodyJson = new JSONObject();
        postBodyJson.put("text", "社会主义核心价值观");
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
                Integer id = wordJson.getInteger("id"); // 分词编号
                String word = wordJson.getString("word"); // 词
                System.out.printf("id: %d, word: %s\n", id, word);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
