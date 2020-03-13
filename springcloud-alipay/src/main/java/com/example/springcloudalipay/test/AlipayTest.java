package com.example.springcloudalipay.test;

import com.arronlong.httpclientutil.HttpClientUtil;
import com.arronlong.httpclientutil.common.HttpConfig;
import com.arronlong.httpclientutil.exception.HttpProcessException;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @ClassName AlipayTest
 * @Author Administrator
 * @date 2019.12.30 14:51
 */
public class AlipayTest {



    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("name","ll");
        HttpConfig httpConfig= HttpConfig.custom().url("https://zixuephp.net/article-415.html").map(map);

        try {
            HttpClientUtil.post(httpConfig);
        } catch (HttpProcessException e) {
            e.printStackTrace();
        }

    }



}
