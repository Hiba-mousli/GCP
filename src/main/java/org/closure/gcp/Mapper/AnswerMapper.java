package org.closure.gcp.Mapper;

import java.util.List;

import org.closure.gcp.entities.AnswerEntity;
import org.closure.gcp.models.AnswerModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnswerMapper {

    AnswerMapper INSTANCE = Mappers.getMapper( AnswerMapper.class ); 
 
    @Mapping(source = "", target = "")
    AnswerModel convertToModel (AnswerEntity entity);
    AnswerEntity convertToEntity (AnswerModel model);
    List<AnswerModel> convertToListModel (List<AnswerEntity> entity );
    List<AnswerEntity> convertToListEntity (List<AnswerModel> model );

    
}
