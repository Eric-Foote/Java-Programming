import java.time.*;
public class CertificateOfDeposit {
    private static String CertificateNumber;
    private  static String AccountHoldersLastName;
    private static double Balance;
    private LocalDate IssueDate;
    private LocalDate MaturityDate;
    
    public CertificateOfDeposit (String Number, String LastName, double Funds, LocalDate Date) //this constructor sets the parameters set from the object to the instance variables of this class
    {
        CertificateNumber = Number;
        AccountHoldersLastName = LastName;
        Balance = Funds;
        IssueDate = Date;
        MaturityDate = Date.plusYears(1); //this method will add one year to the current date.
    }

    CertificateOfDeposit(){    }
    
    public static void setCertificateNumber (String Number)
    {
     CertificateNumber = Number;   
    }
    
    public static void setAccountHoldersLastName (String LastName)
    {
        AccountHoldersLastName = LastName;
    }
    
    public static void setBalance (double Funds)
    {
        Balance = Funds;
    }
    
    public void setIssueDate (LocalDate Date)
    {
        IssueDate = Date;
    }
    
    public void setMaturityDate (LocalDate Date)
    {
        MaturityDate = Date.plusYears(1);
    }
    
    public String getCertificateNumber ()
    {
        return CertificateNumber;    
    }
    
    public String getAccountHoldersLastName ()
    {
        return AccountHoldersLastName;
    }
    
    public double getBalance ()
    {
        return Balance;
    }
    
    public LocalDate getIssueDate ()
    {
        return IssueDate;
    }
    
    public LocalDate getMaturityDate ()
    {
        return MaturityDate;
    }
  
    
}
