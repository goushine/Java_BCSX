package initialization;

public class NewVarArgs {
    static void printArray(Object... args){
        for(Object obj:args) {
            System.out.print(obj +" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        printArray(new Integer(47),new Float(3.14),new Double(11.11));
        printArray((Object)new Integer[]{1,2,3,4});
    }
}

