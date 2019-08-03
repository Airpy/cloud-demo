package com.asiainfo.clouddemo.clouddemo.repository;

import com.asiainfo.clouddemo.clouddemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 */
public interface ProductRepository extends JpaRepository<Product,Long> {
}
