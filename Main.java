import java.io.*;
import java.io.IOException;
import java.io.RandomAccessFile;

import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.ID3v1Tag;
import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.ID3v24Tag;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.NotSupportedException;
import com.mpatric.mp3agic.UnsupportedTagException;


class Main{
	public static String direccion;
	public static String playlist;
	public static Archivos fichero = new Archivos();
	public static String[] metainformacion=new String[10];
	//public static String direccionimagen""
	public static String direccioncover="";

	public static void main(String[] args)throws UnsupportedTagException, InvalidDataException, IOException, NotSupportedException {
		//Prueba
		direccion= "/home/andrey/Desktop/Skrillex/Skrillex - Voltage (2012)/02 Bangarang.mp3";
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
        MetaDatos1 metainfo =new MetaDatos1(direccion);
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