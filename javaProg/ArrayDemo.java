public class ArrayDemo{
     public static void main(String args[]){
	  //first way to declare an array. this way initialize the array by default
	  int [] intArray = {1,2,3,4,5};
	  System.out.println(intArray[1]);//print 2
	  //second way to declare an array
	 char [] charArray = new char[5];
	 charArray[0] = 65;
	 charArray[1] = 'B';
	  charArray[2] = 'C';
	  
	  	  System.out.println(charArray[0]);//print 2
		  
		  //declare an array called loopedArray. Use a for statement and add all the even 
		  //numbers from 2 to 20 into the loopedArray. now print out the array.
		  //1. declare the array
		  int [] loopedArray = new int[11];
		  //2. loop the values into the array
		  int count = 0;
		  int even = 2;
		  while(even <= 20){
			  loopedArray[count] = even;
			  count++;
			  even += 2;
		  }
		  for(int i = 0; i < loopedArray.length; i++){
			  System.out.println(loopedArray[i]);
			  
		  }
		  
		  //3.
		  int [] oddArray = new int[11];
		  int count1 = 30;
		  int odd= 3;
		  while(odd >=30){
			oddArray[count1] = odd;
			count1 -=2;
			odd -= 2;
			
		  }
		  
		  for(int i = 0; i < oddArray.length; i-=2){
			  System.out.println(oddArray[i]);
			  
		  }
	 }
}