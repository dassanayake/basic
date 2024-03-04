package org.lux.service.personal.basic.spring.boot.repository;

import org.lux.service.personal.basic.spring.boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByFirstName(String name);
}
