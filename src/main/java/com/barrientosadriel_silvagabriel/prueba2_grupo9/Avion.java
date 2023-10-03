package com.barrientosadriel_silvagabriel.prueba2_grupo9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Avion {
    Asiento[] asientosPasajeros = new Asiento[42];
    
    public void poblarAvion() {
        boolean vip;
        for (int i = 1; i <= 42; i++) {
            if (i < 31)
                vip = false;
            else
                vip = true;
            asientosPasajeros[i-1] = new Asiento(vip);
        }
    }

    public void anularVuelo(int vueloAnulado) {
        if (vueloAnulado > 0 && vueloAnulado < 43) {
            if (!asientosPasajeros[vueloAnulado].isEmpty()) {
                asientosPasajeros[vueloAnulado].pasajero = null;
                System.out.println("El vuelo se ha anulado.");
            } else
                System.out.println("El vuelo está vacío.");
        }
    }

    public void comprarPasaje(int asiento) throws IOException {
        String nombre = "", rut = "";
        int telefono = 900000000, intVip, valor = 0;
        float descuento = 1;
        boolean vip = false, check = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        if (asiento > 0 && asiento < 43) {
            if (!asientosPasajeros[asiento].isEmpty()) {
                System.out.println("Asiento no disponible");
                if (!asientosPasajeros[asiento].isVip()) {
                    System.out.println("Asiento Premium VIP disponible");
                    valor = 240000;
                }
                else {
                    System.out.println("Asiento Economy disponible");
                    valor = 78900;
                }
                
                System.out.print("\nIngrese el nombre: ");
                nombre = br.readLine();
                System.out.print("\nIngrese el rut: ");
                rut = br.readLine();
                System.out.print("\nIngrese el telefono (ej: 912345678): ");
                telefono = Integer.parseInt(br.readLine());
                do {
                    System.out.println("Usuario VIP:");
                    System.out.println("1.- Si");
                    System.out.println("2.- No");
                    System.out.print("Ingrese su opción: ");
                    intVip = Integer.parseInt(br.readLine());
                    switch (intVip) {
                        case 1:
                            check = true;
                            vip = true;
                            descuento = 0.85F;
                            System.out.println("Descuento por usuario VIP: 15%");
                            break;
                        case 2:
                            check = true;
                            vip = false;
                            break;
                        default:
                            System.out.println("Respuesta inválida");
                            break;
                    }
                } while (!check);
            }
            
            System.out.println("Valor del vuelo: $" + (valor * descuento));
            System.out.println(".");
            System.out.println("..");
            System.out.println("...");
            asientosPasajeros[asiento].pasajero = new Pasajero(nombre, rut, telefono, vip);
            System.out.println("Vuelo comprado con exito.");
        }
    }

    public void mostrarAsientos() {
        String aux;
        String[] au = new String[42];
        for (int i = 0; i < asientosPasajeros.length; i++) {
            if (asientosPasajeros[i].pasajero == null)
                aux = Integer.toString(i);
            else if (i > 10)
                aux = "x ";
            else
                aux = "x";
            au[i] = aux;
        }
    }

    @Override
    public String toString() {
        return "Avion [asientosPasajeros=" + Arrays.toString(asientosPasajeros) + "]";
    }
}
