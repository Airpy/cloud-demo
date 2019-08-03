package com.asiainfo.clouddemo.clouddemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.asiainfo.clouddemo.clouddemo.dto.UserDto;
import com.asiainfo.clouddemo.clouddemo.entity.User;
import com.asiainfo.clouddemo.clouddemo.repository.UserRepository;
import com.asiainfo.clouddemo.clouddemo.service.UserService;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userReposity;

    @Override
    public Page<User> getPage(Pageable pageable) {
        return this.userReposity.findAll(pageable);
    }

    @Override
    public User load(Long id) {
        return this.userReposity.getOne(id);
    }

    @Override
    public User save(UserDto userDto) {
        User user = this.userReposity.getOne(userDto.getId());
        if (user == null) {
            user = new User();
        }
        user.setNickname(userDto.getNickname());
        user.setAvatar(userDto.getAvatar());
        return this.userReposity.save(user);
    }

    @Override
    public void delete(Long id) {
        this.userReposity.deleteById(id);
    }

}
