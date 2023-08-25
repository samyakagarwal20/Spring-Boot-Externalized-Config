package com.yflash.tech.ExternalizedConfig.entity;

import com.yflash.tech.ExternalizedConfig.common.CommonConstants;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "USER")
@Data
@ToString
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = CommonConstants.USER_ID)
    private Integer id;

    @Column(name = CommonConstants.FIRST_NAME)
    private String firstName;

    @Column(name = CommonConstants.LAST_NAME)
    private String lastName;

}
