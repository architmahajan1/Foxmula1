import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class set {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<Integer> num = new HashSet<>();
        System.out.println("enter the length");
        int a = s.nextInt();
        System.out.println("enter the number");
        for (int i =0; i <a; i++) {
            num.add(s.nextInt());
            //System.out.println("hello world");
        }
        System.out.println("Enter the number to search");
        int n = s.nextInt();
        if (num.contains(n)) {
            System.out.println("number is present");
        } else {
            System.out.println("Does not contain number");
        }
    }
}
