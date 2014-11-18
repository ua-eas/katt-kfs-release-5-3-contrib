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
package org.kuali.kfs.module.purap.document.validation.event;

import org.kuali.kfs.sys.KFSConstants;
import org.kuali.kfs.sys.document.validation.event.AttributedSaveDocumentEvent;
import org.kuali.rice.krad.document.Document;
import org.kuali.rice.krad.rules.rule.event.SaveEvent;

/**
 * UpdateCamsView Event for Accounts Payable Document.
 * This could be triggered when a user presses the UpdateCamsView button to go to the next page.
 */
public final class AttributedUpdateCamsViewPurapEvent extends AttributedSaveDocumentEvent implements SaveEvent {

    /**
     * Overridden constructor.
     * 
     * @param document the document for this event
     */
    public AttributedUpdateCamsViewPurapEvent(Document document) {
        this(KFSConstants.EMPTY_STRING, document);
    }

    /**
     * Constructs a UpdateCamsViewPurapEvent with the given errorPathPrefix and document.
     * 
     * @param errorPathPrefix the error path
     * @param document document the event was invoked upon
     */
    public AttributedUpdateCamsViewPurapEvent(String errorPathPrefix, Document document) {
        super("updating view for document " + getDocumentId(document), errorPathPrefix, document);
    }
}
