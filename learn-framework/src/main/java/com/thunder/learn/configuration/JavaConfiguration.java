package com.thunder.learn.configuration;

import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

@Configuration
public class JavaConfiguration {

    @Autowired
    ResourceLoader resourceLoader;

    @Value("classpath*:dozer/*.xml")
    private Resource[] resources;

    @Bean
    public DozerBeanMapperFactoryBean modelMapper() {
//        List<String> xmlString =
//                resources.stream()
//                        .map(t -> {
//                            try {
//                                return t..toURI().toURL().toString();
//                            }
//                            catch (IOException e) {
//                                throw new RuntimeException(e);
//                            }
//                        })
//                        .collect(Collectors.toList());
        DozerBeanMapperFactoryBean dz = new DozerBeanMapperFactoryBean();
        dz.setMappingFiles(resources);
        return dz;
    }
}
