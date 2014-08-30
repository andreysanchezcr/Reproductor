
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

public class MetaDatos1{
    Mp3File mp3file;
    ID3v1 informacion;

    public MetaDatos1(){
        
        try{
            mp3file = new Mp3File("/home/andrey/Desktop/Skrillex/Skrillex - Voltage (2012)/09 Imma try it out (Rene Eberstark edit)_[EnfermoGP].mp3");//Prueba de impresion
            informacion = mp3file.getId3v1Tag();
            long num = mp3file.getLengthInSeconds();

            long hor,min,seg;
            String tiempo;   
            hor=num/3600;  
            min=(num-(3600*hor))/60;  
            seg=num-((hor*3600)+(min*60)); 

            tiempo = hor+"h:"+min+"m:"+seg+"s";

            System.out.println("Length of this mp3 is: " + tiempo  + " seconds");
            System.out.println("Bitrate: " + mp3file.getLengthInSeconds() + " kbps " + (mp3file.isVbr() ? "(VBR)" : "(CBR)"));
            System.out.println("Track: " + informacion.getTrack());
            System.out.println("Artist: " + informacion.getArtist());
            System.out.println("Title: " + informacion.getTitle());
            System.out.println("Album: " + informacion.getAlbum());
            System.out.println("Year: " + informacion.getYear());
            System.out.println("Genre: " + informacion.getGenre() + " (" + informacion.getGenreDescription() + ")");
            System.out.println("Comment: " + informacion.getComment());
            
        }catch(Exception e){
            System.err.println("Exception caught: "+e);
        }

        
        
    }
    public String gettitulo(){
        return informacion.getTitle();
    }
    public String getartista(){
        return informacion.getArtist();
    }

    public String getgenero(){
        return informacion.getTitle();
    }

    public String getalbum(){
        return informacion.getAlbum();
    }

    public String getyear(){
        return informacion.getYear();
    }

    public String gettrack(){

        return informacion.getTrack();
    }
    public void getImage() throws UnsupportedTagException, InvalidDataException, IOException, NotSupportedException{
         if (mp3file.hasId3v2Tag()) {
            ID3v2 imagen = mp3file.getId3v2Tag();
             byte[] imageData = imagen.getAlbumImage();
             if (imageData != null) {
                String mimeType = imagen.getAlbumImageMimeType();
                System.out.println("Mime type: " + mimeType);
                // Write image to file - can determine appropriate file extension from the mime type
                RandomAccessFile file = new RandomAccessFile("albuuuum-artwork", "rw");
                file.write(imageData);    //
                file.close();

             }
             else
                System.out.println("No tiene imagen");
        }
    }


    /*public static void main(String[] args)throws UnsupportedTagException, InvalidDataException, IOException, NotSupportedException {
        MetaDatos1 prueba = new MetaDatos1();
        prueba.getartista();
        prueba.getImage();
        }*/

}