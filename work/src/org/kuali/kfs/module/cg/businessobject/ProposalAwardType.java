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

package org.kuali.kfs.module.cg.businessobject;

import java.util.LinkedHashMap;

import org.kuali.rice.core.api.mo.common.active.MutableInactivatable;
import org.kuali.rice.krad.bo.PersistableBusinessObjectBase;

/**
 * The type of {@link Award} associated with a {@link Proposal} instance.
 */
public class ProposalAwardType extends PersistableBusinessObjectBase implements MutableInactivatable {

    private String proposalAwardTypeCode;
    private String proposalAwardTypeDescription;
    private boolean active;

    /**
     * Default constructor.
     */
    public ProposalAwardType() {
    }

    /**
     * Gets the proposalAwardTypeCode attribute.
     * 
     * @return Returns the proposalAwardTypeCode
     */
    public String getProposalAwardTypeCode() {
        return proposalAwardTypeCode;
    }

    /**
     * Sets the proposalAwardTypeCode attribute.
     * 
     * @param proposalAwardTypeCode The proposalAwardTypeCode to set.
     */
    public void setProposalAwardTypeCode(String proposalAwardTypeCode) {
        this.proposalAwardTypeCode = proposalAwardTypeCode;
    }


    /**
     * Gets the proposalAwardTypeDescription attribute.
     * 
     * @return Returns the proposalAwardTypeDescription
     */
    public String getProposalAwardTypeDescription() {
        return proposalAwardTypeDescription;
    }

    /**
     * Sets the proposalAwardTypeDescription attribute.
     * 
     * @param proposalAwardTypeDescription The proposalAwardTypeDescription to set.
     */
    public void setProposalAwardTypeDescription(String proposalAwardTypeDescription) {
        this.proposalAwardTypeDescription = proposalAwardTypeDescription;
    }

    /**
     * Gets the active attribute.
     * 
     * @return Returns the active.
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the active attribute value.
     * 
     * @param active The active to set.
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @see org.kuali.rice.krad.bo.BusinessObjectBase#toStringMapper()
     */
    protected LinkedHashMap toStringMapper_RICE20_REFACTORME() {
        LinkedHashMap m = new LinkedHashMap();
        m.put("proposalAwardTypeCode", this.proposalAwardTypeCode);
        return m;
    }
}
