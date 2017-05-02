package org.programirame.repositories;

import org.programirame.models.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<AppUser, Long>{

    AppUser findByUsername(String userName);

}
