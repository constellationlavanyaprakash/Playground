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
perfect(arr,no);
  }
  public static void perfect(int arr[],int no)
  {
   boolean ismatch=false;
    int sum=arr[0]+arr[1]+arr[2];
    for(int i=3;i<=no-1;i=i+3)
    {
     int sum1=arr[i]+arr[i+1]+arr[i+2];
      if(sum==sum1)
      {
       ismatch=true; 
      }
    }
    if(ismatch==true)
    {
     System.out.println("Perfect Batch"); 
    }
    else
    {
     System.out.print("Not a Perfect Batch"); 
    }
  }
}