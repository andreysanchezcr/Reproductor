//package com.mpatric.mp3agic.app;

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
            mp3file = new Mp3File("/home/andrey/Desktop/afterlife1.mp3");//Prueba de impresion
            informacion = mp3file.getId3v1Tag();
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

        return informacion.getTitle();



    }
    public static void main(String[] args) {
        MetaDatos1 prueba = new MetaDatos1();
        System.out.println("Esta en una prueba de lo que imprime"+prueba.gettitulo());
        }

}