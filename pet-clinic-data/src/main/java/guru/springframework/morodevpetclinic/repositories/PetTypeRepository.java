package guru.springframework.morodevpetclinic.repositories;

import guru.springframework.morodevpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Luca Moro on 31/10/2020 12:09
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
