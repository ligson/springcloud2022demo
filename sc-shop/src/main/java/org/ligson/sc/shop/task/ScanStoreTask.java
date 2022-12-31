package org.ligson.sc.shop.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

@Slf4j
public class ScanStoreTask implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("scan store task----args:{}", args);
    }
}
