package Logica;

public class Tarea {

    private String descripcion;
    private boolean entregada;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.entregada = false;
    }


    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

}
