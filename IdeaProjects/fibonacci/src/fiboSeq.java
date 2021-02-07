import java.util.Scanner;
public class fiboSeq {
    public static void main (String args[]) {
        //asking user for number to generate
        System.out.println("enter a number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(fiboSeriesRec(i) + " ");
        }
    }
        //creating recursive sequence

        public static int fiboSeriesRec(int n){
            //setting the first two numbers in the sequence
            if(n==1){
                return 0;
            }
            else if(n==2){
                return 1;
            }
            //making value the sum of the last two numbers
            else{
                return (fiboSeriesRec(n-1) + fiboSeriesRec(n-2));
            }
        }

}


