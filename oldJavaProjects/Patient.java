// Patient.java                                                                 Author: Eric Foote    
//
// CS 1073                                                                      Student#: 3502094
 
// This program demonstrates how the constructor methods can act as setter methods

package blood;
public class Patient {
private int idNumber;
private int age;
private String Type;
public Patient () //the default constructor that assigns the Id Number to 0 the age to 0 and the blood type to O+
{
    idNumber = 0;
    age = 0;
    Type = "O+";
}
public Patient (int id, int yearOfBirth, String Blood) //the overloaded constructor
{
    idNumber = id;
    age = yearOfBirth;
    Type = Blood;
}
public int getID ()
{
    return idNumber;
}
public int getAge()
{
    return age;
}
public String getBloodType()
{
    return Type;
}
public static void main (String[] args)
{
 Patient patient1 = new Patient ();
 Patient patient2 = new Patient (1129, 1996, "A+"); // these last two lines created Patient objects 
 System.out.println("The first patient is: " + patient1.getAge() + "  " +  patient1.getID() + "  " +  patient1.getBloodType());
 System.out.println("The second patient is: " + patient2.getAge() + "  " + patient2.getID() + " " + patient2.getBloodType());
}

}
        




