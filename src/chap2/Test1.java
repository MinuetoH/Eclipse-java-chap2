package chap2;

public class Test1 {
	public static void main(String[] args) {
     //1. 잘못된 문장을 골라내고 그 이유를 설명하시오.		
	    char       a='a'; 
//	    char       b="a";    // 작은따옴표를 사용해야함.
	    String     c="a";   
//	    String     d='a';	 // 큰따옴표를 사용해야함.
//	    char       e='ab'; 	 // char는 한 개의 문자만 저장 가능
	    String     f="ab"; 
//	    char       g ='';	 // char는 한 개의 문자만 저장 가능. 없어도 안됨
	    String     h = ""; 	 // 빈문자열 가능.

//	    byte   var1 = 128; 	// byte : -128 ~ 127. byte -> short or 형변환 연산자 사용 : (byte)128  
		short  var2 = 128; 
//		int    var3 = 28L;	// int <- long. 형변환 연산자 필수. (int)28L
		long   var4 = 128L;
//		float  var5 = 1.2;  // 리터널 기본형이 double이므로 float형 리터널을 붙여야함. 1.2f 
		double var6 = 1.2; 
	    float var9 = '1';   // float <- char타입의 코드값이 실수형
	    
	    int defalut = 1;
	    
	}
}
/*
2.   변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다. 
      변수 이름으로 사용할 수 있는 것을 고르시오.
      변수이름으로 사용할 수 없는 이유를 작성하시오
      A. false	 (X) : 예약어 변수 사용 불가
      B. default (O) : 예약어 변수 사용 불가
      C. _var	 (O) : _ 특수문자 변수 사용 가능
      D. a-class (X) : - 특수문자 변수 사용 불가
      
3. 변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다.
   변수 이름으로 사용할 수 있는 것을 고르시오.
    A. s#arp  	# 문자 변수 사용 불가
    B. static   예약어 변수 사용 불가
    C. _class 	(O)
    D. class 	예약어 변수 사용 불가
    
4. byte 형을 저장할 수 있는 데이터 값의 허용 범위는 얼마입니까?
     -128 ~ 127 : 256가지 값 가능
     				0 ~ 255 : 부호때문에 -128 ~ 127까지 범위.
 
5. float 형 변수 선언이 올바르게 된 것을 모두 고르시오.
   A. float f1 = 1F;	(O)
   B. float f2 = 1.0; 	(X) 1.0 double형. 형변환, 접미사
   C. float f3 = '1';  	(O) float <- char
   D. float f4 = "1";  	(X) float(기본형) <- String(참조형)
   E. float f5 = 1.0d;	(X) 형변환 연산자 필요.      
*/

