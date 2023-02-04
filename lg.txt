import java.util.Scanner;
public class LCMGCD{
public static void main(String args[]){
Scanner input=new Scanner(System.int);
System.out.println("enter the two number:");
int number1=input.nextint();
int number2=input.nextint();
System.out.println("the GCD of the two numbers:" + GCD(number1,number2));
System.out.prinln("the LCM of the two numbers:" + LCM(number1,number2));
input.close();
}
public static int GCD(int a,int b){
if(b==0)
 return a;
else
 return GCD(b,a%b);
}
 public static int LCM(int a,int b){
return a*b/(GCD(a,b));
}
}
