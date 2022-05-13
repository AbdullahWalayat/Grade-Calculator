package studentrecord;

public class studentRecord {


private int quiz1;
private int quiz2;
private int midtrm;
private int exm;
  
public String toString()
{
double numericGrade = finalWeightedGrade();
return("Student Record: \nQuiz 1: " + quiz1 + " \nQuiz 2: "
+ quiz2 + " \nMidtrm: " + midtrm + " \nFinal Exm: " + exm
+ " \nClass Numeric Grade " + numericGrade
+ " \nLetter Grade: " + letterGrade(numericGrade));
}   
  
public void studentRecord() 
{   
quiz1 = 0;
quiz2 = 0;
midtrm = 0;
exm = 0;
}
  
public studentRecord(int q1, int q2, int mt, int ex) 
{   
midtrm = mt;
exm = ex;
  
if(q1 > 10 || q1 < 0)
{
System.out.println("Invalid quiz score: must be out of 10");
System.exit(0);
}
else
{
quiz1 = q1;
}
if(q2 > 10 || q2 < 0)
{
System.out.println("Invalid quiz score: must be out of 10");
System.exit(0);
}
else
{
quiz2 = q2;
}   
  
if(mt > 100)
{
System.out.println("Invalid midtrm score: must be out of 100");
System.exit(0);
}
else
{
midtrm = mt;
}
if(ex > 100)
{
System.out.println("Invalid final Exm score: must be out of 100");
System.exit(0);
}
else
{
exm = ex;
}   
}
  
public double getQuizGrade() 
{
return((quiz1*10 + quiz2*10) / 2) * 0.25; 
}
  
  
public double getMidtrm() 
{
return midtrm * 0.25; 
}
  
public double getExm() 
{
return exm * 0.5; 
}
  
public double finalWeightedGrade()
{   
return getQuizGrade() + getMidtrm() + getExm(); 
}
  
public String letterGrade(double numericGrade) 
{
if (numericGrade >= 90)
{
return "A";
}
else if (numericGrade < 90 && numericGrade >= 80)
{
return "B";
}
else if (numericGrade < 80 && numericGrade >= 70)
{
return "C";
}
else if (numericGrade < 70 && numericGrade >= 60)
{
return "D";
}
else
{
return "F";
}
}
    
}


    
  
