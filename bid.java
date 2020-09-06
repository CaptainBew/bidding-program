import java.util.Scanner;
class bid{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean con = false;
        int aucNum = 1;
        int yn;
        double tmpBid;
        String aucName = "Test";
        String nOne = "";
        String tmpName = "";
        char currency = '€';
        Integer[] bids = {};
        String[] bidders = {};

        //User entering bid information - all pretty simple data collection
        do{
            System.out.print("What is your name? ");
            tmpName = in.next();
            System.out.print("How much do you wish to bid? ");
            tmpBid = in.nextDouble();
            System.out.println(tmpName + " are you sure you wish to bid a total of " + currency + tmpBid + "? If you are, enter 1. Otherwise, enter 2. ");
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

        int p = 0;
        for(int i = 0; i < bids.length; i++) {
            if(tmpBid >= bids[0]){
                System.arraycopy(bids,);
            }
        }

        in.close();
 }
}
