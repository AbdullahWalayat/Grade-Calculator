package studentrecord;

import java.util.Scanner;

public class WeightedGrades {
  
public static void main(String[] args) {
Scanner input = new Scanner(System.in);


//Taking Inputs from user
System.out.println("Enter in the first quiz score (out of 10): ");
int quiz1 = (input.nextInt());

System.out.println("Enter in the second quiz score (out of 10): ");
int quiz2 = input.nextInt();

System.out.println("Enter in the Midtrm score (out of 100): ");
int midtrm = input.nextInt();

System.out.println("Enter in the Final Exm score (out of 100): ");
int exm = input.nextInt();


//creating object of studentRecord
studentRecord newGrade = new studentRecord(quiz1, quiz2, midtrm, exm);
System.out.println();

//Display output
System.out.println(newGrade);
}
}
