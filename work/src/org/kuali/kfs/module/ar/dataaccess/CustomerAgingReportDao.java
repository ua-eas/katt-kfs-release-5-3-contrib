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
package org.kuali.kfs.module.ar.dataaccess;

import java.util.HashMap;

import org.kuali.rice.core.api.util.type.KualiDecimal;

public interface CustomerAgingReportDao {

    // PROCESSING CHART AND ORG METHODS
    
    /**
     * This method generates a database query and retrieves the total of all invoices for the given processing chart and org codes, 
     * which have billing dates within the given date range, for which there is an outstanding balance due.  
     * 
     * @param chart Processing chart code for the invoices being retrieved.
     * @param org Processing org code for the invoices being retrieved.
     * @param begin Beginning date of the date range used to find invoice balances due.
     * @param end Ending date of the date range used to find invoice balances due.
     * @return 
     */
    HashMap<String, KualiDecimal> findInvoiceAmountByProcessingChartAndOrg(String chart, String org, java.sql.Date begin, java.sql.Date end);

    /**
     * 
     * This method...
     * @param chart
     * @param org
     * @param begin
     * @param end
     * @return
     */
    HashMap<String, KualiDecimal> findAppliedAmountByProcessingChartAndOrg(String chart, String org, java.sql.Date begin, java.sql.Date end);

    /**
     * 
     * This method...
     * @param chart
     * @param org
     * @param begin
     * @param end
     * @return
     */
    HashMap<String, KualiDecimal> findDiscountAmountByProcessingChartAndOrg(String chart, String org, java.sql.Date begin, java.sql.Date end);

    // BILLING CHART AND ORG METHODS
    
    /**
     * 
     * This method...
     * @param chart
     * @param org
     * @param begin
     * @param end
     * @return
     */
    HashMap<String, KualiDecimal> findInvoiceAmountByBillingChartAndOrg(String chart, String org, java.sql.Date begin, java.sql.Date end);

    /**
     * 
     * This method...
     * @param chart
     * @param org
     * @param begin
     * @param end
     * @return
     */
    HashMap<String, KualiDecimal> findAppliedAmountByBillingChartAndOrg(String chart, String org, java.sql.Date begin, java.sql.Date end);

    /**
     * 
     * This method...
     * @param chart
     * @param org
     * @param begin
     * @param end
     * @return
     */
    HashMap<String, KualiDecimal> findDiscountAmountByBillingChartAndOrg(String chart, String org, java.sql.Date begin, java.sql.Date end);

    // ACCOUNT METHODS
    
    /**
     * 
     * This method...
     * @param chart
     * @param account
     * @param begin
     * @param end
     * @return
     */
    HashMap<String, KualiDecimal> findInvoiceAmountByAccount(String chart, String account, java.sql.Date begin, java.sql.Date end);

    /**
     * 
     * This method...
     * @param chart
     * @param account
     * @param begin
     * @param end
     * @return
     */
    HashMap<String, KualiDecimal> findAppliedAmountByAccount(String chart, String account, java.sql.Date begin, java.sql.Date end);

    /**
     * 
     * This method...
     * @param chart
     * @param account
     * @param begin
     * @param end
     * @return
     */
    HashMap<String, KualiDecimal> findDiscountAmountByAccount(String chart, String account, java.sql.Date begin, java.sql.Date end);
}
