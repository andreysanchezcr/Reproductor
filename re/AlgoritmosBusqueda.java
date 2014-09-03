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

}
