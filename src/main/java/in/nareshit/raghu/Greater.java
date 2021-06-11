package in.nareshit.raghu;

public class Greater {

	public static void greater(int a,int b, int c) {
		if(a>b && a>c) {
			System.out.println("a is greater");
		}
		else if(b>a && b>c) {
			System.out.println("b is greater");
		}
		else if(c>a && c>b) {
			System.out.println("c is greater");
		}
		else{
			System.out.println("all are equal");
		}
		
	}
	
	public static void main(String[] args) {
      Greater.greater(10, 20, 30);
	}

}
