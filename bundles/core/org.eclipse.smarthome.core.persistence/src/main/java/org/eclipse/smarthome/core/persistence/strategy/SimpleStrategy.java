/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.persistence.strategy;

import java.util.Objects;

/**
 * This class holds a strategy to persist items.
 *
 * @author Markus Rathgeb - Initial contribution and API
 */
public class SimpleStrategy {
    public static class Globals {
        public static final SimpleStrategy UPDATE = new SimpleStrategy("everyUpdate");
        public static final SimpleStrategy CHANGE = new SimpleStrategy("everyChange");
        public static final SimpleStrategy RESTORE = new SimpleStrategy("restoreOnStartup");
    }

    private final String name;

    public SimpleStrategy(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        // if (getClass() != obj.getClass()) {
        // return false;
        // }
        if (!(obj instanceof SimpleStrategy)) {
            return false;
        }
        final SimpleStrategy other = (SimpleStrategy) obj;
        if (!Objects.equals(name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s [name=%s]", getClass().getSimpleName(), name);
    }

}
