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
package org.kuali.kfs.integration.ld;

import org.kuali.rice.krad.bo.ExternalizableBusinessObject;

/**
 * BO for the Labor Benefit Rate Category Fringe Benefit
 *
 * @author Allan Sonkin
 */
public interface LaborBenefitRateCategory extends  ExternalizableBusinessObject {


    /**
     * Getter method to get the laborBenefitRateCategoryCode
     * @return laborBenefitRateCategoryCode
     */
	public String getLaborBenefitRateCategoryCode();

    /**
     *
     * Method to set the code
     * @param code
     */
    public void setLaborBenefitRateCategoryCode(String laborBenefitRateCategoryCode);

    /**
     *
     * Getter method for the code's description
     * @return codeDesc
     */
    public String getCodeDesc();

    /**
	 *
	 * Sets the codeDesc
	 * @param codeDesc
	 */
    public void setCodeDesc(String codeDesc);

}
