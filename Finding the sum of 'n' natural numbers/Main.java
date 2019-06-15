import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int i=in.nextInt();
    int a=natural(i);
    System.out.println(a);
  }
  public static int natural(int n)
  {
   if(n==1)
   {
    return 1; 
   }
    else
    {
     return n+natural(n-1); 
    }
  }
}