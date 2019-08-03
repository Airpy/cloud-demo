package com.asiainfo.clouddemo.clouddemo.repository;

import com.asiainfo.clouddemo.clouddemo.entity.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCommentRepository extends JpaRepository<ProductComment,Long> {
}
