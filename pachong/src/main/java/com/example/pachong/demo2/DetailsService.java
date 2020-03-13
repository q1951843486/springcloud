package com.example.pachong.demo2;

import com.geccocrawler.gecco.GeccoEngine;

/**
 * @Description
 * @ClassName DetailsService
 * @Author Administrator
 * @date 2019.12.09 15:28
 */
public class DetailsService {
    public static void add(String url){
        GeccoEngine.create()
                //工程的包路径
                .classpath("com.example.pachong.demo2")
                //开始抓取的页面地址
                .start(url)
                //开启几个爬虫线程
                .thread(1)
                //单个爬虫每次抓取完一个请求后的间隔时间
                .interval(1)
                //使用pc端userAgent
                .mobile(false)
                //开始运行
                .run();



    }
}
