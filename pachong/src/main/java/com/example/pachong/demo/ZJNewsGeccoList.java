package com.example.pachong.demo;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;

import java.util.List;

/**
 * @Description
 * @ClassName ZJNewsGeccoList
 * @Author Administrator
 * @date 2019.12.09 10:46
 */
@Data
@Gecco(matchUrl = "http://sousuo.gov.cn/{c}/{a}/{b}",pipelines = "zJNewsListPipelines")
public class ZJNewsGeccoList implements HtmlBean {


    private static final long serialVersionUID = 1L;

    @Request
    private HttpRequest request;

    @Href
    @HtmlField(cssPath =".listTxt > li")
    public List<PageBean> pagelist;




    @Href
    @HtmlField(cssPath = ".next")
    public String nextUrl;







}
