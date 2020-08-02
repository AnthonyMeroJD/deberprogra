package utils;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Menu {

    private Scanner lee = new Scanner(System.in);

    public void enmarcarBoton(ArrayList<String> opciones) {
        int numeroBotones = opciones.size();

        for (int i = 0; i < opciones.size(); i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < numeroBotones * 30; j++) {
                    if (j % 30 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            } else {
                for (int t = 0; t < numeroBotones; t++) {
                    String c = "\n";
                    if (t == 0) {
                        System.out.print(c + "■" + opciones.get(t));
                        for (int w=0;w<30-opciones.get(t).length()-1;w++){
                            System.out.print("*");
                        }
                    } else if (t == numeroBotones - 1) {
                        System.out.print("■" + opciones.get(t) + c);
                    } else {
                        int n=opciones.get(t).length();
                        for (int w=0;w<30-opciones.get(t).length()-1;w++){
                            System.out.print("*");
                        }
                        System.out.print("■" + opciones.get(t));
                        for (int w=0;w<30-opciones.get(t).length()-1;w++){
                            System.out.print("*");
                        }
                    }

                }
            }
        }
    }

    public void limpiarpantalla() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }

    public void enmarcar(ArrayList<String> textoPorLineas, int largo) {

        int y = 0;
        for (int i = 0; i < textoPorLineas.size() * 2 + 1; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < largo; j++) {
                    System.out.print("*");
                }
                if (i == textoPorLineas.size() * 2) {
                    System.out.println(" ");
                }
            } else {
                System.out.println("\n " + textoPorLineas.get(y));
                y++;
            }
        }


    }

    public void enmarcar(String textoPorLineas, int largo) {

        int y = 0;
        for (int i = 0; i < 1 * 2 + 1; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < largo; j++) {
                    System.out.print("*");
                }
                if (i == 1 * 2) {
                    System.out.println(" ");
                }
            } else {
                System.out.println("\n " + textoPorLineas);
                y++;
            }
        }


    }

    public HashMap<String, String> menuLogin() {
        HashMap<String, String> msm = new HashMap<>();
        enmarcar(Opciones.MsmLoginAdmin.getmsm(), 60);
        enmarcar(Opciones.Ingresar.getmsm(), 60);
        enmarcar(Opciones.Usuario.getmsm(), 15);
        System.out.println(" ");
        msm.put(Opciones.Usuario.getmsm(), lee.nextLine());
        enmarcar(Opciones.Contraseña.getmsm(), 15);
        System.out.println(" ");
        msm.put(Opciones.Contraseña.getmsm(), lee.nextLine());
        return msm;
    }

    public String bienvenida() {
        String eleccion = "0";
        Boolean correcto = false;
        ArrayList<String> msm = new ArrayList<>();
        msm.add(Opciones.AvionIcono.getmsm());
        msm.add(Opciones.MsmBienvenida.getmsm());
        msm.add(Opciones.OpcionesDeUsers.getmsm());
        enmarcar(msm, 150);
        while (!correcto) {
            eleccion = lee.nextLine();
            switch (eleccion) {
                case "1":
                case "2":
                    correcto = true;
                    break;
                default:
                    enmarcar(Opciones.IngreseCorrecytamente.getmsm(), 150);
                    break;
            }

        }
        return eleccion;
    }
}
