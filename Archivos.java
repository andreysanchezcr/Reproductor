import java.io.*;
import javax.swing.*;


/** 
*Una clase que permite el manejo de archivos necesarios para el reproductor
*@author Kenneth Martínez Avendaño
*/

public class Archivos{

	private  String directorio;

    /**
    * Constructor para la clase Archivos
    *@param archivo El párametro archivo es el fichero con el que se va trabajar
    */

	public Archivos(String archivo){

		this.directorio = archivo;
	}

	public Archivos(){
		this.directorio = null;	
	}

	/** 
	*Método que permite generar una carpeta en donde se almacenarán los datos
	*/

	private void generarDirectorio(){

		File archivo = new File("pruebaReproductor");
		if (archivo.exists()){ // Revisa si existe la carpeta
		}
		else{
			archivo.mkdir();
		}
	}

	/** 
	*Crea una copia del archivo entrada y lo redirecciona a la carpeta del programa
	*/

	public void redireccionarFichero(){

                File archivo = new File(this.directorio);

        		String nombre = archivo.getName(); 

                File destino = new File("pruebaReproductor" + File.separator + nombre); // Une la carpeta con el nombre del archivo de entrada


                try {
                        InputStream entrada = new FileInputStream(this.directorio); //Obtiene los bytes del directorio
                        OutputStream salida = new FileOutputStream(destino); //Lee los flujos de bytes
                                
                        byte[] contenido = new byte[1024];
                        int iniciador;

                        // Va leyendo el contenido de entrada y escribiendo en el de salida
                        while ((iniciador = entrada.read(contenido)) > 0) { 
                                salida.write(contenido, 0, iniciador);
                        }

                        // Cierre de archivos
                        entrada.close(); 
                        salida.close();

                } catch (IOException ioe){
                        ioe.printStackTrace();
                	}
        }

    /**
    *Obtiene el nombre del archivo segun su ruta
    *@return Devuelve un string del nombre de un fichero
	*/

    public String obtenerNombre(){
    	File temp = new File(this.directorio);
    	return temp.getName(); //obtener nombre
    }

    /**
    *Obtiene la direccion del archivo segun su ruta
    *@return Devuelve un string de la ruta completa de un fichero
	*/

    public String obtenerDireccion(){
    	File temp = new File(this.directorio);
    	return temp.getAbsolutePath(); //obtener ruta completa
    }

    /**
    *Obtiene el directorio home y lo une con la carpeta musica
    *@return Devuele un String con el directorio de musica
	*/

    public String obtenerDirectorioCarpeta(){
    	String homeUsuario = System.getProperty("user.home"); //obtiene el directorio personal
    	File directorioMusica = new File(homeUsuario + File.separator + "Música"); // Une el directorio personal con la carpeta musica
    	
    	if (directorioMusica.exists()){ // Identifica si existe la carpeta
    		String directorioFinal = homeUsuario + "/Música";
    		return directorioFinal;
    		}
   
    	else {
    		String directorioFinal = homeUsuario + "/Music";
			 return directorioFinal;
    	}
    }

    /**
    *Permite leer todos los elementos que hay en un directorio y almacenar las direcciones en un arreglo de strings
    *@param directorio Es la dirección personal del computador
    */

    public String[] leerArchivosCarpeta(String directorio){

    	File fichero = new File(directorio);
    	File[] arregloFichero = fichero.listFiles(); // Lista de ficheros
    	int cantidad = arregloFichero.length;
    	String[] listaCanciones = new String[cantidad];

    	for(int contador = 0; contador < arregloFichero.length;contador ++){

    		String cancion = arregloFichero[contador].getAbsolutePath(); // Guarda las direcciones
    		listaCanciones[contador] = cancion; 
    	}	
    	return listaCanciones;
    }
	
 	public static void main (String [] args) {

 		Archivos fichero = new Archivos("/home/kenneth/Descargas/presmate.pptx");
 		fichero.generarDirectorio();
 		fichero.redireccionarFichero();
 		System.out.println(fichero.obtenerNombre());
 		System.out.println(fichero.obtenerDireccion());
 		System.out.println(fichero.obtenerDirectorioCarpeta());
 		String variable = fichero.obtenerDirectorioCarpeta();
 		System.out.println(fichero.leerArchivosCarpeta(variable)[0]);
 	}
 }