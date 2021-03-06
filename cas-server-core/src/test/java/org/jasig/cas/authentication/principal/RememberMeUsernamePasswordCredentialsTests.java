/*
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
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
package org.jasig.cas.authentication.principal;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for RememberMeUsernamePasswordCredentials.
 *
 * @author Scott Battaglia
 * @since 3.2.1
 *
 */
public final class RememberMeUsernamePasswordCredentialsTests  {

    @Test
    public void testGettersAndSetters() {
        final RememberMeUsernamePasswordCredentials c = new RememberMeUsernamePasswordCredentials();
        c.setPassword("password");
        c.setUsername("username");
        c.setRememberMe(true);

        assertEquals("username", c.getUsername());
        assertEquals("password", c.getPassword());
        assertTrue(c.isRememberMe());
    }
}
