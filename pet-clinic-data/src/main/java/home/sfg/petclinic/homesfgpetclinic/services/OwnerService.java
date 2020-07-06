package home.sfg.petclinic.homesfgpetclinic.services;

import home.sfg.petclinic.homesfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
