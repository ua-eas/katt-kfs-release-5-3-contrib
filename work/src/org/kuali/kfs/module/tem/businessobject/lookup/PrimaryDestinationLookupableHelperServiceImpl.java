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
package org.kuali.kfs.module.tem.businessobject.lookup;

import java.util.List;
import java.util.Map;

import org.kuali.kfs.module.tem.businessobject.PrimaryDestination;
import org.kuali.rice.kns.lookup.KualiLookupableHelperServiceImpl;
import org.kuali.rice.kns.lookup.LookupUtils;
import org.kuali.rice.krad.bo.BusinessObject;
import org.kuali.rice.krad.lookup.CollectionIncomplete;


@SuppressWarnings("deprecation")
public class PrimaryDestinationLookupableHelperServiceImpl extends KualiLookupableHelperServiceImpl {

    /**
     * @see org.kuali.rice.kns.lookup.KualiLookupableHelperServiceImpl#getSearchResults(java.util.Map)
     */
    @SuppressWarnings("rawtypes")
    @Override
    public List<? extends BusinessObject> getSearchResults(Map<String, String> fieldValues) {
        fieldValues.put("active", "true");
        List<PrimaryDestination> results = (List<PrimaryDestination>) super.getSearchResultsHelper(fieldValues, true);

        CollectionIncomplete collection = null;
        Integer limit = LookupUtils.getSearchResultsLimit(PrimaryDestination.class);
        if (results.size() > limit.intValue()){
            collection = new CollectionIncomplete(results.subList(0, limit), (long) results.size());
        }
        else{
            collection = new CollectionIncomplete(results, (long) 0);
        }

        return collection;


    }

}
