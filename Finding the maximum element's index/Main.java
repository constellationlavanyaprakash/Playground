import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int no=in.nextInt();
    int arr[]=new int[no];
    for(int i=0;i<=no-1;i++)
    {   
      arr[i]=in.nextInt();
    }
    maximum(arr,no);
  }
  public static void maximum(int arr[],int no)
  {
    int max;
   if(arr[0]>arr[1])
   {
    max=0; 
   }
    else
    {
     max=1; 
    }
    for(int i=2;i<=no-1;i++)
    {
     if(arr[max]<arr[i]) 
     {
       max=i;
     }
 }
     
      System.out.println(max);    
  }
    
}