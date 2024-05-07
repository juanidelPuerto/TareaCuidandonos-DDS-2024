package domain.seguridadpersonal;

import java.util.List;

public class EvaluarFalsaAlarma implements Reaccion{
    private int minutosDeEspera;
    private Notificacion notificacion;
    @Override
    public void reaccionar(List<Persona> cuidadores, Persona usuario){
            if(this.esperar()>minutosDeEspera){
                //etc
            }
    }
    public double esperar(){
        //return minutosEsperadosHastaAhora       (es un ejemplo)
    }

    public int getMinutosDeEspera() {
        return minutosDeEspera;
    }

    public void setMinutosDeEspera(int minutosDeEspera) {
        this.minutosDeEspera = minutosDeEspera;
    }

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }
}
