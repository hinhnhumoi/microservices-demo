package com.dts.user.controller;

import com.dts.user.VO.RespondTemplateVO;
import com.dts.user.entity.User;
import com.dts.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/")
    public User saveUser (@RequestBody User user){
        log.info("Inside saveUser method of UserController:");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public RespondTemplateVO getUserWithDepartment (@PathVariable("id") Long userId){
        log.info("Inside saveUser method of UserController:");
        return userService.getUserWithDepartment(userId);
    }
}
