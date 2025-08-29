package Logica;

public abstract class Usuario {
    private int ci;
    private String nombre;
    private String apellido;
    private String contraseña;

    public Usuario(int ci, String nombre, String apellido, String contraseña) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
    }

    public int getCi() { return ci; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }
}
