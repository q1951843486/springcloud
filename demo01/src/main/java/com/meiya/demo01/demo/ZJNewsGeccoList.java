package com.meiya.demo01.demo;

import com.geccocrawler.gecco.annotation.*;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.spider.HrefBean;
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
@Gecco(matchUrl = "http://sousuo.gov.cn/column/31421/0.htm",pipelines = "zJNewsListPipelines")
public class ZJNewsGeccoList implements HtmlBean {


    private static final long serialVersionUID = 1L;

    @Request
    private HttpRequest request;

    @Href
    @HtmlField(cssPath =".listTxt > li")

    public List<PageBean> pagelist;



}
