import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number... ");
        int a =  s.nextInt();
        System.out.print("Enter the second number... ");
        int b = s.nextInt();
        System.out.println("The sum of the two numbers is: " + (a + b));


    }
}
