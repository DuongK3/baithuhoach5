import java.util.Scanner;
public class Decimal {
	
	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số thập phân cần chuyển đổi: ");
		n = sc.nextInt();
		sc.close();
		
		if (n<0) {
			System.out.println("Số bạn nhập phải lớn hơn 0"); }
		else {					
			String nhiphan = "" ;
			while(n>0) {
				nhiphan = (n%2) + nhiphan;
				n = n/2;
			}
			System.out.println("Số thập phân đổi sang nhị phân là: "+nhiphan);
		}
	}
}	