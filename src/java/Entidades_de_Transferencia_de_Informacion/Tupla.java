
package Entidades_de_Transferencia_de_Informacion;


public class Tupla {
    private int id;
    private String tipo;
    
    public Tupla(){}
    
    public Tupla(int id, String tipo){
        this.id = id;
        this.tipo = tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }
}
