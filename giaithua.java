import java.util.Scanner;
public class giaithua {
	
	public static void main(String[] args) {
		int n,giaithua;
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số nguyên dương n: ");
		n=sc.nextInt(); 
		sc.close();
		
		giaithua = 1;
		if (n<0) 
		{
			System.out.println("Điều kiện (n >= 0)"); 
		}
		else 
		{
			for (int i = 1; i<=n; i++) 
			{
				giaithua = giaithua *i;
			}
			System.out.println("Giai thừa của "+n+" là: "+giaithua);
		}
	}
}


