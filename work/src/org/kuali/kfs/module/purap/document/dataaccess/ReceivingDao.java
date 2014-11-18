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
package org.kuali.kfs.module.purap.document.dataaccess;

import java.util.List;

/**
 * Receiving Line DAO Interface.
 */
public interface ReceivingDao {

    public List<String> getDocumentNumbersByPurchaseOrderId(Integer id);

    public List<String> getCorrectionReceivingDocumentNumbersByPurchaseOrderId(Integer id);
    
    public List<String> getCorrectionReceivingDocumentNumbersByReceivingLineNumber(String receivingDocumentNumber);
    
    public List<String> duplicateVendorDate(Integer poId, java.sql.Date vendorDate);
    
    public List<String> duplicatePackingSlipNumber(Integer poId, String packingSlipNumber);
    
    public List<String> duplicateBillOfLadingNumber(Integer poId, String billOfLadingNumber);
}
