package org.closure.gcp.repositories;

import java.util.Optional;

import org.closure.gcp.entities.AnswerEntity;
import org.closure.gcp.models.AnswerModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepo extends CrudRepository<AnswerEntity,Integer> {
    Optional<AnswerEntity> findByModel(AnswerModel answerModel);
}