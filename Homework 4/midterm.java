public {
    
}

// set up scanners 


int[] cases = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
int[] values = {10,25,40,85,280,100,1000,3000,5000,5500,2200,1300,4500,3000,10000,20,350,6000, }


String pickedFirstCase = "";
int pickedFirstValue = 0;

// have the user choose a case 
String firstCase = sc.nextLine();

// have 26 of these if statements for each possible case 

if(firstCase.equals("one")) {
    pickedFirstCase = "One";
    pickedFirstCase = values[0];

// if the case is picked then do cases[21] = 0 (if 22 case is picked) and values[21]= 0 

}

System.out.println("pick next case");

String nextCase = sc.nextLine();

if(nextCase.equals("twenty-two") && values[21] != 0 {
    System.out.println("22 had a value of " + values[21]);
    cases[21]= 0 
    values[21]= 0 
    
}

// if you want to print out everything in an array use a for loop for for( int j = 0; j <= cases.length; j++
                                                                        // if cases[j] != 0 { print cases[j]}
//banker offers t0 end game or keep going for more money

// if yes 
    //print CONGRARTS: then system.exit(0)