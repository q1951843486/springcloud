package com.meiya.elastic.config;

import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.lite.spring.api.SpringJobScheduler;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import com.meiya.elastic.test.SimpleJobTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.WebEndpoint;

/**
 * @Description
 * @ClassName ZookeeperConfig
 * @Author yw
 * @date 2019.12.05 14:57
 */
@Configuration
public class ZookeeperConfig {


    @Bean(initMethod = "init")
    public ZookeeperRegistryCenter zookeeperRegistryCenter(){


        ZookeeperConfiguration configuration =
                new ZookeeperConfiguration("116.62.36.17:2181","elasticJob-simpleTask");
        ZookeeperRegistryCenter zookeeperRegistryCenter= new ZookeeperRegistryCenter(configuration);
        return zookeeperRegistryCenter;
    }
    @Bean(initMethod = "init")
    public JobScheduler jobScheduler(SimpleJob simpleJob, ZookeeperRegistryCenter regCenter) {
        SpringJobScheduler springJobScheduler = new SpringJobScheduler(simpleJob, regCenter, liteJobConfiguration());
        return springJobScheduler;
    }

    public LiteJobConfiguration liteJobConfiguration() {
        JobCoreConfiguration.Builder jobConfig0 = JobCoreConfiguration.newBuilder("jobParameter1", "0/10 * * * * ?", 3).shardingItemParameters("0=a,1=b,2=c").jobParameter("param");
        SimpleJobConfiguration simpleJobConfiguration = new SimpleJobConfiguration(jobConfig0.build(),
                SimpleJobTest.class.getCanonicalName());
        LiteJobConfiguration.Builder builder = LiteJobConfiguration.newBuilder(simpleJobConfiguration);
        return builder.build();
    }
}
