import java.util.Scanner;
public class sanitizeprac {
    
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
/* System.out.println("Enter a number");
int userNum = 0;


    try{
        userNum = sc.nextInt();
        
        System.out.println("number is a number" );
        
    }catch(Exception e) {
        System.out.println("Not a number");
    }
    System.out.println("number is " +userNum);

    */

/* String var = "ajcleg4";

if(var.matches("\\D*")){
    System.out.print("patient name valid");

} else {
    System.out.println("invalid string");
}
*/

/* String num = "45";

if(num.matches("\\d*")){
    System.out.println("valid num");
} else {
    System.out.println("invalid");
}
*/

int firstNum = 0;
System.out.println("Enter first nimber for calculator: ");
while(sc.hasNext()){
String line = sc.nextLine();

try{
    int val = Integer.parseInt(line);
    //firstNum = sc.nextInt();
    System.out.println(val + " is a number");
    break;
} catch (Exception e) {
    System.out.println("try again: ");

}

}



    
    
    
    
    
    
    
    
    
    }
}
