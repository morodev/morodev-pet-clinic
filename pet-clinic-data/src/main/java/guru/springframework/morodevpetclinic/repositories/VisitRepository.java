package guru.springframework.morodevpetclinic.repositories;

import guru.springframework.morodevpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By Luca Moro on 31/10/2020 12:14
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
