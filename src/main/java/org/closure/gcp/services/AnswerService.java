package org.closure.gcp.services;

import org.closure.gcp.entities.AnswerEntity;
import org.closure.gcp.entities.QuestionEntity;
import org.closure.gcp.exceptions.AnswerException;
import org.closure.gcp.models.AnswerModel;
import org.closure.gcp.models.QuestionModel;
import org.closure.gcp.repositories.AnswerRepo;
import org.closure.gcp.repositories.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
    
    @Autowired
    AnswerRepo answerRepo;

    @Autowired
    QuestionRepo questionRepo;

    
    public AnswerModel createAnswer(AnswerModel answer)
    {
        AnswerEntity entity = answerRepo.save(
             new AnswerEntity().answer(answer.getAnswer())
                               .status(answer.getStatus()));
        return answer.id(entity.getId());
    }

    public AnswerModel createAnswerWithQuestion(AnswerModel answer, String question) throws AnswerException
    {
        QuestionEntity questionEntity = new QuestionEntity();
        questionEntity.setQuestion(question);
        
        questionEntity = questionRepo
            .findByQuestion(question)
            .orElseThrow(
                ()-> new AnswerException("no question with this value"));
         AnswerEntity entity = answerRepo.save(
            new AnswerEntity().answer(answer.getAnswer())
                              .status(answer.getStatus()));

        return answer.id(entity.getId()).question(new QuestionModel().id(questionEntity.getId())
                                                                     .points(questionEntity.getpoints())
                                                                     .question(questionEntity.getQuestion()));                                                   
                                                                
    }

    public AnswerModel ReadAnswer (AnswerModel answer) throws AnswerException
    {
        
        AnswerEntity answerEntity = answerRepo
            .findById(answer.getId()) 
            .orElseThrow(
                ()-> new AnswerException("Unable to find an answer to this number .."));
        
        QuestionEntity questionEntity = questionRepo.findByQuestion((answer.getQuestion()).getQuestion()).orElse(new QuestionEntity());
        return new AnswerModel().id(answerEntity.getId())
                                .answer(answerEntity.getAnswer())
                                .status(answerEntity.getStatus())
                                .question(new QuestionModel().id(questionEntity.getId())
                                                             .points(questionEntity.getpoints())
                                                             .question(questionEntity.getQuestion()));
    }


public AnswerModel updateAnswer (AnswerModel answer) throws AnswerException
{
    AnswerEntity answereEntity = answerRepo
            .findById(answer.getId())
            .orElseThrow(
                ()-> new AnswerException("Unable to find an answer to this number ..."));
QuestionEntity questionEntity = questionRepo.findByQuestion((answer.getQuestion()).getQuestion()).orElse(new QuestionEntity());

         answereEntity = answerRepo.save(
        new AnswerEntity().answer(answereEntity.getAnswer())
                          .status(answereEntity.getStatus()));
    return new AnswerModel().id(answereEntity.getId()).question(new QuestionModel().id(questionEntity.getId())
                                                                 .points(questionEntity.getpoints())
                                                                 .question(questionEntity.getQuestion()));
}

public void DeleteAnswer(AnswerModel answer) throws AnswerException
    {
        AnswerEntity answereEntity = answerRepo
        .findById(answer.getId())
        .orElseThrow(
            ()-> new AnswerException("Unable to find an answer to this number ..."));
            answerRepo.delete(answereEntity);

    }
}