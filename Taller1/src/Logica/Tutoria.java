package Logica;

import java.util.ArrayList;
import java.util.List;

public class Tutoria {
    private int id;
    private String tema;
    private String asignatura;
    private String fecha;


    private List<Tarea> tareas;

    public Tutoria(int id, String tema, String asignatura,
                   String fecha, String hora, String docenteCi) {
        this.id = id;
        this.tema = tema;
        this.asignatura = asignatura;
        this.fecha = fecha;
        this.tareas = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getTema() { return tema; }
    public void setTema(String tema) { this.tema = tema; }
    public String getAsignatura() { return asignatura; }
    public void setAsignatura(String asignatura) { this.asignatura = asignatura; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public List<Tarea> getTareas() { return tareas; }
    
}
