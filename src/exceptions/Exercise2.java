package exceptions;

public class Exercise2 {
    public static void main(String[] args){
        String s = null;
        try{
            s.toString();
        }catch (Exception e){
            System.out.println("Caught exception "+e);
        }
    }
}
