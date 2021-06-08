package org.closure.gcp.repositories;

import java.util.Optional;

import org.closure.gcp.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserEntity,Integer>{
    
    Optional<UserEntity> findByEmail(String email);
}
