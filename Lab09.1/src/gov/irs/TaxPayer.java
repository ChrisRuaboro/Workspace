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
 * TaxPayer is our simple interface for working with interfaces.
 */

public interface TaxPayer
{
    public void payTaxes();
    default public double getStandardDeduction()
    {
        return 7500.0;
    }
    default public void fileReturn()
    {
        System.out.println("File returned by US Mail");
    }
}