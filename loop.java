import java.util.Scanner; //importing the Scanner class to take input from the user
public class loop {  //declaring the class named loop
    public static void main(String[] args) {  //main method which is the entry point of the program
        Scanner s = new Scanner(System.in);  //creating an object of the Scanner class to take input from the user
        System.out.println("Enter a number layers... "); //prompting the user to enter a number which will determine the number of layers in the pattern
        int n = s.nextInt(); //taking the input from the user and storing it in the variable n
        System.out.println("The pattern is here : ");  //printing a message to indicate that the pattern will be displayed
        for(int i = 0; i < n+1; i++) {     //outer loop for determine the number of layers in the pattern
            for(int k = n; k > i; k--) {   //inner loop for printing spaces before the stars in each layer
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) { //inner loop for printing stars in each layer
                System.out.print("*"+" ");
            }
            System.out.println(); //printing a new line after each layer is printed
            
        }
        s.close(); //closing the Scanner object to prevent memory leaks
    }
    
}
