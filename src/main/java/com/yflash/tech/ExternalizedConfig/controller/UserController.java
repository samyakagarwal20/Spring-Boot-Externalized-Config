package com.yflash.tech.ExternalizedConfig.controller;

import com.yflash.tech.ExternalizedConfig.model.out.User;
import com.yflash.tech.ExternalizedConfig.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LogManager.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @PostMapping(value = "/add-multiple-users", produces = "application/json")
    public ResponseEntity<List<User>> addMultipleUserDetails() {
        return new ResponseEntity<>(userService.addMultipleUserDetails(), HttpStatus.OK);
    }

}
