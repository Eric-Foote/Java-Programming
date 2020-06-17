//Author: Eric Foote                                                      

// This program will solve the mathematical game the Towers of Hanoi. 
// base source code came from: (http://www.javawithus.com/programs/towers-of-hanoi) with minor modifications to include dialog boxes
// edits were for dialog boxes instead of using the system out print command.

import javax.swing.*;
public class TowersOfHanoi {

    public static void main(String[] args) {
        TowersOfHanoi towersofhanoi = new TowersOfHanoi();
        String InputtedDisks = JOptionPane.showInputDialog(null, "Enter the number of disks!");
        int disks = Integer.parseInt(InputtedDisks);
        System.out.println("The ammount of disks are: " + disks);
        towersofhanoi.solvepuzzle(disks, "A", "B", "C");
        JOptionPane.showMessageDialog(null, "The puzzle is solved!");
        System.out.println("The puzzle is solved!");
        
    }
    public void solvepuzzle(int n, String start, String auxilary, String end){
        if (n == 1){ //this is the base case
            JOptionPane.showMessageDialog(null, start + " => " + end);
            System.out.println(start + " => " + end);
         }
        else {
            solvepuzzle (n-1, start, end, auxilary);
            JOptionPane.showMessageDialog(null, start + " => " + end);
            System.out.println(start + " => " + end);
            solvepuzzle (n-1, auxilary, start, end);
        }
    }
}
