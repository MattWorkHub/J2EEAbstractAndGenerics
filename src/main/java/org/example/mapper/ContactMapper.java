package org.example.mapper;

import org.example.dto.ContactDto;
import org.example.entity.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper( nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
public interface ContactMapper {
    ContactMapper INSTANCE = Mappers.getMapper( ContactMapper.class );

    ContactDto entityToDto(Contact contact);
    Contact dtoToEntity(ContactDto contactDto);
}
