package com.example.inversion_control;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobilesConfig {

	@Bean
	public Mobiles getOnePlusObject() {
		return new OnePlus();
	}
	@Bean
	public Mobiles getIphoneObject() {
		return new Iphone();
	}
}
