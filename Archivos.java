import java.io.*;
import javax.swing.*;

/** 
*Una clase que permite el manejo de archivos necesarios para el reproductor
*@author Kenneth Martínez Avendaño
*/

public class Archivos{

	/**
	*Ruta del fichero
	*/
	private  String directorio;

    /**
    * Constructor para la clase Archivos
    *@param direccion El párametro direccion es el fichero con el que se va trabajar
    */

	public Archivos(){

		//this.directorio = direccion;
	}


	/** 
	*Método que permite generar una carpeta en donde se almacenarán los datos
	*/

	public void generarDirectorio(String nombre){

		File archivo = new File(nombre);
		if (archivo.exists()){ // Revisa si existe la carpeta
		}
		else{
			archivo.mkdir();
		}
	}

    public boolean revisarCarpeta(String nombre){

        File archivo = new File("FilesMusic" + File.separator + nombre);
        return archivo.exists();
    }

	/** 
	*Crea una copia del archivo entrada y lo redirecciona a la carpeta del programa
	*/

	public void redireccionarFichero(String direccion, String carpeta){

                File archivo = new File(direccion);
        		String nombre = archivo.getName();
                String direccionCompleta;
                
                // Une una direccion con nombre de carpeta y nombre de archivo
                if (carpeta == null){

                    direccionCompleta = "FilesMusic" + File.separator + nombre; 
                }
                
                else {

                    direccionCompleta =  "FilesMusic" + File.separator + carpeta + File.separator + nombre;
    
                }

                 File destino = new File(direccionCompleta);
                


                try {
                        InputStream entrada = new FileInputStream(direccion); //Obtiene los bytes del directorio
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

    public String obtenerDirectorioMusica(){
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
    *Permite leer los elementos de tipo (".mp3", ".wav", ".ogg") que hay en un directorio 
    *y sobre redireccionar el fichero a la carpeta FilesMusic
    *@param directorio Es la dirección personal del computador
    */

    public void leerArchivosCarpeta(String directorio, String carpeta){

    	File fichero = new File(directorio);
    	File[] arregloFichero = fichero.listFiles(); // Lista de ficheros
    	int cantidad = arregloFichero.length;
    	String[] listaCanciones = new String[cantidad];

    	for(int contador = 0; contador < arregloFichero.length;contador ++){

    		String cancion = arregloFichero[contador].getAbsolutePath(); // Guarda las direcciones

            if (cancion.endsWith(".mp3")||cancion.endsWith(".wav")||cancion.endsWith(".ogg")){ // Busca solo archivos de musica
                Archivos archivoTemp = new Archivos();
                archivoTemp.redireccionarFichero(cancion,carpeta);
            } 
    	}	
    }
	
 	/*public static void main (String [] args) {

 		Archivos fichero = new Archivos("/home/andrey/Desktop/Programacion/albuuuum-artwork");
 		fichero.generarDirectorio("FilesMusic");
 		fichero.redireccionarFichero("/home/andrey/Desktop/Programacion/albuuuum-artwork",null);
        String variable = fichero.obtenerDirectorioMusica();
        System.out.println(variable);
 		fichero.leerArchivosCarpeta(variable,null);
        fichero.generarDirectorio("FilesMusic" + File.separator + "AndreyPlayo");
        fichero.redireccionarFichero("/home/andrey/Desktop/Programacion/albuuuum-artwork","AndreyPlayo");
        System.out.println(fichero.revisarCarpeta("AndreyPlayo"));
        System.out.println(fichero.revisarCarpeta("holaumundo"));

 	}*/
 }