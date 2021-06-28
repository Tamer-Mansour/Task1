import java.util.Scanner;

public class pythagorean_Theorem {

    public static void main(String[] args) {
        int num1,num2;
        double c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Inter The number 1");
        num1 = scan.nextInt();
        System.out.println("Please Inter The number 2");
        num2 = scan.nextInt();
        c = Math.sqrt((num1*num1)+(num2*num2));
        System.out.println("The Result is : "+c);
    }
}

