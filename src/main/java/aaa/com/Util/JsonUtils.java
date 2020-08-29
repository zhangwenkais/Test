package aaa.com.Util;/*
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class JsonUtils {

    public static String prettyJson(String reqJson){
        JSONObject jsonObject = JSONObject.parseObject(reqJson);
        String preJson = JSON.toJSONString(jsonObject, SerializerFeature.PrettyFormat,SerializerFeature.WriteMapNullValue,SerializerFeature.WriteDateUseDateFormat);
        return preJson;
    }

}
