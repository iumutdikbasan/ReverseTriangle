import java.util.Scanner;



public class main
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayiyi giriniz ");
        int row = inp.nextInt();
        for (int i= 0; i<= row-1; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=row-1-i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}