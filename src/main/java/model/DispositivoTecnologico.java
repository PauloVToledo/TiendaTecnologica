package model;

import java.util.ArrayList;

public abstract class DispositivoTecnologico {
	private String marca;
	private String ram;
	private String almacenamiento;
	private String procesador;
	private String modelo;
	private String anoFabricacion;
	private int precio;
	private int stock;
	private String tipo;
	private TiendaTecnologica tienda;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getRam() {
		return this.ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getAlmacenamiento() {
		return this.almacenamiento;
	}

	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnoFabricacion() {
		return this.anoFabricacion;
	}

	public void setAnoFabricacion(String anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public abstract String getTipo();

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public DispositivoTecnologico(String marca, String ram, String almacenamiento, String procesador, String modelo, String anoFabricacion, int precio, int stock, String tipo) {
	}

    public abstract ArrayList<String> obtenerEspecificacionesDispositivo();
}