// Blood.java                                Author: Eric Foote
//
// CS 1073                                   Student#: 3502094

// This class displays a use for the getter, setter and constructor methods

package blood;
public class Blood {
    private String bloodType;
    private String rhFactor;
    public Blood() //the default constructor that sets the fields bloodtype and rhfactor to O and + respectivally
    {
        bloodType = "O";
        rhFactor = "+";
    }
    public Blood(String Type, String RH) //the overloaded constructor that will allow the fields bloodtype and rhfactor to be other than O and + 
    {
       bloodType = Type;
       rhFactor = RH;
    }
    public void setBloodType(String Blood)
    {
        bloodType = Blood;
    }
    public void setRhFactor (String R)
    {
        rhFactor = R;
    }
    public String getRhFactor ()
    {
        return rhFactor;
    }
    public String getBloodType ()
    {
        return bloodType;
    }
    public static void main(String[] args) {
       Blood patient1 = new Blood();
       Blood patient2 = new Blood("A", "-");
       Blood patient3 = new Blood();
       System.out.println("The first patients blood sample was: " + patient1.getBloodType() + patient1.getRhFactor()); //calling the default constructor
       System.out.println("The second patients blood sample was: " + patient2.getBloodType() + patient2.getRhFactor()); //calling the overloaded constructor
       patient3.setBloodType("B"); //setting the bloodtype of the patient through the setter method to B
       patient3.setRhFactor("+"); //setting the rhfactor of the patient throught the setter method to +
       System.out.println("The third patients blood sample was: " + patient3.getBloodType() + patient3.getRhFactor()); //printing the third patients blood sample through the getter methods
    }
    
}
