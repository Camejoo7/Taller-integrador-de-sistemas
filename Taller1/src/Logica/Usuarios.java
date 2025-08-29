package Logica;

import java.util.List;
import java.util.ArrayList;

public class Usuarios {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public Usuarios() {
    	
    }

    public boolean agregarUsuario(Usuario u) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCi() == u.getCi()) {
                return false;
            }
        }
        usuarios.add(u);
        return true;
    }

    public Usuario buscarUsuario(int ci) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCi() == ci) {
                return usuario;
            }
        }
        return null;
    }

    public boolean login(int ci, String contraseña) {
        Usuario u = buscarUsuario(ci);
        return u != null && u.getContraseña().equals(contraseña);
    }
}