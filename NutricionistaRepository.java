package com.adriano.nutrition.repository;


import com.adriano.nutrition.datasource.model.Nutricionista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutricionistaRepository extends JpaRepository<Nutricionista, Long> {

}
