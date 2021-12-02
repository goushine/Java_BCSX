package access.connection;

public class Connectsion {
    private static int count =0;
    private int id = count++;
    Connectsion(){}
    public String toString(){
        return "Connection "+id;
    }
    public void doSomething(){}
}
