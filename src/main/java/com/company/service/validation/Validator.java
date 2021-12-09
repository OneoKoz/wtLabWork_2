package com.company.service.validation;

import com.company.entity.criteria.Criteria;
import com.company.entity.criteria.SearchCriteria;

public class Validator {

    public static boolean isCriteriaValid(Criteria criteria) {
        if (criteria == null) {
            return false;
        }

        return criteria.getCriteriaMap().entrySet().stream().allMatch(
                entry -> CriteriaValidatorFactory.getInstance()
                        .getValidator(entry.getKey())
                        .isCriteriaValid(entry.getValue()));
    }

}