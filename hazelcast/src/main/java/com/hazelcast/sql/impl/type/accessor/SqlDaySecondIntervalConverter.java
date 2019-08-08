/*
 * Copyright (c) 2008-2019, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.sql.impl.type.accessor;

import com.hazelcast.sql.SqlDaySecondInterval;
import com.hazelcast.sql.impl.type.GenericType;

/**
 * Converter for {@link Integer} type.
 */
public final class SqlDaySecondIntervalConverter extends Converter {
    /** Singleton instance. */
    public static SqlDaySecondIntervalConverter INSTANCE = new SqlDaySecondIntervalConverter();

    @Override
    public Class getClazz() {
        return SqlDaySecondInterval.class;
    }

    @Override
    public GenericType getGenericType() {
        return GenericType.INTERVAL_DAY_SECOND;
    }

    private SqlDaySecondIntervalConverter() {
        // No-op.
    }
}
