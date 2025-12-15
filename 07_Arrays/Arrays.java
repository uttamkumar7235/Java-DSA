public class Arrays {
    
    public static void main(String[] args) {
        
        // creating arrays

        int marks[] = new int[50]; // size = 50
        marks[0] = 95;
        marks[1] = 80;
        marks[2] = 93;
        System.out.print("marks at index 1 : " + marks[1]);
        System.out.println();



        int numbers[] = {1, 5, 3, 9};

        System.out.print("Numbers : ");

        // for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();



        String fruits[] = {"mango", "apple", "orange", "pineapple"};

        System.out.print("Fruits : ");

        // forEach loop
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}
