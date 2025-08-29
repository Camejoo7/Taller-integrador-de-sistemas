package Logica;

import java.util.ArrayList;
import java.util.List;

public class Tutorias {
    private ArrayList<Tutoria> tutorias = new ArrayList<>();
    private int id;

public Tutorias() {
	this.tutorias = new ArrayList<>();
}
 
    public List<Tutoria> listarTodas() {
        return new ArrayList<>(tutorias);
    }

    public List<Tutoria> listarPorAsignatura(String asignatura) {
        List<Tutoria> resultado = new ArrayList<>();
        for (Tutoria t : tutorias) {
            if (t.getAsignatura().equals(asignatura)) {
                resultado.add(t);
            }
        }
        return resultado;
    }
}