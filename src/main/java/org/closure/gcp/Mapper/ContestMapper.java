package org.closure.gcp.Mapper;

import java.util.List;

import org.closure.gcp.entities.ContestEntity;
import org.closure.gcp.models.ContestModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContestMapper {

    ContestMapper INSTANCE =  Mappers.getMapper(ContestMapper.class);
    
    @Mapping(source = "", target = "")
    List<ContestModel> convertToListModel (List<ContestEntity> entity );
    List<ContestEntity> convertToListEntity (List<ContestModel> model );

    
}
