package ploymorphism.shape;

class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public void printMsg(){
        System.out.println("print Shapes msg");
    }

    public static void main(String[] args){
        Shape[] s = new Shape[9];
        for(int i =0;i<s.length;i++){
            s[i] = gen.next();
        }
        for(Shape shp:s){
            shp.draw();
        }
    }
}
class NewType extends Shape{
    @Override
    public void draw(){
        System.out.println("NewType.draw()");
    }
    @Override
    public void erase(){
        System.out.println("NewType.erase()");
    }
}
