package com.envers.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Configuration file
 *
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableTransactionManagement
@ComponentScan(basePackages = CommonConstants.PACKAGES_TO_SCAN_FIRST)
@PropertySource(value = { "classpath:system.properties" })
public class AppConfig {
}
