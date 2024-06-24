package com.aleyna.recipesharing.service;

import com.aleyna.recipesharing.model.User;

public interface UserService {

public User findUserById(Long userId) throws Exception;
public User findUserByJwt(String jwt)throws Exception;

}
