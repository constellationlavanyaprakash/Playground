import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    sort(n,arr);
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
  public static void sort(int p,int arr[])
  {
    int n=p/2;
   for(int i=0;i<=n-2;i++)
   {
     for(int j=0;j<=n-2-i;j++)
     {
       if(arr[j+1]<arr[j])
       {
         int temp=arr[j+1];
         arr[j+1]=arr[j];
         arr[j]=temp;
       }
     }
   }
    
    }
    }
