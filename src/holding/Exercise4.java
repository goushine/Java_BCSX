//package holding;
//import java.util.*;
//import net.mindview.*;
//import sun.rmi.rmic.Generator;
//import static net.mindview.util.Print.*;
//
//class MovieNameGenerator implements Generator<String> {
//    String[] characters ={"Grumy","Happy","Sleepy"};
//    int next;
//    public String next(){
//        String r = characters[next];
//        next = (next+1)%characters.length;
//        return r;
//    }
//}
//
//
//public class Exercise4 {
//    private static final MovieNameGenerator mng =new MovieNameGenerator();
//    static String[] fill(String[] array){
//        for(int i=0;i<array.length;i++){
//            array[i] = mng.next();
//        }
//        return array;
//    }
//    static Collection<String> fill(Collection<String> collection){
//        for(int i=0;i<5;i++){
//            collection.add(mng.next());
//        }
//        return collection;
//    }
//
//    public static void main(String[] args){
//        print(Arrays.toString(fill(new String[5])));
//        print(fill(new ArrayList<String>()));
//        print(fill(new LinkedList<String>()));
//        print(fill(new HashSet<String>()));
//        print(fill(new TreeSet<String>()));
//        print(fill(new LinkedHashSet<String>()));
//    }
//}
