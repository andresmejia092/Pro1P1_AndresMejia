// Andres Mejia
package pro1p1_andresmejia;
import java.util.ArrayList;

public class Cancion {
    public String name;
    public String album;
    public String artist;
    public int year;
    public int secs;

    public Cancion(String name, String album, String artist, int year, int secs) {
        this.name = name;
        this.album = album;
        this.artist = artist;
        this.year = year;
        this.secs = secs;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSecs() {
        return secs;
    }

    public void setSecs(int secs) {
        this.secs = secs;
    }

    @Override
    public String toString() {
        return name + " - " + artist;
    }

    
    
    
    
    
    
    
}
