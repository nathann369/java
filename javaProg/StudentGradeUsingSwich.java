import java.util.Scanner;

public class StudentGradeUsingSwich {
    public static void main(String[] args) {
        int testScore,examScore,totalScore;
        String grade,name;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        name = scan.nextLine();
        
        System.out.print("Enter Your Test Score: ");
        testScore = scan.nextInt();
        System.out.print("Enter Your Exam Score: ");
        examScore = scan.nextInt();
		
		totalScore = testScore +examScore;
        
        
        switch(totalScore){
            case 70: 
                grade = "A";
                break;
            case 60:
                grade = "B";
                break;
            case 50:
                grade = "C";
                break;
            case 44:
                grade ="D";
                break;
            case 40:
                grade = "E";
                break;
            default:
                grade = "F";
                break;
                
        }//end switch
        System.out.printf("Hello %s."+
		"your test score is %d%n"+
		"your exam score is %d%n"+
		"your total score is %d%n"+
		"your grade is %s%n", name, testScore,examScore,totalScore,grade);
    }//end of main method
}//end of class
