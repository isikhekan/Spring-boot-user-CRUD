package com.example.user_crud_management.services;

import com.example.user_crud_management.dto.UserDto;
import com.example.user_crud_management.dto.UserDtoIU;
import com.example.user_crud_management.entities.User;
import com.example.user_crud_management.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserDto saveUser(UserDtoIU userDtoUI){
        User user = new User();
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDtoUI,user);
        User savedUser = userRepository.save(user);
        BeanUtils.copyProperties(savedUser,userDto);
        return userDto;
    }

    public List<UserDto> listUser(){
        List<UserDto> userList = new ArrayList<>();
        for(User user : userRepository.findAll()){
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(user,userDto);
            userList.add(userDto);
        }
        return userList;
    }
    public UserDto listUserById(Integer id){
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            User dbUser = user.get();
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(dbUser,userDto);
            return userDto;
        }
        return null;
    }

    public void deleteUserById(Integer id){
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            User userDb = user.get();
            userRepository.delete(userDb);
        }
    }

    public UserDto updateUser(Integer id,UserDtoIU userDtoUI){
        UserDto userDto = new UserDto();
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            User dbUser = user.get();
            dbUser.setFirstname(userDtoUI.getFirstname());
            dbUser.setLastname(userDtoUI.getLastname());
            dbUser.setEmail(userDtoUI.getEmail());
            dbUser.setPhone(userDtoUI.getPhone());
            User savedUser = userRepository.save(dbUser);
            BeanUtils.copyProperties(savedUser,userDto);
            return userDto;
        }
        return null;

    }

}
