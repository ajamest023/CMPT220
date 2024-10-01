import java.util.Scanner;


public class test_2 {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Give me a number: ");
//int userIn = sc.nextInt();

int sum = 0 ;
for(int i = 0; i <= 10; i++) {
    sum = i + sum;

}
System.out.println(sum);


String password = "passw0rd";
String userPass = "";




while(userPass != password) {
    System.out.println("What is the password? ");
    userPass = sc.nextLine();

if(password.equals(userPass)) {
    System.out.println("Correct");
    break;
}else{
    System.out.println("try again");
} 
}
    
    
    
    
    }
    }

