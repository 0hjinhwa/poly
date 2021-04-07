
public class Page204 {

	int b = 0; // 클래스 전체에서 사용되는 변수 (전역변수)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hap=0; //Main 함수 실행되는 동안만 살아있는 변수
		int i;  //for문 돌 동안 유지되게 하기 위해서
		
		for(i=1; i<=10; i++) {
			int c= 0; //1번 돌 때만 살아있는 변수 (지역변수)
			hap=hap+i; 
		}
		System.out.println("1에서 10까지의 합 : %d \n"+hap);
	}	
	
}
