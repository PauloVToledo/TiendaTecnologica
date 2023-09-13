package model;

import java.util.ArrayList;

public class Compra {
	private String fechaCompra;
	private Cliente cliente;
	private TiendaTecnologica tiendaTecnologica;
	private ArrayList<DispositivoTecnologico> dispositivosComprados;

	public String getFechaCompra() {
		return this.fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public boolean compra(Object stock) {
		if (stock instanceof Integer) {
			// Se compra un dispositivo
			DispositivoTecnologico dispositivo = this.tiendaTecnologica.getDispositivos().get((Integer) stock);
			this.dispositivosComprados.add(dispositivo);
			this.tiendaTecnologica.getDispositivos().remove(dispositivo);
			return true;
		} else {
			// Se compra una lista de dispositivos
			ArrayList<DispositivoTecnologico> dispositivos = (ArrayList<DispositivoTecnologico>) stock;
			this.dispositivosComprados.addAll(dispositivos);
			for (DispositivoTecnologico dispositivo : dispositivos) {
				this.tiendaTecnologica.getDispositivos().remove(dispositivo);
			}
			return true;
		}
	}

	public Compra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
		this.dispositivosComprados = new ArrayList<DispositivoTecnologico>();
	}
}
