package com.practice.userdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

  @Autowired
  UserRepos userRepos;

  //Create a New User
  @PostMapping("/signup")
  public UserModel createUser(@Validated @RequestBody UserModel userModel) {

      System.out.println("userModel.getEmail()"+userModel.getEmail());
     
      return userRepos.save(userModel);
  }



  



  //Get a Single User By Id
  @GetMapping("/user/{id}")
  public UserModel getUserById(@PathVariable(value = "id") Long id)
    throws NoUserFoundException {
    return userRepos
      .findById(id)
      .orElseThrow(() -> new NoUserFoundException(id));
  }

  //Update Deatils of User
  @PutMapping("user/{id}")
  public UserModel updateData(
    @PathVariable(value = "id") Long id,
    @Validated @RequestBody UserModel userModel
  )
    throws NoUserFoundException {
    UserModel userModel2 = userRepos
      .findById(id)
      .orElseThrow(() -> new NoUserFoundException(id));
    userModel2.setName(userModel2.getName());
    userModel2.setEmail(userModel2.getEmail());
    userModel2.setUsername(userModel2.getUsername());
    userModel2.setPhoneNumber(userModel2.getPhoneNumber());
    UserModel updatedUserModel = userRepos.save(userModel2);
    return updatedUserModel;
  }
}
