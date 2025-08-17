package com.shopsphere.backend.product;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*")
public class ProductController {
  private final ProductService service;
  public ProductController(ProductService service) { this.service = service; }

  @GetMapping public List<Product> list() { return service.list(); }
  @GetMapping("/{id}") public Product get(@PathVariable Long id) { return service.get(id); }

  @PostMapping @ResponseStatus(HttpStatus.CREATED)
  public Product create(@RequestBody Product p) { return service.create(p); }

  @PutMapping("/{id}") public Product update(@PathVariable Long id, @RequestBody Product p) { return service.update(id, p); }

  @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id) { service.delete(id); }
}
