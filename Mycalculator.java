package week1.day2;

public class Mycalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator obj=new Calculator();
		int Add = obj.add(10, 10, 10);
		System.out.println(Add);
		
		int sub = obj.subtraction(30, 10);
		System.out.println(sub);
		
		int mul = obj.multiplication(25, 25);
		System.out.println(mul);
		
		float div = obj.division(100, 2);
		System.out.println(div);
		
		
		

	}

}
