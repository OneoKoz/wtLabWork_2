package com.company.service.validation.impl;

import com.company.dao.constant.ApplianceTagName;
import com.company.service.validation.CriteriaValidator;


public class ApplianceNameValidator implements CriteriaValidator {


    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            ApplianceTagName.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }
}
