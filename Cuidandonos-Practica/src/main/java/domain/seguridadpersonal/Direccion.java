package domain.seguridadpersonal;

public class Direccion {
    private String calle;
    private String altura;

    public String getDireccionComoString(){
        return this.getCalle() + " " + this.getAltura();
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
}
