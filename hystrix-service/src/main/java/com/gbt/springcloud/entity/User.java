package com.gbt.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author botaogao
 */
@Data
@AllArgsConstructor
public class User  implements Serializable {
    private static final long serialVersionUID = -1;
    private Long id;
    private String username;
    private String password;
    public User() {
    }
}
