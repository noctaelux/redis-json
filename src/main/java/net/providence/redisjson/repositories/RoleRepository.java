package net.providence.redisjson.repositories;

import net.providence.redisjson.models.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role,String> {
    Role findFirstByName(String role);
}
