package initialization;

class Dog{

    void bark(){
        System.out.println("Default bark!");
    }

    void bark(int i){
        System.out.println("barking "+i);
    }
    void bark(String s){
        System.out.println("howling "+s);
    }
}

public class Exercise5 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1);
        dog.bark("1");
    }
}
