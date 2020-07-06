package home.sfg.petclinic.homesfgpetclinic.services;

import home.sfg.petclinic.homesfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> finAll();
}
