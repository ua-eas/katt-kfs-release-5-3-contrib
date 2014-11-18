<%--
   - The Kuali Financial System, a comprehensive financial management system for higher education.
   - 
   - Copyright 2005-2014 The Kuali Foundation
   - 
   - This program is free software: you can redistribute it and/or modify
   - it under the terms of the GNU Affero General Public License as
   - published by the Free Software Foundation, either version 3 of the
   - License, or (at your option) any later version.
   - 
   - This program is distributed in the hope that it will be useful,
   - but WITHOUT ANY WARRANTY; without even the implied warranty of
   - MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   - GNU Affero General Public License for more details.
   - 
   - You should have received a copy of the GNU Affero General Public License
   - along with this program.  If not, see <http://www.gnu.org/licenses/>.
--%>
<%@ include file="/jsp/sys/kfsTldHeader.jsp"%>
<%@ taglib uri="/WEB-INF/tlds/temfunc.tld" prefix="temfunc"%>
<%@ attribute name="lineNumber" required="false" description="Line number for the record." %>
<%@ attribute name="isCTS" required="true" description="determines rowspan." %>

<c:set var="importedExpenseAttributes" value="${DataDictionary.ImportedExpense.attributes}" />
			<tr>
				<c:choose>
					<c:when test="${lineNumber == null }">
						<th>&nbsp;</th>
					</c:when>
					<c:otherwise>
						<th scope="row" class="infoline" rowspan="${isCTS?3:4}">
							<div align="center"> 
								${lineNumber}
							</div>
						</th>
					</c:otherwise>
				</c:choose>
	            <th>
	            	<div align="left">
	            		<kul:htmlAttributeLabel attributeEntry="${importedExpenseAttributes.cardType}" noColon="true" />
	            	</div>
				</th>
				<th>
					<div align="left">
						<kul:htmlAttributeLabel attributeEntry="${importedExpenseAttributes.expenseDate}" noColon="true" />
					</div>
				</th>
				<th>
					<div align="left">
						<kul:htmlAttributeLabel attributeEntry="${importedExpenseAttributes.expenseTypeObjectCodeId}" noColon="true" />
					</div>
				</th>
				<th>
					<div align="left">
						<kul:htmlAttributeLabel attributeEntry="${importedExpenseAttributes.travelCompanyCodeName}" noColon="true" />
					</div>
				</th>
				<th>
					<div align="left">
						<kul:htmlAttributeLabel attributeEntry="${importedExpenseAttributes.expenseAmount}" noColon="true" />
					</div>
				</th>
				<th>
					<div align="left">
						<kul:htmlAttributeLabel attributeEntry="${importedExpenseAttributes.currencyRate}" noColon="true" />
					</div>
				</th>
				<th>
					<div align="left">$US</div>
				</th>
				<th>
					<div align="left">
						<kul:htmlAttributeLabel attributeEntry="${importedExpenseAttributes.nonReimbursable}" noColon="true" />
					</div>
				</th>
				<th>
					<div align="left">
						<kul:htmlAttributeLabel attributeEntry="${importedExpenseAttributes.receiptRequired}" noColon="true" />
					</div>
				</th>
				<th>
					<div align="left">
						<kul:htmlAttributeLabel attributeEntry="${importedExpenseAttributes.taxable}" noColon="true" />
					</div>
				</th>
	            <th>
	            	<div align="center">Actions</div>
	            </th>
			</tr>
