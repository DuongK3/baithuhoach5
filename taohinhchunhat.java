import java.util.Scanner;
public class taohinhchunhat {
	
	public static void main(String[] args) {
		int n,m;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		n = sc.nextInt();
		System.out.print("Nhập chiều rộng: ");
		m = sc.nextInt();
		sc.close();
	if (n < 0 || m < 0)
		System.out.println("Chiều dài hoặc chiều rộng không hợp lệ!");
	else 
		for(int i = 1; i<= m; i++) 
		{
			for(int j = 1; j <= n; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
