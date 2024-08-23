import java.util.Scanner;
//develop a class-averaging program that proceesses grades for an arbitrary number of students each tiem its run.

public class While2Demo{
		public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		int total =0;
		int gradeCount =0;
		int grade;
		double average;
		//use of sentinel
		System.out.println("Enter grade or -1 to qiut");
		grade = scan.nextInt();
		while(grade != -1){
			total = total + grade;
			gradeCount =gradeCount +1;
			
			// prompt for anothr input
			System.out.println("Enter grade or -1 to quit");
			grade = scan.nextInt();
		}
		//calcutator the grade
		if(gradeCount !=0){
			average = (double)total/gradeCount;
			System.out.printf("%nTotal of the %d grade entered is %d%n",gradeCount,total);
			System.out.printf("Class average is %.2f%n", average);
		}else
		System.out.println("No grades were entered");
	}
}
