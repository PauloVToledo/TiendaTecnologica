package model;

import java.util.ArrayList;

public class TiendaTecnologica {
	private String direccion;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<DispositivoTecnologico> dispositivos = new ArrayList<DispositivoTecnologico>();
	private ArrayList<Compra> compras = new ArrayList<Compra>();
	private TiendaTecnologica tiendaTecnologica;

	public TiendaTecnologica() {
		dispositivo = tiendaTecnologica.getDispositivos();
	}


	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<String> obtenerEspecificacionesDispositivo(DispositivoTecnologico dispositivo) {
		ArrayList<String> especificaciones = new ArrayList<String>();
		especificaciones.add("Marca: " + dispositivo.getMarca());
		especificaciones.add("RAM: " + dispositivo.getRam());
		especificaciones.add("Almacenamiento: " + dispositivo.getAlmacenamiento());
		especificaciones.add("Procesador: " + dispositivo.getProcesador());
		especificaciones.add("Modelo: " + dispositivo.getModelo());
		especificaciones.add("Año de fabricación: " + dispositivo.getAnoFabricacion());
		especificaciones.add("Precio: " + dispositivo.getPrecio());
		especificaciones.add("Stock: " + dispositivo.getStock());
		especificaciones.add("Tipo: " + dispositivo.getTipo());
		return especificaciones;
	}

	public ArrayList<Cliente> agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
		return this.clientes;
	}

	ArrayList<DispositivoTecnologico> dispositivo;

	public ArrayList<DispositivoTecnologico> getDispositivos() {
		return this.dispositivos;
	}

	public ArrayList<DispositivoTecnologico> buscarPorMarca(String marcaBuscada) {
		ArrayList<DispositivoTecnologico> dispositivosEncontrados = new ArrayList<DispositivoTecnologico>();

		// Recorre la lista de dispositivos en la tienda y compara la marca con la marca buscada
		for (DispositivoTecnologico dispositivo : this.tiendaTecnologica.getDispositivos()) {
			if (dispositivo.getMarca().equalsIgnoreCase(marcaBuscada)) {
				dispositivosEncontrados.add(dispositivo);
			}
		}

		return dispositivosEncontrados;
	}

	public ArrayList<DispositivoTecnologico> buscarPorModelo(String modeloBuscado) {
		ArrayList<DispositivoTecnologico> dispositivosEncontrados = new ArrayList<DispositivoTecnologico>();

		// Recorre la lista de dispositivos en la tienda y compara el modelo con el modelo buscado
		for (DispositivoTecnologico dispositivo : this.tiendaTecnologica.getDispositivos()) {
			if (dispositivo.getModelo().equalsIgnoreCase(modeloBuscado)) {
				dispositivosEncontrados.add(dispositivo);
			}
		}

		return dispositivosEncontrados;
	}

	public ArrayList<DispositivoTecnologico> buscarPorTipo(String tipoBuscado) {
		ArrayList<DispositivoTecnologico> dispositivosEncontrados = new ArrayList<DispositivoTecnologico>();

		for (DispositivoTecnologico dispositivo : this.tiendaTecnologica.getDispositivos()) {
			if (dispositivo.getTipo().equalsIgnoreCase(tipoBuscado)) {
				dispositivosEncontrados.add(dispositivo);
			}
		}

		return dispositivosEncontrados;
	}

}