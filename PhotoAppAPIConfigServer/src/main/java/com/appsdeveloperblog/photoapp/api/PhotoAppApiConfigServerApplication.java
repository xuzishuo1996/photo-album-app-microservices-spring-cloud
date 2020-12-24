package com.appsdeveloperblog.photoapp.api;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.jasypt.encryption.StringEncryptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigServer
public class PhotoAppApiConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppApiConfigServerApplication.class, args);
    }

}

//@SpringBootApplication
//@EnableEncryptableProperties
//public class PhotoAppApiConfigServerApplication implements CommandLineRunner {
//    private static final Logger l = LoggerFactory.getLogger(PhotoAppApiConfigServerApplication.class);
//
//    @Autowired
//    private StringEncryptor stringEncryptor;
//
//    @Autowired
//    private ApplicationContext applicationContext;
//
//    public static void main(String[] args) {
//        SpringApplication.run(PhotoAppApiConfigServerApplication.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Environment environment = applicationContext.getEnvironment();
//        l.info(environment.getProperty("password"));
//        l.info(stringEncryptor.encrypt(environment.getProperty("password")));
//    }
//}
