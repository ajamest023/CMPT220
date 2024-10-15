public class profnotes{
    public static void main(String[] args) {
        int[] cases = new int[]{1,0,3,4,5,6,7,8,9,10,0,12,13,14,15,16,17,18,19,20,21,22,23,24,0};
        int[] values =new int[]{10,0,284,398293,40429,239582,289287,495929,23948,220,0,1298437845739,3984734,2957327,57348543765743,1245,52357,35687,1356,2467,2468,746244235,778432,3467583543,235236745,0};
       
       /* double[] values =new double[]{0.01,.5,284,398293,40429,239582,289287,495929,23948,220,0,1298437845739,3984734,2957327,57348543765743,1245,52357,35687,1356,2467,2468,746244235,778432,3467583543,235236745,0};*/
       
        String pickedFirstCase = "";
        int pickedFirstValue = 0;
        //(set up scanner)
        System.out.println("Choose ur first case");
        String firstCase = sc.nextLine();
        if(firstCase.equals("one")){
            pickedFirstCase = "One";
            pickedFirstValue = values[0];
            cases[0]=0;
            values[0]=0;
        }
       
        for(int i = 0; i <= 6; i++){
        System.out.println("Pick ur next case");
        System.out.println("cases left:");
        for(int j = 0; j <= cases.length; j++){
            if(cases[j] != 0){
                System.out.print(cases[j] + ",");
            }
        }
        String nextCase = sc.nextLine();
        if(nextCase.equals("Twenty-two") && values[21] != 0){
            cases[21] = 0;
            System.out.println("Case 22 had a value of" + values[21]);
            values[21] = 0;
           
        }
       
        }
        //banker suggests $
        //banker offer? or keep going?
       
        //if yes
            //print CONGRATS! then system.exit(0)
        //if no
            //KEEP LPLAYING
           
         for(int i = 0; i <= 5; i++){
        System.out.println("Pick ur next case");
        String nextCase = sc.nextLine();
        if(nextCase.equals("Twenty-two") && values[21] != 0){
            cases[21] = 0;
            values[21] = 0;
        }
        }
        //banker suggests $
        //banker offer? or keep going?
       
        //if yes
            //print CONGRATS! then system.exit(0)
        //if no
            //KEEP LPLAYING
          for(int i = 0; i <= 4; i++){
        System.out.println("Pick ur next case");
        String nextCase = sc.nextLine();
        if(nextCase.equals("Twenty-two") && values[21] != 0){
            cases[21] = 0;
            values[21] = 0;
        }
        } 
        
    }
    

}