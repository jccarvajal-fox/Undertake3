package com.unimayor.Undertake.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Pasantias")
public class PasantiasDTO {

    @Id
    private String id;
    private String empresa;
    private String area;
    private String duracion;
    private String descripcion;

    public PasantiasDTO() {
    }

    public PasantiasDTO(String id, String empresa, String area, String duracion, String descripcion) {
        this.id = id;
        this.empresa = empresa;
        this.area = area;
        this.duracion = duracion;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}