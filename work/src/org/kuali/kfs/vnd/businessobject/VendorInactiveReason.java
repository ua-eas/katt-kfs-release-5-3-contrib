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

package org.kuali.kfs.vnd.businessobject;

import java.util.LinkedHashMap;

import org.kuali.rice.core.api.mo.common.active.MutableInactivatable;
import org.kuali.rice.krad.bo.PersistableBusinessObjectBase;

/**
 * Possible reasons why a Vendor may become inactivated.
 */
public class VendorInactiveReason extends PersistableBusinessObjectBase implements MutableInactivatable{

    private String vendorInactiveReasonCode;
    private String vendorInactiveReasonDescription;
    private boolean active;

    /**
     * Default constructor.
     */
    public VendorInactiveReason() {

    }

    public String getVendorInactiveReasonCode() {

        return vendorInactiveReasonCode;
    }

    public void setVendorInactiveReasonCode(String vendorInactiveReasonCode) {
        this.vendorInactiveReasonCode = vendorInactiveReasonCode;
    }

    public String getVendorInactiveReasonDescription() {

        return vendorInactiveReasonDescription;
    }

    public void setVendorInactiveReasonDescription(String vendorInactiveReasonDescription) {
        this.vendorInactiveReasonDescription = vendorInactiveReasonDescription;
    }

    public boolean isActive() {

        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @see org.kuali.rice.krad.bo.BusinessObjectBase#toStringMapper()
     */
    protected LinkedHashMap toStringMapper_RICE20_REFACTORME() {
        LinkedHashMap m = new LinkedHashMap();
        m.put("vendorInactiveReasonCode", this.vendorInactiveReasonCode);

        return m;
    }
}
