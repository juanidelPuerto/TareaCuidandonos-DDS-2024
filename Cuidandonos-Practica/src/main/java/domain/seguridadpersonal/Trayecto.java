package domain.seguridadpersonal;

public class Trayecto {
    private Direccion origen;
    private Direccion destino;
    private int minutosDetenido;
    private boolean llegoDestino;

    public double calcularTiempoDemora(Tiempo calculador){
            return calculador.calcularTiempo(this.getOrigen(), this.getDestino()) + this.getMinutosDetenido();
    }

    public Direccion getOrigen() {
        return origen;
    }

    public void setOrigen(Direccion origen) {
        this.origen = origen;
    }

    public Direccion getDestino() {
        return destino;
    }

    public void setDestino(Direccion destino) {
        this.destino = destino;
    }

    public int getMinutosDetenido() {
        return minutosDetenido;
    }

    public void setMinutosDetenido(int minutosDetenido) {
        this.minutosDetenido = minutosDetenido;
    }

    public boolean isLlegoDestino() {
        return llegoDestino;
    }

    public void setLlegoDestino(boolean llegoDestino) {
        this.llegoDestino = llegoDestino;
    }
}
