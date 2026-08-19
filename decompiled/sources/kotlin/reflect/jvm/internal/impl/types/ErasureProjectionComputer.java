package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public class ErasureProjectionComputer {
    public static /* synthetic */ TypeProjection computeProjection$default(ErasureProjectionComputer erasureProjectionComputer, TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, KotlinType kotlinType, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i10 & 8) != 0) {
            kotlinType = typeParameterUpperBoundEraser.getErasedUpperBound(typeParameterDescriptor, erasureTypeAttributes);
        }
        return erasureProjectionComputer.computeProjection(typeParameterDescriptor, erasureTypeAttributes, typeParameterUpperBoundEraser, kotlinType);
    }

    public TypeProjection computeProjection(TypeParameterDescriptor parameter, ErasureTypeAttributes typeAttr, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, KotlinType erasedUpperBound) {
        AbstractC16544l.m18094g(parameter, "parameter");
        AbstractC16544l.m18094g(typeAttr, "typeAttr");
        AbstractC16544l.m18094g(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        AbstractC16544l.m18094g(erasedUpperBound, "erasedUpperBound");
        return new TypeProjectionImpl(Variance.OUT_VARIANCE, erasedUpperBound);
    }
}
