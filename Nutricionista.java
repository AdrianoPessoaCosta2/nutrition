package com.adriano.nutrition.datasource.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

@Entity(name = "nutricionista")
@Table
public class Nutricionista implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private LocalDate idade;

    @Column
    private String codigoRegistro;

    @Column
    private Long idPaciente;


    public Nutricionista() {
    }

    public Nutricionista(String nome, LocalDate idade, String codigoRegistro, Long idPaciente) {
        this.nome = nome;
        this.idade = idade;
        this.codigoRegistro = codigoRegistro;
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long id_paciente) {
        this.idPaciente = id_paciente;
    }

}
