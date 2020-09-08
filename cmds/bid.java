package cmds;

import java.util.Scanner;
class bid{

    public static double[] bubble_sort(double[] unsorted_array) {
        double[] sorted_array = unsorted_array;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int x = 0; x < sorted_array.length - 1; x++) {
                if (sorted_array[x] > sorted_array[x+1]) {
                    double tmp = sorted_array[x];
                    sorted_array[x] = sorted_array[x+1];
                    sorted_array[x+1] = tmp;
                    sorted = false;
                }
            }
        }
        return sorted_array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean con = false;
        int aucNum = 1;
        int yn;
        double tmpBid;
        double nOne = 0;
        String aucName = "Test";
        String tmpName = "";
        char currency = '€';
        double[] bids = {400.15, 350.10, 200.05};

        //User entering bid information - all pretty simple data collection
        do{
            System.out.print("What is your name? ");
            tmpName = in.next(); 
            System.out.print("How much do you wish to bid? ");
            tmpBid = in.nextDouble();
            System.out.println(tmpName + " are you sure you wish to bid a total of " + currency + tmpBid + " on the auction " + aucName + ", " + aucNum + "? If you are, enter 1. Otherwise, enter 2. ");
            yn = in.nextInt();

            if(yn == 1){
                con = true;
            }else if(yn == 2){
                con = false;
            }else{
                con = false;
            }
        }while(con == false);
        con = false;

        System.out.println("Your bid has been placed!");

        //Sorting bids
        bids = bubble_sort(bids);
        //Declaring the num One bid on the array
        nOne = bids[1];
        System.out.println("This is the highest bid for this auction. " + nOne);

        in.close();
 }
}
