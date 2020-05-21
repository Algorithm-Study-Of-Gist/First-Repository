import java.util.Scanner;
public class number1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int total =0;
		int num00= 0;
		int num1 = 0;
		
		if(n%2 == 1) {
			num00 = n/2;
			num1 = n%2;
			while(num00>=0) {
				total += (facto(num00 + num1))/(facto(num00)*facto(num1));
			num00--;
			num1 = num1 +2;
			}	
		}
		else
			if(n %2 ==0) {
				num00 = n/2;
				num1 = n%2;
				while(num00>=0) {
					total += (facto(num00 + num1))/(facto(num00)*facto(num1));
				num00--;
				num1 = num1 +2;
				}		
			}
		System.out.println(total);
	}
	
	public static int facto(int a) {
	int res =1 ;
	while(a != 0) {
		res *= a;
		a--;
	}
	
	return res;
	}

}
