	package exception;
	//try catch를 사용하지 않아도 java쪽으로 처리해달라고 전달을 해준다 
	//throws는 코드가 깔끔해진다.
	class Test06 {
		public void test1()  {
			System.out.println(111111);
			test2();
			
		}
		public void test2()  {
			System.out.println(222222);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}// 다른 매소드를 예외처리를 안해도 된다.
	}
	public class Ex06 {
		public static void main(String[] args) throws InterruptedException {
			Test06 t = new Test06();
			t.test1();
			
	}
}

	//예외를 전가하다보니까 test1 test2 전가한 메소드에 전부 다 처리해줘야한다