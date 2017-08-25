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

import org.n52.series.db.beans.HibernateRelations.HasResultEncoding;
import org.n52.series.db.beans.HibernateRelations.HasResultStructure;

/**
 * @since 1.0.0
 *
 */
public class ResultTemplateEntity extends IdEntity implements Serializable, HasResultStructure, HasResultEncoding {

    public static final String PROPERTY_OFFERING = "offering";

    public static final String PROPERTY_OBSERVABLE_PROPERTY = "observableProperty";

    public static final String PROPERTY_DOMAIN_ID = "domainId";
    
    public static final String PROPERTY_FEATURE_OF_INTEREST = "featureOfInterest";

    private static final long serialVersionUID = -8847952458819368733L;

    private PhenomenonEntity observableProperty;

    private OfferingEntity offering;
    
    private ProcedureEntity procedure;
    
    private AbstractFeatureEntity featureOfInterest;

    private String identifier;

    private String domainId;

    private String resultStructure;

    private String resultEncoding;

    public ResultTemplateEntity() {
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * @return the observableProperty
     */
    public PhenomenonEntity getObservableProperty() {
        return observableProperty;
    }

    /**
     * @param observableProperty the observableProperty to set
     */
    public void setObservableProperty(PhenomenonEntity observableProperty) {
        this.observableProperty = observableProperty;
    }

    /**
     * @return the offering
     */
    public OfferingEntity getOffering() {
        return offering;
    }

    /**
     * @param offering the offering to set
     */
    public void setOffering(OfferingEntity offering) {
        this.offering = offering;
    }

    /**
     * @return the procedure
     */
    public ProcedureEntity getProcedure() {
        return procedure;
    }

    /**
     * @param procedure the procedure to set
     */
    public void setProcedure(ProcedureEntity procedure) {
        this.procedure = procedure;
    }

    /**
     * @return the featureOfInterest
     */
    public AbstractFeatureEntity getFeatureOfInterest() {
        return featureOfInterest;
    }

    /**
     * @param featureOfInterest the featureOfInterest to set
     */
    public void setFeatureOfInterest(AbstractFeatureEntity featureOfInterest) {
        this.featureOfInterest = featureOfInterest;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public boolean isSetIdentifier() {
        return getIdentifier() != null && !getIdentifier().isEmpty();
    }

    @Override
    public String getResultStructure() {
        return resultStructure;
    }

    @Override
    public boolean isSetResultStructure() {
        return getResultStructure() != null && !getResultStructure().isEmpty();
    }

    @Override
    public void setResultStructure(String resultStructure) {
        this.resultStructure = resultStructure;
    }

    @Override
    public String getResultEncoding() {
        return this.resultEncoding;
    }

    @Override
    public boolean isSetResultEncoding() {
        return getResultEncoding() != null && !getResultEncoding().isEmpty();
    }

    @Override
    public void setResultEncoding(String resultEncoding) {
        this.resultEncoding = resultEncoding;
    }

}
