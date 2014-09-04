package tarea.programada1;

import java.io.PrintStream; 
import java.util.Map; 
import javazoom.jlgui.basicplayer.*; 


public  class Reproductor implements BasicPlayerListener { 

    private PrintStream out = null;//Stream para el Debbugging(println)...  
    BasicPlayer player = new BasicPlayer();//Instancia de BasicPlayer
   
    
    public Reproductor () {//Constructor de la clase 
        player.addBasicPlayerListener(this);
        out = System.out; 
    } 

    BasicController control = (BasicController) player;//Controlador para player    
    //**Metodos de la clase Reproductor: 

    //metodo que proporciona informacion del archivo abierto
    public void opened(Object stream, Map properties) { 
        display("opened : " + properties.toString()); 
    } 
    
    //Metodo que muestra el proceso mientras se reproduce la cancion
   public void progress(int bytesread, long microseconds, byte[] pcmdata, Map properties) { 
       display("progress : " + properties.toString()); 
    } 

  //Metodo que actualiza el estado del reproductor 
    public void stateUpdated(BasicPlayerEvent event) { 
        display("stateUpdated : " + event.toString()); 
    } 

    //Controla la ejecucion de la reproduccion
    public void setController(BasicController controller) { 
        display("setController : " + controller); 
    } 

    // Mustra todos los datos de los metodos anterires
    public void display(String msg) { 
        if (out != null) { 
            out.println(msg); 
        } 
    } 

}