package com.company.service.validation.impl;

import com.company.service.validation.CriteriaValidator;

public class WeightValidator implements CriteriaValidator {
    private final static double MIN_WEIGHT = 0.0;

    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > MIN_WEIGHT;
        } else {
            return false;
        }
    }
}
