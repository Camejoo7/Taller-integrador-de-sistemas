package Logica;

public class Docente extends Usuario{
	private String asignatura;
	
	public Docente(int ci, String nombre, String apellido, String contraseña, String asignatura) {
		super(ci, nombre, apellido, contraseña);
		this.asignatura = asignatura;
		
	}


}
