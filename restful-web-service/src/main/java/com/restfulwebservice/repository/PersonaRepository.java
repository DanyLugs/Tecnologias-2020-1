package com.restfulwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restfulwebservice.model.*;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
