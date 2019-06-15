import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int no=sc.nextInt();
      int arr[]=new int[no];
      for(int i=0;i<no;i++)
      {
       arr[i]=sc.nextInt(); 
      }
      int pali=0;
      int left=0;
      int right=no-1;
    while(left<right)
    {
     if(arr[left]!=arr[right])
     {
      pali=1;
       break;
     }
      left++;
      right--;
     }
      if(pali==0)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}