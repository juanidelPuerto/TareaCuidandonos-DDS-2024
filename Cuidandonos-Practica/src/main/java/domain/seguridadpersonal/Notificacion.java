package domain.seguridadpersonal;

public class Notificacion {
    private String titulo;
    private String mensaje;


    public void notificar(Persona usuario){
        // La logica para enviar el mensaje al usuario destinatario
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
