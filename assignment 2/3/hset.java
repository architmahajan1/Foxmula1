import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class hset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<String> c = new HashSet<>();
        System.out.println("enter the length");
        int a = s.nextInt();
        System.out.println("enter the character/string");
        for (int i =0; i <a; i++) {
            c.add(s.next());
            //System.out.println("hello world");
        }
        //System.out.println("Enter the number to search");
        //int n = s.nextInt();
        //if (num.contains(n)) {
          //  System.out.println("number is present");
        //} else {
          //  System.out.println("Does not contain number");
        //}
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            System.out.println("The element present are "+it.next());
            //System.out.println( );
        }
    }
}
