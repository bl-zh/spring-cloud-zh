package org.zh.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.zh.domain.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
