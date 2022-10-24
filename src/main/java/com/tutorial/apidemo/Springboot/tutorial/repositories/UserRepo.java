package com.tutorial.apidemo.Springboot.tutorial.repositories;

import com.tutorial.apidemo.Springboot.tutorial.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
