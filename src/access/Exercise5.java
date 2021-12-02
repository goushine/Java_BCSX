package access;

public class Exercise5 {
    public int a;
    private int b;
    protected int c;
    int d;
    public void f1(){}
    protected void f2(){}
    private  void f3(){}
    void f4(){}
    public static void main(String[] args){
        Exercise5 e5 = new Exercise5();
        e5.a =1;
        e5.b =2;
        e5.c =3;
        e5.d=4;
        e5.f1();
        e5.f2();
        e5.f3();
        e5.f4();
    }
}
