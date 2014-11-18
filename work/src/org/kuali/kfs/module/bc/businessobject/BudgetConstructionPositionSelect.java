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

package org.kuali.kfs.module.bc.businessobject;

import java.util.LinkedHashMap;

import org.kuali.rice.krad.bo.PersistableBusinessObjectBase;

public class BudgetConstructionPositionSelect extends PersistableBusinessObjectBase {

    private String principalId;
    private String positionNumber;
    private Integer universityFiscalYear;
    private String emplid;
    private String iuPositionType;
    private String positionDepartmentIdentifier;
    private String setidSalary;
    private String salaryAdministrationPlan;
    private String grade;
    private String positionDescription;
    private String name;

    private BudgetConstructionPosition budgetConstructionPosition;

    /**
     * Default constructor.
     */
    public BudgetConstructionPositionSelect() {
        super();
    }

    /**
     * Gets the principalId attribute.
     * 
     * @return Returns the principalId
     */
    public String getPrincipalId() {
        return principalId;
    }

    /**
     * Sets the principalId attribute.
     * 
     * @param principalId The principalId to set.
     */
    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }


    /**
     * Gets the positionNumber attribute.
     * 
     * @return Returns the positionNumber
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /**
     * Sets the positionNumber attribute.
     * 
     * @param positionNumber The positionNumber to set.
     */
    public void setPositionNumber(String positionNumber) {
        this.positionNumber = positionNumber;
    }


    /**
     * Gets the universityFiscalYear attribute.
     * 
     * @return Returns the universityFiscalYear
     */
    public Integer getUniversityFiscalYear() {
        return universityFiscalYear;
    }

    /**
     * Sets the universityFiscalYear attribute.
     * 
     * @param universityFiscalYear The universityFiscalYear to set.
     */
    public void setUniversityFiscalYear(Integer universityFiscalYear) {
        this.universityFiscalYear = universityFiscalYear;
    }


    /**
     * Gets the emplid attribute.
     * 
     * @return Returns the emplid
     */
    public String getEmplid() {
        return emplid;
    }

    /**
     * Sets the emplid attribute.
     * 
     * @param emplid The emplid to set.
     */
    public void setEmplid(String emplid) {
        this.emplid = emplid;
    }


    /**
     * Gets the iuPositionType attribute.
     * 
     * @return Returns the iuPositionType
     */
    public String getIuPositionType() {
        return iuPositionType;
    }

    /**
     * Sets the iuPositionType attribute.
     * 
     * @param iuPositionType The iuPositionType to set.
     */
    public void setIuPositionType(String iuPositionType) {
        this.iuPositionType = iuPositionType;
    }


    /**
     * Gets the positionDepartmentIdentifier attribute.
     * 
     * @return Returns the positionDepartmentIdentifier
     */
    public String getPositionDepartmentIdentifier() {
        return positionDepartmentIdentifier;
    }

    /**
     * Sets the positionDepartmentIdentifier attribute.
     * 
     * @param positionDepartmentIdentifier The positionDepartmentIdentifier to set.
     */
    public void setPositionDepartmentIdentifier(String positionDepartmentIdentifier) {
        this.positionDepartmentIdentifier = positionDepartmentIdentifier;
    }


    /**
     * Gets the setidSalary attribute.
     * 
     * @return Returns the setidSalary
     */
    public String getSetidSalary() {
        return setidSalary;
    }

    /**
     * Sets the setidSalary attribute.
     * 
     * @param setidSalary The setidSalary to set.
     */
    public void setSetidSalary(String setidSalary) {
        this.setidSalary = setidSalary;
    }


    /**
     * Gets the salaryAdministrationPlan attribute.
     * 
     * @return Returns the salaryAdministrationPlan
     */
    public String getSalaryAdministrationPlan() {
        return salaryAdministrationPlan;
    }

    /**
     * Sets the salaryAdministrationPlan attribute.
     * 
     * @param salaryAdministrationPlan The salaryAdministrationPlan to set.
     */
    public void setSalaryAdministrationPlan(String salaryAdministrationPlan) {
        this.salaryAdministrationPlan = salaryAdministrationPlan;
    }


    /**
     * Gets the grade attribute.
     * 
     * @return Returns the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets the grade attribute.
     * 
     * @param grade The grade to set.
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }


    /**
     * Gets the positionDescription attribute.
     * 
     * @return Returns the positionDescription
     */
    public String getPositionDescription() {
        return positionDescription;
    }

    /**
     * Sets the positionDescription attribute.
     * 
     * @param positionDescription The positionDescription to set.
     */
    public void setPositionDescription(String positionDescription) {
        this.positionDescription = positionDescription;
    }


    /**
     * Gets the name attribute.
     * 
     * @return Returns the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name attribute.
     * 
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the budgetConstructionPosition attribute.
     * 
     * @return Returns the budgetConstructionPosition
     */
    public BudgetConstructionPosition getBudgetConstructionPosition() {
        return budgetConstructionPosition;
    }

    /**
     * Sets the budgetConstructionPosition attribute.
     * 
     * @param budgetConstructionPosition The budgetConstructionPosition to set.
     * @deprecated
     */
    public void setBudgetConstructionPosition(BudgetConstructionPosition budgetConstructionPosition) {
        this.budgetConstructionPosition = budgetConstructionPosition;
    }

    /**
     * @see org.kuali.rice.krad.bo.BusinessObjectBase#toStringMapper()
     */
    protected LinkedHashMap toStringMapper_RICE20_REFACTORME() {
        LinkedHashMap m = new LinkedHashMap();
        m.put("principalId", this.principalId);
        m.put("positionNumber", this.positionNumber);
        if (this.universityFiscalYear != null) {
            m.put("universityFiscalYear", this.universityFiscalYear.toString());
        }
        m.put("emplid", this.emplid);
        return m;
    }
}

