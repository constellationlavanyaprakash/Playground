import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
      int no=in.nextInt();
      int arr[]=new int[no];
      for(int idx=0;idx<=no-1;idx++)
      {
        arr[idx]=in.nextInt();
       }
    int search1=in.nextInt();
    int search2=in.nextInt();
      int element1=-1;
      int element2=-1;
      for(int idx=0;idx<=no-1;idx++)
      {
        if(search1==arr[idx])
        {
         element1=idx; 
        }
         if(search2==arr[idx])
        {
         element2=idx; 
        }
      }
      System.out.println(element1);
      System.out.println(element2);
    
    }
}