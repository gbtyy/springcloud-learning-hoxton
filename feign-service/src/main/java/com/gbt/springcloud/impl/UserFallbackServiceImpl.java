package com.gbt.springcloud.impl;

import com.gbt.springcloud.entity.Result;
import com.gbt.springcloud.entity.User;
import com.gbt.springcloud.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author botaogao
 */
@Component
public class UserFallbackServiceImpl implements UserService {
    @Override
    public Result insert(User user) {
        return new Result("调用失败，服务被降级",500);
    }

    @Override
    public Result<User> getUser(Long id) {
        return new Result("调用失败，服务被降级",500);
    }

    @Override
    public Result<List<User>> listUsersByIds(List<Long> ids) {
        return new Result("调用失败，服务被降级",500);
    }

    @Override
    public Result<User> getByUsername(String username) {
        return new Result("调用失败，服务被降级",500);
    }

    @Override
    public Result update(User user) {
        return new Result("调用失败，服务被降级",500);
    }

    @Override
    public Result delete(Long id) {
        return new Result("调用失败，服务被降级",500);
    }
}
