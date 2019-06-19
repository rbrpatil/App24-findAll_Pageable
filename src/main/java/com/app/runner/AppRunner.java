package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repository.ProductRepository;
@Component
public class AppRunner implements CommandLineRunner {
	@Autowired
	ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		PageRequest p=PageRequest.of(2, 3);
		repo.findAll(p).forEach(System.out::println);
	}

}
