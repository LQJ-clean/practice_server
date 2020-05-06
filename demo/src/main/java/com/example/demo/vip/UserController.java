package com.example.demo.vip;

import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/user", method = RequestMethod.POST)
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/add")
    public User add(@RequestBody User entity){
        return userService.add(entity);
    }
}
