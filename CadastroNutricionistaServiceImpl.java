package com.adriano.nutrition.service;

import com.adriano.nutrition.datasource.model.Nutricionista;
import com.adriano.nutrition.exception.NutricionistaResourceException;
import com.adriano.nutrition.repository.NutricionistaRepository;
import com.adriano.nutrition.resource.model.NutricionistaResource;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroNutricionistaServiceImpl {

    private static final Logger Log = Logger.getLogger(CadastroNutricionistaServiceImpl.class);


    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    @Autowired
    private NutricionistaConversor service;

    public void cadastro(NutricionistaResource nutricionistaResource){


        try {
            Nutricionista nutricionista = service.conversor(nutricionistaResource);
            nutricionistaRepository.saveAndFlush(nutricionista);
        } catch (NutricionistaResourceException e) {
           Log.error("Erro ao salvar o nutricionista" + e.getMessage(),e);
        }

    }

}
