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
package org.kuali.kfs.module.ld.businessobject.options;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.kuali.kfs.gl.GeneralLedgerConstants;
import org.kuali.kfs.module.ld.service.LaborOriginEntryGroupService;
import org.kuali.kfs.sys.context.SpringContext;
import org.kuali.rice.core.api.util.ConcreteKeyValue;
import org.kuali.rice.core.api.util.KeyValue;
import org.kuali.rice.krad.keyvalues.KeyValuesBase;

/**
 * Returns a list of done files in batch origin entry directory
 */
public class ProcessingCorrectionLaborGroupEntriesFinder extends KeyValuesBase {

    /**
     * @see org.kuali.rice.kns.lookup.keyvalues.KeyValuesFinder#getKeyValues()
     */
    public List<KeyValue> getKeyValues() {
        List<KeyValue> activeLabels = new ArrayList<KeyValue>();

        LaborOriginEntryGroupService originEntryGroupService = SpringContext.getBean(LaborOriginEntryGroupService.class);;
        File[] fileList = originEntryGroupService.getAllFileInBatchDirectory();
        if (fileList != null) {
            for (File file : fileList) {
                String fileName = file.getName();
                if (fileName.contains(GeneralLedgerConstants.BatchFileSystem.DONE_FILE_EXTENSION)) {
                    activeLabels.add(new ConcreteKeyValue(fileName, fileName));
                }
            }
        }

        return activeLabels;
    }
}
