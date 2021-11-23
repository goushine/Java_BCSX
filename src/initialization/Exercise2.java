package initialization;

public class Exercise2 {
    String s1 = "Initilized at definiation";
    String s2;
    public Exercise2(String s2i){
        s2 = s2i;
    }
    public static void main(String[] args){
        Exercise2 e2 = new Exercise2("Initialized at construction");
        System.out.println("e2.s1= "+e2.s1);
        System.out.println("e2.s2= "+e2.s2);
    }
}
