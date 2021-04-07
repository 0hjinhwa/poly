import java.util.Scanner;

public class Page238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a,b;
		
		while(true) { //난 무한 루프이다.
			System.out.println("더할 첫번째 수 입력");
			a=s.nextInt();
			System.out.println("더할 두번째 수 입력");
			b=s.nextInt();
			
			System.out.println(a+"+"+b+"="+(a+b));
			
			//합계가 10보다 크면 나가기
			if((a+b)>10) {
				break;
			}
		}
	}
}
