package com.example.demo.models;
import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String correo;
    private Integer prioridad;

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCorreo() {
        return correo;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
    public Integer getPrioridad() {
        return prioridad;
    }

}
