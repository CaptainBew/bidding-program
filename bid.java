import java.util.Scanner;
class bid{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean con;
        int aucNum = 1;
        double tmpBid;
        String aucName = "Test";
        String nOne = "";
        String tmpName = "";
        String yn;
        char currency = '€';
        String[][] bids = {{},{}};

        //User entering bid information - all pretty simple data collection
        while(con=true){
            System.out.print("What is your name? ");
            tmpName = in.next();
            System.out.print("How much do you wish to bid? ");
            tmpBid = in.nextDouble();
            System.out.println(tmpName + " are you sure you wish to bid a total of " + currency + tmpBid + "? If you are, enter Y. Otherwise, enter N. ");
            yn = in.next();
            if(yn == "Y") {
                con = true;
            } else if(yn == "N") {
                con = false;
            } else {
                con = false;
            }
        }
        con = false;

        System.out.println("Your bid has been placed!");

        in.close();
 }
}
