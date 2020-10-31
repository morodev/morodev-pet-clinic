package guru.springframework.morodevpetclinic.repositories;

import guru.springframework.morodevpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By Luca Moro on 31/10/2020 12:07
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
