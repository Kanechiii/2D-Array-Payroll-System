package pkg2darr_payrollsystem;

class transactionClass extends Main
{
    public static void Transaction()
    {
        totalPay = 0;
        for(int i=0; i<numEmployee; i++)
        {
            dataEmployee[i][10] = dataEmployee[i][4] * dataEmployee[i][5]; //overtimepay
            dataEmployee[i][11] = dataEmployee[i][2] * dataEmployee[i][3]; //Basic salary
            dataEmployee[i][12] = (dataEmployee[i][2] * dataEmployee[i][3]) + dataEmployee[i][10]; //Gross pay

            statusChoice = statusChoiceArr[i];
            numDepChoice = numDepChoiceArr[i];

            taxRate = 0;
            if(statusChoice == 1)
                {
                    statusEmployee[i] = "Single" + "(6%)";
                    taxRate = 0.06;
                }
            else if(statusChoice == 2)
                {
                    statusEmployee[i] = "Single[H]";
                    if(numDepChoice == 1)
                        {
                            numDepEmployee[i] = "1" + "(4%)";
                            taxRate = 0.04;
                        }
                    else if(numDepChoice == 2)
                        {
                            numDepEmployee[i] = "2" + "(2%)";
                            taxRate = 0.02;
                        }
                    else if(numDepChoice >= 3)
                        {
                            numDepEmployee[i] = "3" + "(0%)";
                            taxRate = 0.00;
                        }
                }
            else if(statusChoice == 3)
                {
                    statusEmployee[i] = "Married";
                    if(numDepChoice == 1)
                        {
                            numDepEmployee[i] = "1" + "(4%)";
                            taxRate = 0.04;
                        }
                    else if(numDepChoice == 2)
                        {
                            numDepEmployee[i] = "2" + "(2%)";
                            taxRate = 0.02;
                        }
                    else if(numDepChoice == 3)
                        {
                            numDepEmployee[i] = "3" + "(0%)";
                            taxRate = 0.00;
                        }
                }
            else if(statusChoice == 4)
                {
                    statusEmployee[i] = "Widow";
                    if(numDepChoice == 1)
                        {
                            numDepEmployee[i] = "1" + "(4%)";
                            taxRate = 0.04;
                        }
                    else if(numDepChoice == 2)
                        {
                            numDepEmployee[i] = "2" + "(2%)";
                            taxRate = 0.02;
                        }
                    else if(numDepChoice >= 3)
                        {
                            numDepEmployee[i] = "3" + "(0%)";
                            taxRate = 0.00;
                        }
                }

            vat = dataEmployee[i][12] * taxRate;
            dataEmployee[i][15] = vat;
            dataEmployee[i][13] = (dataEmployee[i][12] * vat) - dataEmployee[i][9]; //Net pay
            totalPay += dataEmployee[i][13]; //total net pay of employees
        }
    }
    
    public static void Deduction()
        {
            for (int i = 0; i < numEmployee; i++) 
                {
                    dataEmployee[i][9] = (dataEmployee[i][6] * dataEmployee[i][7]) + dataEmployee[i][8]; //totaldeduct
                }
        }
}




