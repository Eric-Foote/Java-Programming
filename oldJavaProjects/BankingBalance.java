import java.time.LocalDate;
import javax.swing.*;
public class BankingBalance {
    public static void main(String[] args) {
        CertificateOfDeposit Person1 = new CertificateOfDeposit ();
        String Certificate = JOptionPane.showInputDialog(null, "Enter Certificate Number:");
        CertificateOfDeposit.setCertificateNumber(Certificate);
        String Name = JOptionPane.showInputDialog(null, "Enter Last Name of Owner:");
        CertificateOfDeposit.setAccountHoldersLastName(Name);
        double Funds;
        String inputtedFunds = JOptionPane.showInputDialog(null, "Enter Balance:");
        Funds = Double.parseDouble(inputtedFunds);
        CertificateOfDeposit.setBalance(Funds);
        JOptionPane.showMessageDialog(null,"Certificate: " + Certificate + "\n" + "Name: " + Name + "  " + "Balance: " + Funds);
        
        
        
        
        
        
        
        
    }
    
}
