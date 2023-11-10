import java.util.Scanner;

class LinearSearch {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int flag = 0;

        System.out.print("Enter the number of terms: ");
        int n = scan.nextInt();
        System.out.println();
        int a[] = new int[n];

        System.out.print("Enter the terms: ");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println();
        System.out.print("Enter the search key: ");
        int sk = scan.nextInt();

        for (int i = 0; i < n; i++) {
            if (a[i] == sk) {
                System.out.println("Element found at index " + i); 
                flag = 1;
            }
        }

        if (flag == 0) {
            System.out.println("Element not found");
        }
        scan.close();
    }
}
