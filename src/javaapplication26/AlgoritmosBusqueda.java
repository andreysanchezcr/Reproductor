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

		for(int contador = 1;contador < this.cajaDatos.getTamaño();contador++){
			String variable = this.cajaDatos.obtenerDatos(contador)[tipo];

			if(variable == nombre){
                                System.out.println("Se ha localizado con exito");

				return this.cajaDatos.obtenerDatos(contador)[tipo];
			}
		}
		return null;
	}

}
