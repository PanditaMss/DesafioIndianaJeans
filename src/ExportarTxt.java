
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExportarTxt implements ExportadorTxt {
	public void exportar(ProductoServicio prd) {
		if (prd.getListaProductos().size() > 0) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Ingese el nombre de la ruta donde desea exportar el archivo clientes.txt");
			String nombreDir = sc.next();

			String directorio = nombreDir + "/";

			File directorioFinal = new File("src/" + directorio);
			File archivo = new File("src/" + directorio + "clientes" + ".txt");
			if (!directorioFinal.exists()) {
				if (directorioFinal.mkdirs()) {
					System.out.println("El directorio " + directorio + " ha sido creado exitosamente");
				} else {
					System.out.println("El directorio ingresado ya se encuentra creado");
				}
			}
			if (!archivo.exists()) {
				try {
					archivo.createNewFile();
					System.out.println("El archivo " + archivo + " ha sido creado exitosamente");
					ArrayList<Producto> prds = new ArrayList<Producto>();

					prds = prd.getListaProductos();

					FileWriter fileW = new FileWriter(archivo);
					BufferedWriter bufferedWriter = new BufferedWriter(fileW);
					for (int i = 0; i < prds.size(); i++) {
						bufferedWriter.write("Nombre articulo: " + prds.get(i).getArticulo());
						bufferedWriter.write("\nCódigo: " + prds.get(i).getCodigo());
						bufferedWriter.write("\nMarca: " + prds.get(i).getMarca());
						bufferedWriter.write("\nColor: " + prds.get(i).getColor());
						bufferedWriter.write("\nDescripción: " + prds.get(i).getDescripcion());
						bufferedWriter.write("\nPrecio: " + prds.get(i).getPrecio());
						bufferedWriter.write("\nTalla: " + prds.get(i).getTalla());
					}
					bufferedWriter.close();
					System.out.println("Datos de clientes exportados correctamente en formato .txt");

				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("Error de E/S" + e.getMessage());
				}
			} else {
				System.out.println("Ya existe un archivo con ese nombre");
			}
		} else {
			System.out.println("No se encontraron datos para exportar");
		}
	}

}