import java.util.Scanner;
class Main
{
  public static int square(int num)
     {
      int num1=num*num; 
    return num1;
     }
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n1=square(n);
      System.out.println(n1);
      
	} 
}