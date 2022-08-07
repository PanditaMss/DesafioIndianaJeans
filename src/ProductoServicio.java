
import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {
	Scanner sc = new Scanner(System.in);
	Producto prd = new Producto();
	public ArrayList<Producto> listaProductos = new ArrayList<Producto>();

	public ProductoServicio(ArrayList<Producto> list) {
		super();
		this.listaProductos = list;
	}

	public ProductoServicio() {
		super();
	}

	public ArrayList<Producto> getList() {
		return listaProductos;
	}

	public void setList(ArrayList<Producto> list) {
		this.listaProductos = list;
	}

	public void listarProductos() {
		if (listaProductos.size() > 0) {
			System.out.println("Datos del producto: ");
			for (int i = 0; i < listaProductos.size(); i++) {
				System.out.println("\nNombre articulo: " + listaProductos.get(i).getArticulo());
				System.out.println("Código: " + listaProductos.get(i).getCodigo());
				System.out.println("Marca: " + listaProductos.get(i).getMarca());
				System.out.println("Color: " + listaProductos.get(i).getColor());
				System.out.println("Descripción: " + listaProductos.get(i).getDescripcion());
				System.out.println("Precio: " + listaProductos.get(i).getPrecio());
				System.out.println("Talla: " + listaProductos.get(i).getTalla());
			}
		} else {
			System.out.println("No se encontraron productos en la tienda");
		}

	}

	public ArrayList<Producto> getListaProductos() {

		return listaProductos;
	}

	public void agregarProducto() {

		System.out.println("Ingresar nombre articulo: ");
		String articulo = sc.nextLine();
		prd.setArticulo(articulo);

		System.out.println("Ingresa descripción: ");
		String descripcion = sc.nextLine();
		prd.setDescripcion(descripcion);

		System.out.println("Ingresa marca: ");
		String marca = sc.nextLine();
		prd.setMarca(marca);

		System.out.println("Ingresa color: ");
		String color = sc.nextLine();
		prd.setColor(color);

		System.out.println("Ingresa precio: ");
		int precio = sc.nextInt();
		prd.setPrecio(precio);

		System.out.println("Ingresa talla: ");
		int talla = sc.nextInt();
		prd.setTalla(talla);

		System.out.println("Ingresa código: ");
		int codigo = sc.nextInt();
		prd.setCodigo(codigo);

		listaProductos.add(prd);

		System.out.println("");
		System.out.println("El Producto ha sido creado");
	}

}
