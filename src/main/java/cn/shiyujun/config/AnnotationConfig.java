package cn.shiyujun.config;

import cn.shiyujun.service.IOCService;
import cn.shiyujun.service.impl.IOCServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {
    @Bean
    public IOCService iocService(){
        return new IOCServiceImpl();
    }
}
