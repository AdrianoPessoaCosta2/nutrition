package com.adriano.nutrition.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NutricionistaResource {

    @JsonProperty("nomeNutricionista")
    private String nome;

    @JsonProperty("idade")
    private String idade;

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    @JsonProperty("codigoRegistro")
    private String codigoRegistro;

    @JsonProperty("idPaciente")
    private String idPaciente;

    public NutricionistaResource(String nome, String idPaciente) {
        this.nome = nome;
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public String toString() {
        return "NutricionistaResource{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", codigoRegistro='" + codigoRegistro + '\'' +
                ", idPaciente='" + idPaciente + '\'' +
                '}';
    }
}
