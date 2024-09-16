
public class hwtwo {
    public static void main(String[] args) {

        //for this section: are these all printing the best option? If they aren't, fix it!
        //(However you interpret 'fix' is fine i promise, any way you fix it shows you get the concept to me)
        int var1 = 4;
        if (var1 > 4){
            System.out.println("Var1 is greater than 4");
        }else{
            System.out.println("Var1 is less than 4 or equal to 4");
        }

        int var2 = 6;
        if (var2 == 6){
            System.out.println("Var2 is 6");
        } else if (var2 > 5){
            System.out.println("Var2 is greater than 6");
        } else if (var2 < 5){
            System.out.println("Var2 is less than 6");
        } else{
            System.out.println("Var2 is not a number");
        }

        int var3 = 5;
        if (var3 > 10){
            System.out.println("Var3 is greater than 10");
        } else {
            System.out.println("Var3 is 10 or less than 10");
        }




        //for this section: why are we not entering the if statement?
        String college = "marist";
        
        if (college == "marist"){
            System.out.println("Marist college!");
        } else{
            System.out.println("Not marist college :(!");
        }


    }
}
