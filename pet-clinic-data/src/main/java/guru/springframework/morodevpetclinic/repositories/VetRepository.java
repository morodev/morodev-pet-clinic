package guru.springframework.morodevpetclinic.repositories;

import guru.springframework.morodevpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Luca Moro on 31/10/2020 12:12
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
