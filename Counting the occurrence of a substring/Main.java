import java.util.Scanner;
class Main{
  public static void main(String args[]) {
   Scanner in=new Scanner(System.in);
       String str1=in.nextLine();
       String str2=in.nextLine();
       int len1=str1.length();
       int len2=str2.length();
    int occ=0;
    for(int i=0;i<(len1-len2+1);i++)
    {
      boolean count=true;
     for(int j=0;j<len2;j++)
     {
       if(str1.charAt(i+j)!=str2.charAt(j))
       {
         count=false;
     }
     }
      if(count==true)
      {
        occ++;
      }
     } 
     System.out.println(occ);
  }
}