package com.example.user_crud_management.controller;

import com.example.user_crud_management.dto.UserDto;
import com.example.user_crud_management.dto.UserDtoIU;
import com.example.user_crud_management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(path = "/save")
    public UserDto saveUser(@RequestBody UserDtoIU userDtoUI){
        return userService.saveUser(userDtoUI);
    }

    @GetMapping(path = "/list")
    public List<UserDto> listUsers(){
        return userService.listUser();
    }

    @GetMapping(path = "/list/{id}")
    public UserDto listUserById(@PathVariable(name = "id") Integer id){
        return userService.listUserById(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteUserById(@PathVariable(name = "id") Integer id){
        userService.deleteUserById(id);
    }

    @PutMapping(path = "/update/{id}")
    public UserDto updateUser(@PathVariable(name = "id") Integer id ,@RequestBody UserDtoIU userDtoUI){
        return userService.updateUser(id,userDtoUI);
    }
}
