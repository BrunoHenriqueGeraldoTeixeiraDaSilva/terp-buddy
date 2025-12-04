package com.brunosilva.terpbuddy.Repository;


import com.brunosilva.terpbuddy.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Find a user by their email (unique).
     * Return Optional to avoid nulls and make handling cleaner.
     */
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);


}
