package com.practice.userdatabase;


import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepos extends JpaRepository<UserModel ,Long> {
    
}
