package com.brunosilva.terpbuddy.Repository;


import com.brunosilva.terpbuddy.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    /**
     * Find a user by their email (unique).
     * Return Optional to avoid nulls and make handling cleaner.
     */
    Optional<Users> findByEmail(String email);
    boolean existsByEmail(String email);





}
