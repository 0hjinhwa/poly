
public class Exam07 {
 int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++) { // 3의 배수이면서 5의 배수인 숫자만 출력하시오.
			if(i%15==0) {
				System.out.println("[3의배수] [5의배수]"+i);
			}
		}
	}
}
