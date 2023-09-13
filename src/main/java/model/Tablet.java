package model;

import java.util.ArrayList;
import model.Accesorio;

public class Tablet extends DispositivoTecnologico {
	private String resolucionPantalla;
	private ArrayList<Accesorio> accesorios = new ArrayList<Accesorio>();

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public ArrayList<Accesorio> listaAccesorios(Accesorio accesorio) {
		throw new UnsupportedOperationException();
	}

	public Tablet(String resolucionPantalla, String marca, String ram, String almacenamiento, String procesador, String modelo, String anoFabricacion, int precio, int stock, String tipo) {
		super(marca, ram,  almacenamiento, procesador,modelo, anoFabricacion, precio, stock, tipo);
		this.resolucionPantalla=resolucionPantalla;
	}

	@Override
	public String getTipo() {
		return "Tablet";
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
		especificaciones.add("Resolución de pantalla: " + this.getResolucionPantalla());
		return especificaciones;
	}

	public static ArrayList<Tablet> dispositivos() {
		ArrayList<Tablet> dispositivos = new ArrayList<>();
		dispositivos.add(new Tablet("1080x2220", "Samsung", "4 GB", "64 GB", "MediaTek Helio P22T", "Tab A7 Lite", "2022", 200, 10, "Tablet"));
		dispositivos.add(new Tablet("1180x2560", "Apple", "6 GB", "128 GB", "Apple A15 Bionic", "iPad mini 6", "2021", 500, 5, "Tablet"));
		dispositivos.add(new Tablet("1384x2800", "Samsung", "8 GB", "256 GB", "Qualcomm Snapdragon 8 Gen 1", "Galaxy Tab S8", "2022", 1000, 10, "Tablet"));
		return dispositivos;
	}
}
