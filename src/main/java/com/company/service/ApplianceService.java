package com.company.service;

import com.company.entity.Appliance;
import com.company.entity.criteria.Criteria;
import com.company.dao.DaoException;
import com.company.entity.criteria.SearchCriteria;

import java.util.List;

public interface ApplianceService {

    List<Appliance> find(Criteria criteria) throws DaoException, ServiceException;

    boolean add(String applianceName, Appliance appliance) throws DaoException, ServiceException;

}
