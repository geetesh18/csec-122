import java.util.*;
public class euclid{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int x0=1,y0=0;
int x1=0,y1=1;
while (b!=0) {
	int q=a/b;
	int temp=b;
	b=a%b;
	a=temp;
	int X=x0-q*x1;
	x0=x1;
	x1=X;
	int Y=y0-q*y1;
	y0=y1;
	y1=Y;
}
System.out.println(x0+" "+y0+" "+" "+a);
sc.close();
}
}



