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

package org.n52.series.db.beans;

import java.io.Serializable;

import org.n52.series.db.beans.HibernateRelations.HasCodespace;

/**
 * @since 1.0.0
 */
public class CodespaceEntity extends PkidEntity implements Serializable {

    public static final String ID = "codespaceId";

    public static final String CODESPACE = HasCodespace.CODESPACE;

    private static final long serialVersionUID = 8795086004488469603L;

    private String codespaceEntity;

    public String getCodespaceEntity() {
        return this.codespaceEntity;
    }

    public CodespaceEntity setCodespace(String codespace) {
        this.codespaceEntity = codespace;
        return this;
    }

    public boolean isSetCodespaceEntity() {
        return getCodespaceEntity() != null && !getCodespaceEntity().isEmpty();
    }
}
