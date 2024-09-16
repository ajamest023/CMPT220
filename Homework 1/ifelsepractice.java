//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class ifelsepractice {
    public static void main(String[] args) {

        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many world series have the Yankees won?");
        Integer ques1 = sc.nextInt();
        
        // question 1
        if (ques1 == 27) {
            counter = counter + 1;
            System.out.println("You are correct and your score is " + counter );
        } else{
            System.out.println("You are incorrect and your score is " + counter );
        
        }
        //question 2 
        Scanner sc2 = new Scanner(System.in);
        System.out.println("What is the highest amount of strikeouts in a single MLB game? ");
        Integer ques2 = sc2.nextInt();

        
        if (ques2 == 20){
            counter = counter + 1;
            System.out.println("you are correct and your score is " + counter );
        } else{
            System.out.println("you are incorrect and your score is " + counter);

        }
       
    // Question 3

    Scanner sc3 = new Scanner(System.in);
    System.out.println("How many runs is a Grand Slam worth in baseball?");
    Integer ques3 = sc3.nextInt();

    if (ques3 == 4) {
        counter = counter + 1;
        System.out.println("you are correct and your score is " + counter );
    }else {
        System.out.println("you are incorrect and your score is " + counter);

    }
   System.out.println("your final score is " + counter + "/3");



    }
    
    
    
    
    
    
    
    
    
        }





    
    
    
    
        


    



