package initialization;

class Test4{
    Test4(){
        System.out.println("Test");
    }
    Test4(String s){
        System.out.println("s: "+s);
    }
}

public class Exercise4 {
    public static void main(String[] args){
        Test4 t = new Test4();
        Test4 t2 = new Test4("111");
    }
}
