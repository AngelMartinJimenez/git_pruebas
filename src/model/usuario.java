package model;

public class usuario {
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public usuario(String nombre) {
		super();
		this.nombre = nombre;
	}

	public usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "usuario [nombre=" + nombre + "]";
	}
	
	

}
