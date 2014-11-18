/*
 * The Kuali Financial System, a comprehensive financial management system for higher education.
 * 
 * Copyright 2005-2014 The Kuali Foundation
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.kuali.kfs.vnd.document.validation.impl;

import org.kuali.kfs.sys.KFSPropertyConstants;
import org.kuali.kfs.sys.context.SpringContext;
import org.kuali.kfs.sys.service.PostalCodeValidationService;
import org.kuali.kfs.vnd.VendorPropertyConstants;
import org.kuali.kfs.vnd.businessobject.CampusParameter;
import org.kuali.rice.kns.document.MaintenanceDocument;
import org.kuali.rice.kns.maintenance.rules.MaintenanceDocumentRuleBase;
import org.kuali.rice.krad.util.GlobalVariables;

public class CampusParameterRule extends MaintenanceDocumentRuleBase {

    protected boolean processCustomApproveDocumentBusinessRules(MaintenanceDocument document) {
        LOG.info("processCustomApproveDocumentBusinessRules called");
        this.setupConvenienceObjects();
        boolean success = this.validateAddress(document);
        return success && super.processCustomApproveDocumentBusinessRules(document);
    }

    protected boolean processCustomRouteDocumentBusinessRules(MaintenanceDocument document) {
        LOG.info("processCustomRouteDocumentBusinessRules called");
        this.setupConvenienceObjects();
        boolean success = this.validateAddress(document);
        return success && super.processCustomRouteDocumentBusinessRules(document);
    }

    protected boolean validateAddress(MaintenanceDocument document) {
        CampusParameter newCampusParameter = (CampusParameter) document.getNewMaintainableObject().getBusinessObject();
        GlobalVariables.getMessageMap().clearErrorPath();
        GlobalVariables.getMessageMap().addToErrorPath(KFSPropertyConstants.DOCUMENT + "." + KFSPropertyConstants.NEW_MAINTAINABLE_OBJECT);
        boolean valid = SpringContext.getBean(PostalCodeValidationService.class).validateAddress(newCampusParameter.getPurchasingDepartmentCountryCode(), newCampusParameter.getPurchasingDepartmentStateCode(), newCampusParameter.getPurchasingDepartmentZipCode(), VendorPropertyConstants.PURCHASING_DEPARTMENT_STATE, VendorPropertyConstants.PURCHASING_DEPARTMENT_POSTAL_CODE);
		GlobalVariables.getMessageMap().clearErrorPath();
        return valid;
    }

}
