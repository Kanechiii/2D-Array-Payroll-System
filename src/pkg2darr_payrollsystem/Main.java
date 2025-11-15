package pkg2darr_payrollsystem;
import java.util.*;
import javax.swing.*;

public class Main
{
    static Scanner in = new Scanner(System.in);
    static String nameEmployee[][];
    static String statusEmployee[];
    static String numDepEmployee[];
    static double dataEmployee[][];
    static double totalPay;
    static double taxRate;
    static int idEmployee[];
    static int statusChoiceArr[];
    static int numDepChoiceArr[];
    static int numEmployee;
    static int statusChoice;
    static int numDepChoice;
    static int idSearch;
    static int idInput;
    static boolean idDuplicate;
    static boolean idFound;

    public static void main(String[] args)
        {
            String input;

            do{

                dataEntryClass.DataEntry();
                transactionClass.Transaction();
                transactionClass.Deduction();
                displayClass.Display();
                searchClass.Search();

                do{
                    System.out.print("\nRun another program? Please enter an input [y/n]: ");
                    input = in.next();
                    if(!input.equals("y") && !input.equals("n"))
                        {
                            JOptionPane.showMessageDialog(null, "Invalid input! Please try again", "ERROR INPUT", JOptionPane.ERROR_MESSAGE);
                        }
                }while(!input.equals("y") && !input.equals("n"));

            }while(input.equals("y"));
        }
}
