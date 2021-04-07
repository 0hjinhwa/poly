import java.util.Scanner; //위치 지정

public class Page176 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in); // new: 메모리에 올라간다. 이게 없으면 입력이 안됨
		int a;
		
		System.out.println("정수 입력");
		a=s.nextInt(); // 숫자 형태로 입력받겠다. 
		
		if(a>=90)
			System.out.println("A");
		else
			if(a>=80)
				System.out.println("B");
			else
				if(a>=70)
					System.out.println("C");
				else
					if(a>=60)
						System.out.println("D");
					else
						System.out.println("F");
		
		System.out.println(" 학점입니다 \n");
		
	}
}
