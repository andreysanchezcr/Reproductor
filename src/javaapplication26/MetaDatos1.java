package tarea.programada1;

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
    public Mp3File mp3file;
    ID3v1 informacion;

    public MetaDatos1(){

        
        
    }
    public void agregarc(String direccion) throws IOException, UnsupportedTagException, InvalidDataException{
        mp3file = new Mp3File(direccion);
        informacion = mp3file.getId3v1Tag();
    }
    public String gettiempo(){
            long num = mp3file.getLengthInSeconds();

            long hor,min,seg;
            String tiempo;   
            hor=num/3600;  
            min=(num-(3600*hor))/60;  
            seg=num-((hor*3600)+(min*60)); 

            tiempo = hor+"h:"+min+"m:"+seg+"s";
            return tiempo;
    }
    public String gettitulo(){
        System.out.println(informacion.getTitle());
        return informacion.getTitle();
    }
    public void settitulo(String valor)throws UnsupportedTagException, InvalidDataException, IOException, NotSupportedException{
        informacion.setTitle(valor);
        mp3file.save("fghjk");
    }
    
    public String getartista(){
                System.out.println(informacion.getArtist());

        return informacion.getArtist();
        
    }
    public void setArtist(String valor){
        informacion.setArtist(valor);
    }

    public String getgenero(){
        return informacion.getTitle();
    }
    public void setgenero(int valor){
        informacion.setGenre(valor);
    }

    public String getalbum(){
        return informacion.getAlbum();
    }
    public void setAlbum(String valor){
        informacion.setTitle(valor);
    }

    public String getyear(){
        return informacion.getYear();
    }
    public void setyear(String valor){
        informacion.setYear(valor);
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
                try ( // Write image to file - can determine appropriate file extension from the mime type
                        RandomAccessFile file = new RandomAccessFile("cover.jpg", "rw")) {
                    file.write(imageData);    //
                } //
                //mp3file.save("MyMp3File.mp3");

             }
             else
                System.out.println("No tiene imagen");
        }
    }




        

}