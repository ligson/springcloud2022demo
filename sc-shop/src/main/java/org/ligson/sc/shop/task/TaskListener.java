package org.ligson.sc.shop.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.task.listener.TaskExecutionListener;
import org.springframework.cloud.task.repository.TaskExecution;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TaskListener implements TaskExecutionListener {
    @Override
    public void onTaskStartup(TaskExecution taskExecution) {
        log.debug("onTaskStartup");
    }

    @Override
    public void onTaskEnd(TaskExecution taskExecution) {
        log.debug("onTaskEnd");
    }

    @Override
    public void onTaskFailed(TaskExecution taskExecution, Throwable throwable) {
        log.debug("onTaskFailed");
    }
}
