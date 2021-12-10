package com.example.HolaSpring.dao;

import com.example.HolaSpring.Domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
