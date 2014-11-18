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
package org.kuali.kfs.coa.service;

import org.kuali.kfs.coa.businessobject.A21SubAccount;

/**
 * 
 * This interface defines the methods for retrieving fully populated A21SubAccount objects
 */
public interface A21SubAccountService {
    
    /**
     * 
     * This retrieves an A21SubAccount by its primary keys of chart of accounts code, account number and 
     * sub account number
     * @param chartOfAccountsCode
     * @param accountNumber
     * @param subAccountNumber
     * @return the A21SubAccount that matches this primary key
     */
    public A21SubAccount getByPrimaryKey(String chartOfAccountsCode, String accountNumber, String subAccountNumber);
    
    /**
     * build a CG ICR account
     * @param chartOfAccountsCode the given chart of account
     * @param accountNumber the given account number
     * @param subAccountNumber the given sub account number
     * @param subAccountTypeCode the type of the CG ICR account
     * @return a CG ICR account built from the given information
     */
    public A21SubAccount buildCgIcrAccount(String chartOfAccountsCode, String accountNumber, String subAccountNumber, String subAccountTypeCode);
    
    /**
     * populate the a21 sub account with the given account
     * 
     * @param a21SubAccount the a21 sub account needed to be populated
     * @param chartOfAccountsCode the given chart of account
     * @param accountNumber the given account number
     */
    public void populateCgIcrAccount(A21SubAccount a21SubAccount, String chartOfAccountsCode, String accountNumber);
}
