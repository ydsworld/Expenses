package com.ydsworld.service;


import com.ydsworld.model.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{

     User findByUsername(String username);
}
