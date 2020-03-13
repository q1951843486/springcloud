package com.meiya.demo01.demo;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.scheduler.SchedulerContext;
import com.geccocrawler.gecco.spider.HrefBean;
import com.meiya.demo01.demo2.DetailsService;

/**
 * @Description
 * @ClassName ZJNewsListPipelines
 * @Author Administrator
 * @date 2019.12.09 10:48
 */
@PipelineName("zJNewsListPipelines")
public class ZJNewsListPipelines implements Pipeline<ZJNewsGeccoList> {
    @Override
    public void process(ZJNewsGeccoList bean) {
        HttpRequest request = bean.getRequest();
        for (PageBean p : bean.getPagelist()) {


            System.out.println(p.getText());
            System.out.println(p.getUrl());

            //进入祥情页面抓取
            DetailsService.add(p.getUrl());
        }


    }
}
