
import java.util.Scanner;
//UpperCamelCase or PascalCase
public class StudentGrade{
//creat the main method
	public static void main(String [] args){
	//declare variables;
	String name;
	double testScore, examScore, totalScore;
	String grade = "";
//ask for the name
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter your name: ");//print (prompt )
	name = scan.nextLine();
//ask for the score
	System.out.print("Enter your Test Score: ");
	testScore = scan.nextDouble();
// ask for the exam score
	System.out.print("Enter your Exam Score: ");
	examScore = scan.nextDouble();
//calculate total score
	totalScore = testScore + examScore;
//determin the grade of the student
		//if((totalScore >= 70) && (totalScore <= 100))
		if (totalScore >= 70){
		grade = "A";
		}else if(totalScore >= 60){
		grade = "B";
		}else if(totalScore>= 50){
		grade = "C";
		}else if(totalScore>=45){
		grade = "D";
		}else if (totalScore>= 40){
		grade = "E";
		}else if( (totalScore <= 1) &&(totalScore <=39) ){
		grade = "F";
		}else{
		System.out.print("Missing Script");
		}
		System.out.printf("Hello %s%n"+
		"your test score is %.2f%n"+
		"your exam score is %.2f%n"+
		"your total score is %.2f%n"+
		"your grade is %s", name, testScore,examScore,totalScore,grade);
		
		
	}// end if statment
}//end of class