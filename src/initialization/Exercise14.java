package initialization;

public class Exercise14 {
    static String i ="1";
    static String j;
    static {
         j = "2";
    }
    static void f(){
        System.out.println("i ="+i+" j= "+j);
    }
    public static void main(String[] args){

    }
}
