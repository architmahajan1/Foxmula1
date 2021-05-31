import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class occ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> c = new ArrayList<>();
        System.out.println("enter the length");
        int a = s.nextInt();
        System.out.println("enter the character/string");
        for (int i = 0; i < a; i++) {
            c.add(s.next());
        }
        int count = 0;
        System.out.println("enter the string ypu want to check");
        String d = s.next();
        System.out.println(c.contains(d));
      for (int i=0;i<c.size();i++){
          if (d.equals(c.get(i))){
                {
                    count++;

                }
            }

        }
        System.out.println("number of time it occures is:" + count);
    }
}

