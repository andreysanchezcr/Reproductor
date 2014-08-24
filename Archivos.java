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


	//* Método que permite generar una carpeta en donde se almacenarán los datos/*

	private void generarDirectorio(){

		File archivo = new File("pruebaReproductor");
		if (archivo.exists()){ // Revisa si existe la carpeta
		}
		else{
			archivo.mkdir();
		}
	}

	//* Crea una copia del archivo entrada y lo redirecciona a la carpeta del programa */

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

    //*Obtiene el nombre del archivo segun su ruta/*

    public String obtenerNombre(){
    	File temp = new File(this.directorio);
    	return temp.getName(); //obtener nombre
    }

    //*Obtiene la direccion del archivo segun su ruta/*

    public String obtenerDireccion(){
    	File temp = new File(this.directorio);
    	return temp.getAbsolutePath(); //obtener ruta completa
    }

 	public static void main (String [] args) {

 		Archivos fichero = new Archivos("/home/kenneth/Descargas/presmate.pptx");
 		fichero.generarDirectorio();
 		fichero.redireccionarFichero();
 		System.out.println(fichero.obtenerNombre());
 		System.out.println(fichero.obtenerDireccion());
 	
 	}
 }