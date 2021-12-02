package exceptions;

public class Exercise0 {
    public static void main(String[] args){
        try{
            int i =10/0;
        }catch (RuntimeException e){
            System.out.println("RuntimeException e");
        }catch (Exception e){
            System.out.println("Exception e");
        }
    }
}
