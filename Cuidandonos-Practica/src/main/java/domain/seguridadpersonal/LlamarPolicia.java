package domain.seguridadpersonal;

import java.util.List;

public class LlamarPolicia implements Reaccion{
    private String numeroDeTelefono;
    @Override
    public void reaccionar(List<Persona> cuidadores, Persona usuario){
            // llamarA(this.getNumeroDeTelefono());    Es un ejemplo
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
}
