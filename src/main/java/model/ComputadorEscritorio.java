package model;

import java.util.ArrayList;

public class ComputadorEscritorio extends DispositivoTecnologico {
	private String tarjetaVideo;
	private String fuentePoder;
	private String chasis;
	private Pantalla pantalla;

	public String getTarjetaVideo() {
		return this.tarjetaVideo;
	}

	public void setTarjetaVideo(String tarjetaVideo) {
		this.tarjetaVideo = tarjetaVideo;
	}

	public String getFuentePoder() {
		return this.fuentePoder;
	}

	public void setFuentePoder(String fuentePoder) {
		this.fuentePoder = fuentePoder;
	}

	public String getChasis() {
		return this.chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public ComputadorEscritorio(String tarjetaVideo, String fuentePoder, String chasis, String marca, String ram, String almacenamiento, String procesador, String modelo, String anoFabricacion, int precio, int stock, String tipo) {
		super(marca,ram,almacenamiento, procesador, modelo, anoFabricacion, precio, stock, tipo);
		this.tarjetaVideo=tarjetaVideo;
		this.fuentePoder=fuentePoder;
		this.chasis=chasis;
	}

	@Override
	public String getTipo() {
		return "Computador de escritorio";
	}

	public ArrayList<String> obtenerEspecificacionesDispositivo() {
		ArrayList<String> especificaciones = new ArrayList<String>();
		especificaciones.add("Marca: " + this.getMarca());
		especificaciones.add("RAM: " + this.getRam());
		especificaciones.add("Almacenamiento: " + this.getAlmacenamiento());
		especificaciones.add("Procesador: " + this.getProcesador());
		especificaciones.add("Modelo: " + this.getModelo());
		especificaciones.add("Año de fabricación: " + this.getAnoFabricacion());
		especificaciones.add("Precio: " + this.getPrecio());
		especificaciones.add("Stock: " + this.getStock());
		especificaciones.add("Tipo: " + this.getTipo());
		especificaciones.add("Tarjeta de video: " + this.getTarjetaVideo());
		especificaciones.add("Fuente de poder: " + this.getFuentePoder());
		especificaciones.add("Chasis: " + this.getChasis());
		if (this.getPantalla() != null) {
			especificaciones.add("Pantalla: " + this.getPantalla().getResolucionPantalla() + " " + this.getPantalla().getTipo());
		} else {
			especificaciones.add("Pantalla: No tiene pantalla");
		}
		return especificaciones;
	}

	public Pantalla getPantalla() {
		return this.pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public static ArrayList<ComputadorEscritorio> dispositivos() {
		ArrayList<ComputadorEscritorio> dispositivos = new ArrayList<>();
		dispositivos.add(new ComputadorEscritorio("Nvidia GeForce RTX 3090", "Corsair RM850x", "Cooler Master MasterCase H500M", "Asus", "16 GB", "1 TB SSD", "Intel Core i9-12900K", "ROG Strix G15", "2023", 3000, 10, "Computador de escritorio"));
		dispositivos.add(new ComputadorEscritorio("AMD Radeon RX 6900 XT", "Seasonic Focus GX-850", "Fractal Design Meshify C ATX Mid Tower Case", "MSI", "16 GB", "500 GB SSD", "AMD Ryzen 9 5950X", "MPG Trident 3090", "2022", 2500, 5, "Computador de escritorio"));
		dispositivos.add(new ComputadorEscritorio("Nvidia GeForce RTX 3080 Ti", "EVGA SuperNOVA G3 850W", "Lian Li LANCOOL II Mesh RGB ATX Mid Tower Case", "Lenovo", "16 GB", "1 TB SSD", "Intel Core i7-12700K", "Legion Tower 5i", "2023", 2000, 10, "Computador de escritorio"));
		return dispositivos;
	}
}
