/*
 * Copyright (c) 2008-2012, Hazelcast, Inc. All Rights Reserved.
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

package com.hazelcast.queue.proxy;

import com.hazelcast.nio.Data;
import com.hazelcast.nio.IOUtil;
import com.hazelcast.queue.QueueItem;

import java.util.Iterator;

/**
 * @ali 12/18/12
 */
public class QueueIterator<E> implements Iterator<E> {

    final Iterator<Data> iter;

    final boolean isData;

    public QueueIterator(Iterator<Data> iter, boolean isData) {
        this.iter = iter;
        this.isData = isData;
    }

    public boolean hasNext() {
        return iter.hasNext();
    }

    public E next() {
        Data data = iter.next();
        if (isData){
            return (E)data;
        }
        return IOUtil.toObject(data);
    }

    public void remove() {
        iter.remove();
    }
}
