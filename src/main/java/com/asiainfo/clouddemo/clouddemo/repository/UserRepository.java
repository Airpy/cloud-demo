package com.asiainfo.clouddemo.clouddemo.repository;

import com.asiainfo.clouddemo.clouddemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : zhenfeng.liu
 * @date : 2019/8/1 21:54
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
