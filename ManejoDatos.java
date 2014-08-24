
/** 
* Clase que permite la administración de datos por medio de nodos
*/

public class ManejoDatos {

	private Nodo primerNodo;
	private Nodo ultimoNodo;
	private int tamaño;


	private class Nodo {

		private String [] arreglo;
		private Nodo siguiente;
		private Nodo anterior;

		public Nodo() {

			this.arreglo = null;
			this.siguiente = null;
			this.anterior = null;
		}

		public Nodo(String [] paramArreglo) {

			this.arreglo = paramArreglo;
			this.siguiente = null;
		}

		public String [] getArreglo() {

			return arreglo;
		}

		public void setArreglo(String [] paramArreglo) {

			this.arreglo = paramArreglo;
		}

		public Nodo getSiguiente() {

			return this.siguiente;
		}

		public void setSiguiente(Nodo proximo) {

			this.siguiente = proximo;
		}
	}

	public ManejoDatos(String[] arregloDatos){

		this.primerNodo = new Nodo(arregloDatos);
		this.ultimoNodo = primerNodo;
		this.tamaño ++;

	}

	public void añadirDatos(String[] arregloDatos){

		Nodo nodo = new Nodo(arregloDatos);

		if(this.primerNodo.getArreglo() == null){
			this.primerNodo = nodo;
			this.ultimoNodo = nodo;
		}
		else{
			this.ultimoNodo.setSiguiente(nodo);
			this.ultimoNodo = nodo;
		}
		this.tamaño ++;
	}

	public String[] obtenerDatos(int indice){
		if (indice >= this.tamaño || indice < 0){
			return null;
		}
		Nodo nodoActual = this.primerNodo;
		for(int contador = 0;contador < indice;contador++){
			System.out.println("entre");
			nodoActual = nodoActual.getSiguiente();
		}

		return nodoActual.getArreglo();
	}		

	public int obtenerTamaño(){
		return this.tamaño;
	}
	
	public static void main(String[] args) {

		String[] listaDatos1 = {"1","2","3"};
		ManejoDatos listaEnlazada = new ManejoDatos(listaDatos1);
		
		String[] listaDatos2 = {"4","5","6"};
		listaEnlazada.añadirDatos(listaDatos2);
		String[] datos = listaEnlazada.obtenerDatos(1);
		System.out.println(datos[1]);

	}
}