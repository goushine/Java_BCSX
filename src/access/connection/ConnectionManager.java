package access.connection;

public class ConnectionManager {
    private static Connectsion[] pool = new Connectsion[10];
    private static int counter=0;
    static {
        for(int i=0;i<pool.length;i++){
            pool[i] = new Connectsion();
        }
    }
    public static Connectsion getConnection(){
        if(counter < pool.length){
            return pool[counter++];
        }
        return null;
    }
}
