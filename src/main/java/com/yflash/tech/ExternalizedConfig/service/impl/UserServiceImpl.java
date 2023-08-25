package com.yflash.tech.ExternalizedConfig.service.impl;

import com.yflash.tech.ExternalizedConfig.model.out.User;
import com.yflash.tech.ExternalizedConfig.repository.UserRepository;
import com.yflash.tech.ExternalizedConfig.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    ModelMapper modelMapper;

    @Autowired
    UserRepository userRepository;

    private static final Logger LOGGER = LogManager.getLogger(UserServiceImpl.class);

    @Override
    public List<User> addMultipleUserDetails() {
        return null;
    }

}
