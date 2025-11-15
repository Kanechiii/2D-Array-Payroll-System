package pkg2darr_payrollsystem;
import javax.swing.*;

class dataEntryClass extends Main
    {
        public static void DataEntry()
            {
                String get = JOptionPane.showInputDialog(null, "Enter number of employees: ", "NUMBER OF EMPLOYEE", JOptionPane.INFORMATION_MESSAGE);
                numEmployee = Integer.parseInt(get);

                idEmployee = new int[numEmployee];
                nameEmployee = new String[numEmployee][1];
                statusEmployee = new String[numEmployee];
                statusChoiceArr = new int[numEmployee];
                numDepChoiceArr = new int[numEmployee];
                numDepEmployee = new String[numEmployee];
                dataEmployee = new double[numEmployee][17];

                System.out.println("\n| - - - DATA ENTRY - - - |");
                for(int i=0; i<numEmployee; i++)
                    {
                        System.out.println("\nEmployee #" + (i + 1));

                        do{
                            System.out.print("Enter Employee ID number: ");
                            idInput = in.nextInt();
                            idDuplicate = false;

                            for(int x=0; x<i; x++)
                                {
                                    if(idEmployee[x] == idInput)
                                        {
                                            String text = "Employee ID number is already exist! \nPlease enter another combination";
                                            JOptionPane.showMessageDialog(null, text, "EMPLOYEE ID NUMBER", JOptionPane.ERROR_MESSAGE);
                                            idDuplicate = true;
                                            break;
                                        }
                                }
                        }while(idDuplicate);

                        idEmployee[i] = idInput;
                        in.nextLine();

                        System.out.print("Enter Employee Name: ");
                        nameEmployee[i][0] = in.nextLine();

                        System.out.println("Employee Status Selection:" +
                                                       "\n[1] - Single" +
                                                       "\n[2] - Single [Head of the family]" +
                                                       "\n[3] - Married" +
                                                       "\n[4] - Widow");

                        do {
                            System.out.print("Enter Employee Status[1-4]: ");
                            statusChoice = in.nextInt();
                            statusChoiceArr[i] = statusChoice;

                            if(statusChoice > 4)
                                {
                                    JOptionPane.showMessageDialog(null, "Please choose only between [1-4]", "EMPLOYEE STATUS", JOptionPane.ERROR_MESSAGE);
                                }
                        }while(statusChoice > 4);

                        if(statusChoice != 1)// condition of asking dependent/s if employee is SINGLE 
                            {
                                System.out.print("Number of Dependent/s: ");
                                numDepChoice = in.nextInt();
                                numDepChoiceArr[i] = numDepChoice;
                            }
                        else 
                            {
                                numDepChoiceArr[i] = 0;
                                numDepEmployee[i] = "0";
                            }

                        in.nextLine();

                        System.out.println("\n| - - - DAILY TIME RECORD - - - |");
                        System.out.print("Enter Rendered Hours: ");
                        dataEmployee[i][2] = in.nextDouble();
                        System.out.print("Enter Rate per Hour: ");
                        dataEmployee[i][3] = in.nextDouble();
                        System.out.print("Enter Overtime Hours: ");
                        dataEmployee[i][4] = in.nextDouble();
                        System.out.print("Overtime Rate per Hour: ");
                        dataEmployee[i][5] = in.nextDouble();
                        System.out.print("Enter Undertime Hours: ");
                        dataEmployee[i][6] = in.nextDouble();
                        System.out.print("Undertime Rate per Hour: ");
                        dataEmployee[i][7] = in.nextDouble();
                        System.out.print("Enter Other Deduction: ");
                        dataEmployee[i][8] = in.nextDouble();

                        dataEmployee[i][9] = 0; //totaldeduct
                        dataEmployee[i][10] = 0; //overtimepay
                        dataEmployee[i][11] = 0; //Basic salary
                        dataEmployee[i][12] = 0; //Gross pay
                        dataEmployee[i][13] = 0; //Net pay

                        in.nextLine();
                    }
            }
    }
