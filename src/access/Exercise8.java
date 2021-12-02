package access;

import access.connection.*;

public class Exercise8 {
    public static void main(String[] args){
        Connectsion c = ConnectionManager.getConnection();
        while(c !=null){
            System.out.println(c);
            c.doSomething();
            c=ConnectionManager.getConnection();
        }
    }
}
