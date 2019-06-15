import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code her
      Scanner sc=new Scanner(System.in);
      int no=sc.nextInt();
      int arr[]=new int[no];
      for(int i=0;i<no;i++)
      {
       arr[i]=sc.nextInt(); 
      }
                    int miss=0;

      for(int val=1;val<=no;val++)
      {
        int found=0;
	for(int i=0;i<no;i++)
       {
        if(arr[i]==val)
        {
         found=1;
          break;
        }
       }
      if(found==0)
      {
       miss=val;
        break;
      }
      }
      System.out.println(miss);
}
}