/**
 * Licensed to Apereo under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright ownership. Apereo
 * licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the License at the
 * following location:
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apereo.portal.portlets.portletadmin;

import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.Map;
import org.apereo.portal.portlet.dao.jpa.PortletTypeImpl;
import org.apereo.portal.portlet.om.IPortletType;
import org.apereo.portal.portletpublishing.xml.PortletPublishingDefinition;
import org.junit.Test;

/** Unit test for PortletAdministrationHelper. */
public class PortletAdministrationHelperTest {

    /**
     * When there are multiple available portlet types, the method
     * updateFormForSinglePortletType(...) is a no-op returning null.
     *
     * <p>This test case verifies that the method returns null in this case.
     */
    @Test
    public void updateFormForSinglePortletTypeNoOpWhenMultiplePortletTypes() {

        PortletAdministrationHelper helper = new PortletAdministrationHelper();

        Map<IPortletType, PortletPublishingDefinition> portletDefinitions = new HashMap<>();

        IPortletType someType = new PortletTypeImpl("someType", "someUri");
        IPortletType someOtherType = new PortletTypeImpl("someOtherType", "someOtherUri");

        PortletPublishingDefinition someDefinition = new PortletPublishingDefinition();
        PortletPublishingDefinition someOtherDefinition = new PortletPublishingDefinition();

        portletDefinitions.put(someType, someDefinition);
        portletDefinitions.put(someOtherType, someOtherDefinition);

        PortletDefinitionForm form = new PortletDefinitionForm();

        assertNull(helper.updateFormForSinglePortletType(portletDefinitions, form));
    }
}
