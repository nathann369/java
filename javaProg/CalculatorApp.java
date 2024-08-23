public class CalculatorApp{
	public static void main (String [] args){
		Calculator1 app = new Calculator1();//app is an object of Calculator1
		
		//System.out.println(new Calculator1());
		
		System.out.println(app.product(5,4));//calling a non-static method()
		
		System.out.println(Calculator1.sum(3,4));// calling a static method()
	}
}