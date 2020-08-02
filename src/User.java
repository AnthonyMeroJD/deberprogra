public class User {
    public void mensaje(String msm){
        System.out.println(msm);
    }
    public void validarUser(String user, String clave) {
        if (user.equals("anthony") && clave.equals("123456A")){
            mensaje("ingreso correcto");
        } else {
            mensaje("verifique los datos");
        }
    }
}
