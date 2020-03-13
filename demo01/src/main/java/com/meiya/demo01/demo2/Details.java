package com.meiya.demo01.demo2;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;
import lombok.Data;

import java.util.List;

/**
 * @Description
 * @ClassName Details
 * @Author Administrator
 * @date 2019.12.09 13:40
 */
@Data
@Gecco(matchUrl = "http://www.gov.cn/xinwen/{data}/{year}/{page}.htm",pipelines = "detailPipeline")
public class Details implements HtmlBean {


    private static final long serialVersionUID = 11L;

    @Text
    @HtmlField(cssPath = "#UCAP-CONTENT > p")

    private List<String> text;

}
