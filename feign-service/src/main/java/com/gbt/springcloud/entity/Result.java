package com.gbt.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author botaogao
 */
@Data
@AllArgsConstructor
public class Result<T> implements Serializable {
    private static final long serialVersionUID = -1;
    private T data;
    private String message;
    private int code;

    public Result(String message, Integer code) {
        this(null, message, code);
    }

    public Result(T data) {
        this(data, "操作陈宫", 200);
    }

    public Result() {

    }
}
