package guru.springframework.morodevpetclinic.repositories;

import guru.springframework.morodevpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By Luca Moro on 31/10/2020 12:08
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
