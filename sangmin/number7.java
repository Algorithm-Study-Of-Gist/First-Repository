
import java.util.Scanner;

public class number7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int l[] = new int[2001];
		int r[] = new int[2001];
		int dp[] = new int[2000];
		for(int i = 0; i < n ; i++) {
			l[i] = input.nextInt();
		}
		int init = 0;
		int cnt=0;
		int cntr = 0;
		
		for(int i = cntr; i < n ; i++) {
			r[i] = input.nextInt();
			int tmp = 0;
			
			for(int j = cnt; j< n; j++) {
				
				if(l[j] >= r[i]) {
					tmp++;
				}
				if(l[j] > r[i]) {
					dp[init] += r[i];
					cnt = j;
					break;
				}
				if(tmp == n - cnt) {
					cnt = j;
					init++;
					cntr = j;
				}
				
			}
		}
		int max = dp[0]; 
				for(int k = 0 ; k < dp.length-1;k++) {
					if(dp[k] > dp[k+1]) {
						max = dp[k];
					}
				}
		System.out.println(max);
	}

}
