package org.closure.gcp.repositories;

import java.util.Optional;

import org.closure.gcp.entities.CollegeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepo extends CrudRepository<CollegeEntity,Integer>{
    
    Optional<CollegeEntity> findByCollegeName(String collegeName);
}
