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
package org.kuali.kfs.gl.batch;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.kuali.kfs.coa.service.ChartService;
import org.kuali.kfs.gl.service.SufficientFundsService;
import org.kuali.kfs.sys.KFSConstants;
import org.kuali.kfs.sys.batch.AbstractStep;

/**
 * A step to remove old sufficient funds balances from the database.
 */
public class PurgeSufficientFundBalancesStep extends AbstractStep {
    private static org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(PurgeSufficientFundBalancesStep.class);
    private ChartService chartService;
    private SufficientFundsService sufficientFundsService;

    /**
     * This step will purge data from the gl_sf_balances_t table older than a specified year. It purges the data one chart at a time
     * each within their own transaction so database transaction logs don't get completely filled up when doing this. This step
     * class should NOT be transactional.
     * 
     * @param jobName the name of the job this step is being run as part of
     * @param jobRunDate the time/date the job was started
     * @return true if the job completed successfully, false if otherwise
     * @see org.kuali.kfs.sys.batch.Step#execute(String, Date)
     */
    public boolean execute(String jobName, Date jobRunDate) {
        String yearStr = getParameterService().getParameterValueAsString(PurgeSufficientFundBalancesStep.class, KFSConstants.SystemGroupParameterNames.PURGE_GL_SF_BALANCES_T_BEFORE_YEAR);
        LOG.info("PurgeSufficientFundBalancesStep was run with year = "+yearStr);
        int year = Integer.parseInt(yearStr);
        List charts = chartService.getAllChartCodes();
        for (Iterator iter = charts.iterator(); iter.hasNext();) {
            String chart = (String) iter.next();
            sufficientFundsService.purgeYearByChart(chart, year);
        }
        return true;
    }

    /**
     * Sets the sufficientFundsService attribute, allowing the injection of an implementation of the service.
     * 
     * @param sufficientFundsService the sufficientFundsService implementation to set
     * @see org.kuali.kfs.gl.service.SufficientFundsService
     */
    public void setSufficientFundsService(SufficientFundsService sufficientFundsService) {
        this.sufficientFundsService = sufficientFundsService;
    }

    /**
     * Sets the chartService attribute, allowing the injection of an implementation of the service.
     * 
     * @param chartService the chartService implementation to set
     * @see org.kuali.kfs.coa.service.ChartService
     */
    public void setChartService(ChartService chartService) {
        this.chartService = chartService;
    }
}
