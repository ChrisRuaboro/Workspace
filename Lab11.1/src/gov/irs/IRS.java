/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package gov.irs;

/*
 * class IRS: Simple class that holds TaxPayer (an interface) instances
 * and can collect taxes from them.  Designed to illustrate use of interfaces.
 *
 */

import java.util.ArrayList;
import java.util.List;

public class IRS
{
    // INSTANCE VARIABLES
    private List<TaxPayer> taxPayers = new ArrayList<>();
    //  private int currentIndex = 0;  // for dealing with array

    // BEHAVIORAL METHODS
    // For each TaxPayer we get them to :
    // fileReturn()
    // getStandardDeduction()
    // payTaxes()
    // then print a blank line
    public void collectTaxes()
    {
        for (TaxPayer i : taxPayers) {
            i.fileReturn();
            double deduction = i.getStandardDeduction();
            System.out.println("Deduction amount is " + deduction);
            i.payTaxes();
            System.out.println();
        }
    }

    // helper method to add a Taxpayer to the array
    public void register(TaxPayer payer)
    {
        taxPayers.add(payer);
    }
}