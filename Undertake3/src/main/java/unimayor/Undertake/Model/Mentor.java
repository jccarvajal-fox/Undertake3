package unimayor.Undertake.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Mentor {
    @Id
    private String id;
    private String nombre;
    private String especialidad;
    private String experiencia;


    }