package domain.seguridadpersonal;

import java.time.*;

public class Persona {
    private String nombre;
    private String apellido;
    private Sexo sexo;
    private  LocalDate fechaNacimiento;
    private boolean activo;
    private boolean aceptaNotificaciones;


    public int getEdad(){
        LocalDate fechaActual = LocalDate.now();
        Period diferencia = Period.between(this.getFechaNacimiento(), fechaActual);
        return diferencia.getYears();
    }

    public boolean isAceptaNotificaciones() {
        return aceptaNotificaciones;
    }

    public void setAceptaNotificaciones(boolean aceptaNotificaciones) {
        this.aceptaNotificaciones = aceptaNotificaciones;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
