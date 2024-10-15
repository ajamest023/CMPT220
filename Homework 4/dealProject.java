import java.util.Scanner;


public class dealProject {
    public static void main(String[] args) {

    

        int[] cases = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        int[] values = {1000,60000,3000,10,5000,10000,20000,100,25000,75000,700,2000,3500,500,1,250,350,6000,100000,25,15000,4500,80000,7000,50000,4000};

        String pickedFirst = "";
        int pickedFirstValue = 0;


Scanner sc = new Scanner(System.in);


// asking for first case
System.out.println("Welcome to Deal or No Deal");

System.out.println("Please choose a starting case 1-26 typed as a word; One, Two, Twenty-two, Twenty-three etc");
String firstCase = sc.nextLine();

if(firstCase.equals("One")){ 
    pickedFirst = "One";
    pickedFirstValue = values[0];
    cases[0]=0;
    values[0]=0;}
if(firstCase.equals("Two")){
    pickedFirst = "Two";
    pickedFirstValue = values[1];
    cases[1]=0;
    values[1]=0;}
if(firstCase.equals("Three")){
    pickedFirst = "Three";
    pickedFirstValue = values[2];
    cases[2]=0;
    values[2]=0;}
if(firstCase.equals("Four")){
    pickedFirst = "Four";
    pickedFirstValue = values[3];
    cases[3]=0;
    values[3]=0;}
if(firstCase.equals("Five")){
    pickedFirst = "Five";
    pickedFirstValue = values[4];
    cases[4]=0;
    values[4]=0;}
if(firstCase.equals("Six")){
    pickedFirst = "Six";
    pickedFirstValue = values[5];
    cases[5]=0;
    values[5]=0;}
if(firstCase.equals("Seven")){
    pickedFirst = "Seven";
    pickedFirstValue = values[6];
    cases[6]=0;
    values[6]=0;}
if(firstCase.equals("Eight")){
    pickedFirst = "Eight";
    pickedFirstValue = values[7];
    cases[7]=0;
    values[7]=0;}
if(firstCase.equals("Nine")){
    pickedFirst = "Nine";
    pickedFirstValue = values[8];
    cases[8]=0;
    values[8]=0;}
if(firstCase.equals("Ten")){
    pickedFirst = "Ten";
    pickedFirstValue = values[9];
    cases[9]=0;
    values[9]=0;}
if(firstCase.equals("Eleven")){
    pickedFirst = "Eleven";
    pickedFirstValue = values[10];
    cases[10]=0;
    values[10]=0;                 
}
if(firstCase.equals("Twelve")){
    pickedFirst = "Twelve";
    pickedFirstValue = values[11];
    cases[11]=0;
    values[11]=0;}
if(firstCase.equals("Thirteen")){
    pickedFirst = "Thirteen";
    pickedFirstValue = values[12];
    cases[12]=0;
    values[12]=0;}
if(firstCase.equals("Fourteen")){
    pickedFirst = "Fourteen";
    pickedFirstValue = values[13];
    cases[13]=0;
    values[13]=0;}
if(firstCase.equals("Fifteen")){
    pickedFirst = "Fifteen";
    pickedFirstValue = values[14];
    cases[14]=0;
    values[14]=0;}
if(firstCase.equals("Sixteen")){
    pickedFirst = "Sixteen";
    pickedFirstValue = values[15];
    cases[15]=0;
    values[15]=0;}
if(firstCase.equals("Seventeen")){
    pickedFirst = "Seventeen";
    pickedFirstValue = values[16];
    cases[16]=0;
    values[16]=0;}
if(firstCase.equals("Eighteen")){
    pickedFirst = "Eighteen";
    pickedFirstValue = values[17];
    cases[17]=0;
    values[17]=0;}
if(firstCase.equals("Nineteen")){
    pickedFirst = "Nineteen";
    pickedFirstValue = values[18];
    cases[18]=0;
    values[18]=0;}
if(firstCase.equals("Twenty")){
    pickedFirst = "Twenty";
    pickedFirstValue = values[19];
    cases[19]=0;
    values[19]=0;}
if(firstCase.equals("Twenty-one")){
    pickedFirst = "Twenty-One";
    pickedFirstValue = values[20];
    cases[20]=0;
    values[20]=0;}
if(firstCase.equals("Twenty-two")){
    pickedFirst = "Twenty-Two";
    pickedFirstValue = values[21];
    cases[21]=0;
    values[21]=0;}
if(firstCase.equals("Twenty-three")){
    pickedFirst = "Twenty-Three";
    pickedFirstValue = values[22];
    cases[22]=0;
    values[22]=0;}
if(firstCase.equals("Twenty-four")){
    pickedFirst = "Twenty-Four";
    pickedFirstValue = values[23];
    cases[23]=0;
    values[23]=0;}
if(firstCase.equals("Twenty-five")){
    pickedFirst = "Twemnty-Five";
    pickedFirstValue = values[24];
    cases[24]=0;
    values[24]=0;}
if(firstCase.equals("Twenty-six")){
    pickedFirst = "Twenty-Six";
    pickedFirstValue = values[25];
    cases[25]=0;
    values[25]=0;}



// first Round 6 cases
    System.out.println("Round 1, choose Six cases");
for (int i = 0; i < 6; i++) {
        System.out.println("\nChoose your case");
        System.out.println("Cases left:");

        // Display available cases
        for (int j = 0; j < cases.length; j++) {
            if (cases[j] != 0) {
                System.out.print(cases[j] + ", ");
            }
        }
        System.out.println();

        String nextCase = sc.nextLine();

        // Process next case selection
        for (int j = 0; j < cases.length; j++) {
            if (nextCase.equals(cases[j]) && cases[j] != 0) {
                System.out.println("Case " + (cases[j]) + " had a value of $" + values[j]);
                cases[j] = 0;  // Mark case as removed
                break;
            }
        }
    

    if(nextCase.equals("One") && values[0] != 0){
        cases[0] = 0;
        System.out.println("Case One had a value of " + values[0]);
        values[0] = 0;}
        if(nextCase.equals("Two") && values[1] != 0){
            cases[1] = 0;
            System.out.println("Case Two had a value of " + values[1]);
            values[1] = 0;}
            if(nextCase.equals("Three") && values[2] != 0){
                cases[2] = 0;
                System.out.println("Case Three had a value of " + values[2]);
                values[2] = 0;}
                if(nextCase.equals("Four") && values[3] != 0){
                    cases[3] = 0;
                    System.out.println("Case Four had a value of " + values[3]);
                    values[3] = 0;}
                    if(nextCase.equals("Five") && values[4] != 0){
                        cases[4] = 0;
                        System.out.println("Case Five had a value of " + values[4]);
                        values[4] = 0;}
                        if(nextCase.equals("Six") && values[5] != 0){
                            cases[5] = 0;
                            System.out.println("Case Six had a value of " + values[5]);
                            values[5] = 0;}
                            if(nextCase.equals("Seven") && values[6] != 0){
                                cases[6] = 0;
                                System.out.println("Case Seven had a value of " + values[6]);
                                values[6] = 0;}
                                if(nextCase.equals("Eight") && values[7] != 0){
                                    cases[7] = 0;
                                    System.out.println("Case Eight had a value of " + values[7]);
                                    values[7] = 0;}
                                    if(nextCase.equals("Nine") && values[8] != 0){
                                        cases[8] = 0;
                                        System.out.println("Case Nine had a value of " + values[8]);
                                        values[8] = 0;}
                                        if(nextCase.equals("Ten") && values[9] != 0){
                                            cases[9] = 0;
                                            System.out.println("Case Ten had a value of " + values[9]);
                                            values[9] = 0;}
                                            if(nextCase.equals("Eleven") && values[10] != 0){
                                                cases[10] = 0;
                                                System.out.println("Case Eleven had a value of " + values[10]);
                                                values[10] = 0;}
                                                if(nextCase.equals("Twelve") && values[11] != 0){
                                                    cases[11] = 0;
                                                    System.out.println("Case Twelve had a value of " + values[11]);
                                                    values[11] = 0;}
                                                    if(nextCase.equals("Thirteen") && values[12] != 0){
                                                        cases[12] = 0;
                                                        System.out.println("Case Thirteen had a value of " + values[12]);
                                                        values[12] = 0;}
                                                        if(nextCase.equals("Fourteen") && values[13] != 0){
                                                            cases[13] = 0;
                                                            System.out.println("Case Fourteen had a value of " + values[13]);
                                                            values[13] = 0;}
                                                            if(nextCase.equals("Fifteen") && values[14] != 0){
                                                                cases[14] = 0;
                                                                System.out.println("Case Fifteen had a value of " + values[14]);
                                                                values[14] = 0;}
                                                                if(nextCase.equals("Sixteen") && values[15] != 0){
                                                                    cases[15] = 0;
                                                                    System.out.println("Case Sixteen had a value of " + values[15]);
                                                                    values[15] = 0;}
                                                                    if(nextCase.equals("Seventeen") && values[16] != 0){
                                                                        cases[16] = 0;
                                                                        System.out.println("Case Seventeen had a value of " + values[16]);
                                                                        values[16] = 0;}
                                                                        if(nextCase.equals("Eighteen") && values[17] != 0){
                                                                            cases[17] = 0;
                                                                            System.out.println("Case Eighteen had a value of " + values[17]);
                                                                            values[17] = 0;}
                                                                            if(nextCase.equals("Nineteen") && values[18] != 0){
                                                                                cases[18] = 0;
                                                                                System.out.println("Case Nineteen had a value of " + values[18]);
                                                                                values[18] = 0;}
                                                                                if(nextCase.equals("Twenty") && values[19] != 0){
                                                                                    cases[19] = 0;
                                                                                    System.out.println("Case Twenty had a value of " + values[19]);
                                                                                    values[19] = 0;}
                                                                                    if(nextCase.equals("Twenty-one") && values[20] != 0){
                                                                                        cases[20] = 0;
                                                                                        System.out.println("Case Twenty-one had a value of " + values[20]);
                                                                                        values[20] = 0;}
                                                                                        if(nextCase.equals("Twenty-two") && values[21] != 0){
                                                                                            cases[21] = 0;
                                                                                            System.out.println("Case Twenty-two had a value of " + values[21]);
                                                                                            values[21] = 0;}
                                                                                            if(nextCase.equals("Twenty-three") && values[22] != 0){
                                                                                                cases[22] = 0;
                                                                                                System.out.println("Case Twenty-three had a value of " + values[22]);
                                                                                                values[22] = 0;}
                                                                                                if(nextCase.equals("Twenty-four") && values[23] != 0){
                                                                                                    cases[23] = 0;
                                                                                                    System.out.println("Case Twenty-four had a value of " + values[23]);
                                                                                                    values[23] = 0;}
                                                                                                    if(nextCase.equals("Twenty-five") && values[24] != 0){
                                                                                                        cases[24] = 0;
                                                                                                        System.out.println("Case Twenty-five had a value of " + values[24]);
                                                                                                        values[24] = 0;}
                                                                                                        if(nextCase.equals("Twenty-six") && values[25] != 0){
                                                                                                            cases[25] = 0;
                                                                                                            System.out.println("Case Twenty-six had a value of " + values[25]);
                                                                                                            values[25] = 0;}
                                                                                                        }


 // Banker round 1 
 int sumOne = 0;
 int length1 = values.length;
 for (int i = 0; i < values.length; i++) {
    sumOne += values[i];}

int banker1 = sumOne / length1;

 System.out.println("I am the banker, I am here to make you an offer for $" + banker1);
System.out.println("Do you wish to take the deal?");

String userChoiceOne = sc.nextLine();

if(userChoiceOne.equals("Yes")){
    System.out.println("Congrats you won $" + banker1);
    System.exit(0);}

//round 2 
System.out.println("Round 2, choose 5 cases");
for (int i = 0; i < 5; i++) {
    System.out.println("\nChoose your next case!");
    System.out.println("Cases left:");

    // cases available
    for (int j = 0; j < cases.length; j++) {
        if (cases[j] != 0) {
            System.out.print(cases[j] + ", ");
        }
    }
    System.out.println();

    String nextCase = sc.nextLine();

    // Process next case selection
    for (int j = 0; j < cases.length; j++) {
        if (nextCase.equals(cases[j]) && cases[j] != 0) {
            System.out.println("Case " + (cases[j]) + " had a value of $" + values[j]);
            cases[j] = 0;  
            break;
        }
    }


if(nextCase.equals("One") && values[0] != 0){
    cases[0] = 0;
    System.out.println("Case One had a value of " + values[0]);
    values[0] = 0;}
    if(nextCase.equals("Two") && values[1] != 0){
        cases[1] = 0;
        System.out.println("Case Two had a value of " + values[1]);
        values[1] = 0;}
        if(nextCase.equals("Three") && values[2] != 0){
            cases[2] = 0;
            System.out.println("Case Three had a value of " + values[2]);
            values[2] = 0;}
            if(nextCase.equals("Four") && values[3] != 0){
                cases[3] = 0;
                System.out.println("Case Four had a value of " + values[3]);
                values[3] = 0;}
                if(nextCase.equals("Five") && values[4] != 0){
                    cases[4] = 0;
                    System.out.println("Case Five had a value of " + values[4]);
                    values[4] = 0;}
                    if(nextCase.equals("Six") && values[5] != 0){
                        cases[5] = 0;
                        System.out.println("Case Six had a value of " + values[5]);
                        values[5] = 0;}
                        if(nextCase.equals("Seven") && values[6] != 0){
                            cases[6] = 0;
                            System.out.println("Case Seven had a value of " + values[6]);
                            values[6] = 0;}
                            if(nextCase.equals("Eight") && values[7] != 0){
                                cases[7] = 0;
                                System.out.println("Case Eight had a value of " + values[7]);
                                values[7] = 0;}
                                if(nextCase.equals("Nine") && values[8] != 0){
                                    cases[8] = 0;
                                    System.out.println("Case Nine had a value of " + values[8]);
                                    values[8] = 0;}
                                    if(nextCase.equals("Ten") && values[9] != 0){
                                        cases[9] = 0;
                                        System.out.println("Case Ten had a value of " + values[9]);
                                        values[9] = 0;}
                                        if(nextCase.equals("Eleven") && values[10] != 0){
                                            cases[10] = 0;
                                            System.out.println("Case Eleven had a value of " + values[10]);
                                            values[10] = 0;}
                                            if(nextCase.equals("Twelve") && values[11] != 0){
                                                cases[11] = 0;
                                                System.out.println("Case Twelve had a value of " + values[11]);
                                                values[11] = 0;}
                                                if(nextCase.equals("Thirteen") && values[12] != 0){
                                                    cases[12] = 0;
                                                    System.out.println("Case Thirteen had a value of " + values[12]);
                                                    values[12] = 0;}
                                                    if(nextCase.equals("Fourteen") && values[13] != 0){
                                                        cases[13] = 0;
                                                        System.out.println("Case Fourteen had a value of " + values[13]);
                                                        values[13] = 0;}
                                                        if(nextCase.equals("Fifteen") && values[14] != 0){
                                                            cases[14] = 0;
                                                            System.out.println("Case Fifteen had a value of " + values[14]);
                                                            values[14] = 0;}
                                                            if(nextCase.equals("Sixteen") && values[15] != 0){
                                                                cases[15] = 0;
                                                                System.out.println("Case Sixteen had a value of " + values[15]);
                                                                values[15] = 0;}
                                                                if(nextCase.equals("Seventeen") && values[16] != 0){
                                                                    cases[16] = 0;
                                                                    System.out.println("Case Seventeen had a value of " + values[16]);
                                                                    values[16] = 0;}
                                                                    if(nextCase.equals("Eighteen") && values[17] != 0){
                                                                        cases[17] = 0;
                                                                        System.out.println("Case Eighteen had a value of " + values[17]);
                                                                        values[17] = 0;}
                                                                        if(nextCase.equals("Nineteen") && values[18] != 0){
                                                                            cases[18] = 0;
                                                                            System.out.println("Case Nineteen had a value of " + values[18]);
                                                                            values[18] = 0;}
                                                                            if(nextCase.equals("Twenty") && values[19] != 0){
                                                                                cases[19] = 0;
                                                                                System.out.println("Case Twenty had a value of " + values[19]);
                                                                                values[19] = 0;}
                                                                                if(nextCase.equals("Twenty-one") && values[20] != 0){
                                                                                    cases[20] = 0;
                                                                                    System.out.println("Case Twenty-one had a value of " + values[20]);
                                                                                    values[20] = 0;}
                                                                                    if(nextCase.equals("Twenty-two") && values[21] != 0){
                                                                                        cases[21] = 0;
                                                                                        System.out.println("Case Twenty-two had a value of " + values[21]);
                                                                                        values[21] = 0;}
                                                                                        if(nextCase.equals("Twenty-three") && values[22] != 0){
                                                                                            cases[22] = 0;
                                                                                            System.out.println("Case Twenty-three had a value of " + values[22]);
                                                                                            values[22] = 0;}
                                                                                            if(nextCase.equals("Twenty-four") && values[23] != 0){
                                                                                                cases[23] = 0;
                                                                                                System.out.println("Case Twenty-four had a value of " + values[23]);
                                                                                                values[23] = 0;}
                                                                                                if(nextCase.equals("Twenty-five") && values[24] != 0){
                                                                                                    cases[24] = 0;
                                                                                                    System.out.println("Case Twenty-five had a value of " + values[24]);
                                                                                                    values[24] = 0;}
                                                                                                    if(nextCase.equals("Twenty-six") && values[25] != 0){
                                                                                                        cases[25] = 0;
                                                                                                        System.out.println("Case Twenty-six had a value of " + values[25]);
                                                                                                        values[25] = 0;}
                                                                                                    }

 int sum2 = 0;
 int length2 = values.length;
for (int i = 0; i < values.length; i++) {
sum2 += values[i];}
                                                                                                   
int banker2 = sum2 / length2;
                                                                                                   
System.out.println("I am the banker, I am here to make you an offer for $" + banker2);
System.out.println("Do you wish to take the deal?");

String userChoiceTwo = sc.nextLine();

if(userChoiceTwo.equals("Yes")){
    System.out.println("Congrats you won $" + banker2);
    System.exit(0);}

    System.out.println("Round 3, Choose four cases");
for (int i = 0; i < 4; i++) {
            System.out.println("\nChoose your case");
            System.out.println("Cases left:");
    
            // Display available cases
            for (int j = 0; j < cases.length; j++) {
                if (cases[j] != 0) {
                    System.out.print(cases[j] + ", ");
                }
            }
            System.out.println();
    
            String nextCase = sc.nextLine();
    
            // Process next case selection
            for (int j = 0; j < cases.length; j++) {
                if (nextCase.equals(cases[j]) && cases[j] != 0) {
                    System.out.println("Case " + (cases[j]) + " had a value of $" + values[j]);
                    cases[j] = 0;  // Mark case as removed
                    break;
                }
            }
        
    
        if(nextCase.equals("One") && values[0] != 0){
            cases[0] = 0;
            System.out.println("Case One had a value of " + values[0]);
            values[0] = 0;}
            if(nextCase.equals("Two") && values[1] != 0){
                cases[1] = 0;
                System.out.println("Case Two had a value of " + values[1]);
                values[1] = 0;}
                if(nextCase.equals("Three") && values[2] != 0){
                    cases[2] = 0;
                    System.out.println("Case Three had a value of " + values[2]);
                    values[2] = 0;}
                    if(nextCase.equals("Four") && values[3] != 0){
                        cases[3] = 0;
                        System.out.println("Case Four had a value of " + values[3]);
                        values[3] = 0;}
                        if(nextCase.equals("Five") && values[4] != 0){
                            cases[4] = 0;
                            System.out.println("Case Five had a value of " + values[4]);
                            values[4] = 0;}
                            if(nextCase.equals("Six") && values[5] != 0){
                                cases[5] = 0;
                                System.out.println("Case Six had a value of " + values[5]);
                                values[5] = 0;}
                                if(nextCase.equals("Seven") && values[6] != 0){
                                    cases[6] = 0;
                                    System.out.println("Case Seven had a value of " + values[6]);
                                    values[6] = 0;}
                                    if(nextCase.equals("Eight") && values[7] != 0){
                                        cases[7] = 0;
                                        System.out.println("Case Eight had a value of " + values[7]);
                                        values[7] = 0;}
                                        if(nextCase.equals("Nine") && values[8] != 0){
                                            cases[8] = 0;
                                            System.out.println("Case Nine had a value of " + values[8]);
                                            values[8] = 0;}
                                            if(nextCase.equals("Ten") && values[9] != 0){
                                                cases[9] = 0;
                                                System.out.println("Case Ten had a value of " + values[9]);
                                                values[9] = 0;}
                                                if(nextCase.equals("Eleven") && values[10] != 0){
                                                    cases[10] = 0;
                                                    System.out.println("Case Eleven had a value of " + values[10]);
                                                    values[10] = 0;}
                                                    if(nextCase.equals("Twelve") && values[11] != 0){
                                                        cases[11] = 0;
                                                        System.out.println("Case Twelve had a value of " + values[11]);
                                                        values[11] = 0;}
                                                        if(nextCase.equals("Thirteen") && values[12] != 0){
                                                            cases[12] = 0;
                                                            System.out.println("Case Thirteen had a value of " + values[12]);
                                                            values[12] = 0;}
                                                            if(nextCase.equals("Fourteen") && values[13] != 0){
                                                                cases[13] = 0;
                                                                System.out.println("Case Fourteen had a value of " + values[13]);
                                                                values[13] = 0;}
                                                                if(nextCase.equals("Fifteen") && values[14] != 0){
                                                                    cases[14] = 0;
                                                                    System.out.println("Case Fifteen had a value of " + values[14]);
                                                                    values[14] = 0;}
                                                                    if(nextCase.equals("Sixteen") && values[15] != 0){
                                                                        cases[15] = 0;
                                                                        System.out.println("Case Sixteen had a value of " + values[15]);
                                                                        values[15] = 0;}
                                                                        if(nextCase.equals("Seventeen") && values[16] != 0){
                                                                            cases[16] = 0;
                                                                            System.out.println("Case Seventeen had a value of " + values[16]);
                                                                            values[16] = 0;}
                                                                            if(nextCase.equals("Eighteen") && values[17] != 0){
                                                                                cases[17] = 0;
                                                                                System.out.println("Case Eighteen had a value of " + values[17]);
                                                                                values[17] = 0;}
                                                                                if(nextCase.equals("Nineteen") && values[18] != 0){
                                                                                    cases[18] = 0;
                                                                                    System.out.println("Case Nineteen had a value of " + values[18]);
                                                                                    values[18] = 0;}
                                                                                    if(nextCase.equals("Twenty") && values[19] != 0){
                                                                                        cases[19] = 0;
                                                                                        System.out.println("Case Twenty had a value of " + values[19]);
                                                                                        values[19] = 0;}
                                                                                        if(nextCase.equals("Twenty-one") && values[20] != 0){
                                                                                            cases[20] = 0;
                                                                                            System.out.println("Case Twenty-one had a value of " + values[20]);
                                                                                            values[20] = 0;}
                                                                                            if(nextCase.equals("Twenty-two") && values[21] != 0){
                                                                                                cases[21] = 0;
                                                                                                System.out.println("Case Twenty-two had a value of " + values[21]);
                                                                                                values[21] = 0;}
                                                                                                if(nextCase.equals("Twenty-three") && values[22] != 0){
                                                                                                    cases[22] = 0;
                                                                                                    System.out.println("Case Twenty-three had a value of " + values[22]);
                                                                                                    values[22] = 0;}
                                                                                                    if(nextCase.equals("Twenty-four") && values[23] != 0){
                                                                                                        cases[23] = 0;
                                                                                                        System.out.println("Case Twenty-four had a value of " + values[23]);
                                                                                                        values[23] = 0;}
                                                                                                        if(nextCase.equals("Twenty-five") && values[24] != 0){
                                                                                                            cases[24] = 0;
                                                                                                            System.out.println("Case Twenty-five had a value of " + values[24]);
                                                                                                            values[24] = 0;}
                                                                                                            if(nextCase.equals("Twenty-six") && values[25] != 0){
                                                                                                                cases[25] = 0;
                                                                                                                System.out.println("Case Twenty-six had a value of " + values[25]);
                                                                                                                values[25] = 0;}
                                                                                                            }
    

//Banker round 3 
int sum3 = 0;
int length3 = values.length;
for (int i = 0; i < values.length; i++) {
sum3 += values[i];}
                                                                                                   
int banker3 = sum3 / length3;
                                                                                                   
System.out.println("I am the banker, I am here to make you an offer for $" + banker3);
System.out.println("Do you wish to take the deal?");

String userChoiceThree = sc.nextLine();

if(userChoiceThree.equals("Yes")){
    System.out.println("Congrats you won $" + banker3);
    System.exit(0);}
    
    
// Round 4 
System.out.println("Round four, choose 3 cases");
 for (int i = 0; i < 3; i++) {
        System.out.println("\nChoose your case");
        System.out.println("Cases left:");

        // Display available cases
        for (int j = 0; j < cases.length; j++) {
            if (cases[j] != 0) {
                System.out.print(cases[j] + ", ");
            }
        }
        System.out.println();

        String nextCase = sc.nextLine();

        // Process next case selection
        for (int j = 0; j < cases.length; j++) {
            if (nextCase.equals(cases[j]) && cases[j] != 0) {
                System.out.println("Case " + (cases[j]) + " had a value of $" + values[j]);
                cases[j] = 0;  // Mark case as removed
                break;
            }
        }
    

    if(nextCase.equals("One") && values[0] != 0){
        cases[0] = 0;
        System.out.println("Case One had a value of " + values[0]);
        values[0] = 0;}
        if(nextCase.equals("Two") && values[1] != 0){
            cases[1] = 0;
            System.out.println("Case Two had a value of " + values[1]);
            values[1] = 0;}
            if(nextCase.equals("Three") && values[2] != 0){
                cases[2] = 0;
                System.out.println("Case Three had a value of " + values[2]);
                values[2] = 0;}
                if(nextCase.equals("Four") && values[3] != 0){
                    cases[3] = 0;
                    System.out.println("Case Four had a value of " + values[3]);
                    values[3] = 0;}
                    if(nextCase.equals("Five") && values[4] != 0){
                        cases[4] = 0;
                        System.out.println("Case Five had a value of " + values[4]);
                        values[4] = 0;}
                        if(nextCase.equals("Six") && values[5] != 0){
                            cases[5] = 0;
                            System.out.println("Case Six had a value of " + values[5]);
                            values[5] = 0;}
                            if(nextCase.equals("Seven") && values[6] != 0){
                                cases[6] = 0;
                                System.out.println("Case Seven had a value of " + values[6]);
                                values[6] = 0;}
                                if(nextCase.equals("Eight") && values[7] != 0){
                                    cases[7] = 0;
                                    System.out.println("Case Eight had a value of " + values[7]);
                                    values[7] = 0;}
                                    if(nextCase.equals("Nine") && values[8] != 0){
                                        cases[8] = 0;
                                        System.out.println("Case Nine had a value of " + values[8]);
                                        values[8] = 0;}
                                        if(nextCase.equals("Ten") && values[9] != 0){
                                            cases[9] = 0;
                                            System.out.println("Case Ten had a value of " + values[9]);
                                            values[9] = 0;}
                                            if(nextCase.equals("Eleven") && values[10] != 0){
                                                cases[10] = 0;
                                                System.out.println("Case Eleven had a value of " + values[10]);
                                                values[10] = 0;}
                                                if(nextCase.equals("Twelve") && values[11] != 0){
                                                    cases[11] = 0;
                                                    System.out.println("Case Twelve had a value of " + values[11]);
                                                    values[11] = 0;}
                                                    if(nextCase.equals("Thirteen") && values[12] != 0){
                                                        cases[12] = 0;
                                                        System.out.println("Case Thirteen had a value of " + values[12]);
                                                        values[12] = 0;}
                                                        if(nextCase.equals("Fourteen") && values[13] != 0){
                                                            cases[13] = 0;
                                                            System.out.println("Case Fourteen had a value of " + values[13]);
                                                            values[13] = 0;}
                                                            if(nextCase.equals("Fifteen") && values[14] != 0){
                                                                cases[14] = 0;
                                                                System.out.println("Case Fifteen had a value of " + values[14]);
                                                                values[14] = 0;}
                                                                if(nextCase.equals("Sixteen") && values[15] != 0){
                                                                    cases[15] = 0;
                                                                    System.out.println("Case Sixteen had a value of " + values[15]);
                                                                    values[15] = 0;}
                                                                    if(nextCase.equals("Seventeen") && values[16] != 0){
                                                                        cases[16] = 0;
                                                                        System.out.println("Case Seventeen had a value of " + values[16]);
                                                                        values[16] = 0;}
                                                                        if(nextCase.equals("Eighteen") && values[17] != 0){
                                                                            cases[17] = 0;
                                                                            System.out.println("Case Eighteen had a value of " + values[17]);
                                                                            values[17] = 0;}
                                                                            if(nextCase.equals("Nineteen") && values[18] != 0){
                                                                                cases[18] = 0;
                                                                                System.out.println("Case Nineteen had a value of " + values[18]);
                                                                                values[18] = 0;}
                                                                                if(nextCase.equals("Twenty") && values[19] != 0){
                                                                                    cases[19] = 0;
                                                                                    System.out.println("Case Twenty had a value of " + values[19]);
                                                                                    values[19] = 0;}
                                                                                    if(nextCase.equals("Twenty-one") && values[20] != 0){
                                                                                        cases[20] = 0;
                                                                                        System.out.println("Case Twenty-one had a value of " + values[20]);
                                                                                        values[20] = 0;}
                                                                                        if(nextCase.equals("Twenty-two") && values[21] != 0){
                                                                                            cases[21] = 0;
                                                                                            System.out.println("Case Twenty-two had a value of " + values[21]);
                                                                                            values[21] = 0;}
                                                                                            if(nextCase.equals("Twenty-three") && values[22] != 0){
                                                                                                cases[22] = 0;
                                                                                                System.out.println("Case Twenty-three had a value of " + values[22]);
                                                                                                values[22] = 0;}
                                                                                                if(nextCase.equals("Twenty-four") && values[23] != 0){
                                                                                                    cases[23] = 0;
                                                                                                    System.out.println("Case Twenty-four had a value of " + values[23]);
                                                                                                    values[23] = 0;}
                                                                                                    if(nextCase.equals("Twenty-five") && values[24] != 0){
                                                                                                        cases[24] = 0;
                                                                                                        System.out.println("Case Twenty-five had a value of " + values[24]);
                                                                                                        values[24] = 0;}
                                                                                                        if(nextCase.equals("Twenty-six") && values[25] != 0){
                                                                                                            cases[25] = 0;
                                                                                                            System.out.println("Case Twenty-six had a value of " + values[25]);
                                                                                                            values[25] = 0;}
                                                                                                        }

//Banker round 4

int sum4 = 0;
int length4 = values.length;
for (int i = 0; i < values.length; i++) {
sum4 += values[i];}
                                                                                                   
int banker4 = sum4 / length4;
                                                                                                   
System.out.println("I am the banker, I am here to make you an offer for $" + banker4);
System.out.println("Do you wish to take the deal?");

String userChoiceFour = sc.nextLine();

if(userChoiceFour.equals("Yes")){
    System.out.println("Congrats you won $" + banker4);
    System.exit(0);}

//Round 5 
System.out.println("Round 5, Choose two cases");
for (int i = 0; i < 2; i++) {
            System.out.println("\nChoose your case");
            System.out.println("Cases left:");
    
            // Display available cases
            for (int j = 0; j < cases.length; j++) {
                if (cases[j] != 0) {
                    System.out.print(cases[j] + ", ");
                }
            }
            System.out.println();
    
            String nextCase = sc.nextLine();
    
            // Process next case selection
            for (int j = 0; j < cases.length; j++) {
                if (nextCase.equals(cases[j]) && cases[j] != 0) {
                    System.out.println("Case " + (cases[j]) + " had a value of $" + values[j]);
                    cases[j] = 0;  // Mark case as removed
                    break;
                }
            }
        
    
    if(nextCase.equals("One") && values[0] != 0){
            cases[0] = 0;
            System.out.println("Case One had a value of " + values[0]);
            values[0] = 0;}
            if(nextCase.equals("Two") && values[1] != 0){
                cases[1] = 0;
                System.out.println("Case Two had a value of " + values[1]);
                values[1] = 0;}
                if(nextCase.equals("Three") && values[2] != 0){
                    cases[2] = 0;
                    System.out.println("Case Three had a value of " + values[2]);
                    values[2] = 0;}
                    if(nextCase.equals("Four") && values[3] != 0){
                        cases[3] = 0;
                        System.out.println("Case Four had a value of " + values[3]);
                        values[3] = 0;}
                        if(nextCase.equals("Five") && values[4] != 0){
                            cases[4] = 0;
                            System.out.println("Case Five had a value of " + values[4]);
                            values[4] = 0;}
                            if(nextCase.equals("Six") && values[5] != 0){
                                cases[5] = 0;
                                System.out.println("Case Six had a value of " + values[5]);
                                values[5] = 0;}
                                if(nextCase.equals("Seven") && values[6] != 0){
                                    cases[6] = 0;
                                    System.out.println("Case Seven had a value of " + values[6]);
                                    values[6] = 0;}
                                    if(nextCase.equals("Eight") && values[7] != 0){
                                        cases[7] = 0;
                                        System.out.println("Case Eight had a value of " + values[7]);
                                        values[7] = 0;}
                                        if(nextCase.equals("Nine") && values[8] != 0){
                                            cases[8] = 0;
                                            System.out.println("Case Nine had a value of " + values[8]);
                                            values[8] = 0;}
                                            if(nextCase.equals("Ten") && values[9] != 0){
                                                cases[9] = 0;
                                                System.out.println("Case Ten had a value of " + values[9]);
                                                values[9] = 0;}
                                                if(nextCase.equals("Eleven") && values[10] != 0){
                                                    cases[10] = 0;
                                                    System.out.println("Case Eleven had a value of " + values[10]);
                                                    values[10] = 0;}
                                                    if(nextCase.equals("Twelve") && values[11] != 0){
                                                        cases[11] = 0;
                                                        System.out.println("Case Twelve had a value of " + values[11]);
                                                        values[11] = 0;}
                                                        if(nextCase.equals("Thirteen") && values[12] != 0){
                                                            cases[12] = 0;
                                                            System.out.println("Case Thirteen had a value of " + values[12]);
                                                            values[12] = 0;}
                                                            if(nextCase.equals("Fourteen") && values[13] != 0){
                                                                cases[13] = 0;
                                                                System.out.println("Case Fourteen had a value of " + values[13]);
                                                                values[13] = 0;}
                                                                if(nextCase.equals("Fifteen") && values[14] != 0){
                                                                    cases[14] = 0;
                                                                    System.out.println("Case Fifteen had a value of " + values[14]);
                                                                    values[14] = 0;}
                                                                    if(nextCase.equals("Sixteen") && values[15] != 0){
                                                                        cases[15] = 0;
                                                                        System.out.println("Case Sixteen had a value of " + values[15]);
                                                                        values[15] = 0;}
                                                                        if(nextCase.equals("Seventeen") && values[16] != 0){
                                                                            cases[16] = 0;
                                                                            System.out.println("Case Seventeen had a value of " + values[16]);
                                                                            values[16] = 0;}
                                                                            if(nextCase.equals("Eighteen") && values[17] != 0){
                                                                                cases[17] = 0;
                                                                                System.out.println("Case Eighteen had a value of " + values[17]);
                                                                                values[17] = 0;}
                                                                                if(nextCase.equals("Nineteen") && values[18] != 0){
                                                                                    cases[18] = 0;
                                                                                    System.out.println("Case Nineteen had a value of " + values[18]);
                                                                                    values[18] = 0;}
                                                                                    if(nextCase.equals("Twenty") && values[19] != 0){
                                                                                        cases[19] = 0;
                                                                                        System.out.println("Case Twenty had a value of " + values[19]);
                                                                                        values[19] = 0;}
                                                                                        if(nextCase.equals("Twenty-one") && values[20] != 0){
                                                                                            cases[20] = 0;
                                                                                            System.out.println("Case Twenty-one had a value of " + values[20]);
                                                                                            values[20] = 0;}
                                                                                            if(nextCase.equals("Twenty-two") && values[21] != 0){
                                                                                                cases[21] = 0;
                                                                                                System.out.println("Case Twenty-two had a value of " + values[21]);
                                                                                                values[21] = 0;}
                                                                                                if(nextCase.equals("Twenty-three") && values[22] != 0){
                                                                                                    cases[22] = 0;
                                                                                                    System.out.println("Case Twenty-three had a value of " + values[22]);
                                                                                                    values[22] = 0;}
                                                                                                    if(nextCase.equals("Twenty-four") && values[23] != 0){
                                                                                                        cases[23] = 0;
                                                                                                        System.out.println("Case Twenty-four had a value of " + values[23]);
                                                                                                        values[23] = 0;}
                                                                                                        if(nextCase.equals("Twenty-five") && values[24] != 0){
                                                                                                            cases[24] = 0;
                                                                                                            System.out.println("Case Twenty-five had a value of " + values[24]);
                                                                                                            values[24] = 0;}
                                                                                                            if(nextCase.equals("Twenty-six") && values[25] != 0){
                                                                                                                cases[25] = 0;
                                                                                                                System.out.println("Case Twenty-six had a value of " + values[25]);
                                                                                                                values[25] = 0;}
                                                                                                            }
    


//banker round 5
int sum5 = 0;
int length5 = values.length;
for (int i = 0; i < values.length; i++) {
sum4 += values[i];}
                                                                                                                                                                                                               
int banker5 = sum5 / length5 + 10000;
                                                                                                                                                                                                               
System.out.println("I am the banker, I am here to make you an offer for $" + banker5);
System.out.println("Do you wish to take the deal?");
                                                                                                            
String userChoiceFive = sc.nextLine();

if(userChoiceFive.equals("Yes")){
    System.out.println("Congrats you won $" + banker5);
    System.exit(0);}
    
    
//Round 6 
System.out.println("Round 5, Choose one case");
for (int i = 0; i < 1; i++) {
            System.out.println("\nChoose your case");
            System.out.println("Cases left:");
    
            // Display available cases
            for (int j = 0; j < cases.length; j++) {
                if (cases[j] != 0) {
                    System.out.print(cases[j] + ", ");
                }
            }
            System.out.println();
    
            String nextCase = sc.nextLine();
    
            // Process next case selection
            for (int j = 0; j < cases.length; j++) {
                if (nextCase.equals(cases[j]) && cases[j] != 0) {
                    System.out.println("Case " + (cases[j]) + " had a value of $" + values[j]);
                    cases[j] = 0;  // Mark case as removed
                    break;
                }
            }
        
    
    if(nextCase.equals("One") && values[0] != 0){
            cases[0] = 0;
            System.out.println("Case One had a value of " + values[0]);
            values[0] = 0;}
            if(nextCase.equals("Two") && values[1] != 0){
                cases[1] = 0;
                System.out.println("Case Two had a value of " + values[1]);
                values[1] = 0;}
                if(nextCase.equals("Three") && values[2] != 0){
                    cases[2] = 0;
                    System.out.println("Case Three had a value of " + values[2]);
                    values[2] = 0;}
                    if(nextCase.equals("Four") && values[3] != 0){
                        cases[3] = 0;
                        System.out.println("Case Four had a value of " + values[3]);
                        values[3] = 0;}
                        if(nextCase.equals("Five") && values[4] != 0){
                            cases[4] = 0;
                            System.out.println("Case Five had a value of " + values[4]);
                            values[4] = 0;}
                            if(nextCase.equals("Six") && values[5] != 0){
                                cases[5] = 0;
                                System.out.println("Case Six had a value of " + values[5]);
                                values[5] = 0;}
                                if(nextCase.equals("Seven") && values[6] != 0){
                                    cases[6] = 0;
                                    System.out.println("Case Seven had a value of " + values[6]);
                                    values[6] = 0;}
                                    if(nextCase.equals("Eight") && values[7] != 0){
                                        cases[7] = 0;
                                        System.out.println("Case Eight had a value of " + values[7]);
                                        values[7] = 0;}
                                        if(nextCase.equals("Nine") && values[8] != 0){
                                            cases[8] = 0;
                                            System.out.println("Case Nine had a value of " + values[8]);
                                            values[8] = 0;}
                                            if(nextCase.equals("Ten") && values[9] != 0){
                                                cases[9] = 0;
                                                System.out.println("Case Ten had a value of " + values[9]);
                                                values[9] = 0;}
                                                if(nextCase.equals("Eleven") && values[10] != 0){
                                                    cases[10] = 0;
                                                    System.out.println("Case Eleven had a value of " + values[10]);
                                                    values[10] = 0;}
                                                    if(nextCase.equals("Twelve") && values[11] != 0){
                                                        cases[11] = 0;
                                                        System.out.println("Case Twelve had a value of " + values[11]);
                                                        values[11] = 0;}
                                                        if(nextCase.equals("Thirteen") && values[12] != 0){
                                                            cases[12] = 0;
                                                            System.out.println("Case Thirteen had a value of " + values[12]);
                                                            values[12] = 0;}
                                                            if(nextCase.equals("Fourteen") && values[13] != 0){
                                                                cases[13] = 0;
                                                                System.out.println("Case Fourteen had a value of " + values[13]);
                                                                values[13] = 0;}
                                                                if(nextCase.equals("Fifteen") && values[14] != 0){
                                                                    cases[14] = 0;
                                                                    System.out.println("Case Fifteen had a value of " + values[14]);
                                                                    values[14] = 0;}
                                                                    if(nextCase.equals("Sixteen") && values[15] != 0){
                                                                        cases[15] = 0;
                                                                        System.out.println("Case Sixteen had a value of " + values[15]);
                                                                        values[15] = 0;}
                                                                        if(nextCase.equals("Seventeen") && values[16] != 0){
                                                                            cases[16] = 0;
                                                                            System.out.println("Case Seventeen had a value of " + values[16]);
                                                                            values[16] = 0;}
                                                                            if(nextCase.equals("Eighteen") && values[17] != 0){
                                                                                cases[17] = 0;
                                                                                System.out.println("Case Eighteen had a value of " + values[17]);
                                                                                values[17] = 0;}
                                                                                if(nextCase.equals("Nineteen") && values[18] != 0){
                                                                                    cases[18] = 0;
                                                                                    System.out.println("Case Nineteen had a value of " + values[18]);
                                                                                    values[18] = 0;}
                                                                                    if(nextCase.equals("Twenty") && values[19] != 0){
                                                                                        cases[19] = 0;
                                                                                        System.out.println("Case Twenty had a value of " + values[19]);
                                                                                        values[19] = 0;}
                                                                                        if(nextCase.equals("Twenty-one") && values[20] != 0){
                                                                                            cases[20] = 0;
                                                                                            System.out.println("Case Twenty-one had a value of " + values[20]);
                                                                                            values[20] = 0;}
                                                                                            if(nextCase.equals("Twenty-two") && values[21] != 0){
                                                                                                cases[21] = 0;
                                                                                                System.out.println("Case Twenty-two had a value of " + values[21]);
                                                                                                values[21] = 0;}
                                                                                                if(nextCase.equals("Twenty-three") && values[22] != 0){
                                                                                                    cases[22] = 0;
                                                                                                    System.out.println("Case Twenty-three had a value of " + values[22]);
                                                                                                    values[22] = 0;}
                                                                                                    if(nextCase.equals("Twenty-four") && values[23] != 0){
                                                                                                        cases[23] = 0;
                                                                                                        System.out.println("Case Twenty-four had a value of " + values[23]);
                                                                                                        values[23] = 0;}
                                                                                                        if(nextCase.equals("Twenty-five") && values[24] != 0){
                                                                                                            cases[24] = 0;
                                                                                                            System.out.println("Case Twenty-five had a value of " + values[24]);
                                                                                                            values[24] = 0;}
                                                                                                            if(nextCase.equals("Twenty-six") && values[25] != 0){
                                                                                                                cases[25] = 0;
                                                                                                                System.out.println("Case Twenty-six had a value of " + values[25]);
                                                                                                                values[25] = 0;}
                                                                                                            }
    
    
    
 //banker round 6
int sum6 = 0;
int length6 = values.length;
for (int i = 0; i < values.length; i++) {
sum4 += values[i];}
                                                                                                                                                                                                               
int banker6 = sum6 / length6 + 20000;
                                                                                                                                                                                                               
System.out.println("I am the banker, I am here to make you an offer for $" + banker6);
System.out.println("Do you wish to take the deal?");
                                                                                                            
String userChoiceSix = sc.nextLine();

if(userChoiceSix.equals("Yes")){
    System.out.println("Congrats you won $" + banker6);
    System.exit(0);}   
    

    System.out.println("Round 7, Choose one case");
    for (int i = 0; i < 1; i++) {
                System.out.println("\nChoose your case");
                System.out.println("Cases left:");
        
                // Display available cases
                for (int j = 0; j < cases.length; j++) {
                    if (cases[j] != 0) {
                        System.out.print(cases[j] + ", ");
                    }
                }
                System.out.println();
        
                String nextCase = sc.nextLine();
        
                // Process next case selection
                for (int j = 0; j < cases.length; j++) {
                    if (nextCase.equals(cases[j]) && cases[j] != 0) {
                        System.out.println("Case " + (cases[j]) + " had a value of $" + values[j]);
                        cases[j] = 0;  // Mark case as removed
                        break;
                    }
                }
            
        
        if(nextCase.equals("One") && values[0] != 0){
                cases[0] = 0;
                System.out.println("Case One had a value of " + values[0]);
                values[0] = 0;}
                if(nextCase.equals("Two") && values[1] != 0){
                    cases[1] = 0;
                    System.out.println("Case Two had a value of " + values[1]);
                    values[1] = 0;}
                    if(nextCase.equals("Three") && values[2] != 0){
                        cases[2] = 0;
                        System.out.println("Case Three had a value of " + values[2]);
                        values[2] = 0;}
                        if(nextCase.equals("Four") && values[3] != 0){
                            cases[3] = 0;
                            System.out.println("Case Four had a value of " + values[3]);
                            values[3] = 0;}
                            if(nextCase.equals("Five") && values[4] != 0){
                                cases[4] = 0;
                                System.out.println("Case Five had a value of " + values[4]);
                                values[4] = 0;}
                                if(nextCase.equals("Six") && values[5] != 0){
                                    cases[5] = 0;
                                    System.out.println("Case Six had a value of " + values[5]);
                                    values[5] = 0;}
                                    if(nextCase.equals("Seven") && values[6] != 0){
                                        cases[6] = 0;
                                        System.out.println("Case Seven had a value of " + values[6]);
                                        values[6] = 0;}
                                        if(nextCase.equals("Eight") && values[7] != 0){
                                            cases[7] = 0;
                                            System.out.println("Case Eight had a value of " + values[7]);
                                            values[7] = 0;}
                                            if(nextCase.equals("Nine") && values[8] != 0){
                                                cases[8] = 0;
                                                System.out.println("Case Nine had a value of " + values[8]);
                                                values[8] = 0;}
                                                if(nextCase.equals("Ten") && values[9] != 0){
                                                    cases[9] = 0;
                                                    System.out.println("Case Ten had a value of " + values[9]);
                                                    values[9] = 0;}
                                                    if(nextCase.equals("Eleven") && values[10] != 0){
                                                        cases[10] = 0;
                                                        System.out.println("Case Eleven had a value of " + values[10]);
                                                        values[10] = 0;}
                                                        if(nextCase.equals("Twelve") && values[11] != 0){
                                                            cases[11] = 0;
                                                            System.out.println("Case Twelve had a value of " + values[11]);
                                                            values[11] = 0;}
                                                            if(nextCase.equals("Thirteen") && values[12] != 0){
                                                                cases[12] = 0;
                                                                System.out.println("Case Thirteen had a value of " + values[12]);
                                                                values[12] = 0;}
                                                                if(nextCase.equals("Fourteen") && values[13] != 0){
                                                                    cases[13] = 0;
                                                                    System.out.println("Case Fourteen had a value of " + values[13]);
                                                                    values[13] = 0;}
                                                                    if(nextCase.equals("Fifteen") && values[14] != 0){
                                                                        cases[14] = 0;
                                                                        System.out.println("Case Fifteen had a value of " + values[14]);
                                                                        values[14] = 0;}
                                                                        if(nextCase.equals("Sixteen") && values[15] != 0){
                                                                            cases[15] = 0;
                                                                            System.out.println("Case Sixteen had a value of " + values[15]);
                                                                            values[15] = 0;}
                                                                            if(nextCase.equals("Seventeen") && values[16] != 0){
                                                                                cases[16] = 0;
                                                                                System.out.println("Case Seventeen had a value of " + values[16]);
                                                                                values[16] = 0;}
                                                                                if(nextCase.equals("Eighteen") && values[17] != 0){
                                                                                    cases[17] = 0;
                                                                                    System.out.println("Case Eighteen had a value of " + values[17]);
                                                                                    values[17] = 0;}
                                                                                    if(nextCase.equals("Nineteen") && values[18] != 0){
                                                                                        cases[18] = 0;
                                                                                        System.out.println("Case Nineteen had a value of " + values[18]);
                                                                                        values[18] = 0;}
                                                                                        if(nextCase.equals("Twenty") && values[19] != 0){
                                                                                            cases[19] = 0;
                                                                                            System.out.println("Case Twenty had a value of " + values[19]);
                                                                                            values[19] = 0;}
                                                                                            if(nextCase.equals("Twenty-one") && values[20] != 0){
                                                                                                cases[20] = 0;
                                                                                                System.out.println("Case Twenty-one had a value of " + values[20]);
                                                                                                values[20] = 0;}
                                                                                                if(nextCase.equals("Twenty-two") && values[21] != 0){
                                                                                                    cases[21] = 0;
                                                                                                    System.out.println("Case Twenty-two had a value of " + values[21]);
                                                                                                    values[21] = 0;}
                                                                                                    if(nextCase.equals("Twenty-three") && values[22] != 0){
                                                                                                        cases[22] = 0;
                                                                                                        System.out.println("Case Twenty-three had a value of " + values[22]);
                                                                                                        values[22] = 0;}
                                                                                                        if(nextCase.equals("Twenty-four") && values[23] != 0){
                                                                                                            cases[23] = 0;
                                                                                                            System.out.println("Case Twenty-four had a value of " + values[23]);
                                                                                                            values[23] = 0;}
                                                                                                            if(nextCase.equals("Twenty-five") && values[24] != 0){
                                                                                                                cases[24] = 0;
                                                                                                                System.out.println("Case Twenty-five had a value of " + values[24]);
                                                                                                                values[24] = 0;}
                                                                                                                if(nextCase.equals("Twenty-six") && values[25] != 0){
                                                                                                                    cases[25] = 0;
                                                                                                                    System.out.println("Case Twenty-six had a value of " + values[25]);
                                                                                                                    values[25] = 0;}
                                                                                                                }
    
    
    
    int sum7 = 0;
    int length7 = values.length;
    for (int i = 0; i < values.length; i++) {
        sum7 += values[i];}
    int banker7 = sum7 / length7 + 20000;
                                                                                                                                                                                                                                                                                                             
    System.out.println("I am the banker, I am here to make you an offer for $" + banker7);
    System.out.println("Do you wish to take the deal?");
                                                                                                                                                                                                                            
    String userChoiceSeven = sc.nextLine();
                                                                                                                
    if(userChoiceSeven.equals("Yes")){
    System.out.println("Congrats you won $" + banker6);
    System.exit(0);}   
                                                                                                                    
                                                                                                                    System.out.println("Round 8, Choose one case");
                                                                                                                    for (int i = 0; i < 1; i++) {
                                                                                                                                System.out.println("\nChoose your case");
                                                                                                                                System.out.println("Cases left:");
                                                                                                                        
                                                                                                                                // Display available cases
                                                                                                                                for (int j = 0; j < cases.length; j++) {
                                                                                                                                    if (cases[j] != 0) {
                                                                                                                                        System.out.print(cases[j] + ", ");
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                System.out.println();
                                                                                                                        
                                                                                                                                String nextCase = sc.nextLine();
                                                                                                                        
                                                                                                                                // Process next case selection
                                                                                                                                for (int j = 0; j < cases.length; j++) {
                                                                                                                                    if (nextCase.equals(cases[j]) && cases[j] != 0) {
                                                                                                                                        System.out.println("Case " + (cases[j]) + " had a value of $" + values[j]);
                                                                                                                                        cases[j] = 0;  // Mark case as removed
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            
                                                                                                                        
                                                                                                                        if(nextCase.equals("One") && values[0] != 0){
                                                                                                                                cases[0] = 0;
                                                                                                                                System.out.println("Case One had a value of " + values[0]);
                                                                                                                                values[0] = 0;}
                                                                                                                                if(nextCase.equals("Two") && values[1] != 0){
                                                                                                                                    cases[1] = 0;
                                                                                                                                    System.out.println("Case Two had a value of " + values[1]);
                                                                                                                                    values[1] = 0;}
                                                                                                                                    if(nextCase.equals("Three") && values[2] != 0){
                                                                                                                                        cases[2] = 0;
                                                                                                                                        System.out.println("Case Three had a value of " + values[2]);
                                                                                                                                        values[2] = 0;}
                                                                                                                                        if(nextCase.equals("Four") && values[3] != 0){
                                                                                                                                            cases[3] = 0;
                                                                                                                                            System.out.println("Case Four had a value of " + values[3]);
                                                                                                                                            values[3] = 0;}
                                                                                                                                            if(nextCase.equals("Five") && values[4] != 0){
                                                                                                                                                cases[4] = 0;
                                                                                                                                                System.out.println("Case Five had a value of " + values[4]);
                                                                                                                                                values[4] = 0;}
                                                                                                                                                if(nextCase.equals("Six") && values[5] != 0){
                                                                                                                                                    cases[5] = 0;
                                                                                                                                                    System.out.println("Case Six had a value of " + values[5]);
                                                                                                                                                    values[5] = 0;}
                                                                                                                                                    if(nextCase.equals("Seven") && values[6] != 0){
                                                                                                                                                        cases[6] = 0;
                                                                                                                                                        System.out.println("Case Seven had a value of " + values[6]);
                                                                                                                                                        values[6] = 0;}
                                                                                                                                                        if(nextCase.equals("Eight") && values[7] != 0){
                                                                                                                                                            cases[7] = 0;
                                                                                                                                                            System.out.println("Case Eight had a value of " + values[7]);
                                                                                                                                                            values[7] = 0;}
                                                                                                                                                            if(nextCase.equals("Nine") && values[8] != 0){
                                                                                                                                                                cases[8] = 0;
                                                                                                                                                                System.out.println("Case Nine had a value of " + values[8]);
                                                                                                                                                                values[8] = 0;}
                                                                                                                                                                if(nextCase.equals("Ten") && values[9] != 0){
                                                                                                                                                                    cases[9] = 0;
                                                                                                                                                                    System.out.println("Case Ten had a value of " + values[9]);
                                                                                                                                                                    values[9] = 0;}
                                                                                                                                                                    if(nextCase.equals("Eleven") && values[10] != 0){
                                                                                                                                                                        cases[10] = 0;
                                                                                                                                                                        System.out.println("Case Eleven had a value of " + values[10]);
                                                                                                                                                                        values[10] = 0;}
                                                                                                                                                                        if(nextCase.equals("Twelve") && values[11] != 0){
                                                                                                                                                                            cases[11] = 0;
                                                                                                                                                                            System.out.println("Case Twelve had a value of " + values[11]);
                                                                                                                                                                            values[11] = 0;}
                                                                                                                                                                            if(nextCase.equals("Thirteen") && values[12] != 0){
                                                                                                                                                                                cases[12] = 0;
                                                                                                                                                                                System.out.println("Case Thirteen had a value of " + values[12]);
                                                                                                                                                                                values[12] = 0;}
                                                                                                                                                                                if(nextCase.equals("Fourteen") && values[13] != 0){
                                                                                                                                                                                    cases[13] = 0;
                                                                                                                                                                                    System.out.println("Case Fourteen had a value of " + values[13]);
                                                                                                                                                                                    values[13] = 0;}
                                                                                                                                                                                    if(nextCase.equals("Fifteen") && values[14] != 0){
                                                                                                                                                                                        cases[14] = 0;
                                                                                                                                                                                        System.out.println("Case Fifteen had a value of " + values[14]);
                                                                                                                                                                                        values[14] = 0;}
                                                                                                                                                                                        if(nextCase.equals("Sixteen") && values[15] != 0){
                                                                                                                                                                                            cases[15] = 0;
                                                                                                                                                                                            System.out.println("Case Sixteen had a value of " + values[15]);
                                                                                                                                                                                            values[15] = 0;}
                                                                                                                                                                                            if(nextCase.equals("Seventeen") && values[16] != 0){
                                                                                                                                                                                                cases[16] = 0;
                                                                                                                                                                                                System.out.println("Case Seventeen had a value of " + values[16]);
                                                                                                                                                                                                values[16] = 0;}
                                                                                                                                                                                                if(nextCase.equals("Eighteen") && values[17] != 0){
                                                                                                                                                                                                    cases[17] = 0;
                                                                                                                                                                                                    System.out.println("Case Eighteen had a value of " + values[17]);
                                                                                                                                                                                                    values[17] = 0;}
                                                                                                                                                                                                    if(nextCase.equals("Nineteen") && values[18] != 0){
                                                                                                                                                                                                        cases[18] = 0;
                                                                                                                                                                                                        System.out.println("Case Nineteen had a value of " + values[18]);
                                                                                                                                                                                                        values[18] = 0;}
                                                                                                                                                                                                        if(nextCase.equals("Twenty") && values[19] != 0){
                                                                                                                                                                                                            cases[19] = 0;
                                                                                                                                                                                                            System.out.println("Case Twenty had a value of " + values[19]);
                                                                                                                                                                                                            values[19] = 0;}
                                                                                                                                                                                                            if(nextCase.equals("Twenty-one") && values[20] != 0){
                                                                                                                                                                                                                cases[20] = 0;
                                                                                                                                                                                                                System.out.println("Case Twenty-one had a value of " + values[20]);
                                                                                                                                                                                                                values[20] = 0;}
                                                                                                                                                                                                                if(nextCase.equals("Twenty-two") && values[21] != 0){
                                                                                                                                                                                                                    cases[21] = 0;
                                                                                                                                                                                                                    System.out.println("Case Twenty-two had a value of " + values[21]);
                                                                                                                                                                                                                    values[21] = 0;}
                                                                                                                                                                                                                    if(nextCase.equals("Twenty-three") && values[22] != 0){
                                                                                                                                                                                                                        cases[22] = 0;
                                                                                                                                                                                                                        System.out.println("Case Twenty-three had a value of " + values[22]);
                                                                                                                                                                                                                        values[22] = 0;}
                                                                                                                                                                                                                        if(nextCase.equals("Twenty-four") && values[23] != 0){
                                                                                                                                                                                                                            cases[23] = 0;
                                                                                                                                                                                                                            System.out.println("Case Twenty-four had a value of " + values[23]);
                                                                                                                                                                                                                            values[23] = 0;}
                                                                                                                                                                                                                            if(nextCase.equals("Twenty-five") && values[24] != 0){
                                                                                                                                                                                                                                cases[24] = 0;
                                                                                                                                                                                                                                System.out.println("Case Twenty-five had a value of " + values[24]);
                                                                                                                                                                                                                                values[24] = 0;}
                                                                                                                                                                                                                                if(nextCase.equals("Twenty-six") && values[25] != 0){
                                                                                                                                                                                                                                    cases[25] = 0;
                                                                                                                                                                                                                                    System.out.println("Case Twenty-six had a value of " + values[25]);
                                                                                                                                                                                                                                    values[25] = 0;}
                                                                                                                                                                                                                                }
                                                                                                                    
    
int sum8 = 0;
int length8 = values.length;
for (int i = 0; i < values.length; i++) {
    sum8 += values[i];}
int banker8 = sum8 / length8 + 20000;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
System.out.println("I am the banker, I am here to make you an offer for $" + banker8);
System.out.println("Do you wish to take the deal?");
                                                                                                                                                                                                                                                                                                                                                                                                                                                        
String userChoiceEight = sc.nextLine();
                                                                                                                                                                                                                                                                                                                                            
if(userChoiceEight.equals("Yes")){
System.out.println("Congrats you won $" + banker8);
System.exit(0);}      
    

System.out.println("Round 9, choose 1 case");
for (int i = 0; i < 1; i++) {
    System.out.println("\nChoose your next case!");
    System.out.println("Cases left:");

    // cases available
    for (int j = 0; j < cases.length; j++) {
        if (cases[j] != 0) {
            System.out.print(cases[j] + ", ");
        }
    }
    System.out.println();

    String nextCase = sc.nextLine();

    // Process next case selection
    for (int j = 0; j < cases.length; j++) {
        if (nextCase.equals(cases[j]) && cases[j] != 0) {
            System.out.println("Case " + (cases[j]) + " had a value of $" + values[j]);
            cases[j] = 0;  
            break;
        }
    }


if(nextCase.equals("One") && values[0] != 0){
    cases[0] = 0;
    System.out.println("Case One had a value of " + values[0]);
    values[0] = 0;}
    if(nextCase.equals("Two") && values[1] != 0){
        cases[1] = 0;
        System.out.println("Case Two had a value of " + values[1]);
        values[1] = 0;}
        if(nextCase.equals("Three") && values[2] != 0){
            cases[2] = 0;
            System.out.println("Case Three had a value of " + values[2]);
            values[2] = 0;}
            if(nextCase.equals("Four") && values[3] != 0){
                cases[3] = 0;
                System.out.println("Case Four had a value of " + values[3]);
                values[3] = 0;}
                if(nextCase.equals("Five") && values[4] != 0){
                    cases[4] = 0;
                    System.out.println("Case Five had a value of " + values[4]);
                    values[4] = 0;}
                    if(nextCase.equals("Six") && values[5] != 0){
                        cases[5] = 0;
                        System.out.println("Case Six had a value of " + values[5]);
                        values[5] = 0;}
                        if(nextCase.equals("Seven") && values[6] != 0){
                            cases[6] = 0;
                            System.out.println("Case Seven had a value of " + values[6]);
                            values[6] = 0;}
                            if(nextCase.equals("Eight") && values[7] != 0){
                                cases[7] = 0;
                                System.out.println("Case Eight had a value of " + values[7]);
                                values[7] = 0;}
                                if(nextCase.equals("Nine") && values[8] != 0){
                                    cases[8] = 0;
                                    System.out.println("Case Nine had a value of " + values[8]);
                                    values[8] = 0;}
                                    if(nextCase.equals("Ten") && values[9] != 0){
                                        cases[9] = 0;
                                        System.out.println("Case Ten had a value of " + values[9]);
                                        values[9] = 0;}
                                        if(nextCase.equals("Eleven") && values[10] != 0){
                                            cases[10] = 0;
                                            System.out.println("Case Eleven had a value of " + values[10]);
                                            values[10] = 0;}
                                            if(nextCase.equals("Twelve") && values[11] != 0){
                                                cases[11] = 0;
                                                System.out.println("Case Twelve had a value of " + values[11]);
                                                values[11] = 0;}
                                                if(nextCase.equals("Thirteen") && values[12] != 0){
                                                    cases[12] = 0;
                                                    System.out.println("Case Thirteen had a value of " + values[12]);
                                                    values[12] = 0;}
                                                    if(nextCase.equals("Fourteen") && values[13] != 0){
                                                        cases[13] = 0;
                                                        System.out.println("Case Fourteen had a value of " + values[13]);
                                                        values[13] = 0;}
                                                        if(nextCase.equals("Fifteen") && values[14] != 0){
                                                            cases[14] = 0;
                                                            System.out.println("Case Fifteen had a value of " + values[14]);
                                                            values[14] = 0;}
                                                            if(nextCase.equals("Sixteen") && values[15] != 0){
                                                                cases[15] = 0;
                                                                System.out.println("Case Sixteen had a value of " + values[15]);
                                                                values[15] = 0;}
                                                                if(nextCase.equals("Seventeen") && values[16] != 0){
                                                                    cases[16] = 0;
                                                                    System.out.println("Case Seventeen had a value of " + values[16]);
                                                                    values[16] = 0;}
                                                                    if(nextCase.equals("Eighteen") && values[17] != 0){
                                                                        cases[17] = 0;
                                                                        System.out.println("Case Eighteen had a value of " + values[17]);
                                                                        values[17] = 0;}
                                                                        if(nextCase.equals("Nineteen") && values[18] != 0){
                                                                            cases[18] = 0;
                                                                            System.out.println("Case Nineteen had a value of " + values[18]);
                                                                            values[18] = 0;}
                                                                            if(nextCase.equals("Twenty") && values[19] != 0){
                                                                                cases[19] = 0;
                                                                                System.out.println("Case Twenty had a value of " + values[19]);
                                                                                values[19] = 0;}
                                                                                if(nextCase.equals("Twenty-one") && values[20] != 0){
                                                                                    cases[20] = 0;
                                                                                    System.out.println("Case Twenty-one had a value of " + values[20]);
                                                                                    values[20] = 0;}
                                                                                    if(nextCase.equals("Twenty-two") && values[21] != 0){
                                                                                        cases[21] = 0;
                                                                                        System.out.println("Case Twenty-two had a value of " + values[21]);
                                                                                        values[21] = 0;}
                                                                                        if(nextCase.equals("Twenty-three") && values[22] != 0){
                                                                                            cases[22] = 0;
                                                                                            System.out.println("Case Twenty-three had a value of " + values[22]);
                                                                                            values[22] = 0;}
                                                                                            if(nextCase.equals("Twenty-four") && values[23] != 0){
                                                                                                cases[23] = 0;
                                                                                                System.out.println("Case Twenty-four had a value of " + values[23]);
                                                                                                values[23] = 0;}
                                                                                                if(nextCase.equals("Twenty-five") && values[24] != 0){
                                                                                                    cases[24] = 0;
                                                                                                    System.out.println("Case Twenty-five had a value of " + values[24]);
                                                                                                    values[24] = 0;}
                                                                                                    if(nextCase.equals("Twenty-six") && values[25] != 0){
                                                                                                        cases[25] = 0;
                                                                                                        System.out.println("Case Twenty-six had a value of " + values[25]);
                                                                                                        values[25] = 0;}
                                                                                                    }

 int sum9 = 0;
 int length9 = values.length;
for (int i = 0; i < values.length; i++) {
sum2 += values[i];}
                                                                                                   
int banker9 = sum9 / length9;
                                                                                                   
System.out.println("I am the banker, I am here to make you an offer for $" + banker9);
System.out.println("Do you wish to take the deal?");

String userChoiceNine = sc.nextLine();

if(userChoiceNine.equals("Yes")){
    System.out.println("Congrats you won $" + banker9);
    System.exit(0);}
    
    
   
    
            
            
           
            
        
    




 

    
    // last case scenario

int lastRemainingCase = 0;
int lastRemainingValue = 0;
for (int i = 0; i < cases.length; i++) {
    if (cases[i] != 0) {
        lastRemainingCase = cases[i];
        lastRemainingValue = values[i];
        break;} }


System.out.println("You have to now choose between the last remaining case(" + lastRemainingCase + ") or your first chosen case (" + pickedFirst + ")");
System.out.println("Type in First for the first case and Last for the last case");
String finalUserChoice = sc.nextLine();

if(finalUserChoice.equals("First")){
System.out.println("You just won $" + pickedFirstValue);

}else if(finalUserChoice.equals("Last")){
System.out.println("You just won $" + lastRemainingValue);
}else{
System.out.println("Typo, you lose all your money");
}


}

}












   
   
   
   
   
   
   
   
   
   
   
                                                                                                        
                                                                                                    
                                                                                            
                                                                    
