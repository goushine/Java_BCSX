package holding;

import java.util.ArrayList;

class Gala extends Apple{

}

public class GenericsAndUpcasting {
    public static void main(String[] args){
        Apple apple= new Apple();
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new Gala());
        for(Apple c:apples){
            System.out.println(c);
        }
        System.out.println(apple);
    }
}
