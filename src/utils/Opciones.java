package utils;

import java.util.ArrayList;

public enum Opciones {
    MsmBienvenida {
        @Override
        String getmsm() {
            return "BIENVENDOS AL SISTEMA DE RESERVA DE VUELOS AIRLINE";
        }
    },
    MsmLoginAdmin{
        @Override
        String getmsm() {
            return "Bienvenido administrador";
        }
    },
    Reservar {
        @Override
        String getmsm() {
            return null;
        }
    },
    IngreseCorrecytamente {
        @Override
        String getmsm() {
            return "Ingrese el rango correcto de las opciones";
        }
    },
    Ingresar {
        @Override
        String getmsm() {
            return "Escribe tu usuario y contraseña";
        }
    },
    VuelosDispoibles {
        @Override
        String getmsm() {
            return null;
        }
    },
    SeleccionAsiento {
        @Override
        String getmsm() {
            return null;
        }
    },
    Usuario {
        @Override
        String getmsm() {
            return "Usuario";
        }
    }, Contraseña {
        @Override
        String getmsm() {
            return "Contraseña";
        }
    }, Admin {
        @Override
        String getmsm() {
            return "admin";
        }
    }, Cliente {
        @Override
        String getmsm() {
            return "cliente";
        }
    }, OpcionesDeUsers {
        @Override
        String getmsm() {
            return "Elija 1 si desea ingresar como " + Cliente.getmsm() + "\n Elija 2 si desea ingresar como " + Admin.getmsm();
        }
    }, AvionIcono {
        @Override
        String getmsm() {
            return "   ____\n" +
                    "     \\\\  `.\n" +
                    "      \\\\   `.\n" +
                    "       \\ \\   `.\n" +
                    "        \\\\01838`.\n" +
                    "        :. . . . `._______________________.-~|~~-._\n" +
                    "        \\                                 ---'-----`-._\n" +
                    "         /\"\"\"\"\"\"\"/             _...---------..         ~-._________\n" +
                    "        //     .`_________  .-`           \\ .-~           /\n" +
                    "       //    .'       ||__.~             .-~_____________/\n" +
                    "      //___.`           .~            .-~\n" +
                    "                      .~           .-~\n" +
                    "                    .~         _.-~\n" +
                    "                    `-_____.-~'\n" +
                    " ";
        }
    };


    abstract String getmsm();

}
