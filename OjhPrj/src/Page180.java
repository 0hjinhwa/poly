import java.util.Scanner;

public class Page180 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a;
		
		System.out.println("1~4�� �����Ͻÿ� :");
		a=s.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("1�� �����ߴ� \n");
			break;
		case 2:
			System.out.println("2��(��) �����ߴ� \n");
			break;
		case 3:
			System.out.println("3�� �����ߴ� \n");
			break;
		case 4:
			System.out.println("4�� �����ߴ� \n");
			break;
		default:
			System.out.println("�̻��Ѱ� �����ߴ� \n");
		}
	}
}
