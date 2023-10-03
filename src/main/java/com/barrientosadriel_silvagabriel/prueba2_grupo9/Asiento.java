package com.barrientosadriel_silvagabriel.prueba2_grupo9;

public class Asiento {
    Pasajero pasajero;
    boolean vip;

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Asiento(boolean vip) {
        this.vip = vip;
    }

    public Asiento(Pasajero p1, boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Asiento{" + "pasajero=" + pasajero + ", vip=" + vip + '}';
    }

    public boolean isEmpty() {
        return pasajero == null;
    }
}
