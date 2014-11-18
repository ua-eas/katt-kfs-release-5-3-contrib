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
package org.kuali.kfs.pdp.businessobject.options;

import java.util.ArrayList;
import java.util.List;

import org.kuali.kfs.pdp.PdpConstants;
import org.kuali.rice.core.api.util.ConcreteKeyValue;
import org.kuali.rice.krad.keyvalues.KeyValuesBase;

/**
 * returns valid effort reporting fiscal periods 1 - 12
 */
public class AchBankTypeCodeValuesFinder extends KeyValuesBase {

    /*
     * @see org.kuali.keyvalues.KeyValuesFinder#getKeyValues()
     */
    public List getKeyValues() {
        List keyValues = new ArrayList();
        
        keyValues.add(new ConcreteKeyValue(PdpConstants.AchBankTypeCodes.AchBankTypeCode_0, PdpConstants.AchBankTypeCodes.AchBankTypeCode_0));
        keyValues.add(new ConcreteKeyValue(PdpConstants.AchBankTypeCodes.AchBankTypeCode_1, PdpConstants.AchBankTypeCodes.AchBankTypeCode_1));
        keyValues.add(new ConcreteKeyValue(PdpConstants.AchBankTypeCodes.AchBankTypeCode_2, PdpConstants.AchBankTypeCodes.AchBankTypeCode_2));
        
        return keyValues;
    }
}
