public class EvenOddArray{
    public static void evenOddArray(int array[]){
        int evenSize=0;
        int oddSize=0;

        //Finding Size Of Even And Odd Array
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                evenSize++;
            }
            else{
                oddSize++;
            }
        }


        int even[] = new int[evenSize];
        int odd[] = new int[oddSize];
        int j=0, k=0;

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                even[j++] = array[i];
            }
            else{
                odd[k++] = array[i];
            }
        }


        // Printing Original Array
        System.out.print("Original Array : ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Printing Even Array
        if (evenSize != 0){
            System.out.print("Even Array : ");
            for (int i = 0; i < evenSize; i++){
                System.out.print(even[i] + " ");
            }
            System.out.println();
        }

        //Printing Odd Array 
        if (oddSize != 0){
            System.out.print("Odd Array : ");
            for (int i = 0; i < oddSize; i++){
                System.out.print(odd[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        int array[] = {1,5,3,23,45,10,28,6,12};
        //int array[] = {2,4,6};
        //int array[] = {1,2,4,6};
        evenOddArray(array);
        
    }
}