package com.iara.api.services;

import com.iara.api.domains.user.User;
import com.iara.api.domains.user.UserDTO;

public class UserService {
  public User createUser(UserDTO data) {

    User newUser = new User();
    newUser.setName(data.name());
    newUser.setEmail(data.email());
    newUser.setPassword(data.password());
    newUser.setIsadmin(false);

    return newUser;
  }
}
