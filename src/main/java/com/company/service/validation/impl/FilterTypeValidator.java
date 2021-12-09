package com.company.service.validation.impl;

import com.company.entity.FilterType;
import com.company.service.validation.CriteriaValidator;


public class FilterTypeValidator implements CriteriaValidator {

    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            FilterType.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
