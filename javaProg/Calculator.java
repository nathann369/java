

public class Calculator{
//a method to perform addition
		private int numbers = 10;//global variable
		public void simpleCalculate(){
			System.out.println("Calculator");
		}//end
		
		public double addNumbers(int a, int b){
			double c;//local vairable
			c = a+b;
			return c;
		}//end addNumbers
		//creat a method called multiplynumbers it should accept 4numbers and 
		//return the product of the numbers
		//display the output of the method in the main method
				
		public int multiplyNumbers(int a, int b, int c, int d){
			int e;//local vairable
			e = a * b * c * d;
			return e;
			}
		public static void main(String []args){
			Calculator calc = new Calculator();
			calc.simpleCalculate();
			System.out.println(calc.addNumbers (4, 10));
			System.out.println(calc.numbers);
			System.out.println(calc.multiplyNumbers(2,2,2,2));
			
		}
}zf3N5yR