/*
Volunteer.java
Andika Yudha Riyanto - 191524034
D4-2B Teknik Informatika
Politeknik Negeri Bandung
 */
package typeemployee;

/**
 *
 * @author andika19
 */
public class Volunteer extends StaffMember
{
    //----------------------------------------------------------
    // Constructor: Sets up this volunteer using the specified
    // information.
    //----------------------------------------------------------
    public Volunteer (String eName, String eAddress,String ePhone)
    {
        super (eName, eAddress, ePhone);
    }
    //----------------------------------------------------------
    // Returns a zero pay value for this volunteer.
    //----------------------------------------------------------
    public double pay()
    {
        return 0.0;
    }
}