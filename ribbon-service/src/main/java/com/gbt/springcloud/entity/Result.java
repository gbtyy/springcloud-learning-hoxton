package com.gbt.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result<T> {
    private T data;
    private String message;
    private int code;

    public Result() {
    }

    public Result(String message, Integer code) {
        this(null, message, code);
    }

    public  Result(T data){
        this(data,"操作陈宫",200);
    }
}
