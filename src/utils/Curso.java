package utils;

import utils.Menu;
import utils.Opciones;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Curso{
    private static Menu menu=new Menu();
    public static void main(String[] args) {

        bienvenidaSistema();
    }

    private static void bienvenidaSistema(){
        String op=menu.bienvenida();
        switch (op){
            case "1":
                System.out.println("user");
                break;
            case "2":
                menu.limpiarpantalla();
                loginAdmin();
                break;
        }
    }

    private static void loginAdmin(){
        HashMap<String,String> hn=menu.menuLogin();
        Validacion validacion=new Validacion();
        ArrayList<String> b=new ArrayList<>();
        b.add("botton 1");
        b.add("botton 2");b.add("botton 3");
        menu.enmarcarBoton(b);
//        if (validacion.validaUserPass(hn)){
//
//        };
    }
}



