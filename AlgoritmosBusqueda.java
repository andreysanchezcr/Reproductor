/**
* Esta clase permite la busqueda de datos utilizando la clase Datos
*/

public class AlgoritmosBusqueda{

	Datos cajaDatos;

	public AlgoritmosBusqueda(Datos cajaDatos){

		this.cajaDatos = cajaDatos;

	}

	public String buscarArtista(String nombreArtista){

		for(int contador = 0;contador < this.cajaDatos.getTamaño();contador++){
			String nombre = this.cajaDatos.obtenerDatos(contador)[2];

			if(nombre == nombreArtista){
				return this.cajaDatos.obtenerDatos(contador)[0];
			}
		}
		return null;
	}

	public static void main(String[] args) {

		String[] listaDatos1 = {"R","N","A","Ab","G","play1","play2","play3"};
		Datos listaEnlazada = new Datos(listaDatos1);
		
		String[] listaDatos2 = {"R1","N1","A1","Ab1","G1","play11","play21","play31"};
		listaEnlazada.añadirDatos(listaDatos2);
		String[] datos = listaEnlazada.obtenerDatos(1);

		AlgoritmosBusqueda artista = new AlgoritmosBusqueda(listaEnlazada);

		System.out.println(datos[1]);
		System.out.println(listaEnlazada.getTamaño());
		System.out.println(artista.buscarArtista("A"));

		}
}