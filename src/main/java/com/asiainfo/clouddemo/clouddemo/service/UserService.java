package com.asiainfo.clouddemo.clouddemo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.asiainfo.clouddemo.clouddemo.dto.UserDto;
import com.asiainfo.clouddemo.clouddemo.entity.User;

/**
 * @author : zhenfeng.liu
 * @date : 2019/8/1 22:01
 */
public interface UserService {

    Page<User> getPage(Pageable pageable);
    
    User load(Long id);
    
    User save(UserDto userDto);
    
    void delete(Long id);
    

}
