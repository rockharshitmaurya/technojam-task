import java.util.*;
class LongString {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n; i++){
		    String name=sc.nextLine();
		    int len=name.length();
		   if(len<=10){
		       System.out.println(name);
		       break;
		   }else{
		       System.out.println(name.charAt(0)+""+(len-2)+""+name.charAt(len-1));
		   }
		  
		}
	}
}