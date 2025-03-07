package com.example.Ask.Repositories;
import com.example.Ask.Entities.Request;
import com.example.Ask.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {
    Optional<Request> findByName(String animalName);

}
