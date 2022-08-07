
import java.io.IOException;

public class Utilidad {
	public void Limpiar() throws IOException, InterruptedException {
		try{
			//new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            
        }  catch (Exception e) {
            System.out.println("Error al limpiar la pantalla"+e.getMessage());
        }
	}

	public void TiempoEsperado() throws InterruptedException {
		Thread.sleep(5000);
	}
}

