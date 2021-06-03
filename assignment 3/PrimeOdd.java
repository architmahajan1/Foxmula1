import java.util.Scanner;

class CustomException extends Exception{
    public CustomException(int num) {
        System.out.println("No is invalid " +num);
    }
}
public class PrimeOdd {

    public static void main(String[] args) throws CustomException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number for input");
        int num = s.nextInt();
        if (num == 2) {
            System.out.println("not a odd  number");
        }
        else
        {
            int count=0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if(count>0){
                System.out.println("divisible by more than 2 number ");
            }
            else{
                throw new CustomException(num);
            }
        }
    }
}



