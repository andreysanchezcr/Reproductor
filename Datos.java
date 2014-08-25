/** 
* Clase que permite la administración de datos por medio de nodos
*/

public class Datos {

	private Nodo primerNodo;
	private Nodo ultimoNodo;
	private int tamaño;


	/**
	*Establece el primer y el ultimo nodo
	*@param arregloDatos Datos que seran almacenados en un nodo
	*/	
	public Datos(String[] arregloDatos){

		this.primerNodo = new Nodo(arregloDatos);
		this.ultimoNodo = primerNodo;
		this.tamaño ++;

	}

	/**
	*Clase utilizada para manejar la lista por medio de Nodos
	*/
	private class Nodo {

		private String [] arreglo;
		private Nodo siguiente;
		private Nodo anterior;

		public Nodo() {

			this.arreglo = null;
			this.siguiente = null;
			this.anterior = null;
		}
		/**
		* Constructor del nodo con su puntero al anterior y al siguiente
		*@param paramArreglo Arreglo de String
		*/
		public Nodo(String [] paramArreglo) {

			this.arreglo = paramArreglo;
			this.siguiente = null;
			this.anterior = null;
		}

		// Retorna el arreglo
		public String [] getArreglo() {

			return arreglo;
		}

		// Establece el arreglo
		public void setArreglo(String [] paramArreglo) {

			this.arreglo = paramArreglo;
		}

		// Retorna el siguiente nodo
		public Nodo getSiguiente() {

			return this.siguiente;
		}

		// Establece el proximo nodo
		public void setSiguiente(Nodo proximo) {

			this.siguiente = proximo;
		}
		
		// Retorna el nodo anterior
		public Nodo getAnterior(){

			return this.anterior;
		}		

		// Establece el nodo anterior
		public void setAnterior(Nodo antes){
			this.anterior = antes;

		}
	}

	// Añade datos en la ultima posicion de la lista
	public void añadirDatos(String[] arregloDatos){

		Nodo nodo = new Nodo(arregloDatos);

		if(this.primerNodo.getArreglo() == null){
			this.primerNodo = nodo;
			this.ultimoNodo = nodo;
		}
		else{
			nodo.setAnterior(ultimoNodo);
			this.ultimoNodo.setSiguiente(nodo);
			this.ultimoNodo = nodo;


		}
		this.tamaño ++;
	}

	// Obtiene los datos segun posicion
	public String[] obtenerDatos(int indice){
		if (indice >= this.tamaño || indice < 0){
			return null;
		}
		Nodo nodoActual = this.primerNodo;
		for(int contador = 0;contador < indice;contador++){
			nodoActual = nodoActual.getSiguiente();
		}

		return nodoActual.getArreglo();
	}
	// Obtiene el tamaño total de la lista
	public int obtenerTamaño(){

		return this.tamaño;
	}
	
	public static void main(String[] args) {

		String[] listaDatos1 = {"1","2","3"};
		Datos listaEnlazada = new Datos(listaDatos1);
		
		String[] listaDatos2 = {"4","5","6"};
		listaEnlazada.añadirDatos(listaDatos2);
		String[] datos = listaEnlazada.obtenerDatos(1);
		System.out.println(datos[1]);

		}
}