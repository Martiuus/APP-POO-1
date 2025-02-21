package model;

import java.time.LocalDate;

public class CicloAcademico {

    private Integer idciclo;
    private String nomciclo;
    private String descripcion;
    private LocalDate fechainicio;
    private LocalDate fechafin;

    public CicloAcademico(Integer idciclo, String nomciclo, String descripcion, LocalDate fechainicio, LocalDate fechafin) {
        this.idciclo = idciclo;
        this.nomciclo = nomciclo;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }

    public Integer getIdciclo() {
        return idciclo;
    }

    public void setIdciclo(Integer idciclo) {
        this.idciclo = idciclo;
    }

    public String getNomciclo() {
        return nomciclo;
    }

    public void setNomciclo(String nomciclo) {
        this.nomciclo = nomciclo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }
}
