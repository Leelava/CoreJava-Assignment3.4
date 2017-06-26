package Session3Assignment4;

import java.util.Scanner;

public class Student1 {
private String name;
private int rollno;
private long phoneno;
private int standard;

public Student1()
{
	System.out.println("Enter the student details");
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the rollno");
    this.rollno = input.nextInt();
    System.out.println("Enter the Student name");
	this.name= input.next();
	System.out.println("Enter the phoneno");
	this.phoneno= input.nextLong();
	System.out.println("Enter the class");
	this.standard= input.nextInt();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}
public int getStandard() {
	return standard;
}
public void setStandard(int standard) {
	this.standard = standard;
}
public String result (int ms, int chem,int ph, int rol)
{
	int avg; String result;
	avg= (ms+chem+ph)/3;
	
	if (avg >= 35) {result = "PASS";return result;}
	else return(result="FAIL");
}



}
