package com.company.service.validation.impl;

import com.company.entity.CPU;
import com.company.service.validation.CriteriaValidator;

public class CPUValidator implements CriteriaValidator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            CPU.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
