package com.tutorial.apidemo.Springboot.tutorial.repositories;

import com.tutorial.apidemo.Springboot.tutorial.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);

}
