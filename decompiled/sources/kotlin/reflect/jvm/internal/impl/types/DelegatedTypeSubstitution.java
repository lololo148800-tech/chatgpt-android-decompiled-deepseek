package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes2.dex */
public class DelegatedTypeSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: a */
    public final TypeSubstitution f53154a;

    public DelegatedTypeSubstitution(TypeSubstitution substitution) {
        AbstractC16544l.m18094g(substitution, "substitution");
        this.f53154a = substitution;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateCapturedTypes() {
        return this.f53154a.approximateCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.f53154a.approximateContravariantCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public Annotations filterAnnotations(Annotations annotations) {
        AbstractC16544l.m18094g(annotations, "annotations");
        return this.f53154a.filterAnnotations(annotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: get */
    public TypeProjection mo22592get(KotlinType key) {
        AbstractC16544l.m18094g(key, "key");
        return this.f53154a.mo22592get(key);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return this.f53154a.isEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public KotlinType prepareTopLevelType(KotlinType topLevelType, Variance position) {
        AbstractC16544l.m18094g(topLevelType, "topLevelType");
        AbstractC16544l.m18094g(position, "position");
        return this.f53154a.prepareTopLevelType(topLevelType, position);
    }
}
