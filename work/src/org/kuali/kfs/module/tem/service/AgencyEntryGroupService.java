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
package org.kuali.kfs.module.tem.service;

import java.io.File;

public interface AgencyEntryGroupService {
    /**
     * Create the backup group which has all the entries from all the groups where all the flags are set Y.
     */
    public void createBackupGroup();
    
    public File createGroup(String fileName);

    public boolean getGroupExists(String groupId);
    
    public String getNewestAgencyMatchingErrorFileName();
    
    public File[] getAllFileInBatchDirectory();
    
    public File getFileWithFileName(String fileName);
    
    public void deleteFile(String fileName);

}
