package com.company.service.validation.impl;

import com.company.entity.OS;
import com.company.service.validation.CriteriaValidator;

public class OSValidator implements CriteriaValidator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            OS.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
