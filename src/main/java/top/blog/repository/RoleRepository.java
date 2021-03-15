package top.blog.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import top.blog.model.Role;
import top.blog.model.RoleName;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName name);
}