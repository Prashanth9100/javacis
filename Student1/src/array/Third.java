package array;
import java.util.Scanner;
public class Third {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int arr[] = new int[size];
        int[] a=new int[size];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The elements of the array are:");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("Enter the element from where you want to rotate");
        int x = scanner.nextInt();





        for (int i = 0; i < x; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        System.out.println("The elements of the array are:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



    }
}
