package domain.seguridadpersonal;

public class CalculadorDistancia implements DistanciaAdapter{
    private DistanceMatrixAPI adapter;

    @Override
    public double calcularDistancia(Direccion origen, Direccion destino) {
        return this.adapter.calcularDistancia(origen, destino);
    }
}
