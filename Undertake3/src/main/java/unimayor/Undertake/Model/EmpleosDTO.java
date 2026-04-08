package unimayor.Undertake.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Empleos")
public class EmpleosDTO {

    @Id
    private String id;
    private String empresa;
    private String cargo;
    private String descripcion;
    private String salario;

    public EmpleosDTO() {
    }

    public EmpleosDTO(String id, String empresa, String cargo, String descripcion, String salario) {
        this.id = id;
        this.empresa = empresa;
        this.cargo = cargo;
        this.descripcion = descripcion;
        this.salario = salario;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
