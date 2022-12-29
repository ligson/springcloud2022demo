package org.ligson.sc.gw;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class StatisFilter implements WebFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        long startTime = System.currentTimeMillis();
        ServerHttpRequest req = exchange.getRequest();
        String url = req.getURI() + "";
        try {
            return chain.filter(exchange);
        } finally {
            long endTime = System.currentTimeMillis();
            HttpStatusCode code = exchange.getResponse().getStatusCode();
            log.info("请求uri:{},请求方法:{},响应状态:{},耗时:{}s", url, req.getMethod(), code != null ? code.value() : code, (endTime - startTime) / 1000.0);
        }
    }
}
