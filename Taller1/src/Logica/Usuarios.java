package Logica;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Usuarios {
    private HashMap<Integer, Usuario> usuarios = new HashMap<>();  

    public boolean agregarUsuario(Usuario u) {
        if (usuarios.containsKey(u.getCi())) return false;
        usuarios.put(u.getCi(), u);
        return true;
    }


    public Usuario buscarUsuario(int ci) {  
        return usuarios.get(ci);
    }
    
    public boolean login(int ci, String contraseña) {
        Usuario u = usuarios.get(ci);
        return u != null && u.getContraseña().equals(contraseña);
    }
} 