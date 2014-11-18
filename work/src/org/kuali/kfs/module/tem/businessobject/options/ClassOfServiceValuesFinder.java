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
package org.kuali.kfs.module.tem.businessobject.options;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kuali.kfs.module.tem.TemPropertyConstants;
import org.kuali.kfs.module.tem.businessobject.ClassOfService;
import org.kuali.kfs.sys.KFSConstants;
import org.kuali.kfs.sys.context.SpringContext;
import org.kuali.rice.core.api.util.ConcreteKeyValue;
import org.kuali.rice.core.api.util.KeyValue;
import org.kuali.rice.krad.keyvalues.KeyValuesBase;
import org.kuali.rice.krad.service.KeyValuesService;
import org.kuali.rice.krad.util.ObjectUtils;

public class ClassOfServiceValuesFinder extends KeyValuesBase {

    private String expenseTypeMetaCategoryCode;
    protected static volatile KeyValuesService keyValuesService;

    /**
     * @see org.kuali.rice.krad.keyvalues.KeyValuesFinder#getKeyValues()
     */
    @Override
    public List<KeyValue> getKeyValues() {
        List<KeyValue> keyValues = new ArrayList<KeyValue>();

        Collection<ClassOfService> bos = null;
        if(ObjectUtils.isNotNull(expenseTypeMetaCategoryCode)){
            Map<String, Object> searchMap = new HashMap<String, Object>();
            searchMap.put(TemPropertyConstants.ClassOfService.EXPENSE_TYPE_META_CATEGORY_CODE, expenseTypeMetaCategoryCode);
            bos = getKeyValuesService().findMatching(ClassOfService.class, searchMap);
        }
        else{
            bos = getKeyValuesService().findAll(ClassOfService.class);
        }

        keyValues.add(new ConcreteKeyValue(KFSConstants.EMPTY_STRING, KFSConstants.EMPTY_STRING));
        for (ClassOfService typ : bos) {
            keyValues.add(new ConcreteKeyValue(typ.getCode(), typ.getClassOfServiceName()));
        }

        return keyValues;
    }

    public String getExpenseTypeMetaCategoryCode() {
        return expenseTypeMetaCategoryCode;
    }

    public void setExpenseTypeMetaCategoryCode(String expenseTypeMetaCategoryCode) {
        this.expenseTypeMetaCategoryCode = expenseTypeMetaCategoryCode;
    }

    protected KeyValuesService getKeyValuesService() {
        if (keyValuesService == null) {
            keyValuesService = SpringContext.getBean(KeyValuesService.class);
        }
        return keyValuesService;
    }

}
