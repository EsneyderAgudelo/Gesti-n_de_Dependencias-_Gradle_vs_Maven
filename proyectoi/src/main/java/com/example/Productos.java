package com.example;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String tamaño;

    @Column(unique = true)
    private String peso;

    // Constructor por defecto
    public Productos() {}

    // Constructor con parámetros
    public Productos(String nombre, String Tamaño, String Peso) {
        this.nombre = nombre;
        this.tamaño = Tamaño;
        this.peso = Peso;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getEmail() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" +
            "id=" + id +
            ", nombre='" + nombre + '\'' +
            ", tamaño='" + tamaño + '\'' +
            ", peso='" + peso + '\'' +
            '}';
    }
}