package com.mario.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@ComponentScans({
	@ComponentScan({"com.mario.market.domain.repository"}),
	@ComponentScan({"com.mario.market.web.controller"})
})
@SpringBootApplication
public class SuperMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperMarketApplication.class, args);
	}
}
