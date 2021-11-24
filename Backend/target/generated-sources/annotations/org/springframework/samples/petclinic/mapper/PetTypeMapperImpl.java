package org.springframework.samples.petclinic.mapper;

import java.util.ArrayList;
import java.util.Collection;
import javax.annotation.Generated;
import org.springframework.samples.petclinic.dto.PetTypeDto;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class PetTypeMapperImpl implements PetTypeMapper {

    @Override
    public PetType toPetType(PetTypeDto petTypeDto) {
        if ( petTypeDto == null ) {
            return null;
        }

        PetType petType = new PetType();

        petType.setId( petTypeDto.getId() );
        petType.setName( petTypeDto.getName() );

        return petType;
    }

    @Override
    public PetTypeDto toPetTypeDto(PetType petType) {
        if ( petType == null ) {
            return null;
        }

        PetTypeDto petTypeDto = new PetTypeDto();

        petTypeDto.setId( petType.getId() );
        petTypeDto.setName( petType.getName() );

        return petTypeDto;
    }

    @Override
    public Collection<PetTypeDto> toPetTypeDtos(Collection<PetType> petTypes) {
        if ( petTypes == null ) {
            return null;
        }

        Collection<PetTypeDto> collection = new ArrayList<PetTypeDto>( petTypes.size() );
        for ( PetType petType : petTypes ) {
            collection.add( toPetTypeDto( petType ) );
        }

        return collection;
    }
}
