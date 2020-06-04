

/**
 *
 * @author Noemí
 */
public class Cadeas {
    public static int numVogais(String str){
        char[] vogais={'A','E','I','O','U'};
        int vog=0;
        for(int i=0;i<str.length();i++){
            for(char l:vogais){
                if(str.toUpperCase().charAt(i)==l){
                    vog++;
                    break;
                }
            }
        }
        return vog;
    }
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
        String strNum2="a@";
        System.out.println("A cadea é un número:"+eNumeroEnt(strNum2));
        String vogais="hh";
        System.out.println("A cadea ten: "+numVogais(vogais)+" vogais");
        
    }
}
