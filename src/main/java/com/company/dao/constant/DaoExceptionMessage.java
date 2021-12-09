package com.company.dao.constant;

public enum DaoExceptionMessage {
    ILLEGAL_ARGUMENT_APPLIANCE_FACTORY_EXCEPTION_MSG("No such appliance factory exists.");

    private final String message;

    private DaoExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
