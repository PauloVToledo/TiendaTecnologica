package gestorArchivos;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GestorDatos {
	private String datos;

	public void guardarDispositivo(@NotNull Object dispositivo) {
		try {
			File archivo = new File("dispositivos.txt");
			FileWriter fw = new FileWriter(archivo, true);
			PrintWriter pw = new PrintWriter(fw);


			pw.println(dispositivo.toString());

			pw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println("Ocurrió un error al guardar el dispositivo: " + e.getMessage());
		}
	}
}
