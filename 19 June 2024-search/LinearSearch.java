import java.util.Scanner;

public class LinearSearch {

   
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        
        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

       
        System.out.print("Enter the target element to search for: ");
        int target = scanner.nextInt();

      
        int result = linearSearch(arr, target);

       
        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found in the array");

        scanner.close();
    }
}
