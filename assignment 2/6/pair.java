import java.util.ArrayList;
import java.util.Scanner;

public class pair {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> c = new ArrayList<>();
        System.out.println("enter the length");
        int a = s.nextInt();
        System.out.println("enter the number");
        for (int i = 0; i < a; i++) {
            c.add(s.nextInt());
            //System.out.println("hello world");
        }
        System.out.println("Enter element's sum");
        int k = s.nextInt();
        for (int i = 0; i < c.size(); i++) {
            for (int j = i + 1; j < c.size(); j++) {
                if (k == (c.get(i) + c.get(j))) {
                    System.out.println("The two pare are (" + c.get(i) + "," + c.get(j) + ")");
                }
            }

        }
    }
}
