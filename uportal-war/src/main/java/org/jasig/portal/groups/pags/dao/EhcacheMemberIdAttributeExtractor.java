/**
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.portal.groups.pags.dao;

import net.sf.ehcache.Element;
import net.sf.ehcache.search.attribute.AttributeExtractor;
import net.sf.ehcache.search.attribute.AttributeExtractorException;
import org.jasig.portal.EntityIdentifier;

/**
 * Used within Ehcache to find keys that reference the specified username.
 *
 * @author drewwills
 */
public class EhcacheMemberIdAttributeExtractor implements AttributeExtractor {

    @Override
    public Object attributeFor(Element element, String attributeName) throws AttributeExtractorException {
        final MembershipCacheKey membershipCacheKey = (MembershipCacheKey) element.getObjectKey();
        final EntityIdentifier ei = membershipCacheKey.getMemberId();
        return ei.getKey();
    }

}