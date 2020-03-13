package com.meiya.demo01.demo2;

import com.geccocrawler.gecco.annotation.PipelineName;
import com.geccocrawler.gecco.pipeline.Pipeline;

import java.util.List;

/**
 * @Description
 * @ClassName DetailPipeline
 * @Author Administrator
 * @date 2019.12.09 13:44
 */
@PipelineName("detailPipeline")
public class DetailPipeline implements Pipeline<Details> {
    @Override
    public void process(Details bean) {

        System.out.println("..........................................");
        System.out.println(bean.getText().toString());
    }
}
