package com.adriano.nutrition.service;

import com.adriano.nutrition.datasource.model.Nutricionista;
import com.adriano.nutrition.exception.NutricionistaNotFoundException;
import com.adriano.nutrition.repository.NutricionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BuscarNutricionistaPorIdServiceImpl {

    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    public Nutricionista buscarPorId(Long id) throws NutricionistaNotFoundException {
        Optional<Nutricionista> optionalNutricionista = nutricionistaRepository.findById(id);

        Nutricionista nutricionista = null;
        if (!optionalNutricionista.isPresent()) {
            throw new NutricionistaNotFoundException("Nutricionista Não Encontrado atraves do ID: ");
        } else {
            nutricionista = optionalNutricionista.get();
        }
        return nutricionista;
    }

    public void deletarPorId(Long id) throws NutricionistaNotFoundException {
        Optional<Nutricionista> optionalNutricionista = nutricionistaRepository.findById(id);
        if (!optionalNutricionista.isPresent()) {
            throw new NutricionistaNotFoundException("Nutricionista Não Encontrado atraves do ID: ");
        } else {
            nutricionistaRepository.delete(optionalNutricionista.get());
        }
    }
}
