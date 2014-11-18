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
package org.kuali.kfs.module.tem.businessobject.defaultvalue;

import org.kuali.kfs.module.tem.businessobject.AgencyStagingData;
import org.kuali.kfs.sys.businessobject.defaultvalue.SequenceValueFinder;
import org.kuali.rice.krad.bo.PersistableBusinessObject;

public class NextAgencyStagingDataIdFinder extends SequenceValueFinder {
    public static final String AGENCY_STAGING_DATA_SEQUENCE_NAME = "TEM_AGENCY_STAGING_ID_SEQ";

    @Override
    public String getSequenceName() {
        return AGENCY_STAGING_DATA_SEQUENCE_NAME;
    }

    @Override
    public Class<? extends PersistableBusinessObject> getAssociatedClass() {
        return AgencyStagingData.class;
    }

}
