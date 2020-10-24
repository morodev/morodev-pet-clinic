package guru.springframework.morodevpetclinic.services.map;

import guru.springframework.morodevpetclinic.model.Pet;
import guru.springframework.morodevpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Luca Moro on 17/10/2020 12:41
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
