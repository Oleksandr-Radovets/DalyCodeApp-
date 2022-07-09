package com.example.dalycodeapp.RepositoryApps;


import com.example.dalycodeapp.EntityApps.UserEntity;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {



}
