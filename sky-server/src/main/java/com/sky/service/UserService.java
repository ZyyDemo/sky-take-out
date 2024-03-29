package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
import com.sky.result.Result;
import com.sky.vo.UserLoginVO;

public interface UserService {
    /**
     * 微信登陆
     * @param userLoginDTO
     * @return
     */
     User wxLogin(UserLoginDTO userLoginDTO);

}
