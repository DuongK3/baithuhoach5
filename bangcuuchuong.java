import java.util.Scanner;
public class bangcuuchuong {

	public static void main(String[] args) {

		int bcc;
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhập giá trị bảng cửu chương: ");
	bcc = sc.nextInt();
	sc.close();
	
	if (bcc<1 || bcc>10)
		System.out.print("Không có bảng cửu chương cho giá trị này!");
	else 
	{
		for(int i=1; i<=10; i++)
			System.out.println(bcc+" x "+i+" = "+bcc*i);
		}		
	}
}