

package domain.seguridadpersonal;

import java.util.*;

public class Recorrido {
    private Persona Transeunte;
    private List<Persona> cuidadoresElegidos;
    private List<Persona> cuidadoresConfirmados;
    private Direccion direccionOrigen;
    private Direccion destino;
    private double distancia;
    private Tiempo tiempoDemoraEstimado;
    private ArrayList<Trayecto>  trayecto;
    private boolean detencionParada;
    private Reaccion formaDeReaccionar;

    public Recorrido(Persona transeunte, java.util.List<Persona> cuidadoresElegidos, java.util.List<Persona> cuidadoresConfirmados, Direccion direccionOrigen, Direccion destino, double distancia, Tiempo tiempoDemoraEstimado, boolean detencionParada, Reaccion formaDeReaccionar) {
        Transeunte = transeunte;
        this.cuidadoresElegidos = cuidadoresElegidos;
        this.cuidadoresConfirmados = cuidadoresConfirmados;
        this.direccionOrigen = direccionOrigen;
        this.destino = destino;
        this.distancia = distancia;
        this.tiempoDemoraEstimado = tiempoDemoraEstimado;
        this.detencionParada = detencionParada;
        this.formaDeReaccionar = formaDeReaccionar;
        this.trayecto = new ArrayList<>();
    }

    public double calcularTiempoRecorrido(Tiempo calculador){
        if(this.isDetencionParada()){
           return this.calcularTiempoTrayecto(calculador);
        }else{
            return this.calcularTiempoTotal((calculador));
        }
    }

    public double calcularTiempoTotal(Tiempo calculador){
            return calculador.calcularTiempo(this.getDireccionOrigen(), this.getDestino());
    }

    public double calcularTiempoTrayecto(Tiempo calculador){
        double tiempo = 0;
        for(Trayecto t : this.getTrayecto()){
            tiempo = tiempo + t.calcularTiempoDemora(calculador);
        }
        return tiempo;
    }

    public Persona getTranseunte() {
        return Transeunte;
    }

    public void setTranseunte(Persona transeunte) {
        Transeunte = transeunte;
    }

    public List<Persona> getCuidadoresElegidos() {
        return cuidadoresElegidos;
    }

    public void setCuidadoresElegidos(List<Persona> cuidadoresElegidos) {
        this.cuidadoresElegidos = cuidadoresElegidos;
    }

    public List<Persona> getCuidadoresConfirmados() {
        return cuidadoresConfirmados;
    }

    public void setCuidadoresConfirmados(List<Persona> cuidadoresConfirmados) {
        this.cuidadoresConfirmados = cuidadoresConfirmados;
    }

    public Direccion getDireccionOrigen() {
        return direccionOrigen;
    }

    public void setDireccionOrigen(Direccion direccionOrigen) {
        this.direccionOrigen = direccionOrigen;
    }

    public Direccion getDestino() {
        return destino;
    }

    public void setDestino(Direccion destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Tiempo getTiempoDemoraEstimado() {
        return tiempoDemoraEstimado;
    }

    public void setTiempoDemoraEstimado(Tiempo tiempoDemoraEstimado) {
        this.tiempoDemoraEstimado = tiempoDemoraEstimado;
    }

    public ArrayList<Trayecto> getTrayecto() {
        return trayecto;
    }

    public boolean isDetencionParada() {
        return detencionParada;
    }

    public void setDetencionParada(boolean detencionParada) {
        this.detencionParada = detencionParada;
    }
}
