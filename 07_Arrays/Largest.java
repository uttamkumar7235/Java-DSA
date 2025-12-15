public class Largest {

    public static int cal_largest(int num[]) {
        int large = num[0];
        int small = num[0];
        
        for (int i = 0; i < num.length; i++){
            if (num[i] > large) {
                large = num[i];
            }
            if (num[i] < small) {
                small = num[i];
            }
        }
        System.out.println("Smallest number : "+small);
        return large;
    }

    public static void main(String args[]){
        
        int num[] = {2, 4, 6, 8, 10, 52, 14, 16, 18, 20};
        int large = cal_largest(num);
        System.out.println("Largest number: " + large);
    }
}