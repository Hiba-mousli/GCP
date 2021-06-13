package org.closure.gcp.Mapper;

import org.closure.gcp.entities.InterestEntity;
import org.closure.gcp.models.InterestModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InterestMapper {
    
    InterestMapper INSTANCE = Mappers.getMapper( InterestMapper.class ); 
 
    @Mapping(source = "", target = "")
    InterestModel convertToModel (InterestEntity entity);
    InterestEntity convertToEntity (InterestModel model);
    
}
