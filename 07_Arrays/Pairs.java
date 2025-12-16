// Program to print pairs from an array :-

public class Pairs {

    public static void printPairs(int num[]) {
        
        int totalPairs = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                System.out.print("(" +num[i] +"," +num[j] +")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = " + totalPairs);
    }

    public static void main(String args[]) {

        int num[] = {2,4,6,8,10};
        printPairs(num);

    }
}