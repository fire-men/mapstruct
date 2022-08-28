package org.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

/**
 * @Author zhangLe
 * @Description
 */
@Configuration
@ComponentScan("org.example.demo")
public class ApplicationContextConfig implements Serializable {
}
