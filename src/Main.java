
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {
		try {
		Scanner sc = new Scanner(System.in);
		ProductoServicio Ps = new ProductoServicio();
		ExportarTxt export = new ExportarTxt();
		Menu mn = new Menu();
		Utilidad util = new Utilidad();
		int opcion = 0;
	
			while (opcion < 5) {
				System.out.println("");
				mn.menu();
				opcion = sc.nextInt();
				if (opcion == 1) {
					Ps.listarProductos();
					util.Limpiar();
					util.TiempoEsperado();
				} else if (opcion == 2) {
					Ps.agregarProducto();
					util.Limpiar();
					util.TiempoEsperado();
				} else if (opcion == 3) {
					export.exportar(Ps);
					util.Limpiar();
					util.TiempoEsperado();
				} else if (opcion == 4) {
					System.out.println("Abandonando el sistema de productos...");
					System.out.println("Acaba de salir del sistema");
					System.exit(0);
				}
			}
		} catch (Exception e) {
			
			System.out.println("Ha ocurrido un error: " +e.getMessage());
		}

	}

}