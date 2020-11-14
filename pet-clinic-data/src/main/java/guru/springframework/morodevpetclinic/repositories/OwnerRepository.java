package guru.springframework.morodevpetclinic.repositories;

import guru.springframework.morodevpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created By Luca Moro on 31/10/2020 12:07
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
