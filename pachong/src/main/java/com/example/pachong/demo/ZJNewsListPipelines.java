package com.example.pachong.demo;

import com.example.pachong.demo2.DetailsService;
import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;
import com.geccocrawler.gecco.request.HttpRequest;
import com.geccocrawler.gecco.scheduler.SchedulerContext;


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
        HttpRequest httpRequest = bean.getRequest();
        SchedulerContext.into(httpRequest.subRequest(bean.getNextUrl()));


    }
}
