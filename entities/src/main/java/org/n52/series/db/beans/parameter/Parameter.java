/*
 * Copyright 2015-2017 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.series.db.beans.parameter;

import java.util.HashMap;
import java.util.Map;

public abstract class Parameter<T> {

    private long parameterId;

    private long fkId;

    private String name;

    private T value;

    public Map<String, Object> toValueMap(String locale) {
        Map<String, Object> valueMap = new HashMap<>();
        valueMap.put("name", getName());
        valueMap.put("value", getValue());
        return valueMap;
    }

    public long getParameterId() {
        return parameterId;
    }

    public void setParameterId(long parameterId) {
        this.parameterId = parameterId;
    }

    public long getFkId() {
        return fkId;
    }

    public void setFkId(long fkId) {
        this.fkId = fkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSetName() {
        return getName() != null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return getValue() != null;
    }

}
