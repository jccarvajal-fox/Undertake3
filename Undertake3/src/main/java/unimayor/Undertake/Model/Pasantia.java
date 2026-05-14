package unimayor.Undertake.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pasantias")
public class Pasantia {
    @Id
    private String id;
    private String empresa;
    private String area;
    private String descripcion;
    private String modalidad;
    private String ciudad;

    public Pasantia() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }
    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getModalidad() { return modalidad; }
    public void setModalidad(String modalidad) { this.modalidad = modalidad; }
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
}