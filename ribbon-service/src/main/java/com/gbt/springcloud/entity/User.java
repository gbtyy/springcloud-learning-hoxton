package com.gbt.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String username;
    private String password;
    public User() {
    }
}
