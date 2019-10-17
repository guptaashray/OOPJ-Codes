public class ADD
{
public static void main()
{
int a[][] = {{1,5,7},{5,8,0},{3,5,1}}
int b[][] = {{9,0,0},{5,6,5},{4,2,4}}
int c[][] = new int[3][3];
for(int i = 0; i<3;i++)
{
for(int j =0;j<3;j++)
{
c[i][j] = a[i][j] + b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}