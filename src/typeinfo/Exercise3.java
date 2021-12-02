package typeinfo;

import java.util.Arrays;
import java.util.List;

class Rhomboid extends Shape{
    public String toString(){
        return "Rhomboid";
    }
}

public class Exercise3 {
    public static void main(String[] args){
        List<Shape> shapes = Arrays.asList(new Circle(),new Square(),new Triangle(),new Rhomboid());
        for(Shape shape:shapes){
            shape.draw();
        }
        Shape shape = new Rhomboid();
        Rhomboid r = (Rhomboid)shape;

    }
}
