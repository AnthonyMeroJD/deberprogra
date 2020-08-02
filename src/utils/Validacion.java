package utils;

import com.sun.org.apache.xpath.internal.operations.Bool;
import model.Admin;
import model.Cliente;
import org.omg.CORBA.Any;

import java.util.ArrayList;
import java.util.HashMap;

public class Validacion {
    private HashMap<Integer, Admin> userAdmin = new HashMap<>();
    private int contadorUser = 0;

    public Validacion() {
        //creo una lista de administrador
        for (int i=0;i<3;i++){
            Admin a = new Admin("admin"+(i+1), "123");
            userAdmin.put(contadorUser++, a);
        }

    }

    public Boolean validaUserPassAdmin(HashMap<String, String> campos) {
        Boolean valida = false;

        if (campos.containsKey(Opciones.Usuario.getmsm()) && campos.containsKey(Opciones.Contraseña.getmsm())) {
            for (int i = 0; i < userAdmin.size(); i++) {
                String contraseña, usuario;
                contraseña = userAdmin.get(i).getPass();
                usuario = userAdmin.get(i).getUser();
                valida = contraseña.equals(campos.get(Opciones.Contraseña.getmsm())) &&
                        usuario.equals(campos.get(Opciones.Usuario.getmsm()));
                if (valida) {
                    break;
                }
            }
        }
        return valida;
    }

}
