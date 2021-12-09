package com.company.service.validation.impl;

import com.company.entity.WandType;
import com.company.service.validation.CriteriaValidator;

public class WandTypeValidator implements CriteriaValidator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            WandType.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
