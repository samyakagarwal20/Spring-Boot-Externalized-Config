package com.yflash.tech.ExternalizedConfig.repository;

import com.yflash.tech.ExternalizedConfig.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
