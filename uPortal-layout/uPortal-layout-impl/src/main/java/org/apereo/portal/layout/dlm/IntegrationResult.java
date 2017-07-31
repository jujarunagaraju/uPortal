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
package org.apereo.portal.layout.dlm;

/**
 * This class is used to keep track of changes when integrating PLF and ILF components.
 *
 * @since 2.5
 */
public class IntegrationResult {

    private boolean changedPLF = false;
    private boolean changedILF = false;

    /**
     * Indicates whether the "personal layout fragment" (PLF) changed as a consequence of the merge.
     */
    public boolean isChangedPLF() {
        return changedPLF;
    }

    public void setChangedPLF(boolean changedPLF) {
        this.changedPLF = changedPLF;
    }

    /**
     * Indicates whether the "incorporated layouts fragment" (ILF) changed as a consequence of the
     * merge.
     */
    public boolean isChangedILF() {
        return changedILF;
    }

    public void setChangedILF(boolean changedILF) {
        this.changedILF = changedILF;
    }
}