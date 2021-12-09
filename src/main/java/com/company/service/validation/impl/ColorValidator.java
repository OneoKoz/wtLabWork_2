package com.company.service.validation.impl;

import com.company.entity.Color;
import com.company.service.validation.CriteriaValidator;

public class ColorValidator implements CriteriaValidator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            Color.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
