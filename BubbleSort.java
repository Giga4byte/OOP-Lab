import java.util.Scanner;

class BubbleSort {
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        int i, j;

        System.out.println ("Enter the number of terms: ");
        int n = scan.nextInt ();
        int a[] = new int [n];
        System.out.println ("Enter the terms: ");
        for (i=0; i<n; i++)
        {
            a[i] = scan.nextInt ();
        }

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println ("PROCESS COMLETE. NOW DISPAYING: ");
        for (i=0; i<n; i++)
        {
            System.out.print (a[i]+"  ");
        }

        scan.close ();
    }
}
