package chap2;
// 변수의 선언 및 초기화
//	자료형 변수명 = 값
// 변수의 선언
// 	자료형 변수명; => 자료형의 크기만큼 변수값을 메모리에 할당
// 변수의 초기화
// 	변수명 = 값(리터널)|변수|수식 => 선언된 변수에 값을 저장

public class VarEx1 {

	public static void main(String[] args) {
		int num = 100; 				// 변수의 선언 + 초기화
		System.out.println(num);
		
		byte b2;	// 변수의 선언
		b2=100;		// 오류발생. 선언하지 않은 변수는 사용 못함.
		
		byte b1 = 100;	// 1바이트 메모리 할당. -128 ~ 127까지 값 저장
		short s1 = 200;	// 2바이트 메모리 할당. 
		int i1 = 300;	// 4바이트 메모리 할당.
		long l1 = 400;	// 8바이트 메모리 할당.
		
		// 실수형 변수 선언
		// 10.1	 : double 형
		// 10.1F : float 형
		float f1 = 10.1F;	// 실수형 리터널(값) double 형임.
		double d1 = 100.1;
		
		
	}

}
