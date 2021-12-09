package com.company.service.validation.impl;

import com.company.entity.BagType;
import com.company.service.validation.CriteriaValidator;

public class BagTypeValidator implements CriteriaValidator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            BagType.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
