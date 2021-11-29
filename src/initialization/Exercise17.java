package initialization;

class Test17{
    Test17(String s){
        System.out.println("String constructor,s= "+s);
    }
}

public class Exercise17 {

    public static void main(String[] args){
        Test17[] array1 = new Test17[5];
        for(int i =0;i<array1.length;i++){
            array1[i] = new Test17(Integer.toString(i));
        }
    }
}
