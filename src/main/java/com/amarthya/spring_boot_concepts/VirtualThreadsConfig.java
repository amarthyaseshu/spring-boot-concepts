package com.amarthya.spring_boot_concepts;

import org.springframework.boot.web.embedded.tomcat.TomcatProtocolHandlerCustomizer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VirtualThreadsConfig {

//    public TomcatProtocolHandlerCustomizer tomcatProtocolHandlerCustomizer(){
//        return protocolHandler -> {
//            protocolHandler.setExecutor(Excecutors.new VirtualThreadPerTaskExecutor());
//        };
//    }
}


