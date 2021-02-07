import java.util.Scanner;
public class fiboSeq {
    public static void main (String args[]) {
        //asking user for number to generate
        System.out.println("enter a number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //initializing time and calling iterative sequence
        long startTime = System.nanoTime();
        fiboSeriesIte(n);
        //printing out time results
        long endTime = System.nanoTime();
        System.out.println("iteration took " + (endTime-startTime) +" nano seconds" );

        //initializing time and using a for loop to print
        // out all the values in the recursive sequence
        long startRec = System.nanoTime();
        for(int i = 1; i <=n;i++){
            System.out.print(fiboSeriesRec(i)+ " ");
        }
        //printing out time results
        long endRec = System.nanoTime();
        System.out.println(" ");
        System.out.print("recursive took " + (endRec-startRec) +" nano seconds" );

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
    //creating iterative sequence
    public static void fiboSeriesIte(int n) {
        //initializing variables
        int lastNum = 1;
        int lastLastNum = 0;
        //loop to add last two numbers to make new number and print results
        for (int i = 1; i <= n; i++) {
            int newLast = 0;
            if (i == 1) {
                System.out.print("0 ");
            } else if (i == 2) {
                System.out.print("1 ");
            } else {
                newLast = lastNum + lastLastNum;
                System.out.print(newLast + " ");
                lastLastNum = lastNum;
                lastNum = newLast;
            }
        }
        System.out.println();
    }

}


