package model;

import java.time.LocalDate;
import java.util.Calendar;


public class Especialidad {

    private Integer idespecialidad;
    private String nomespecialidad;
    private Boolean estado;
    private LocalDate fechacreada;

    public Especialidad(Integer idespecialidad, String nomespecialidad, Boolean estado, LocalDate fechacreada) {
        this.idespecialidad = idespecialidad;
        this.nomespecialidad = nomespecialidad;
        this.estado = estado;
        this.fechacreada = fechacreada;
    }

    public Integer getIdespecialidad() {
        return idespecialidad;
    }

    public void setIdespecialidad(Integer idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

    public String getNomespecialidad() {
        return nomespecialidad;
    }

    public void setNomespecialidad(String nomespecialidad) {
        this.nomespecialidad = nomespecialidad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechacreada() {
        return fechacreada;
    }

    public void setFechacreada(LocalDate fechacreada) {
        this.fechacreada = fechacreada;
    }


}
