import java.util.Scanner;
class Main{
  public static int sum(int m)
  {
   int fa=0;
    for(int count=1;count<=m;count++)
   {
     fa=fa+count;
   } 
    return fa;
   }
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n1=sum(n);
      System.out.println(n1);
	}
}