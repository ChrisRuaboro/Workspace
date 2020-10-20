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

public class IRS
{
    // INSTANCE VARIABLES
    private TaxPayer[] payers = new TaxPayer[100];
    private int currentIndex = 0;  // for dealing with array

    // BEHAVIORAL METHODS
    // For each TaxPayer we get them to :
    // fileReturn()
    // getStandardDeduction()
    // payTaxes()
    // then print a blank line
    public void collectTaxes()
    {
        for (int i = 0; i < currentIndex; i++) {
            payers[i].getStandardDeduction();
            payers[i].fileReturn();
            payers[i].payTaxes();
            System.out.println();
        }
    }

    // helper method to add a Taxpayer to the array
    public void register(TaxPayer payer)
    {
        payers[currentIndex++] = payer;
    }
}