import java.util.Scanner;
public class Main{
  public static void gcd(int r1,int r2,int r3)
  {
    int min,gg=0;
   if(r1<r2)
   {
     if(r1<r3)
     {
       min=r1;
     }
     else
     {
       min=r3;
     }
   }
    else
    {
     min=r2; 
    }
  while(min>=1)
  {
   if((r1%min==0) && (r2%min==0) && (r3%min==0))  
   {
    gg=min;
     break;
   }
    min--;
   }
    System.out.println(gg);
 }
  
	public static void main (String[] args)
	{
 Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
       int n2=in.nextInt();
       int n3=in.nextInt();
      gcd(n1,n2,n3);	
    }
}