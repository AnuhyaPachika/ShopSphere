package com.shopsphere.backend;

import com.shopsphere.backend.product.Product;
import com.shopsphere.backend.product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendApplication {
  public static void main(String[] args) {
    SpringApplication.run(BackendApplication.class, args);
  }

  @Bean
  CommandLineRunner seed(ProductRepository repo) {
    return args -> {
      if (repo.count() == 0) {
        repo.save(new Product(null, "Laptop", "Lightweight 14-inch", 999.99, 10));
        repo.save(new Product(null, "Headphones", "Noise cancelling", 199.99, 50));
      }
    };
  }
}
