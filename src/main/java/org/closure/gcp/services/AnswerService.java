package org.closure.gcp.services;

import org.closure.gcp.Mapper.AnswerMapper;
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

    public AnswerModel createAnswerWithQuestion(AnswerModel answer, String question)
    {

    QuestionEntity questionEntity=new QuestionEntity();
    AnswerEntity entity = answerRepo.save(new AnswerEntity().answer(answer.getAnswer())
                                                            .status(answer.getStatus()));
                                                        
    return answer.id(entity.getId()).question(new QuestionModel().id(questionEntity.getId())
                                                                 .points(questionEntity.getPoints())
                                                                 .question(question));
    }

    public AnswerModel ReadAnswer (AnswerModel answer) throws AnswerException
    {

         
        AnswerEntity entity = answerRepo.findById(answer.getId()).orElseThrow(
                ()-> new AnswerException("The answer doesn't actally exist with this ID ..."));
        
        return new AnswerModel().id(entity.getId())
                                .answer(entity.getAnswer())
                                .status(entity.getStatus());
    }


public AnswerModel updateAnswer (AnswerModel answer) throws AnswerException
{
            if( answer.getId() == null )
                 throw new AnswerException("You didn't enter enough information to update ...");   
             AnswerEntity entity = answerRepo.findById(answer.getId()).orElseThrow(
                ()-> new AnswerException("can't update an answer that doesn't actally exist ..."));
                entity.answer(answer.getAnswer()).status(answer.getStatus());
                answerRepo.save(entity);
                return  AnswerMapper.INSTANCE.convertToModel(entity);
}

public AnswerModel DeleteAnswer(AnswerModel answer) throws AnswerException
    {
        AnswerEntity entity = answerRepo.findById(answer.getId()).orElseThrow(
            ()-> new AnswerException("Unable to find an answer to this number ..."));
        answerRepo.delete(entity);
        return AnswerMapper.INSTANCE.convertToListModerl(entity);
    }
}