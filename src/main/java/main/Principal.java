package main;

import model.DispositivoTecnologico;
import model.Tablet;
import model.TiendaTecnologica;
import model.Cliente;
import gestorArchivos.GestorDatos;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		menuu();
		inicializar();

	}

	public static void inicializar() {
		Tablet tablet = new Tablet("1080x2220", "Samsung", "4 GB", "64 GB", "MediaTek Helio P22T", "Tab A7 Lite", "2022", 200, 10, "Tablet");

		ArrayList<String> especificaciones = tablet.obtenerEspecificacionesDispositivo();

		for (String especificacion : especificaciones) {
			System.out.println(especificacion);
		}

		TiendaTecnologica tienda = new TiendaTecnologica();

		Cliente nuevoCliente = new Cliente();
		nuevoCliente.setNombre("Juan Perez");
		nuevoCliente.setCorreoElectronico("juan@example.com");
		nuevoCliente.setNumeroContacto("123456789");

		ArrayList<Cliente> clientes = tienda.agregarCliente(nuevoCliente);

		System.out.println("Clientes en la tienda:");
		for (Cliente cliente : clientes) {
			System.out.println("Nombre: " + cliente.getNombre());
			System.out.println("Correo Electrónico: " + cliente.getCorreoElectronico());
			System.out.println("Teléfono: " + cliente.getNumeroContacto());
		}

		ArrayList<DispositivoTecnologico> dispositivosPorMarca;
		dispositivosPorMarca = tienda.buscarPorMarca("Samsung");
		ArrayList<DispositivoTecnologico> dispositivosPorModelo = tienda.buscarPorModelo("Tab A7 Lite");
		ArrayList<DispositivoTecnologico> dispositivosPorTipo = tienda.buscarPorTipo("Tablet");

		System.out.println("Dispositivos encontrados por marca:");
		for (DispositivoTecnologico dispositivo : dispositivosPorMarca) {
			System.out.println("Marca: " + dispositivo.getMarca() + ", Modelo: " + dispositivo.getModelo());
		}

		System.out.println("Dispositivos encontrados por modelo:");
		for (DispositivoTecnologico dispositivo : dispositivosPorModelo) {
			System.out.println("Marca: " + dispositivo.getMarca() + ", Modelo: " + dispositivo.getModelo());
		}

		System.out.println("Dispositivos encontrados por tipo:");
		for (DispositivoTecnologico dispositivo : dispositivosPorTipo) {
			System.out.println("Marca: " + dispositivo.getMarca() + ", Modelo: " + dispositivo.getModelo() + ", Tipo: " + dispositivo.getTipo());
		}

		// Crear una instancia de GestorDatos
		GestorDatos gestor = new GestorDatos();

		// Llamar al método guardarDispositivo para guardar un dispositivo en el archivo "dispositivos.txt"
		gestor.guardarDispositivo(tablet);
	}
	public static void menuu() {
		Scanner scanner = new Scanner(System.in);

		int opcion = 0;

		while (opcion != 7) {
			System.out.println("**Menú de la Tienda Tecnológica**");
			System.out.println("1. Ver especificaciones de un dispositivo");
			System.out.println("2. Agregar un cliente");
			System.out.println("3. Buscar dispositivos por marca");
			System.out.println("4. Buscar dispositivos por modelo");
			System.out.println("5. Buscar dispositivos por tipo");
			System.out.println("6. Guardar un dispositivo");
			System.out.println("7. Salir");

			System.out.println("Seleccione una opción:");
			opcion = scanner.nextInt();

			switch (opcion) {
				case 7 -> System.out.println("Saliendo del programa...");
				default -> System.out.println("Opción no válida.");
			}
		}
	}
}
