package generics;

import typeinfo.pets.*;
import java.util.*;
import net.mindview.util.*;

public class SimplePets {
    public static void main(String[] args){
        Map<Person,List<? extends Pet>> petPeople = New.map();
    }
}
