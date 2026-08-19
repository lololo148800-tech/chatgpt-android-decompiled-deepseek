package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p025An.C0644w;

/* JADX INFO: loaded from: classes2.dex */
public final class RawProjectionComputer extends ErasureProjectionComputer {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JavaTypeFlexibility.values().length];
            try {
                iArr[JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JavaTypeFlexibility.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer
    public TypeProjection computeProjection(TypeParameterDescriptor parameter, ErasureTypeAttributes typeAttr, TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, KotlinType erasedUpperBound) {
        AbstractC16544l.m18094g(parameter, "parameter");
        AbstractC16544l.m18094g(typeAttr, "typeAttr");
        AbstractC16544l.m18094g(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        AbstractC16544l.m18094g(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof JavaTypeAttributes)) {
            return super.computeProjection(parameter, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        JavaTypeAttributes javaTypeAttributesWithFlexibility = (JavaTypeAttributes) typeAttr;
        if (!javaTypeAttributesWithFlexibility.isRaw()) {
            javaTypeAttributesWithFlexibility = javaTypeAttributesWithFlexibility.withFlexibility(JavaTypeFlexibility.INFLEXIBLE);
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[javaTypeAttributesWithFlexibility.getFlexibility().ordinal()];
        if (i10 == 1) {
            return new TypeProjectionImpl(Variance.INVARIANT, erasedUpperBound);
        }
        if (i10 != 2 && i10 != 3) {
            throw new C0644w();
        }
        if (!parameter.getVariance().getAllowsOutPosition()) {
            return new TypeProjectionImpl(Variance.INVARIANT, DescriptorUtilsKt.getBuiltIns(parameter).getNothingType());
        }
        List<TypeParameterDescriptor> parameters = erasedUpperBound.getConstructor().getParameters();
        AbstractC16544l.m18093f(parameters, "getParameters(...)");
        if (!parameters.isEmpty()) {
            return new TypeProjectionImpl(Variance.OUT_VARIANCE, erasedUpperBound);
        }
        TypeProjection typeProjectionMakeStarProjection = TypeUtils.makeStarProjection(parameter, javaTypeAttributesWithFlexibility);
        AbstractC16544l.m18091d(typeProjectionMakeStarProjection);
        return typeProjectionMakeStarProjection;
    }
}
