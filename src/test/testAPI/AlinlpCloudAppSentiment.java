package test.testAPI;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
/*
 * 情感分析 目前只适用于电商领域
 */
public class AlinlpCloudAppSentiment {
    public static void main( String[] args ) throws Exception {
        // serviceURL: https://dtplus-cn-shanghai.data.aliyuncs.com/{org_code}/nlp/api/Sentiment/{Domain}
    	//目前仅支持电商邻域

        // 填充请求body
//        String postBody = "{\n" +
//                 "    \"text\": \"虽然有点贵，不是很修身，但颜色很亮，布料摸起来挺舒服的，图案也好看，挺喜欢的。\",\n" +
//                 "  }";
        JSONObject postBodyJson = new JSONObject();
        // text: 要处理的文本
        postBodyJson.put("text", "虽然有点贵，不是很修身，但颜色很亮，布料摸起来挺舒服的，图案也好看，挺喜欢的。");
        // Sender代码参考 https://help.aliyun.com/document_detail/shujia/OCR/ocr-api/sender.html
        // String result = Sender.sendPost(serviceURL, postBody, akID, akSecret);
        AESDecode Sender = new AESDecode();
        String result = Sender.sendPost(serviceURL, postBodyJson.toJSONString(), akID, akSecret);
        System.out.println(result);
        try {
            JSONObject resultJson = JSON.parseObject(result);
            JSONObject dataObj = resultJson.getObject("data", JSONObject.class);
            String textPolarity = dataObj.getString("text_polarity");
            System.out.printf("text_polarity: %s\n", textPolarity);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
