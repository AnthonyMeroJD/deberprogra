package utils;

public enum  Tamaño {
    claseEconomy{
        @Override
        String tamano() {
            return " clase Economy ";
        }
    },claseBusiness{
        @Override
        String tamano() {
            return "clase Business";
        }
    },claseLaPremière{
        @Override
        String tamano() {
            return "clase La Première";
        }
    };

    abstract String tamano();

    }
