package com.molier.store.repositories;

import org.springframework.data.repository.CrudRepository;
import com.molier.store.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
     
}
