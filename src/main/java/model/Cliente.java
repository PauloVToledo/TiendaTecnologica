package model;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellido;
	private String correoElectronico;
	private String numeroContacto;
	private String estadoCivil;
	private String ciudad;
	private TiendaTecnologica tiendaTecnologica;
	private ArrayList<Compra> compras = new ArrayList<Compra>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getNumeroContacto() {
		return this.numeroContacto;
	}

	public void setNumeroContacto(String numeroContacto) {
		this.numeroContacto = numeroContacto;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public ArrayList<DispositivoTecnologico> buscarPorMarca(Object marca) {
		ArrayList<DispositivoTecnologico> dispositivos = new ArrayList<DispositivoTecnologico>();
		for (DispositivoTecnologico dispositivo : this.tiendaTecnologica.getDispositivos()) {
			if (dispositivo.getMarca().equals(marca)) {
				dispositivos.add(dispositivo);
			}
		}
		return dispositivos;
	}

	public ArrayList<DispositivoTecnologico> buscarPorModelo(Object modelo) {
		ArrayList<DispositivoTecnologico> dispositivos = new ArrayList<DispositivoTecnologico>();
		for (DispositivoTecnologico dispositivo : this.tiendaTecnologica.getDispositivos()) {
			if (dispositivo.getModelo().equals(modelo)) {
				dispositivos.add(dispositivo);
			}
		}
		return dispositivos;
	}

	public ArrayList<DispositivoTecnologico> buscarPorTipo(Object tipo) {
		ArrayList<DispositivoTecnologico> dispositivos = new ArrayList<DispositivoTecnologico>();
		for (DispositivoTecnologico dispositivo : this.tiendaTecnologica.getDispositivos()) {
			if (dispositivo.getTipo().equals(tipo)) {
				dispositivos.add(dispositivo);
			}
		}
		return dispositivos;
	}

	public Cliente() {
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoElectronico = correoElectronico;
		this.numeroContacto = numeroContacto;
		this.estadoCivil = estadoCivil;
		this.ciudad = ciudad;
	}
}
