package com.barrientosadriel_silvagabriel.prueba2_grupo9;

public class Pasajero {
    String nombrePasajero, rutPasajero;
    int telefonoPasajero;
    boolean vip;

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public String getRutPasajero() {
        return rutPasajero;
    }

    public void setRutPasajero(String rutPasajero) {
        this.rutPasajero = rutPasajero;
    }

    public int getTelefonoPasajero() {
        return telefonoPasajero;
    }

    public void setTelefonoPasajero(int telefonoPasajero) {
        this.telefonoPasajero = telefonoPasajero;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Pasajero(String nombrePasajero, String rutPasajero, int telefonoPasajero, boolean vip) {
        this.nombrePasajero = nombrePasajero;
        this.rutPasajero = rutPasajero;
        this.telefonoPasajero = telefonoPasajero;
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Pasajero [nombrePasajero=" + nombrePasajero + ", rutPasajero=" + rutPasajero + ", telefonoPasajero="
                + telefonoPasajero + "]";
    }
}
