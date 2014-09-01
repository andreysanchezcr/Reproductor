package tarea.programada1;
import java.io.*;
import javazoom.jlgui.basicplayer.BasicPlayer;

public class Reproductor1 {
    private BasicPlayer player;

    public Reproductor1() {
        player = new BasicPlayer();
    }

    public void Play() throws Exception {
        player.play();
    }

    public void AbrirFichero(String ruta) throws Exception {
        player.open(new File(ruta));
    }

    public void Pausa() throws Exception {
        player.pause();
    }

    public void Continuar() throws Exception {
        player.resume();
    }

    public void Stop() throws Exception {
        player.stop();
    }

    public static void main(String args[]){
        try {
            Reproductor1 mi_reproductor = new Reproductor1();
            mi_reproductor.AbrirFichero("c:/temp/cancion.mp3");
            mi_reproductor.Play();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}