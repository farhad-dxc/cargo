/*
 * ========================================================================
 *
 * Codehaus CARGO, copyright 2004-2010 Vincent Massol.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ========================================================================
 */
package org.codehaus.cargo.sample.java.validator;

import org.codehaus.cargo.generic.ContainerFactory;
import org.codehaus.cargo.generic.DefaultContainerFactory;
import org.codehaus.cargo.container.ContainerType;

/**
 * Validate that a container has a remote container.
 *
 * @version $Id$
 */
public class HasRemoteContainerValidator implements Validator
{
    private ContainerFactory factory = new DefaultContainerFactory();

    /**
     * @return true if the container has a remote container implementation available, false
     *              otherwise
     */
    public boolean validate(String containerId, ContainerType type)
    {
        return this.factory.isContainerRegistered(containerId, ContainerType.REMOTE);
    }
}