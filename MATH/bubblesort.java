import java.io.*;
public class BubbleSort
{
    void main()throws IOException
    {
        int a[]=new int[10];
        BufferedReader ob= new BufferedReader(new InputStreamReader( System.in));
        System.out.println("Enter 10 numbers to be sorted=");
        for(int i=0;i<10;i++)
        {
            a[i]= Integer.parseInt(ob.readLine());
        }
        System.out.println("The entered array is=");
        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    for(int i=(a.length-2);i>=0;i--)
    {
        for(int j=0;j<=i;j++)
        {
            if(a[j]>a[j+1])
            {
                int t= a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
    }
    System.out.println("the sorted array is=");
    for(int i=0;i<10;i++)
    {
        System.out.print(a[i]+" ");
    }
}
}
