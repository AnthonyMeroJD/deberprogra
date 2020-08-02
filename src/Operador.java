public class Operador {

    public void suma(int a,int b){
        msms("la respuesta de la sumaz es: "+(a+b));
    }
    public void resta(int a,int b){
        msms("la respuesta de la sumaz es: "+(a-b));
    }
    public void multiplicacion(int a,int b){
        msms("la respuesta de la sumaz es: "+(a*b));
    }
    public void division(float a,float b){
        if (b==0){
            msms("no se puede dividir entre 0 ");
        }else {
           msms("la respuesta es:"+(a/b));
        }

    }
    public void msms(String msm){
        System.out.println(msm);
    }
}
