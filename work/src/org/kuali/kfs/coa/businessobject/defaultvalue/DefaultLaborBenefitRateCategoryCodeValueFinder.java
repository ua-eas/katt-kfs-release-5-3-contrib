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
package org.kuali.kfs.coa.businessobject.defaultvalue;

import org.kuali.kfs.coa.businessobject.Account;
import org.kuali.kfs.sys.KFSParameterKeyConstants;
import org.kuali.kfs.sys.context.SpringContext;
import org.kuali.rice.coreservice.framework.parameter.ParameterService;
import org.kuali.rice.krad.valuefinder.ValueFinder;

public class DefaultLaborBenefitRateCategoryCodeValueFinder implements ValueFinder {

    @Override
    public String getValue() {
        String defaultValue = "";
        ParameterService parameterService = SpringContext.getBean(ParameterService.class);
        
        //make sure the parameter exists
        if(parameterService.parameterExists(Account.class, KFSParameterKeyConstants.LdParameterConstants.DEFAULT_BENEFIT_RATE_CATEGORY_CODE)){
            defaultValue = parameterService.getParameterValueAsString(Account.class, KFSParameterKeyConstants.LdParameterConstants.DEFAULT_BENEFIT_RATE_CATEGORY_CODE);
        }
        
        return defaultValue;
    }

}
