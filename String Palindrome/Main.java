import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in=new Scanner(System.in);
       String str=in.nextLine();
       int len=str.length();
      int front=0;
      int end=len-1;
      boolean ispali=true;
      while(front<end)
      {
       if(str.charAt(front)!=str.charAt(end))
       {
         ispali=false;
         break;
       }
        front++;
        end--;
       }
      if(ispali==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    } 
}