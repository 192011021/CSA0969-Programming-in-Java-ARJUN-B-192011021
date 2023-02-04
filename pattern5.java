import java.util.Scanner;
public class pattern5{
public static void main (String args[]){
int i,j,rows;
Scanner sc= new Scanner(System.in);
System.out.print("enter the number of pattern print:");
rows = sc.Nextlnt();
for(i=1;i<=rows;i++){
for(j=1;j<=i;j++){
System.out.print(i+" ");
}
System.out.println();
}
}
}