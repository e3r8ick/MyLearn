

package Entidades_de_Transferencia_de_Informacion;


public class Oferta extends Mensaje{
    private int precio;
    private String tiempo;  
    
    
    public Oferta(){}
    
    public Oferta( int id, int idAutor, int idProyecto, String comentario,
            String fecha, String hora, int precio, String tiempo){
        super( id, idAutor, idProyecto, comentario, fecha, hora);
        this.precio = precio;
        this.tiempo = tiempo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTiempo() {
        return tiempo;
    }
}
