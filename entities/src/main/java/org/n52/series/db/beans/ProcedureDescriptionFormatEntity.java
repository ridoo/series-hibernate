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

import org.n52.series.db.beans.HibernateRelations.HasProcedureDescriptionFormat;

/**
 * @since 1.0.0
 */
public class ProcedureDescriptionFormatEntity extends IdEntity implements Serializable {

    public static final String PROCEDURE_DESCRIPTION_FORMAT =
            HasProcedureDescriptionFormat.PROCEDURE_DESCRIPTION_FORMAT;

    private static final long serialVersionUID = 5252037145878336688L;

    private String procedureDescriptionFormat;

    public ProcedureDescriptionFormatEntity() {
    }

    public String getProcedureDescriptionFormat() {
        return this.procedureDescriptionFormat;
    }

    public ProcedureDescriptionFormatEntity setProcedureDescriptionFormat(String procedureDescriptionFormat) {
        this.procedureDescriptionFormat = procedureDescriptionFormat;
        return this;
    }

}
