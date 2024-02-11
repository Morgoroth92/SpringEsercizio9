package com.example.SpringEsercizio9.repositories;

import com.example.SpringEsercizio9.entities.cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface carsrepository extends JpaRepository<cars,Long> {
}