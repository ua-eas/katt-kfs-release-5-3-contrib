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
package org.kuali.kfs.module.cam.businessobject.defaultvalue;

import java.util.ArrayList;
import java.util.List;

import org.kuali.kfs.module.cam.businessobject.AssetAcquisitionType;
import org.kuali.kfs.sys.context.SpringContext;
import org.kuali.rice.core.api.util.ConcreteKeyValue;
import org.kuali.rice.core.api.util.KeyValue;
import org.kuali.rice.krad.keyvalues.KeyValuesBase;
import org.kuali.rice.krad.service.KeyValuesService;

public class AssetAquisitionTypeValuesFinder extends KeyValuesBase {
    public List<KeyValue> getKeyValues() {
        List<AssetAcquisitionType> aquisitionTypes = (List<AssetAcquisitionType>) SpringContext.getBean(KeyValuesService.class).findAll(AssetAcquisitionType.class);
        // copy the list of codes before sorting, since we can't modify the results from this method
        if ( aquisitionTypes == null ) {
            aquisitionTypes = new ArrayList<AssetAcquisitionType>(0);
        } else {
            aquisitionTypes = new ArrayList<AssetAcquisitionType>(aquisitionTypes);
        }

        List<KeyValue> labels = new ArrayList<KeyValue>();
        labels.add(new ConcreteKeyValue("", ""));

        for (AssetAcquisitionType acquisitionType : aquisitionTypes) {
            if(acquisitionType.isActive()) {
                labels.add(new ConcreteKeyValue(acquisitionType.getAcquisitionTypeCode(), acquisitionType.getAcquisitionTypeName()));
            }
        }

        return labels;
    }

}
