package exceptions;

public class Exercise1 {
    public static void main(String[] args){
        try{
            throw new Exception("An exception in main");
        }catch(Exception e){
            System.out.println("e.getMessage()= "+e.getMessage());
        }finally {
            System.out.println("In finally clause");
        }
    }
}
