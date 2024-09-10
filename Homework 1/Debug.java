//always start with importing our scanner so we can use it!
import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        //I've already set up a scanner with the name 'sc' for you!
        
    
        //finish this one for me by receiving and printing the user's age back to them

        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you? ");
        String age = sc.nextLine();
        System.out.println("You are " + age + " years old.");


        //can you do some math for me? take these variable and print out the sum of them!
        int num1 = 10;
        int num2 = 37;
        //?
        System.out.print("The sum of these numbers is ");
        System.out.println( num1 + num2);
        

    }
}


