import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number layers... ");
        int n = s.nextInt();
        System.out.println("The pattern is here : ");
        for(int i = 0; i < n+1; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    
}
