package org.closure.gcp.services;

import org.closure.gcp.entities.QuestionEntity;
import org.closure.gcp.models.QuestionModel;
import org.closure.gcp.repositories.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

   @Autowired
    QuestionRepo questionRepo;

   public QuestionModel createquestion(QuestionModel question)
   {
        QuestionEntity entity = QuestionRepo.save(
                new QuestionEntity().question(question.getQuestion())
                                    .answers(convertToListEntity(question.getAnswers()))
                                    .question_type(question.getQuestion_type())
                                    .sup_file(question.getSup_file())
                                    .points(question.getPoints()));
            
        return question.id(entity.getId());
    }

    public QuestionModel readquestion(QuestionEntity question)
    {
        QuestionEntity questionEntity = questionRepo
       .findById(question.getId())
       .orElseThrow(
           ()-> new QuestionException("Unable to find an question to this number .."));

           return new QuestionModel().id(question.getId())
                                     .answers(convertToListModel(question.getAnswers()))
                                     .points(question.getPoints())
                                     .question(question.getQuestion())
                                     .question_type(question.getQuestion_type())
                                     .sup_file(question.getSup_file())
                                     .contest(question.getContest());




    }

    


    
}
