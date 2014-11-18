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
package org.kuali.kfs.fp.batch;

import java.util.Date;

import org.kuali.kfs.fp.service.PopulateProcurementCardDefaultIdsService;
import org.kuali.kfs.sys.batch.AbstractStep;

/**
 * Step which populates all procurement card default records which don't have ids with id's
 */
public class PopulateProcurementCardDefaultIdStep extends AbstractStep {
    protected PopulateProcurementCardDefaultIdsService populateProcurementCardDefaultIdsService;

    @Override
    public boolean execute(String jobName, Date jobRunDate) throws InterruptedException {
        getPopulateProcurementCardDefaultIdsService().populateIdsOnProcurementCardDefaults();
        return true;
    }

    public PopulateProcurementCardDefaultIdsService getPopulateProcurementCardDefaultIdsService() {
        return populateProcurementCardDefaultIdsService;
    }

    public void setPopulateProcurementCardDefaultIdsService(PopulateProcurementCardDefaultIdsService populateProcurementCardDefaultIdsService) {
        this.populateProcurementCardDefaultIdsService = populateProcurementCardDefaultIdsService;
    }
}
