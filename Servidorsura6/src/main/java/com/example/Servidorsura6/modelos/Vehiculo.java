package com.example.Servidorsura6.modelos;
import jakarta.persistence.*;

@Entity
@Table(name="vehiculos")
public class Vehiculo {

    //Id(auto-long)
    //Placa (string 6)
    //modelo (string)
    //marca (string)
    //cilindraje (string)
    //color (string)
    //descripcion (string)
    //numero de siniestros (int)

    @Id // se pone encima de la llave principal
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="placa", nullable = false, length = 7)
    private String placa;

    @Column(name="modelo", nullable = false, length = 4)
    private String modelo;

    @Column(name="marca", nullable = false, length = 10)
    private String marca;

    @Column(name="cilindraje", nullable = false, length = 4)
    private String cilindraje;

    @Column(name="color", nullable = false, length = 10)
    private String color;

    @Column(name="descripcion", nullable = false, length = 4)
    private String descripcion;

    @Column(name="numeroSiniestro", nullable = false)
    private Integer numeroSiniestros;

    // constructor vacio
    public Vehiculo() {
    }

    //constructor que si tiene la variable.
    public Vehiculo(Long id, String placa, String modelo, String marca, String cilindraje, String color, String descripcion, Integer numeroSiniestros) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.color = color;
        this.descripcion = descripcion;
        this.numeroSiniestros = numeroSiniestros;
    }

    //Encapsulamiento
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNumeroSiniestros() {
        return numeroSiniestros;
    }

    public void setNumeroSiniestros(Integer numeroSiniestros) {
        this.numeroSiniestros = numeroSiniestros;
    }
}
