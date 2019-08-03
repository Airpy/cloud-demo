package com.asiainfo.clouddemo.clouddemo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Api(value="UserEndpoint",description="用户管理相关Api")
public class UserEndpoint {

}
