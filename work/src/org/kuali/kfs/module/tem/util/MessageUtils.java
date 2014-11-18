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
package org.kuali.kfs.module.tem.util;

import java.text.MessageFormat;

import org.kuali.kfs.sys.context.SpringContext;
import org.kuali.rice.core.api.config.property.ConfigurationService;
import org.kuali.rice.krad.util.ErrorMessage;

public class MessageUtils {
    protected static org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(MessageUtils.class);

    /**
     * Resolve the message from the key and the parameters on ErrorMessage propertie
     *
     * @param error
     * @return
     */
    public static String getErrorMessage(ErrorMessage error){
        return getMessage(error.getErrorKey(), error.getMessageParameters());
    }

    /**
     * Resolve the message from the key and the parameters
     *
     * @param error
     * @return
     */
    public static String getMessage(String key, String... parameters){
        String message = SpringContext.getBean(ConfigurationService.class).getPropertyValueAsString(key);
        return MessageFormat.format(message, (Object[])parameters);
    }

}
