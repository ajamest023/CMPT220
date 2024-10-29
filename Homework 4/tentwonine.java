import java.util.Scanner;

public class tentwonine {
    public static void main(String[] args) {
    
    
     String[] names = {"Tyler", "Will", "Steve", "Aiden"};


// shorthand way
   /*  for(String i : names){
        System.out.println(i);

    }

    // normal way 
    for(int n = 0; n < names.length; n++){
        System.out.println(names[n]);
    }
    
int[] nums = { 1,2,3,4,5};

for(int k : nums){
    System.out.println(k);
}
    */

Scanner sc = new Scanner(System.in);

/* System.out.println("What grade did you get on the test?");

int grade = sc.nextInt();

switch (grade) {

case 0:
    
case 10:
    
case 20:
    
case 30:
    
case 40:
    
case 50:
    System.out.println("F");
    break;
case 60:
    System.out.println("D");
    break;
case 70:
    System.out.println("C");
    break;
case 80:
    System.out.println("B");
    break;
case 90:
    System.out.println("A");
    break;
case 100:
    System.out.println("A");
    break;
*/

/* System.out.println("What is your age?");

Integer age = sc.nextInt();

switch (age) {
case 0:
case 10:
    System.out.println("cant drink");
    break;
case 20:
    System.out.println("if 21 or above then you can drink");
    break;
case 30:
case 40:
case 50:
case 60:
case 70:
case 80:
case 90:
    System.out.println("you can drink");
    break;

default :
System.out.println("invalid age");
    }
*/

/* Integer add = 100;

add += 3;
System.out.println(add);

add -= 3;
System.out.println(add);

add  *= 5;
System.out.println(add);

add /= 100;
System.out.println(add);

*/


System.out.println("what is your age");
Integer drink = sc.nextInt();

String result = (drink >= 21)? ("Can drink"): ("Cannot drink");

System.out.println(result);











    
    
    
    
    
    
    
    
    
    
    
    
    
    }

}
