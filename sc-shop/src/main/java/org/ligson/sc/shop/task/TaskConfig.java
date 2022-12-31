package org.ligson.sc.shop.task;

import org.springframework.cloud.task.configuration.DefaultTaskConfigurer;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableTask
public class TaskConfig {
    @Bean
    public ScanStoreTask scanStoreTask() {
        return new ScanStoreTask();
    }

    @Bean
    public DefaultTaskConfigurer getTaskConfigurer(DataSource dataSource) {
        return new DefaultTaskConfigurer(dataSource);
    }
}
