import java.util.*;
class ArrayShuffle {
    static void solution(int A[], int n){
        int sum = 0;
        for(int i=0; i<n-1; i++)
        {
            if ((A[i]%2)!=(i % 2)&&(A[i+1]%2)==(i%2))
            {
                int t = A[i];
                A[i] = A[i+1];
                A[i+1] = t;
            }
            if ((A[i]%2)==(i%2)) sum++;
        }
        if ((A[n-1]%2)==((n-1)%2)) sum++;
        System.out.println(sum);
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0; i<t; i++){
		   int n=sc.nextInt();
		   int A[]=new int[n];
		   for(int j=0; j<n; j++){
		       A[j]=sc.nextInt();
		   }
		   solution(A,n);
		}
	}
}
