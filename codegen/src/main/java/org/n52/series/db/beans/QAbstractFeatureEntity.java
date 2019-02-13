package org.n52.series.db.beans;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAbstractFeatureEntity is a Querydsl query type for AbstractFeatureEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAbstractFeatureEntity extends EntityPathBase<AbstractFeatureEntity<?>> {

    private static final long serialVersionUID = 933372582L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAbstractFeatureEntity abstractFeatureEntity = new QAbstractFeatureEntity("abstractFeatureEntity");

    public final QHierarchicalEntity _super = new QHierarchicalEntity(this);

    public final StringPath description = createString("description");

    public final QGeometryEntity geometryEntity;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath identifier = createString("identifier");

    public final StringPath name = createString("name");

    public final SetPath<org.n52.series.db.beans.i18n.I18nFeatureEntity, org.n52.series.db.beans.i18n.QI18nFeatureEntity> translations = this.<org.n52.series.db.beans.i18n.I18nFeatureEntity, org.n52.series.db.beans.i18n.QI18nFeatureEntity>createSet("translations", org.n52.series.db.beans.i18n.I18nFeatureEntity.class, org.n52.series.db.beans.i18n.QI18nFeatureEntity.class, PathInits.DIRECT2);

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QAbstractFeatureEntity(String variable) {
        this((Class) AbstractFeatureEntity.class, forVariable(variable), INITS);
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QAbstractFeatureEntity(Path<? extends AbstractFeatureEntity> path) {
        this((Class) path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAbstractFeatureEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QAbstractFeatureEntity(PathMetadata metadata, PathInits inits) {
        this((Class) AbstractFeatureEntity.class, metadata, inits);
    }

    public QAbstractFeatureEntity(Class<? extends AbstractFeatureEntity<?>> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.geometryEntity = inits.isInitialized("geometryEntity") ? new QGeometryEntity(forProperty("geometryEntity")) : null;
    }

}

