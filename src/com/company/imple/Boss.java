package com.company.imple;

import com.company.interfa.Company;

public class Boss implements Company {

    @Override
    public void work() {
        System.out.println("老板在开会");
    }
}
