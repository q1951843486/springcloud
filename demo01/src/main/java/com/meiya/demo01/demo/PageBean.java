package com.meiya.demo01.demo;

import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.SpiderBean;
import lombok.Data;

/**
 * @Description
 * @ClassName PageBean
 * @Author Administrator
 * @date 2019.12.09 11:40
 */
@Data
public class PageBean implements SpiderBean {

    @Href
    @HtmlField(cssPath=" h4 > a")
    private String url;


    @Text
    @HtmlField(cssPath = " h4 > a")
    private String text;

}
