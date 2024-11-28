package com.example.Servidorsura6.modelos;
import jakarta.persistence.*;
import java.time.LocalDate;

//clase DAO. es una clase que solo tiene: clases, constructores, setters y getters.

@Entity // Una entidad es una tabla en sql. indica que esa clase va a ser una tabla
@Table(name= "usuarios") //para cambiarle el nombre de la tabla si quiero, por defecto el nombre de la tabla es el mismo de la clase. En minuscula.
public class Usuario {

    //id(AUTO-AUTO-LONG)
    //cedula(STRING )
    //nombres(String 50)
    //telefono(string 10)
    //direccion( string 50)
    //correo(String 20)
    //fechaNacimiento (LOCALDATE)

    @Id // se pone encima de la llave principal
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para que sea autoincremental.
    private Long id; // en mayuscula es una envultura

    @Column(name="documento", nullable = false, length = 50) //en java se llama cedula peor en la base de datos quiero que se llame documento... puede tener cualquier nombre
    //nullable= false, significa que no puede ser nulo.( si no pongo esto toma los valores por defecto.)
    private String cedula;
    private String nombres;
    private String telefono;
    private String direccion;
    private String correo;
    private LocalDate fechaNacimiento;

    //Constructores
    //siempre debe haber un constructor vacío.
    public Usuario() {
    }

    //siempre debe haber otro constructor que si tenga las variables.
    public Usuario(Long id, String cedula, String nombres, String telefono, String direccion, String correo, LocalDate fechaNacimiento) {
        this.id = id;
        this.cedula = cedula;
        this.nombres = nombres;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
    }

    //encapsulamiento

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
