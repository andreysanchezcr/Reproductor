package tarea.programada1;

/**
* Esta clase permite la busqueda de datos utilizando la clase Datos
*/

public class AlgoritmosBusqueda{

	Datos cajaDatos;

	public AlgoritmosBusqueda(Datos cajaDatos){

		this.cajaDatos = cajaDatos;

	}

	public String buscarCancion(String nombre, int tipo){

		for(int contador = 0;contador < this.cajaDatos.getTamaño();contador++){
			String variable = this.cajaDatos.obtenerDatos(contador)[tipo];

			if(variable == nombre){
				return this.cajaDatos.obtenerDatos(contador)[0];
			}
		}
		return null;
	}



	/*public static void main(String[] args) {

		String[] listaDatos1 = {"R","N","A","Ab","G","play1","play2","play3"};
		Datos listaEnlazada = new Datos(listaDatos1);
		
		String[] listaDatos2 = {"R1","N1","A1","Ab1","G1","play11","play21","play31"};
		listaEnlazada.añadirDatos(listaDatos2);
		String[] datos = listaEnlazada.obtenerDatos(1);

		AlgoritmosBusqueda artista = new AlgoritmosBusqueda(listaEnlazada);
		System.out.println(artista.buscarCancion("Ab1",3));

		}*/
}
