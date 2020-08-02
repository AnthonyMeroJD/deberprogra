import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ficheros {
    public static void main(String[] args) {
        try {
            FileWriter file=new FileWriter("C:\\Users\\Anthony\\Documents\\contactos.txt");
            PrintWriter pw=new PrintWriter(file);
            Scanner s=new Scanner(System.in);
            int numero;
            String nombre;
            boolean salir=true;

            while (salir) {
                System.out.println("Ingrese el nombre del contacto");
                nombre=s.nextLine();
                pw.print(nombre);
                System.out.println("Ingrese el apellido del contacto");
                nombre=s.nextLine();
                pw.print(nombre);
                System.out.println("Ingrese el celular del contacto");
                numero=s.nextInt();
                pw.print(numero);
                System.out.println("coloque 0 si desea salir o 1 si quiere ingresar mas contactos");
                numero=s.nextInt();
                if (numero==0){salir=false;}else {

                    pw.println("");
                    String f=s.nextLine();
                }
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
