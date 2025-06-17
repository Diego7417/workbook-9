package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.dao.ProductDao;
import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class App  {
//	@Autowired
//	ProductDao productDao;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		productDao.add(new Product(0, "Coke", "Drinks", 2));
//
//		List<Product> products = productDao.getAll();
//		System.out.println(products);
//	}
}
