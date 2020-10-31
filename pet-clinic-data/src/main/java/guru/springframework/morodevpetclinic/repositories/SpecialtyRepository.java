package guru.springframework.morodevpetclinic.repositories;

import guru.springframework.morodevpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Luca Moro on 31/10/2020 12:10
 */
public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
