package home.sfg.petclinic.homesfgpetclinic.services;

import home.sfg.petclinic.homesfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}

