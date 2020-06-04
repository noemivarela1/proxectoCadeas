

/**
 *
 * @author Noemí
 */
public class Cadeas {
    public static boolean eNumeroEnt(String str){
        boolean eNum=true;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                eNum=true;
            }else{
                eNum=false;
                break;
            }
        }
        return eNum;
    }
    public static void main(String[] args){
        System.out.println("Proxecto Cadeas");
        System.out.println("Cambio feito en remoto");
        String strNum="234";
        System.out.println("A cadea é un número:"+eNumeroEnt(strNum));
        System.out.println("Fin");
    }
}
