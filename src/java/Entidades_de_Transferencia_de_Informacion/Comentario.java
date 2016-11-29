
package Entidades_de_Transferencia_de_Informacion;


public class Comentario extends Mensaje{
    private String adjunto;
    private String nombreArchivo;
    private int respuesta;
    
    public Comentario(){}
    
    public Comentario(int id, int idAutor, int idProyecto, String comentario,
            String fecha, String hora, String adjunto, String nombreArchivo, 
            int respuesta){
        super( id, idAutor, idProyecto, comentario, fecha, hora);
        this.adjunto = adjunto;
        this.nombreArchivo = nombreArchivo;
        this.respuesta = respuesta;
    }

    public void setAdjunto(String adjunto) {
        this.adjunto = adjunto;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public String getAdjunto() {
        return adjunto;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public int getRespuesta() {
        return respuesta;
    }
    
}
