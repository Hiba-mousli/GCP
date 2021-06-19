package org.closure.gcp.services;

import org.closure.gcp.Mapper.AnswerMapper;
import org.closure.gcp.entities.AnswerEntity;
import org.closure.gcp.entities.QuestionEntity;
import org.closure.gcp.models.AnswerModel;
import org.closure.gcp.models.QuestionModel;
import org.closure.gcp.repositories.AnswerRepo;
import org.closure.gcp.repositories.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.closure.gcp.exceptions.QuestionException;

@Service
public class QuestionService
{
   @Autowired
    QuestionRepo questionRepo;

   @Autowired
   AnswerRepo answerRepo; 

   public QuestionModel createquestion(QuestionModel question)
   {         
                         
                // for (AnswerModel answermModel : question.getAnswers())
                // {
                //    answerRepo.save( new AnswerEntity().answer(answermModel.getAnswer()));
                // }

                QuestionEntity entity = questionRepo.save(
                new QuestionEntity().question(question.getQuestion())
                                    .question_type(question.getQuestion_type())
                                    .sup_file(question.getSup_file())
                                    .points(question.getPoints())
                                    .answers(AnswerMapper.INSTANCE.convertToListEntity(question.getAnswers())));
                return question.id(entity.getId());
    }

    public QuestionModel readquestion(QuestionModel question) throws QuestionException
    {
        QuestionEntity questionEntity = questionRepo
       .findByQuestion(question.getQuestion())
       .orElseThrow( 
           ()-> new QuestionException("Unable to find an question to this .."));

           return new QuestionModel().question(questionEntity.getQuestion())
                                     .question_type(questionEntity.getQuestion_type())
                                     .sup_file(questionEntity.getSup_file())
                                     .points(questionEntity.getPoints());

    } 

    public QuestionModel updatequestion (QuestionModel question) throws QuestionException
    {
        QuestionEntity questionEntity = questionRepo
        .findByQuestion(question.getQuestion())
        .orElseThrow(()-> new QuestionException("This question does not exist .. "));

        questionEntity = questionRepo.save( new QuestionEntity()
                                  .question(question.getQuestion())
                                  .question_type(question.getQuestion_type())
                                  .sup_file(question.getSup_file())
                                  .points(question.getPoints()));   
        return question.id(questionEntity.getId());                       
    }


    public void deletequestion (QuestionModel question) throws QuestionException
    {
        QuestionEntity questionEntity = questionRepo
        .findById(question.getId())
        .orElseThrow(
            ()-> new QuestionException("This question does not exist .. "));
            questionRepo.delete(questionEntity);

    }

}