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
package org.kuali.kfs.module.ar.document.validation.impl;

import org.kuali.kfs.module.ar.ArKeyConstants;
import org.kuali.kfs.module.ar.ArPropertyConstants;
import org.kuali.kfs.module.ar.document.CustomerCreditMemoDocument;
import org.kuali.kfs.module.ar.document.service.CustomerCreditMemoDocumentService;
import org.kuali.kfs.sys.document.validation.GenericValidation;
import org.kuali.kfs.sys.document.validation.event.AttributedDocumentEvent;
import org.kuali.rice.krad.util.GlobalVariables;

public class CustomerCreditMemoNoDataToSubmitValidation extends GenericValidation {

    private CustomerCreditMemoDocument customerCreditMemoDocument;
    private CustomerCreditMemoDocumentService customerCreditMemoDocumentService;
    
    public boolean validate(AttributedDocumentEvent event) {
    
        if (customerCreditMemoDocumentService.isThereNoDataToSubmit(customerCreditMemoDocument)) {
            GlobalVariables.getMessageMap().putError(ArPropertyConstants.CustomerCreditMemoDocumentFields.CREDIT_MEMO_ITEM_TOTAL_AMOUNT, ArKeyConstants.ERROR_CUSTOMER_CREDIT_MEMO_DOCUMENT_NO_DATA_TO_SUBMIT);
            return false;
        }
        return true;
    }

    public CustomerCreditMemoDocument getCustomerCreditMemoDocument() {
        return customerCreditMemoDocument;
    }

    public void setCustomerCreditMemoDocument(CustomerCreditMemoDocument customerCreditMemoDocument) {
        this.customerCreditMemoDocument = customerCreditMemoDocument;
    }

    public CustomerCreditMemoDocumentService getCustomerCreditMemoDocumentService() {
        return customerCreditMemoDocumentService;
    }

    public void setCustomerCreditMemoDocumentService(CustomerCreditMemoDocumentService customerCreditMemoDocumentService) {
        this.customerCreditMemoDocumentService = customerCreditMemoDocumentService;
    }    
    
}
