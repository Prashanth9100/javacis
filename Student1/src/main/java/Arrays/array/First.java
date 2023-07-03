package Arrays.array;


public class First {

    public static void main(String[] args) {
        int large = 0;
        int small = 0;
        int arr[] = new int[]{1, 25, 5, 89, 55, 6};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }


            if (arr[i] < large) {
                small = arr[i];
            }
        }

            System.out.println("Smallest number:" + small);
            System.out.println("largest number:" + large);


        }
    }

