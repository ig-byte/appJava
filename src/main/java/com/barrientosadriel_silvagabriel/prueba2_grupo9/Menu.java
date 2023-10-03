package com.barrientosadriel_silvagabriel.prueba2_grupo9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    public static void main(String[] args) throws NumberFormatException, IOException {

        Avion v1 = new Avion();
        v1.poblarAvion();
        System.out.println(v1.toString());

        int opcion;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
         * Menu
         * 
         */
        do {
            System.out.println("Menu");
            System.out.println("1. Ver Asientos disponibles");
            System.out.println("2. Comprar Asiento");
            System.out.println("3. Anular Vuelo");
            System.out.println("4. Salir");
            System.out.print("- Seleccione una opcion: ");

            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    v1.mostrarAsientos();
                    break;
                case 2:
                    int vuelo;
                    System.out.println("Compra de asiento");

                    v1.mostrarAsientos();
                    
                    System.out.print("Ingrese el vuelo a comprar: ");
                    vuelo = Integer.parseInt(br.readLine());
                    v1.comprarPasaje(vuelo);
                    break;
                case 3:
                    int vueloAnulado;
                    System.out.println("Anulación de vuelo");
                    System.out.print("Ingrese el vuelo a anular: ");
                    vueloAnulado = Integer.parseInt(br.readLine());
                    v1.anularVuelo(vueloAnulado);
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion Invalida !");
                    break;
            }
        } while (opcion != 4);
    }
}
