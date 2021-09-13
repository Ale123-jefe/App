package com.example.appinfovirtual.model;

public class image {
    private String urlImagen;
    private String username;
    private String cantidadDias;
    private String cantidadMeGusta;

    public image(String urlImagen, String username, String cantidadDias, String cantidadMeGusta) {
        this.setUrlImagen(urlImagen);
        this.setUsername(username);
        this.setCantidadDias(cantidadDias);
        this.setCantidadMeGusta(cantidadMeGusta);
    }


    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(String cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public String getCantidadMeGusta() {
        return cantidadMeGusta;
    }

    public void setCantidadMeGusta(String cantidadMeGusta) {
        this.cantidadMeGusta = cantidadMeGusta;
    }
}
