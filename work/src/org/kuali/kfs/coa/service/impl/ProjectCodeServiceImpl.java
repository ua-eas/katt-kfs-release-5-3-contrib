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
package org.kuali.kfs.coa.service.impl;


import org.kuali.kfs.coa.businessobject.ProjectCode;
import org.kuali.kfs.coa.service.ProjectCodeService;
import org.kuali.kfs.sys.context.SpringContext;
import org.kuali.kfs.sys.service.NonTransactional;
import org.kuali.rice.krad.service.BusinessObjectService;
import org.springframework.cache.annotation.Cacheable;

/**
 * This class is the service implementation for the ProjectCode structure. This is the default implementation, that is delivered
 * with Kuali.
 */

@NonTransactional
public class ProjectCodeServiceImpl implements ProjectCodeService {
    /**
     *
     * @see org.kuali.kfs.coa.service.ProjectCodeService#getByPrimaryId(java.lang.String)
     */
    @Override
    //   KFSMI-2612
    @Cacheable(value=ProjectCode.CACHE_NAME, key="'projectCode='+#p0")
    public ProjectCode getByPrimaryId(String projectCode) {
        return SpringContext.getBean(BusinessObjectService.class).findBySinglePrimaryKey(ProjectCode.class, projectCode);
    }

}
