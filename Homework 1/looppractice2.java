import java.util.Scanner;


public class looppractice2 {
    

     public static void main(String[] args) {

        //int counter = 10;
        //while(counter >= 1) {
           // System.out.println(counter);
           // counter = counter - 1;
            
       // }

       //for(int i = 10; i >= 1; i--) {
        //System.out.println(i);
       //}

      // Scanner sc = new Scanner(System.in);
       //System.out.println("Enter the password: ");
       //String guess = sc.nextLine();
       //String pass = "baseball";


       //while(!guess.equals(pass)) {
        //System.out.println("wrong password");
        //guess = sc.nextLine();
        //}
    //System.out.println("correct");
      
    Scanner sca = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sca.nextInt();

    int sum = 0;
    while(num >= 0) {
        sum = sum + num;
        System.out.println("keep going brah");
        num = sca.nextInt();    
    
    }
    System.out.println("negative number brah here is the sum: " + sum);
       




}
    }
    

