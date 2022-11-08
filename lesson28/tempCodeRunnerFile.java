import java.util.HashSet;
import java.util.Set;

public class setInterface {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(11);
        set1.add(22);
        set1.add(33);
        set1.add(44);
        set1.add(55);
        System.out.println("Set: " + set1);
        //clearing the set
        set1.clear();
        System.out.println("the final set: " + set1);

    }
    
}