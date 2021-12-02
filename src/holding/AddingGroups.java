package holding;

import java.util.*;

public class AddingGroups {
    public static void main(String[] args){
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts ={6,7,8,9,10};
        //区别collection.addAll and Collections.addAll。
        collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,moreInts);
        List<Integer> list = Arrays.asList(16,17,18,19,20);//底层是数据，因此无法改变。
        list.set(1,99);
    }
}
