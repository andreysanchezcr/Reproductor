import java.io.*;
import org.blinkenlights.jid3.*;
import org.blinkenlights.jid3.v1.*;
import org.blinkenlights.jid3.v2.*;


public class MetaDatos1 {
	Object[] arreglo= new Object[10];
		

	
	ID3Tag[] variable;


	public MetaDatos1(String direccion)throws Exception{
		File correrArchivo = new File(direccion);
		MediaFile archivoMedia = new MP3File(correrArchivo);
		variable= archivoMedia.getTags();



	}
	public Object[] getDatos()throws Exception{

		arreglo[0]=variable[0];

		arreglo[1]=variable[1];
		return arreglo;
	}

	public static void main(String[] args)throws Exception
	{

		MetaDatos1 prueba = new MetaDatos1("/home/andrey/Desktop/afterlife1.mp3");

		System.out.println(prueba.getDatos()[0]);
		System.out.println(prueba.getDatos()[1]);
		System.out.println(prueba.getDatos()[4]);
		System.out.println(prueba.getDatos()[5]);


		String hola = prueba.getDatos()[1].toString();
		char perro = hola.charAt(0);
		System.out.println(perro);
		//System.out.println(prueba.getArtist())
	}
}