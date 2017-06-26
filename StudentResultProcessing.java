package Session3Assignment4;

import java.util.Scanner;

public class StudentResultProcessing extends Student1
{
	public int maths;
	public int chemistry;
	public int physics;
	
	public StudentResultProcessing(){
		super();
		System.out.println("Enter the marks in Maths, Chem, Physics");
		Scanner input = new Scanner(System.in);
		this.maths =input.nextInt();
		this.chemistry =input.nextInt();
		this.physics = input.nextInt();
	}
	
	

	public void display()
	{
		System.out.println("Student rollno is " +this.getRollno());
		System.out.println("Student name is " +this.getName());
		System.out.println("Student phone no is " +this.getPhoneno());
		System.out.println("Marks in Maths is " +this.maths );
		System.out.println("Marks in Chemistry is " +this.chemistry);
		System.out.println("Marks in Physics is " +this.physics);
		
	}
	

	public static void main(String[] args) {
		
		for (int i =1 ;i<=3; i++){
		StudentResultProcessing s1 = new StudentResultProcessing();	
	
		String res = s1.result(s1.maths,s1.chemistry,s1.physics,s1.getRollno());
		s1.display();
		System.out.println("***The result is "+res + "***");
		}
		

	}

}
