package guru.springframework.morodevpetclinic.services;

import guru.springframework.morodevpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
