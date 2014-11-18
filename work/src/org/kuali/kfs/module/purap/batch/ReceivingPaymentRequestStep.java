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
package org.kuali.kfs.module.purap.batch;

import java.util.Date;

import org.apache.log4j.Logger;
import org.kuali.kfs.module.purap.document.service.PaymentRequestService;
import org.kuali.kfs.sys.batch.AbstractStep;


public class ReceivingPaymentRequestStep extends AbstractStep {

    private static final Logger log = Logger.getLogger(ReceivingPaymentRequestStep.class);
    private PaymentRequestService paymentRequestService;
    
    public ReceivingPaymentRequestStep() {
        super();
    }

    public boolean execute(String jobName, 
                           Date jobRunDate) 
    throws InterruptedException {
        log.debug("Started executing the batch job.....");
        paymentRequestService.processPaymentRequestInReceivingStatus();
        return true;
    }
    
    public void setPaymentRequestService(PaymentRequestService paymentRequestService) {
        this.paymentRequestService = paymentRequestService;
    }

    


}
