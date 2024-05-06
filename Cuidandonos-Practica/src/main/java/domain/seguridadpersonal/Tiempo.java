package domain.seguridadpersonal;

public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;
    private double velocidadPersona;
    private DistanciaAdapter adapterDistancia;

    public double calcularTiempo(Direccion origen, Direccion destino){
            return (this.adapterDistancia.calcularDistancia(origen, destino) / this.getVelocidadPersona());
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public double getVelocidadPersona() {
        return velocidadPersona;
    }

    public void setVelocidadPersona(double velocidadPersona) {
        this.velocidadPersona = velocidadPersona;
    }

    public DistanciaAdapter getAdapterDistancia() {
        return adapterDistancia;
    }

    public void setAdapterDistancia(DistanciaAdapter adapterDistancia) {
        this.adapterDistancia = adapterDistancia;
    }
}
