package com.example.demo.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "com.example.demo")
@Component
@Data
public class ThreadPoolConfigProperties {
    private Integer coreSize;

    private Integer MaxSize;

    private Integer keepAliveTime;
}
