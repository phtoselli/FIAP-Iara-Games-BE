package com.iara.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iara.api.domains.user.User;
import com.iara.api.domains.user.UserDTO;
import com.iara.api.services.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

  @Autowired
  private UserService userService;

  public ResponseEntity<User> create(@RequestBody UserDTO body) {
    User newUser = this.userService.createUser(body);
    return ResponseEntity.ok(newUser);
  }
}
