package pkg2darr_payrollsystem;
import javax.swing.*;

class searchClass extends Main
    {
        public static void Search()
            {
                int input1;

                do{
                    String get1 = JOptionPane.showInputDialog(null, "Search Employee (ID Number): ", "SEARCH EMPLOYEE ID", JOptionPane.INFORMATION_MESSAGE);
                    idSearch = Integer.parseInt(get1);
                    idFound = false;

                    for(int i=0; i<numEmployee; i++)
                        {
                            if(idEmployee[i] == idSearch)
                                {
                                    idFound = true;
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.printf("%-4s | %-11s | %-19s | %-6s | %-8s | %-6s | %-8s | %-6s | %-8s | %-12s | %-8s | %-12s | %-12s | %-10s | %-10s | %-10s | %-10s | %-10s%n",
                                            "NO.", "EMP ID", "NAME", "RH", "RPH", "OHR", "OTR", "UTH", "UTR", "STATUS", "DEP", "OTHER DEDUCT", "TOTAL DEDUCT", "OTP", "VAT","BALSAL", "GROSS", "NET PAY");
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                    System.out.printf("%-4d | ID%-9d | %-19s | %-6.2f | %-8.2f | %-6.2f | %-8.2f | %-6.2f | %-8.2f | %-12s | %-8s | %-12.2f | %-12.2f | %-10.2f | %-10.2f | %-10.2f | %-10.2f | %-10.2f%n",
                                            (i + 1),
                                            idEmployee[i],
                                            nameEmployee[i][0],
                                            dataEmployee[i][2],
                                            dataEmployee[i][3],
                                            dataEmployee[i][4],
                                            dataEmployee[i][5],
                                            dataEmployee[i][6],
                                            dataEmployee[i][7],
                                            statusEmployee[i],
                                            numDepEmployee[i],
                                            dataEmployee[i][8],
                                            dataEmployee[i][9],
                                            dataEmployee[i][10],
                                            dataEmployee[i][15],
                                            dataEmployee[i][11],
                                            dataEmployee[i][12],
                                            dataEmployee[i][13]);
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.printf("TOTAL PAYROLL = %.2f%n", dataEmployee[i][13]);
                                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                                    System.out.println();
                                }
                        }

                    if(!idFound)
                        {
                            JOptionPane.showMessageDialog(null, "No Employee found with ID number: ID" + idSearch, "NO EMP ID FOUND", JOptionPane.ERROR_MESSAGE);
                        }

                    input1 = JOptionPane.showConfirmDialog(null, "Try again searching attempts?", "SEARCH ATTEMPTS", JOptionPane.YES_NO_OPTION);

                }while(input1 == JOptionPane.YES_OPTION);
            }
    }

