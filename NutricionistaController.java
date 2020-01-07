package com.adriano.nutrition.controller;

import com.adriano.nutrition.datasource.model.Nutricionista;
import com.adriano.nutrition.exception.NutricionistaNotFoundException;
import com.adriano.nutrition.resource.model.NutricionistaResource;
import com.adriano.nutrition.service.BuscarNutricionistaPorIdServiceImpl;
import com.adriano.nutrition.service.BuscarNutricionistaServiceImpl;
import com.adriano.nutrition.service.CadastroNutricionistaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NutricionistaController {


    @Autowired
    private BuscarNutricionistaPorIdServiceImpl serviceBuscarPorId;

    @Autowired
    private BuscarNutricionistaServiceImpl serviceBuscar;

    @Autowired
    private CadastroNutricionistaServiceImpl serviceCadastro;

    @GetMapping(path = "/nutricionista")
    public List<Nutricionista> buscarNutricionistas() {
        return serviceBuscar.buscarTodosOsNutricionistas();
    }

    @GetMapping(path = "/nutricionista/id/{id}")
    public Nutricionista buscarNutricionistasPorId(@PathVariable(name = "id", required = true) Long id) throws NutricionistaNotFoundException {
        return serviceBuscarPorId.buscarPorId(id);
    }

    @PostMapping(path = "/nutricionista/save")
    public void salvarNutricionista(@RequestBody NutricionistaResource nutricionista) {
        serviceCadastro.cadastro(nutricionista);
    }

    @DeleteMapping(path = "/nutricionista/delete/{id}")
    public void deletarNutricionista(@PathVariable(name = "id", required = true) Long id) throws NutricionistaNotFoundException {
        serviceBuscarPorId.deletarPorId(id);
    }
}
