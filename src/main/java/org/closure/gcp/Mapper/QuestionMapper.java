package org.closure.gcp.Mapper;

import org.closure.gcp.entities.QuestionEntity;
import org.closure.gcp.models.QuestionModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface QuestionMapper {
    
    QuestionMapper INSTANCE = Mappers.getMapper(QuestionMapper.class);

    @Mapping(source = "", target = "")
    QuestionModel ConvertTomModel (QuestionEntity entity) ;
    QuestionEntity ConvertToEntity (QuestionModel model);

}
