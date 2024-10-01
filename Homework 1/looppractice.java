import java.util.Scanner;

public class looppractice {

     public static void main(String[] args) {

String name = "AJ";
for(int i = 0 ; i < 2; i++){
    System.out.println(name);

}

int i = 0;
while(i<2) {
    
    System.out.println(i);
    i++;
}

int x = 0;
while(x<=10) {
   System.out.println(x);
x++;
}


int y = 1;
String p = "AJ Thomas";
while(y <=4) {
    System.out.println(p);
    y++;

}

Scanner sc = new Scanner(System.in);
System.out.println("Give me a number" );
Integer ques = sc.nextInt();
int sum = 0;
for(int v = 1; v <= ques; v++) {
    sum = sum + v;
    
    
}

System.out.println(sum);



















}
}