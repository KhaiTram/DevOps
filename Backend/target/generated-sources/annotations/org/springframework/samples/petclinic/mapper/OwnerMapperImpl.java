package org.springframework.samples.petclinic.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.dto.OwnerDto;
import org.springframework.samples.petclinic.dto.PetDto;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class OwnerMapperImpl implements OwnerMapper {

    @Autowired
    private PetMapper petMapper;

    @Override
    public OwnerDto toOwnerDto(Owner owner) {
        if ( owner == null ) {
            return null;
        }

        OwnerDto ownerDto = new OwnerDto();

        ownerDto.setFirstName( owner.getFirstName() );
        ownerDto.setLastName( owner.getLastName() );
        ownerDto.setAddress( owner.getAddress() );
        ownerDto.setCity( owner.getCity() );
        ownerDto.setTelephone( owner.getTelephone() );
        ownerDto.setId( owner.getId() );
        ownerDto.setPets( petListToPetDtoList( owner.getPets() ) );

        return ownerDto;
    }

    @Override
    public Owner toOwner(OwnerDto ownerDto) {
        if ( ownerDto == null ) {
            return null;
        }

        Owner owner = new Owner();

        owner.setId( ownerDto.getId() );
        owner.setFirstName( ownerDto.getFirstName() );
        owner.setLastName( ownerDto.getLastName() );
        owner.setAddress( ownerDto.getAddress() );
        owner.setCity( ownerDto.getCity() );
        owner.setTelephone( ownerDto.getTelephone() );
        owner.setPets( petDtoListToPetList( ownerDto.getPets() ) );

        return owner;
    }

    @Override
    public Collection<OwnerDto> toOwnerDtoCollection(Collection<Owner> ownerCollection) {
        if ( ownerCollection == null ) {
            return null;
        }

        Collection<OwnerDto> collection = new ArrayList<OwnerDto>( ownerCollection.size() );
        for ( Owner owner : ownerCollection ) {
            collection.add( toOwnerDto( owner ) );
        }

        return collection;
    }

    @Override
    public Collection<Owner> toOwners(Collection<OwnerDto> ownerDtos) {
        if ( ownerDtos == null ) {
            return null;
        }

        Collection<Owner> collection = new ArrayList<Owner>( ownerDtos.size() );
        for ( OwnerDto ownerDto : ownerDtos ) {
            collection.add( toOwner( ownerDto ) );
        }

        return collection;
    }

    protected List<PetDto> petListToPetDtoList(List<Pet> list) {
        if ( list == null ) {
            return null;
        }

        List<PetDto> list1 = new ArrayList<PetDto>( list.size() );
        for ( Pet pet : list ) {
            list1.add( petMapper.toPetDto( pet ) );
        }

        return list1;
    }

    protected List<Pet> petDtoListToPetList(List<PetDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Pet> list1 = new ArrayList<Pet>( list.size() );
        for ( PetDto petDto : list ) {
            list1.add( petMapper.toPet( petDto ) );
        }

        return list1;
    }
}
