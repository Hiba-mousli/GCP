package org.closure.gcp.Mapper;

import org.closure.gcp.entities.LevelEntity;
import org.closure.gcp.models.LevelModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LevelMapper {

    LevelMapper INSTANCE = Mappers.getMapper(LevelMapper.class);
    
    @Mapping(source = "" , target = "")
    LevelModel convertToModel (LevelEntity entity);
    LevelEntity convertToEntity (LevelModel model);    
}
