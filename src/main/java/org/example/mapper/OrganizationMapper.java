package org.example.mapper;

import org.example.dto.OrganizationDto;
import org.example.entity.Organization;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper( nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
public interface OrganizationMapper {
    OrganizationMapper INSTANCE = Mappers.getMapper(OrganizationMapper.class);

    OrganizationDto entityToDto(Organization organization);
    Organization dtoToEntity(OrganizationDto organizationDto);
}
