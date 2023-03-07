package com.abtesting.emailsmtp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
		XADataSourceAutoConfiguration.class})
@EnableAspectJAutoProxy
public class EmailSmtpApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailSmtpApplication.class, args);
	}

}
