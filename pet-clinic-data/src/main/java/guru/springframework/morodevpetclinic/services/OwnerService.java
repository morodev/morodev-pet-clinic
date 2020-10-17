package guru.springframework.morodevpetclinic.services;

import guru.springframework.morodevpetclinic.model.Owner;


/**
 * Created by Luca Moro on 11/10/2020  19:14
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
