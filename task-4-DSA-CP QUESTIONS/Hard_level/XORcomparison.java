import java.util.*;
class XORcomparison  {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0; i<t; i++){
		    int n=sc.nextInt();
		    int total=1;
		    for(int j=1; j<n; j++){
		      total=(total*2)%(int)1e7;
		    }
		    System.out.println(total);
		}
	}
}