package com.example.awsspringbootrestapiuser.repository;

import com.example.awsspringbootrestapiuser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
