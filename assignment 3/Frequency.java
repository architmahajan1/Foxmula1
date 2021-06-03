import java.util.Arrays;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter the length");
        int a = s.nextInt();
        Integer[] arr=new Integer[a];

        System.out.println("enter the character/string");
        for (int i = 0; i < a; i++) {
            arr[i]=s.nextInt();
        }
        int count = 0;
        System.out.println("enter the string you want to check");
        int d = s.nextInt();

        for (int i=0;i< arr.length;i++){
           if (d==arr[i]){
              {
                   count++;

                }
            }

        }
        System.out.println("number of time it occures is:" + count);
        System.out.println("the array after sorting is ");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
