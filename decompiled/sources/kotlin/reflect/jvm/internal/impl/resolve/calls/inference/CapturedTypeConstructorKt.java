package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mm.C17309l;
import p298Lm.C5140G;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class CapturedTypeConstructorKt {
    /* JADX INFO: renamed from: a */
    public static final TypeProjection m18358a(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null || typeProjection.getProjectionKind() == Variance.INVARIANT) {
            return typeProjection;
        }
        if (typeParameterDescriptor.getVariance() != typeProjection.getProjectionKind()) {
            return new TypeProjectionImpl(createCapturedType(typeProjection));
        }
        if (!typeProjection.isStarProjection()) {
            return new TypeProjectionImpl(typeProjection.getType());
        }
        StorageManager NO_LOCKS = LockBasedStorageManager.NO_LOCKS;
        AbstractC16544l.m18093f(NO_LOCKS, "NO_LOCKS");
        return new TypeProjectionImpl(new LazyWrappedType(NO_LOCKS, new C5140G(typeProjection, 20)));
    }

    public static final KotlinType createCapturedType(TypeProjection typeProjection) {
        AbstractC16544l.m18094g(typeProjection, "typeProjection");
        return new CapturedType(typeProjection, null, false, null, 14, null);
    }

    public static final boolean isCaptured(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        return kotlinType.getConstructor() instanceof CapturedTypeConstructor;
    }

    public static final TypeSubstitution wrapWithCapturingSubstitution(TypeSubstitution typeSubstitution, final boolean z6) {
        AbstractC16544l.m18094g(typeSubstitution, "<this>");
        if (!(typeSubstitution instanceof IndexedParametersSubstitution)) {
            return new DelegatedTypeSubstitution(typeSubstitution) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.wrapWithCapturingSubstitution.2
                @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean approximateContravariantCapturedTypes() {
                    return z6;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                /* JADX INFO: renamed from: get */
                public TypeProjection mo22592get(KotlinType key) {
                    AbstractC16544l.m18094g(key, "key");
                    TypeProjection typeProjectionMo22592get = super.mo22592get(key);
                    if (typeProjectionMo22592get == null) {
                        return null;
                    }
                    ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = key.getConstructor().mo22589getDeclarationDescriptor();
                    return CapturedTypeConstructorKt.m18358a(typeProjectionMo22592get, classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo22589getDeclarationDescriptor : null);
                }
            };
        }
        IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
        TypeParameterDescriptor[] parameters = indexedParametersSubstitution.getParameters();
        ArrayList<C17309l> arrayListM19294Q = AbstractC17678l.m19294Q(indexedParametersSubstitution.getArguments(), indexedParametersSubstitution.getParameters());
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM19294Q, 10));
        for (C17309l c17309l : arrayListM19294Q) {
            arrayList.add(m18358a((TypeProjection) c17309l.f55136Y, (TypeParameterDescriptor) c17309l.f55137Z));
        }
        return new IndexedParametersSubstitution(parameters, (TypeProjection[]) arrayList.toArray(new TypeProjection[0]), z6);
    }

    public static /* synthetic */ TypeSubstitution wrapWithCapturingSubstitution$default(TypeSubstitution typeSubstitution, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = true;
        }
        return wrapWithCapturingSubstitution(typeSubstitution, z6);
    }
}
