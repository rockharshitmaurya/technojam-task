import java.util.Scanner;

public class Biscuitqus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a [][] = new int[n][m];
        int i, j;
        int r, rp, rd;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=m-2;j>=0;j--){
                r = a[i][j+1];
                if(a[i][j] == a[0][j]){
                    rp = 0;
                }
                else{
                    rp = a[i-1][j+1];
                }
                if(a[i][j] == a[n-1][j]){
                    rd = 0;
                }
                else
                {
                    rd = a[i+1][j+1];
                }
                a[i][j] = a[i][j] + Math.max(r, Math.max(rp, rd));
            }
        }
        int max = 0;
        for(i=0;i<n;i++){
            if(a[i][0]>max){
                max = a[i][0];
            }
        }
        System.out.println(max);
    }
}