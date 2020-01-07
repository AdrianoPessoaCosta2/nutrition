package com.adriano.nutrition.service;

import com.adriano.nutrition.datasource.model.Nutricionista;
import com.adriano.nutrition.repository.NutricionistaRepository;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuscarNutricionistaServiceImpl {

    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    public List<Nutricionista> buscarTodosOsNutricionistas(){
        return nutricionistaRepository.findAll();
    }

}
