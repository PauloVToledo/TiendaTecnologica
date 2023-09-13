package model;

import java.util.ArrayList;

public class Notebook extends DispositivoTecnologico {
	private String resolucionPantalla;
	private String tipoTeclado;
	private int mAhBateria;

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public String getTipoTeclado() {
		return this.tipoTeclado;
	}

	public void setTipoTeclado(String tipoTeclado) {
		this.tipoTeclado = tipoTeclado;
	}

	public int getMAhBateria() {
		return this.mAhBateria;
	}

	public void setMAhBateria(int mAhBateria) {
		this.mAhBateria = mAhBateria;
	}

	public Notebook(String resolucionPantalla, String tipoTeclado, int mAhBateria, String marca, String ram, String almacenamiento, String procesador, String modelo, String anoFabricacion, int precio, int stock, String tipo) {
		super(marca,ram,  almacenamiento, procesador,  modelo, anoFabricacion, precio, stock, tipo);
		this.resolucionPantalla=resolucionPantalla;
		this.tipoTeclado=tipoTeclado;
		this.mAhBateria=mAhBateria;
	}

	@Override
	public String getTipo() {
		return "Notebook";
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
		especificaciones.add("Tipo de teclado: " + this.getTipoTeclado());
		especificaciones.add("Batería: " + this.getMAhBateria() + " mAh");
		return especificaciones;
	}

	public static ArrayList<Notebook> dispositivos() {
		ArrayList<Notebook> dispositivos = new ArrayList<>();
		dispositivos.add(new Notebook("1920x1080", "QWERTY", 5000, "Asus", "16 GB", "512 GB SSD", "Intel Core i5-12500H", "VivoBook Pro 15 OLED", "2023", 1500, 10, "Notebook"));
		dispositivos.add(new Notebook("2560x1600", "QWERTY", 7000, "Lenovo", "16 GB", "1 TB SSD", "AMD Ryzen 7 5800H", "ThinkPad X1 Carbon Gen 10", "2022", 2000, 5, "Notebook"));
		dispositivos.add(new Notebook("2560x1440", "QWERTY", 8000, "Acer", "16 GB", "1 TB SSD", "Intel Core i7-12700H", "Acer Nitro 5", "2023", 2500, 10, "Notebook"));
		dispositivos.add(new Notebook("1920x1200", "QWERTY", 6000, "HP", "16 GB", "512 GB SSD", "AMD Ryzen 5 5600H", "HP Pavilion Aero 13", "2022", 1000, 10, "Notebook"));
		return dispositivos;
	}
}
