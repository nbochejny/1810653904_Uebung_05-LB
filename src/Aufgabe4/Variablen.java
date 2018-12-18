package Aufgabe4;

import javax.swing.*;

public class Variablen {
    public static void main(String[] args) {


        String var1 = JOptionPane.showInputDialog("Gib was ein");
        String var2 = JOptionPane.showInputDialog("Gib noch was ein");
        String var3 = JOptionPane.showInputDialog("Gib noch mehr ein!");

        if (var1.equals(var2)){
            System.out.println("Es wurden 2 Variablen gleich befüllt!");
        }
        else if (var1.equals(var3)){
            System.out.println("Es wurden 2 Variablen gleich befüllt!");
        }
        else if (var2.equals(var3)){
            System.out.println("Es wurden 2 Variablen gleich befüllt!");
        }
        else{
            System.out.println("Keine der Variablen ist gleich befüllt worden");
        }

    }
}
