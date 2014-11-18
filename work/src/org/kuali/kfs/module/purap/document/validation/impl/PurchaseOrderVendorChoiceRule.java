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
package org.kuali.kfs.module.purap.document.validation.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.kuali.kfs.module.purap.PurapParameterConstants;
import org.kuali.kfs.module.purap.businessobject.PurchaseOrderVendorChoice;
import org.kuali.kfs.module.purap.document.PurchaseOrderDocument;
import org.kuali.kfs.sys.KFSKeyConstants;
import org.kuali.kfs.sys.context.SpringContext;
import org.kuali.rice.coreservice.framework.parameter.ParameterService;
import org.kuali.rice.kns.document.MaintenanceDocument;
import org.kuali.rice.kns.maintenance.rules.MaintenanceDocumentRuleBase;
import org.kuali.rice.kns.service.DataDictionaryService;

/* 
 * 
*/
public class PurchaseOrderVendorChoiceRule extends MaintenanceDocumentRuleBase {

    protected boolean processCustomApproveDocumentBusinessRules(MaintenanceDocument document) {
        LOG.info("processCustomApproveDocumentBusinessRules called");
        this.setupConvenienceObjects();
        boolean success = this.checkForSystemParametersExistence();
        return success && super.processCustomApproveDocumentBusinessRules(document);
    }

    protected boolean processCustomRouteDocumentBusinessRules(MaintenanceDocument document) {
        LOG.info("processCustomRouteDocumentBusinessRules called");
        this.setupConvenienceObjects();
        boolean success = this.checkForSystemParametersExistence();
        return success && super.processCustomRouteDocumentBusinessRules(document);
    }

    protected boolean processCustomSaveDocumentBusinessRules(MaintenanceDocument document) {
        LOG.info("processCustomSaveDocumentBusinessRules called");
        this.setupConvenienceObjects();
        boolean success = this.checkForSystemParametersExistence();
        return success && super.processCustomSaveDocumentBusinessRules(document);
    }

    protected boolean checkForSystemParametersExistence() {
        LOG.info("checkForSystemParametersExistence called");
        boolean success = true;
        Collection<String> apoParameterValues = new ArrayList<String>( SpringContext.getBean(ParameterService.class).getParameterValuesAsString(PurchaseOrderDocument.class, PurapParameterConstants.DEFAULT_APO_VENDOR_CHOICE) );
        Collection<String> b2bParameterValues = new ArrayList<String>( SpringContext.getBean(ParameterService.class).getParameterValuesAsString(PurchaseOrderDocument.class, PurapParameterConstants.DEFAULT_B2B_VENDOR_CHOICE) );
        PurchaseOrderVendorChoice newVendorChoice = (PurchaseOrderVendorChoice)getNewBo();
        PurchaseOrderVendorChoice oldVendorChoice= (PurchaseOrderVendorChoice)getOldBo();
        //If the new funding source code matches with the funding source in the DEFAULT_FUNDING_SOURCE 
        //system parameters then we can't inactivate this funding source, so return false.
        if ((apoParameterValues.contains(newVendorChoice.getPurchaseOrderVendorChoiceCode()) || b2bParameterValues.contains(newVendorChoice.getPurchaseOrderVendorChoiceCode())) && ! newVendorChoice.isActive() && oldVendorChoice.isActive()) {
            success = false;
            String documentLabel = SpringContext.getBean(DataDictionaryService.class).getDocumentLabelByClass(newVendorChoice.getClass());
            putGlobalError(KFSKeyConstants.ERROR_CANNOT_INACTIVATE_USED_IN_SYSTEM_PARAMETERS, documentLabel);
        }
        return success;
    }
}
