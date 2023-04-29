package com.example.watch.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.watch.Model.watch;

@Repository
public interface watchRepository extends JpaRepository <watch,Integer>{

}
