package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes2.dex */
public final class DisjointKeysUnionTypeSubstitution extends TypeSubstitution {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final TypeSubstitution f53156a;

    /* JADX INFO: renamed from: b */
    public final TypeSubstitution f53157b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final TypeSubstitution create(TypeSubstitution first, TypeSubstitution second) {
            AbstractC16544l.m18094g(first, "first");
            AbstractC16544l.m18094g(second, "second");
            if (first.isEmpty()) {
                return second;
            }
            return second.isEmpty() ? first : new DisjointKeysUnionTypeSubstitution(first, second, null);
        }
    }

    public DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2, DefaultConstructorMarker defaultConstructorMarker) {
        this.f53156a = typeSubstitution;
        this.f53157b = typeSubstitution2;
    }

    public static final TypeSubstitution create(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        return Companion.create(typeSubstitution, typeSubstitution2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateCapturedTypes() {
        return this.f53156a.approximateCapturedTypes() || this.f53157b.approximateCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean approximateContravariantCapturedTypes() {
        return this.f53156a.approximateContravariantCapturedTypes() || this.f53157b.approximateContravariantCapturedTypes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public Annotations filterAnnotations(Annotations annotations) {
        AbstractC16544l.m18094g(annotations, "annotations");
        return this.f53157b.filterAnnotations(this.f53156a.filterAnnotations(annotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: get */
    public TypeProjection mo22592get(KotlinType key) {
        AbstractC16544l.m18094g(key, "key");
        TypeProjection typeProjectionMo22592get = this.f53156a.mo22592get(key);
        return typeProjectionMo22592get == null ? this.f53157b.mo22592get(key) : typeProjectionMo22592get;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public KotlinType prepareTopLevelType(KotlinType topLevelType, Variance position) {
        AbstractC16544l.m18094g(topLevelType, "topLevelType");
        AbstractC16544l.m18094g(position, "position");
        return this.f53157b.prepareTopLevelType(this.f53156a.prepareTopLevelType(topLevelType, position), position);
    }
}
