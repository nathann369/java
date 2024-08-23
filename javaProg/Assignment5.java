import java.util.Scanner;
  public class Assignment5{

 public int areaOfTriangle(int base, int height){
	return (base * height)/2;
 }
 
 public int areaOFParallelogram(int base, int height){
	return base * height;
 }
 
 public static void main(String []args){
	Scanner scan = new Scanner(System.in);
	Assignment5 assg = new Assignment5();
	int triBase =0,triHeight=0,paraBase=0,paraHeight=0;
	//values of the triangle
	System.out .println("Enter base of triangle");
	triBase = scan.nextInt();
	System.out .println("Enter height of triangle");
	triHeight = scan.nextInt();
	//values of the parallelogram
	System.out .println("Enter base of Parallelogram");
	paraBase = scan.nextInt();
	System.out .println("Enter height of Parallelogram");
	paraHeight = scan.nextInt();
	
	
	System.out.println("The area of the triangle is: "+ assg.areaOfTriangle(triBase,triHeight));
	
	System.out.printf("With a base of %d and a height of %d,"+ "the area of the parallelogram is : %d%n", paraBase,paraHeight,
	assg.areaOFParallelogram(paraBase,paraHeight));
	
	
	
	
	
 }
}
