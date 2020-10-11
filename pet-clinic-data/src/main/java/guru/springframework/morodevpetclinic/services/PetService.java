package guru.springframework.morodevpetclinic.services;

import guru.springframework.morodevpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
