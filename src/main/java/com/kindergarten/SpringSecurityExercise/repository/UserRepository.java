package com.kindergarten.SpringSecurityExercise.repository;

import com.kindergarten.SpringSecurityExercise.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);

}
