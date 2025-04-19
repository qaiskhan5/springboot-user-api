package com.example.Practice1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Practice1.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}





/*package com.example.Stud.TeachWork.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Stud.TeachWork.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}*/