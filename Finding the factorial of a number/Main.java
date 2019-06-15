import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int i=in.nextInt();
    int a=fact(i);
    System.out.println(a);
  }
  public static int fact(int n)
  {
   if(n==1)
   {
    return 1; 
   }
    else
    {
     return n*fact(n-1); 
    }
  }
}