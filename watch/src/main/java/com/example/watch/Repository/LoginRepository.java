package com.example.watch.Repository;

import org.springframework.stereotype.Repository;

import com.example.watch.Model.LoginModel;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LoginRepository extends JpaRepository <LoginModel,Integer>{
	LoginModel findByUsername(String username);
}


