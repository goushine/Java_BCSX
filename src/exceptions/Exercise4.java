package exceptions;

class MyException2 extends Exception{
    String msg;
    public MyException2(String msg){
        this.msg = msg;
    }
    public void printMsg(){
        System.out.println("msg = "+msg);
    }
}

class MyException3 extends Exception{
    public MyException3(String msg){
       super(msg);
    }
}

public class Exercise4{
    public static void main(String[] args){
        try{
            throw new MyException2("MyException2 message");
        }catch(MyException2 e){
            e.printMsg();
        }
        try{
            throw new MyException3("MyException3 message");
        }catch(MyException3 ee){
            System.out.println("e.getMessage() ="+ee.getMessage());
        }
    }
}
