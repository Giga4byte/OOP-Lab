import java.util.Scanner;

class SumTransposeMatrix {
    public static void main (String args[]) {
        Scanner s = new Scanner (System.in);
	System.out.println ("NAME: GIRIBALA ARUN");
	System.out.println ("ROLL_NO: 28");
	System.out.println ();

	int flag;
        
        System.out.println ("Enter the number of rows in A: ");
        int r1 = s.nextInt();
        System.out.println ("Enter the number of columns in A: ");
        int c1 = s.nextInt();

        System.out.println ("Enter the number of rows in B: ");
        int r2 = s.nextInt();
        System.out.println ("Enter the number of columns in B: ");
        int c2 = s.nextInt();

	if ((r1==r2) && (c1==c2))
        {System.out.println ("Addition possible"); 
	 flag = 1;}
	else
	{System.out.println ("Addition not possible");
	 flag=0;}
	
	while (flag==1)
{
        int a[][]=new int [r1][c1];
        System.out.println ("Enter the elements of A: ");
        for (int i=0;i<r1;i++)
        {
            for (int j=0;j<c1;j++)
            {
                a[i][j] = s.nextInt();
            }
        }

        System.out.println ("MATRIX A: ");
            for (int i=0;i<r1;i++)
            {
                for (int j=0;j<c1;j++)
                {
                   System.out.print (a[i][j]+"  ");
                }
                System.out.println();
            }
        
        int b[][]=new int [r2][c2];
        System.out.println ("Enter the elements of B: ");
        for (int i=0;i<r2;i++)
        {
            for (int j=0;j<c2;j++)
            {
                b[i][j] = s.nextInt();
            }
        }

        System.out.println ("MATRIX B: ");
            for (int i=0;i<r2;i++)
            {
                for (int j=0;j<c2;j++)
                {
                   System.out.print (b[i][j]+"  ");
                }
                System.out.println();
            }
        
        //SUM
            int res[][] = new int [r1][c1];
            for (int i=0;i<r2;i++)
            {
                for (int j=0;j<c2;j++)
                {
                    res[i][j] = a[i][j]+b[i][j];
                }   
            }
            //PRINTING SUM
            System.out.println ("SUM OF A AND B: ");
            for (int i=0;i<r1;i++)
            {
                for (int j=0;j<c1;j++)
                {
                   System.out.print (res[i][j]+"  ");
                }
                System.out.println ();
            } 
            
            //TRANSPOSE OF THE SUM
            System.out.println ("TRANSPOSE OF SUM: ");
            for (int i=0;i<c1;i++)
            {
                for (int j=0;j<r1;j++)
                {
                   System.out.print (res[j][i]+"  ");
                }
                System.out.println();
            }
	
	flag = 2;
        } // while

    } // void main
} // class
