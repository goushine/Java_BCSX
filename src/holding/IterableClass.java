package holding;
import java.util.*;

public class IterableClass implements Iterable<String>{
    protected String[] words =("And that is how "+"we know the Earch to be").split(" ");
    public Iterator<String> iterator(){
        return new Iterator<String>(){
            private int index =0;
            public boolean hasNext(){
                return index < words.length;
            }
            public String next(){return words[index++];}
            public void remove(){throw new UnsupportedOperationException();}
        };

    }
    public static void main(String[] args){
        for(String s :new IterableClass()){
            System.out.print(s+" ");
        }
    }
}
