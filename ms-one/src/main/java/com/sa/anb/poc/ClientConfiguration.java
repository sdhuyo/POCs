package com.sa.anb.poc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sa.anb.poc.exceptionhandling.CustomErrorDecoder;

import feign.Logger;
import feign.codec.ErrorDecoder;

@Configuration
public class ClientConfiguration {
	
	@Bean
	public ErrorDecoder errorDecoder() {
		return new CustomErrorDecoder();
	}
	
	@Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
