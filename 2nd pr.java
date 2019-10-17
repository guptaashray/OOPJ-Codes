class armstrong
{
public static void main()
{
int num= 153, number,total=0,temp;
number = num;
while(number! = 0)
{
temp = number%10;
total = total+ temp*temp*temp;
number = number/10;
}
if(total==num)
System.out.println("Armstrong number");
else
System.out.println("Not a Armstrong number");
}
}