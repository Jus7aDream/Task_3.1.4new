package ru.kata.spring.boot_security.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;
import java.util.Optional;

/**
 * @ In the name of Allah, most gracious and most merciful! 05.10.2022
 */
@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    Optional<Role> findById(Long id);
    List<Role> findAll();
}
