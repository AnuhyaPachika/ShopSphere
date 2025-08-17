package com.shopsphere.backend.product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
  private final ProductRepository repo;
  public ProductService(ProductRepository repo) { this.repo = repo; }
  public List<Product> list() { return repo.findAll(); }
  public Product get(Long id) { return repo.findById(id).orElseThrow(); }
  public Product create(Product p) { return repo.save(p); }
  public Product update(Long id, Product patch) {
    Product p = get(id);
    if (patch.getName()!=null) p.setName(patch.getName());
    if (patch.getDescription()!=null) p.setDescription(patch.getDescription());
    if (patch.getPrice()!=0) p.setPrice(patch.getPrice());
    p.setStock(patch.getStock());
    return repo.save(p);
  }
  public void delete(Long id) { repo.deleteById(id); }
}
