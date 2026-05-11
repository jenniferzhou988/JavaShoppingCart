package com.shoppingchart.JavaShoppingCart;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.shoppingchart.JavaShoppingCart.Mapper")
public class JavaShoppingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaShoppingCartApplication.class, args);
	}

}
