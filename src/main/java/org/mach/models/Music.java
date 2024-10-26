package org.mach.models;

public class Music extends Audio {

    private String album;
    private String genero;
    private String info;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void exibirInfo() {
        System.out.println("Informações sobre a música: " + info);
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
