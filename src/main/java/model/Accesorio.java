package model;

public class Accesorio {
	private String nombre;
	private Tablet tablet;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Accesorio(String nombre) {
		throw new UnsupportedOperationException();
	}
}