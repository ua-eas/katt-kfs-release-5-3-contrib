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
package org.kuali.kfs.module.purap.businessobject.options;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.kuali.kfs.module.purap.businessobject.CapitalAssetSystemState;
import org.kuali.kfs.sys.context.SpringContext;
import org.kuali.rice.core.api.util.ConcreteKeyValue;
import org.kuali.rice.krad.keyvalues.KeyValuesBase;
import org.kuali.rice.krad.service.KeyValuesService;

/**
 * Values finder for CapitalAssetSystemStates
 */
public class CapitalAssetSystemStateValuesFinder extends KeyValuesBase {

    /**
     * Returns code/description pairs of all CapitalAssetSystemStates.
     * 
     * @see org.kuali.rice.kns.lookup.keyvalues.KeyValuesFinder#getKeyValues()
     */
    public List getKeyValues() {
        KeyValuesService boService = SpringContext.getBean(KeyValuesService.class);
        Collection types = boService.findAll(CapitalAssetSystemState.class);
        List labels = new ArrayList();
        labels.add(new ConcreteKeyValue("", ""));
        for (Object type : types) {
            CapitalAssetSystemState camsSystemState = (CapitalAssetSystemState)type;           
            labels.add(new ConcreteKeyValue(camsSystemState.getCapitalAssetSystemStateCode(), camsSystemState.getCapitalAssetSystemStateDescription()));
        }

        return labels;
    }

}
