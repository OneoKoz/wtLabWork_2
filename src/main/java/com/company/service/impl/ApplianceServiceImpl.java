package com.company.service.impl;

import com.company.dao.ApplianceDAO;
import com.company.dao.DAOFactory;
import com.company.entity.Appliance;
import com.company.dao.impl.ApplianceDAOImpl;
import com.company.entity.criteria.Criteria;
import com.company.dao.DaoException;
import com.company.service.ServiceException;
import com.company.service.ApplianceService;
import com.company.service.constant.ServiceExceptionMessage;
import com.company.service.validation.Validator;

import java.util.List;


public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {
        if (!Validator.isCriteriaValid(criteria)) {
            throw new ServiceException(ServiceExceptionMessage.INVALID_CRITERIA_EXCEPTION_MSG.getMessage());
        }

        List<Appliance> appliances;
        try {
            DAOFactory factory = DAOFactory.getInstance();
            ApplianceDAO applianceDAO = factory.getApplianceDAO();
            appliances = applianceDAO.find(criteria);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
        return appliances;
    }


    @Override
    public boolean add(String applianceName, Appliance appliance) throws DaoException, ServiceException {
        if (applianceName.isEmpty() || appliance == null) {
            throw new ServiceException(ServiceExceptionMessage.INVALID_CRITERIA_EXCEPTION_MSG.getMessage());
        }

        boolean isApplianceAdded;
        try {
            DAOFactory factory = DAOFactory.getInstance();
            ApplianceDAO applianceDAO = factory.getApplianceDAO();
            isApplianceAdded = applianceDAO.add(applianceName, appliance);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
        return isApplianceAdded;
    }

}
