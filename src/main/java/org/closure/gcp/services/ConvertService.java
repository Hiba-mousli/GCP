package org.closure.gcp.services;

import java.util.ArrayList;
import java.util.List;

import org.closure.gcp.entities.AnswerEntity;
import org.closure.gcp.entities.QuestionEntity;
import org.closure.gcp.models.AnswerModel;
import org.closure.gcp.models.QuestionModel;

public class ConvertService {
    public AnswerModel convertToModel(AnswerEntity entity){
    AnswerModel model = new AnswerModel();
    model.setId(entity.getId());
    model.setAnswer(entity.getAnswer());
    model.setQuestion(convertToModel(entity.getQuestion()));
    model.setStatus(model.getStatus());
    return model ;
    }

    public QuestionModel convertToModel(QuestionEntity entity){
    QuestionModel model = new QuestionModel();
    model.setId(entity.getId());
    model.setQuestion(entity.getQuestion());
    model.setQuestion_type(entity.getQuestion_type());
    model.setSup_file(entity.getSup_file());
    model.setPoints(entity.getpoints());
    //TODO : CHECK FOR TWO ATRIBUTES
    return model;
    }

    public AnswerEntity convertToEntity (AnswerModel model) {
    AnswerEntity entity = new AnswerEntity();
    entity.setId(model.getId());
    entity.setAnswer(model.getAnswer());
    entity.setQuestion(convertToEntity(model.getQuestion()));
    entity.setStatus(model.getStatus());
    return entity;
    }
 
    public QuestionEntity convertToEntity (QuestionModel model) {
        QuestionEntity entity = new QuestionEntity();
        entity.setId(model.getId());
        entity.setQuestion(model.getQuestion());
        entity.setQuestion_type(model.getQuestion_type());
        entity.setSup_file(model.getSup_file());
        entity.setpoints(model.getPoints());
        //TODO : CHECK FOR TWO ATRIBUTES
        return entity;
        }

        public List<AnswerModel> convertToListModel (List<AnswerEntity> entity ){
            List<AnswerModel> model = new ArrayList<>();
            for (AnswerEntity answereEntity : entity) {
                AnswerModel answer = new AnswerModel(answereEntity.getId(),answereEntity.getStatus(),answereEntity.getAnswer(),
               convertToModel(answereEntity.getQuestion()));
                model.add(answer);
                
            }
            return model ;       
        }


        public List<AnswerEntity> convertToListEntity (List<AnswerModel> model){
            List<AnswerEntity> entity = new ArrayList<>();
            for (AnswerModel answermModel : model ) {
                AnswerEntity answer = new AnswerEntity(answermModel.getId(),convertToEntity(answermModel.getQuestion()),answermModel.getStatus(),
                answermModel.getAnswer());
                entity.add(answer);
            }  
            return entity ;  
        }

}
