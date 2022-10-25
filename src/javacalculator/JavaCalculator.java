/*
 *Castillo, Joaquin Iverson M.
 *2020759@ub.edu.ph
 *CpE3A
 */

package javacalculator;
import javax.swing.JOptionPane;
public class JavaCalculator {
   
    public static void main(String[] args) {
        String enterInt1 = JOptionPane.showInputDialog("Enter First Integer: ");
        System.out.println("Entered First Integer: "+enterInt1);
        String operation = JOptionPane.showInputDialog("Enter Operation: \n + = Addition \n - = Subtraction \n * = Multiplication \n / = Division");
        System.out.println("Entered Operation: "+operation);
        String enterInt2 = JOptionPane.showInputDialog("Enter Second Integer: ");
        System.out.println("Entered Second Integer: "+enterInt2);
       
        float int1 = Float.parseFloat(enterInt1);
        float int2 = Float.parseFloat(enterInt2);
       
        float result = 0;
        if (operation.equals("+")){
            float addition = int1+int2;
            result = addition;
        }
        else if (operation.equals("-")){
            float subtraction = int1-int2;
            result = subtraction;
        }
        if (operation.equals("*")){
            float multiplication = int1*int2;
            result = multiplication;
        }
        if (operation.equals("/")){
            float division = int1/int2;
            result = division;
        }
        else{
            System.out.println("Syntax Error");
        }
        System.out.println("Answer = "+result);
        JOptionPane.showMessageDialog(null, "Answer = "+result);
    }
 
}