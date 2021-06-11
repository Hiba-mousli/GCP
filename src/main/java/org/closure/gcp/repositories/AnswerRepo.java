package org.closure.gcp.repositories;

import org.closure.gcp.entities.AnswerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepo extends CrudRepository<AnswerEntity,Integer> {
    
}