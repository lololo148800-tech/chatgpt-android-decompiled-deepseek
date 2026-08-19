package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeSubstitution {
    public static final Companion Companion = new Companion(null);
    public static final TypeSubstitution EMPTY = new TypeSubstitution$Companion$EMPTY$1();

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public boolean approximateCapturedTypes() {
        return false;
    }

    public boolean approximateContravariantCapturedTypes() {
        return false;
    }

    public final TypeSubstitutor buildSubstitutor() {
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(this);
        AbstractC16544l.m18093f(typeSubstitutorCreate, "create(...)");
        return typeSubstitutorCreate;
    }

    public Annotations filterAnnotations(Annotations annotations) {
        AbstractC16544l.m18094g(annotations, "annotations");
        return annotations;
    }

    /* JADX INFO: renamed from: get */
    public abstract TypeProjection mo22592get(KotlinType kotlinType);

    public boolean isEmpty() {
        return false;
    }

    public KotlinType prepareTopLevelType(KotlinType topLevelType, Variance position) {
        AbstractC16544l.m18094g(topLevelType, "topLevelType");
        AbstractC16544l.m18094g(position, "position");
        return topLevelType;
    }

    public final TypeSubstitution replaceWithNonApproximating() {
        return new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution.replaceWithNonApproximating.1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean approximateCapturedTypes() {
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean approximateContravariantCapturedTypes() {
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public Annotations filterAnnotations(Annotations annotations) {
                AbstractC16544l.m18094g(annotations, "annotations");
                return TypeSubstitution.this.filterAnnotations(annotations);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            /* JADX INFO: renamed from: get */
            public TypeProjection mo22592get(KotlinType key) {
                AbstractC16544l.m18094g(key, "key");
                return TypeSubstitution.this.mo22592get(key);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean isEmpty() {
                return TypeSubstitution.this.isEmpty();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public KotlinType prepareTopLevelType(KotlinType topLevelType, Variance position) {
                AbstractC16544l.m18094g(topLevelType, "topLevelType");
                AbstractC16544l.m18094g(position, "position");
                return TypeSubstitution.this.prepareTopLevelType(topLevelType, position);
            }
        };
    }
}
