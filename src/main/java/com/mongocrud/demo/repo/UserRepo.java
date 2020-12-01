package com.mongocrud.demo.repo;

import com.mongocrud.demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User, Integer> {
}
