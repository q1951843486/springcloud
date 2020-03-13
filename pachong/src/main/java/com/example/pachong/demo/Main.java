package com.example.pachong.demo;

import com.geccocrawler.gecco.GeccoEngine;

/**
 * @Description
 * @ClassName Main
 * @Author Administrator
 * @date 2019.12.09 10:50
 */
public class Main {

        public static void main(String [] rags){
            GeccoEngine.create()
                    //工程的包路径
                    .classpath("com.example.pachong.demo")
                    //开始抓取的页面地址
                    .start("http://sousuo.gov.cn/column/31421/0.htm")
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
