package Logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tutorias {
    private HashMap<Integer, Tutoria> tutorias = new HashMap<>();
    private int id = 1;


    public GestorTutorias() {
    }

    public Tutoria crear(String tema, String asignatura, String fecha, String hora, String docenteCi) {
    		Tutoria t = new Tutoria(id, tema, asignatura, fecha, hora, docenteCi);
    		tutorias.put(t.getId(), t);
    		id++;
    		return t;
    }
    
    public List<Tutoria> listarTodas() {
        return new ArrayList<>(tutorias.values());
    }


    public List<Tutoria> listarPorAsignatura(String asignatura) {
        List<Tutoria> resultado = new ArrayList<>();
        for (Tutoria t : tutorias.values()) {
            if (t.getAsignatura().equals(asignatura)) {
                resultado.add(t);
            }
        }
        return resultado;
    }
    
    	
}