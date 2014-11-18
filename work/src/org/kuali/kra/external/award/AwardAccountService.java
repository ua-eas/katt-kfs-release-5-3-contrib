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
package org.kuali.kra.external.award;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.kuali.kfs.module.external.kc.KcConstants;
import org.kuali.kfs.module.external.kc.businessobject.AwardAccountDTO;

@WebService(targetNamespace = KcConstants.KC_NAMESPACE_URI, name = KcConstants.AwardAccount.SOAP_SERVICE_NAME)
public interface AwardAccountService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAwardAccounts", targetNamespace = KcConstants.KC_NAMESPACE_URI, className = "kc.GetAwardAccounts")
    @WebMethod
    @ResponseWrapper(localName = "getAwardAccountsResponse", targetNamespace = KcConstants.KC_NAMESPACE_URI, className = "kc.GetAwardAccountsResponse")
    public java.util.List<AwardAccountDTO> getAwardAccounts(
        @WebParam(name = "financialAccountNumber", targetNamespace = "")                
        java.lang.String financialAccountNumber,
        @WebParam(name = "chartOfAccounts", targetNamespace = "")
        java.lang.String chartOfAccounts
    );
}
