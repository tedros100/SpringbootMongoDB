package com.quintrix.UserMongo.repository;

import com.quintrix.UserMongo.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
