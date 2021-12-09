package com.company.dao;

import com.company.entity.Appliance;
import com.company.entity.criteria.Criteria;
import com.company.entity.criteria.SearchCriteria;

import java.util.List;

public interface ApplianceDAO {

    List<Appliance> find(Criteria criteria) throws DaoException;

    boolean add(String applianceName, Appliance appliance) throws DaoException;
}
