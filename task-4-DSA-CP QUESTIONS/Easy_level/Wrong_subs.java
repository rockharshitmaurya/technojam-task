import java.io.*;
import java.util.*;
class Wrong_subs {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int k=sc.nextInt();
		int temp=0;
		while(k!=0){
		    int t=a%10;
		    if(t==0) temp=a/10;
            else  temp=a-1;
		    
            a=temp;
		    k--;
		}
		System.out.println(temp);
	}
}