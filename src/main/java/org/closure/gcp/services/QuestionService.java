package org.closure.gcp.services;

import org.closure.gcp.entities.AnswerEntity;
import org.closure.gcp.entities.InterestEntity;
import org.closure.gcp.entities.QuestionEntity;
import org.closure.gcp.models.AnswerModel;
import org.closure.gcp.models.InterestModel;
import org.closure.gcp.models.QuestionModel;
import org.closure.gcp.repositories.AnswerRepo;
import org.closure.gcp.repositories.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    AnswerRepo answerRepo;

   public QuestionModel createquestion(QuestionModel question)
    {
        QuestionEntity entity = QuestionRepo.save(
                new QuestionEntity().question(question.getQuestion())
                                    .answers(convertToListEntity(question.getanswer()))
                                    .question_type(question.getQuestion_type())
                                    .sup_file(question.getSup_file())
                                    .points(question.getPoints()));
            
        return question.id(entity.getId());
    }

    

    


    
}
