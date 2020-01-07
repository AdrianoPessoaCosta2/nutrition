package com.adriano.nutrition.service;

import com.adriano.nutrition.datasource.model.Nutricionista;
import com.adriano.nutrition.exception.NutricionistaResourceException;
import com.adriano.nutrition.resource.model.NutricionistaResource;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class NutricionistaConversor {
    public Nutricionista conversor(NutricionistaResource nutricionistaResource) throws NutricionistaResourceException {
        try{
            Nutricionista nutricionista = new Nutricionista();
            Long idPaciente = checkIdPaciente(nutricionistaResource.getIdPaciente());
            LocalDate idade = checkIdade(nutricionistaResource.getIdade());
            nutricionista.setIdPaciente(idPaciente);
            nutricionista.setIdade(idade);
            nutricionista.setNome(nutricionistaResource.getNome());
            return nutricionista;
        }catch (Exception e){
            throw new NutricionistaResourceException("Falha ao converter para a entidade, resource; " + nutricionistaResource);
        }
    }
    private Long checkIdPaciente(String idPaciente){
        return Long.parseLong(idPaciente);
    }
    private LocalDate checkIdade(String idade){
        return LocalDate.parse(idade);
    }

}
