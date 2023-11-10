import java.util.Scanner;

class OddEvenCounting {
	public static void main (String args[]) {
		Scanner s = new Scanner (System.in);
		System.out.println ("NAME: GIRIBALA ARUN");
		System.out.println ("ROLL_NO: 28");
		System.out.println ();

		int ecount=0, ocount=0, zcount=0;

		System.out.println ("Enter the number of terms: ");
		int n = s.nextInt();

		int a[] = new int [n];
		System.out.println ("Enter the terms in the array: ");
		for (int i=0; i<n; i++)
		{
			a[i]=s.nextInt();
		}

		for (int i=0; i<n; i++)
		{
			if (a[i]==0)
			{ zcount++; }
			else if ((a[i]%2==0)&&(a[i]!=0))
			{ ecount++; }
			else 
			{ ocount++; }
		}

		System.out.println ("Even numbers: "+ecount);
		System.out.println ("Odd numbers: "+ocount);
		System.out.println ("Zeroes: "+zcount);
	}
}
