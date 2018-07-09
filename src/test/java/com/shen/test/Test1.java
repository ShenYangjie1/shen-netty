package com.shen.test;

import java.util.Properties;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import avro.shaded.com.google.common.annotations.VisibleForTesting;

public class Test1 {
    
    
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        System.out.println(-25&0xff);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("1", null);
        jsonObject.put("2", null);
        
        String jsonString = jsonObject.toJSONString(jsonObject, SerializerFeature.WriteMapNullValue);
        System.out.println(jsonString);
        
        
    }
    
    @Test
    public void Test(){
        
        System.out.println("Hello World");
        Properties props = new Properties();
        
        
    }

}
