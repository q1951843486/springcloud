package com.meiya.elastic.test;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalTime;


/**
 * @Description
 * @ClassName SimpleJobTest
 * @Author Administrator
 * @date 2019.12.06 10:06
 */
@Component
@Slf4j
public class SimpleJobTest implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
      log.info("任务开始执行"+ LocalTime.now().toString());
      log.info(shardingContext.toString());
      log.info("任务结束执行"+LocalTime.now().toString());
    }
}
