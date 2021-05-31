import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class tset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TreeSet<String> c = new TreeSet<>();
        System.out.println("enter the length");
        int a = s.nextInt();
        System.out.println("enter the character/string");
        for (int i = 0; i < a; i++) {
            c.add(s.next());
            Iterator<String> it = c.iterator();
            while (it.hasNext()) {
                System.out.println("The element present are " + it.next());
            }

        }


    }

}
