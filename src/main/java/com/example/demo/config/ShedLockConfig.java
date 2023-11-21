package com.example.demo.config;

import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.jdbctemplate.JdbcTemplateLockProvider;
import net.javacrumbs.shedlock.spring.ScheduledLockConfiguration;
import net.javacrumbs.shedlock.spring.ScheduledLockConfigurationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.time.Duration;

/**
 * @descriptions:
 * @author: Liu XuChao
 * @date: 2023/10/23 15:43
 * @version: 1.0
 */
@Component
public class ShedLockConfig {

    @Bean
    public LockProvider lockProvider(DataSource dataSource) {
        return new JdbcTemplateLockProvider(dataSource);
    }

    @Bean
    public ScheduledLockConfiguration scheduledLockConfiguration(LockProvider lockProvider) {
        return ScheduledLockConfigurationBuilder.withLockProvider(lockProvider)
                .withPoolSize(10)
                .withDefaultLockAtMostFor(Duration.ofMinutes(10))
                .build();
    }

}
