package com.hr.corp;

import gov.irs.TaxPayer;

public class Corporation implements TaxPayer
{
    @Override
    public void payTaxes()
    {
        System.out.println("Corporation paid no taxes, we lobbied very hard");
    }

    @Override
    public void fileReturn()
    {
        System.out.println("Returned not filed at all, we sent our lawyers instead");
    }
}
