package com.ngtanphuc.notemanagement.repo;

import com.ngtanphuc.notemanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository  // create a proxy class during runtime. Contains logic for save, delete, findBy,...
public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);  // using Optional to prevent NullPointerException

}
