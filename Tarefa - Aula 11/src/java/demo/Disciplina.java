/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Fatec
 */
public class Disciplina {
    
    private String sigla;
    private String nome;
    private String ementa;
    private String diadsemana;
    private String horario;

    public Disciplina(String sigla, String nome, String ementa, String diadsemana, String horario) {
        this.sigla = sigla;
        this.nome = nome;
        this.ementa = ementa;
        this.diadsemana = diadsemana;
        this.horario = horario;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public String getDiadsemana() {
        return diadsemana;
    }

    public String getHorario() {
        return horario;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public void setDiadsemana(String diadsemana) {
        this.diadsemana = diadsemana;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

}
