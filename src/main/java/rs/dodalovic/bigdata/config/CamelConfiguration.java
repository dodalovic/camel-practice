package rs.dodalovic.bigdata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.dodalovic.bigdata.beanref.MyFileProcessor;

@Configuration
public class CamelConfiguration {

    @Bean
    MyFileProcessor myFileProcessor() {
        return new MyFileProcessor();
    }
}
