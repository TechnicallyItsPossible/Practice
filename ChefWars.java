import java.util.*;
class ChefWars
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int ar[][]=new int[2][T];
        for(int i=0;i<T;i++)
        {
            for(int j=0;j<2;j++)
            {
                ar[j][i]=sc.nextInt();
            }
            System.out.println(check(ar[0][i],ar[1][i]));
        }
    }
    public static int check(int H, int P)
    {
        if(P>0 && H>0)
        {
            H=H-P;
            P=P/2;
            return(check(H,P));
        }
        else if(P<=0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}