package model;

public class Pantalla {
	private String marca;
	private String modelo;
	private int anno;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnno() {
		return this.anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public Pantalla(String marca, String modelo, int anno) {
		throw new UnsupportedOperationException();
	}

    public String getResolucionPantalla() {
		return "Resolución";
    }

	public String getTipo() {
		return "Pantalla";
	}
}