package com.gida.repositoriy;

import com.gida.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductGroupRepository extends CrudRepository<Product, Integer> {
}
