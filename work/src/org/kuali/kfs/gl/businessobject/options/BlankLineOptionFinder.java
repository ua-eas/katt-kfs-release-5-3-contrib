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
package org.kuali.kfs.gl.businessobject.options;

import java.util.ArrayList;
import java.util.List;

import org.kuali.kfs.gl.Constant;
import org.kuali.rice.core.api.util.ConcreteKeyValue;
import org.kuali.rice.core.api.util.KeyValue;
import org.kuali.rice.krad.keyvalues.KeyValuesBase;
import org.kuali.rice.krad.valuefinder.ValueFinder;

/**
 * An implmentation of ValueFinder that allows the balance inquiries to choose whether to show blank entries
 */
public class BlankLineOptionFinder extends KeyValuesBase implements ValueFinder {

    /**
     * Returns the default value for this ValueFinder, in this case, exclude cost share entries
     * @return a String with the default key
     * @see org.kuali.rice.krad.valuefinder.ValueFinder#getValue()
     */
    public String getValue() {
        return Constant.NOT_SHOW_BLANK_LINE;
    }

    /**
     * Returns a list of possible values for this ValueFinder, in this case include cost share entries or exclude cost share entries
     * @return a List of key/value pairs to populate radio buttons
     * @see org.kuali.rice.kns.lookup.keyvalues.KeyValuesFinder#getKeyValues()
     */
    public List<KeyValue> getKeyValues() {
        List<KeyValue> labels = new ArrayList<KeyValue>();
        labels.add(new ConcreteKeyValue(Constant.NOT_SHOW_BLANK_LINE, Constant.NOT_SHOW_BLANK_LINE));
        labels.add(new ConcreteKeyValue(Constant.SHOW_BLANK_LINE, Constant.SHOW_BLANK_LINE));
        return labels;
    }
}
