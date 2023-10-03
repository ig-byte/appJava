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
        vueloAnulado--;
        if (vueloAnulado >= 0 && vueloAnulado < 42) {
            if (!asientosPasajeros[vueloAnulado].isEmpty()) {
                asientosPasajeros[vueloAnulado].pasajero = null;
                System.out.println("El vuelo se ha anulado");
            } else {
                System.out.println("El vuelo no puede ser anulado");
                System.out.println("El asiento se encuentra disponible");
            }
        }
        else
            System.out.println("Asiento inexistente");
    }

    public void comprarPasaje(int asiento) throws IOException {
        String nombre = "", rut = "";
        int telefono = 900000000, intVip, valor = 0;
        float descuento = 1;
        boolean vip = false, check = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        asiento--;
        if (asiento >= 0 && asiento < 42) {
            if (asientosPasajeros[asiento].isEmpty()) {
                if (asientosPasajeros[asiento].isVip()) {
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
                    System.out.println("\nUsuario VIP:");
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
                System.out.println("Valor del vuelo: $" + (valor * descuento));
                System.out.println(".");
                System.out.println("..");
                System.out.println("...");
                asientosPasajeros[asiento].pasajero = new Pasajero(nombre, rut, telefono, vip);
                System.out.println("Vuelo comprado con exito");
            }
            else
                System.out.println("Asiento no disponible");
        }
        else
            System.out.println("Asiento inexistente");
    }

    public void mostrarAsientos() {
        String aux;
        String[] au = new String[42];
        for (int i = 0; i < asientosPasajeros.length; i++) {
            if (asientosPasajeros[i].pasajero == null)
                aux = Integer.toString(i + 1);
            else if (i > 10)
                aux = "x ";
            else
                aux = "x";
            au[i] = aux;
        }
        System.out.println("|  " + au[0] + "   " + au[1] + "   " + au[2] + "   " + au[3] + "   " + au[4] + "   " + au[5] + "  |");
        System.out.println("|  " + au[6] + "   " + au[7] + "   " + au[8] + "   " + au[9] + "  " + au[10] + "  " + au[11] + " |");
        System.out.println("|  " + au[12] + "  " + au[13] + "  " + au[14] + "  " + au[15] + "  " + au[16] + "  " + au[17] + " |");
        System.out.println("|  " + au[18] + "  " + au[19] + "  " + au[20] + "  " + au[21] + "  " + au[22] + "  " +au[23] +" |");
        System.out.println("|  " + au[24] + "  " + au[25] + "  " + au[26] + "  " + au[27] + "  " + au[28] + "  " +au[29] +" |");
        System.out.println("|____________  ___________|");
        System.out.println("|____________  ___________|");
        System.out.println("|  "+au[30]+"  "+au[31]+"  "+au[32]+"  "+au[33]+"  "+au[34]+"  "+au[35]+" |");
        System.out.println("|  "+au[36]+"  "+au[37]+"  "+au[38]+"  "+au[39]+"  "+au[40]+"  "+au[41]+" |");

    }

    @Override
    public String toString() {
        return "Avion [asientosPasajeros=" + Arrays.toString(asientosPasajeros) + "]";
    }
}
