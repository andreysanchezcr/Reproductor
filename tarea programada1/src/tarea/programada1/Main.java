package tarea.programada1;

import java.io.*;
import java.io.IOException;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.NotSupportedException;
import com.mpatric.mp3agic.UnsupportedTagException;
import javazoom.jl.decoder.JavaLayerException;


public class Main{
	public static String direccion;
	public static String playlist;
	public static Archivos fichero = new Archivos();
	public static String[] metainformacion=new String[10];
	//public static String direccionimagen""
	public static String direccioncover="";

	public static void main(String[] args)throws UnsupportedTagException, InvalidDataException, IOException, NotSupportedException, JavaLayerException {
		//Prueba
		//direccion= "/home/andrey/Desktop/Skrillex/Skrillex - Voltage (2012)/02 Bangarang.mp3";
            direccion="C:\\Users\\ricardo\\Desktop\\wigle.mp3";
		playlist= "Andrey rico";
///////////////////////////////////////////
 		fichero.generarDirectorio("FilesMusic");
 		//Interfaz=Interfaz;
 		fichero.redireccionarFichero(direccion,null);
        String variable = fichero.obtenerDirectorioMusica();
        /////////////System.out.println(variable);
 		fichero.leerArchivosCarpeta(variable,null);
        fichero.generarDirectorio("FilesMusic" + File.separator + playlist);
        fichero.redireccionarFichero(direccion,playlist);

        //Añadir esta parte en un evento de boton
        MetaDatos1 metainfo =new MetaDatos1();
        metainfo.agregarc(direccion);
        metainfo.getImage();
        metainformacion[0]=metainfo.gettitulo();
        metainformacion[1]=metainfo.getartista();
        metainformacion[2]=metainfo.getgenero();
        metainformacion[3]=metainfo.getalbum();
        metainformacion[4]=metainfo.getyear();
        metainformacion[5]="";
        metainformacion[6]="";
        metainformacion[7]="";
        metainformacion[8]="";
        metainformacion[9]="";
        
        direccioncover= fichero.obtenerDirectorioMusica()+"/cover";
        


        /* Create and display the form */

    


    //public static void main(String args[]) {

        //Interfaz ventana= new Interfaz();
        //ventana.setVisible(true);
        //
        //Principal reproductor;
        //reproductor = new Principal();
        //reproductor.agregar("2342");
        //reproductor.play();
        VentanaP b =new VentanaP();
        b.setVisible(true);

        //VtnListaReproduccion g = new VtnListaReproduccion();
        //</editor-fold>

        /* Create and display the form */
      /*  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaP().setVisible(true);
            }
        });
    }*/




        //{metainfo.gettitulo,metainfo.getartista,metainfo.getgenero,metainfo.getalbum,metainfo.getyear}



        //System.out.println(fichero.revisarCarpeta("AndreyPlayo"));
        //System.out.println(fichero.revisarCarpeta("holaumundo"));





        //Cargando lista//












		

	}


	    /*public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaP().setVisible(true);
            }
        });
    }*/





















}