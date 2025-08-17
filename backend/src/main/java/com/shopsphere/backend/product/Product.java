package com.shopsphere.backend.product;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity @Table(name = "products")
public class Product {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @NotBlank private String name;
  private String description;
  @Min(0) private double price;
  @Min(0) private int stock;

  public Product() {}
  public Product(Long id, String name, String description, double price, int stock) {
    this.id=id; this.name=name; this.description=description; this.price=price; this.stock=stock;
  }

  public Long getId() { return id; }
  public String getName() { return name; }
  public String getDescription() { return description; }
  public double getPrice() { return price; }
  public int getStock() { return stock; }
  public void setId(Long id) { this.id = id; }
  public void setName(String name) { this.name = name; }
  public void setDescription(String description) { this.description = description; }
  public void setPrice(double price) { this.price = price; }
  public void setStock(int stock) { this.stock = stock; }
}
