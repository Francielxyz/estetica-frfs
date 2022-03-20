package com.estetica.frfs.mapper;

import com.estetica.frfs.dto.CidadeDTO;
import com.estetica.frfs.entity.Cidade;
import org.mapstruct.*;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CidadeMapper {

    // DTO
    @Named(value = "toDto")
    CidadeDTO toDto(Cidade cidade);

    // ENTITY
    @Named(value = "toEntity")
    Cidade toEntity(CidadeDTO cidadeDTO);
}
