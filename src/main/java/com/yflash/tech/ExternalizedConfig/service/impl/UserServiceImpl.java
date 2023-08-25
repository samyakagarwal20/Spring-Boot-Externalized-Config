package com.yflash.tech.ExternalizedConfig.service.impl;

import com.yflash.tech.ExternalizedConfig.entity.UserEntity;
import com.yflash.tech.ExternalizedConfig.model.out.User;
import com.yflash.tech.ExternalizedConfig.repository.UserRepository;
import com.yflash.tech.ExternalizedConfig.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

@Service
public class UserServiceImpl implements UserService {

    private final Environment environment;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    UserRepository userRepository;

    private static final Logger LOGGER = LogManager.getLogger(UserServiceImpl.class);

    public UserServiceImpl(Environment environment) {
        this.environment = environment;
    }

    @Override
    public List<User> addMultipleUserDetails() {
        List<User> users = new ArrayList<>();
        String userDetails = environment.getProperty("users.details");
        Stream<String> userStream = Pattern.compile(", ").splitAsStream(userDetails);
        userStream.forEach(user -> {
            String[] userName = user.split(" ");
            UserEntity userEntity = new UserEntity();
            userEntity.setFirstName(userName[0]);
            userEntity.setLastName(userName[1]);
            userEntity = userRepository.save(userEntity);
            users.add(modelMapper.map(userEntity, User.class));
        });

        return users;
    }

}
