import java.util.Scanner;
class Main{
  public static void greater(int r1,int r2,int r3)
  {
    if(r1>r2)
    {
      if(r1>r3)
      {
       System.out.println(r1); 
      }
       else
       {
          System.out.println(r3); 
       }
  }
    else
    {
       System.out.println(r2); 
    }
  }
    
	public static void main (String[] args){
	 Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
       int n2=in.nextInt();
       int n3=in.nextInt();
      greater(n1,n2,n3);
	}
}