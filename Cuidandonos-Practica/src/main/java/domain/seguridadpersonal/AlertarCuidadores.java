package domain.seguridadpersonal;

import java.util.List;

public class AlertarCuidadores  implements Reaccion{
    @Override
    public void reaccionar(List<Persona> cuidadores, Persona usuario){
        Notificacion notificacionAlerta = new Notificacion();
        notificacionAlerta.setTitulo("ALERTA INCIDENTE");
        notificacionAlerta.setMensaje("El transeunte a cargo sufrio una accidente");
            for(Persona cuidador: cuidadores){
                notificacionAlerta.notificar(cuidador);
            }
    }
}
