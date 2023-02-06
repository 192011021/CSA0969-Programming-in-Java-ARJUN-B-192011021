public class prime{
public static void main (String[]args){
int num=0000;
boolean flag=false;
for(int i=2;i<=num/2;++i){
if(num%1==0){
  flag=true;
  break;
 }
}
if(! flag)
  System.out.println(num+"is a prime number");
else
  System.out.println(num+"is a not prime number");
}
}