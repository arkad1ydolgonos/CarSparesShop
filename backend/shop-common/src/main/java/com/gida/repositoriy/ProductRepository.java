package com.gida.repositoriy;

import com.gida.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
