package typeinfo;

public class Exercise4 {
    public static void main(String[] args){
        Shape shape = new Rhomboid();
        Rhomboid r = (Rhomboid)shape;
        Circle c = null;
        if(shape instanceof Circle){
            c = (Circle) shape;
        }else{
            System.out.println("shape not a Circle");
        }
    }
}
