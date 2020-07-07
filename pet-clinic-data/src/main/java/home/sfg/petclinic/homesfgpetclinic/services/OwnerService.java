package home.sfg.petclinic.homesfgpetclinic.services;

import home.sfg.petclinic.homesfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
