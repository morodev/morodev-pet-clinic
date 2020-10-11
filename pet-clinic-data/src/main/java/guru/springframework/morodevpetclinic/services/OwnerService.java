package guru.springframework.morodevpetclinic.services;

import guru.springframework.morodevpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Luca Moro on 11/10/2020  19:14
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
