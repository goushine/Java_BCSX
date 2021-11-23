package initialization;

public class Exercise8 {
    public void method1(){
        System.out.println("method1");
        method2();
        this.method2();
    }
    public void method2(){
        System.out.println("method2");
    }
    public static void main(String[] args){
        Exercise8 e8 = new Exercise8();
        e8.method1();
    }
}
