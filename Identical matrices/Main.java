import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    int i,j;
    int flag=0;
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix1 = new int[r][c];
        for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }
    int[][] matrix2 = new int[r][c];
        for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }
     for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
              if(matrix1[i][j]!=matrix2[i][j])
              {
                flag=1;
                break;
              }
            }
     }
    if(flag==0)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
    }
}