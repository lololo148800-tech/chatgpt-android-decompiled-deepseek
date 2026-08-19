package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import mm.C17309l;
import p025An.C0644w;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import tn.C20008a;
import tn.C20009b;

/* JADX INFO: loaded from: classes2.dex */
public final class CapturedTypeApproximationKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX INFO: renamed from: a */
    public static final KotlinType m18442a(KotlinType kotlinType, ArrayList arrayList) {
        TypeProjectionImpl typeProjectionImpl;
        kotlinType.getArguments().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C20009b c20009b = (C20009b) it.next();
            c20009b.getClass();
            KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
            KotlinType kotlinType2 = c20009b.f63328b;
            KotlinType kotlinType3 = c20009b.f63329c;
            kotlinTypeChecker.isSubtypeOf(kotlinType2, kotlinType3);
            if (AbstractC16544l.m18089b(kotlinType2, kotlinType3)) {
                typeProjectionImpl = new TypeProjectionImpl(kotlinType2);
            } else {
                TypeParameterDescriptor typeParameterDescriptor = c20009b.f63327a;
                Variance variance = typeParameterDescriptor.getVariance();
                Variance variance2 = Variance.IN_VARIANCE;
                if (variance == variance2) {
                    typeProjectionImpl = new TypeProjectionImpl(kotlinType2);
                } else if (KotlinBuiltIns.isNothing(kotlinType2) && typeParameterDescriptor.getVariance() != variance2) {
                    Variance variance3 = Variance.OUT_VARIANCE;
                    if (variance3 == typeParameterDescriptor.getVariance()) {
                        variance3 = Variance.INVARIANT;
                    }
                    typeProjectionImpl = new TypeProjectionImpl(variance3, kotlinType3);
                } else if (KotlinBuiltIns.isNullableAny(kotlinType3)) {
                    if (variance2 == typeParameterDescriptor.getVariance()) {
                        variance2 = Variance.INVARIANT;
                    }
                    typeProjectionImpl = new TypeProjectionImpl(variance2, kotlinType2);
                } else {
                    Variance variance4 = Variance.OUT_VARIANCE;
                    if (variance4 == typeParameterDescriptor.getVariance()) {
                        variance4 = Variance.INVARIANT;
                    }
                    typeProjectionImpl = new TypeProjectionImpl(variance4, kotlinType3);
                }
            }
            arrayList2.add(typeProjectionImpl);
        }
        return TypeSubstitutionKt.replace$default(kotlinType, arrayList2, null, null, 6, null);
    }

    public static final ApproximationBounds<KotlinType> approximateCapturedTypes(KotlinType type) {
        C20009b c20009b;
        Object objM18442a;
        C20009b c20009b2;
        AbstractC16544l.m18094g(type, "type");
        if (FlexibleTypesKt.isFlexible(type)) {
            ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes = approximateCapturedTypes(FlexibleTypesKt.lowerIfFlexible(type));
            ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes2 = approximateCapturedTypes(FlexibleTypesKt.upperIfFlexible(type));
            return new ApproximationBounds<>(TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(approximationBoundsApproximateCapturedTypes.getLower()), FlexibleTypesKt.upperIfFlexible(approximationBoundsApproximateCapturedTypes2.getLower())), type), TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(approximationBoundsApproximateCapturedTypes.getUpper()), FlexibleTypesKt.upperIfFlexible(approximationBoundsApproximateCapturedTypes2.getUpper())), type));
        }
        TypeConstructor constructor = type.getConstructor();
        if (CapturedTypeConstructorKt.isCaptured(type)) {
            AbstractC16544l.m18092e(constructor, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            TypeProjection projection = ((CapturedTypeConstructor) constructor).getProjection();
            KotlinType type2 = projection.getType();
            AbstractC16544l.m18093f(type2, "getType(...)");
            KotlinType kotlinTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(type2, type.isMarkedNullable());
            AbstractC16544l.m18093f(kotlinTypeMakeNullableIfNeeded, "makeNullableIfNeeded(...)");
            int i10 = WhenMappings.$EnumSwitchMapping$0[projection.getProjectionKind().ordinal()];
            if (i10 == 2) {
                return new ApproximationBounds<>(kotlinTypeMakeNullableIfNeeded, TypeUtilsKt.getBuiltIns(type).getNullableAnyType());
            }
            if (i10 != 3) {
                throw new AssertionError("Only nontrivial projections should have been captured, not: " + projection);
            }
            SimpleType nothingType = TypeUtilsKt.getBuiltIns(type).getNothingType();
            AbstractC16544l.m18093f(nothingType, "getNothingType(...)");
            KotlinType kotlinTypeMakeNullableIfNeeded2 = TypeUtils.makeNullableIfNeeded((KotlinType) nothingType, type.isMarkedNullable());
            AbstractC16544l.m18093f(kotlinTypeMakeNullableIfNeeded2, "makeNullableIfNeeded(...)");
            return new ApproximationBounds<>(kotlinTypeMakeNullableIfNeeded2, kotlinTypeMakeNullableIfNeeded);
        }
        if (type.getArguments().isEmpty() || type.getArguments().size() != constructor.getParameters().size()) {
            return new ApproximationBounds<>(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<TypeProjection> arguments = type.getArguments();
        List<TypeParameterDescriptor> parameters = constructor.getParameters();
        AbstractC16544l.m18093f(parameters, "getParameters(...)");
        Iterator it = AbstractC17680n.m19334J0(arguments, parameters).iterator();
        while (true) {
            boolean z6 = true;
            if (!it.hasNext()) {
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            z6 = false;
                            break;
                        }
                        c20009b = (C20009b) it2.next();
                        c20009b.getClass();
                    } while (KotlinTypeChecker.DEFAULT.isSubtypeOf(c20009b.f63328b, c20009b.f63329c));
                } else {
                    z6 = false;
                    break;
                }
                if (z6) {
                    objM18442a = TypeUtilsKt.getBuiltIns(type).getNothingType();
                    AbstractC16544l.m18093f(objM18442a, "getNothingType(...)");
                } else {
                    objM18442a = m18442a(type, arrayList);
                }
                return new ApproximationBounds<>(objM18442a, m18442a(type, arrayList2));
            }
            C17309l c17309l = (C17309l) it.next();
            TypeProjection typeProjection = (TypeProjection) c17309l.f55136Y;
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) c17309l.f55137Z;
            AbstractC16544l.m18091d(typeParameterDescriptor);
            int i11 = WhenMappings.$EnumSwitchMapping$0[TypeSubstitutor.combine(typeParameterDescriptor.getVariance(), typeProjection).ordinal()];
            if (i11 == 1) {
                KotlinType type3 = typeProjection.getType();
                AbstractC16544l.m18093f(type3, "getType(...)");
                KotlinType type4 = typeProjection.getType();
                AbstractC16544l.m18093f(type4, "getType(...)");
                c20009b2 = new C20009b(typeParameterDescriptor, type3, type4);
            } else if (i11 == 2) {
                KotlinType type5 = typeProjection.getType();
                AbstractC16544l.m18093f(type5, "getType(...)");
                SimpleType nullableAnyType = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNullableAnyType();
                AbstractC16544l.m18093f(nullableAnyType, "getNullableAnyType(...)");
                c20009b2 = new C20009b(typeParameterDescriptor, type5, nullableAnyType);
            } else {
                if (i11 != 3) {
                    throw new C0644w();
                }
                SimpleType nothingType2 = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType();
                AbstractC16544l.m18093f(nothingType2, "getNothingType(...)");
                KotlinType type6 = typeProjection.getType();
                AbstractC16544l.m18093f(type6, "getType(...)");
                c20009b2 = new C20009b(typeParameterDescriptor, nothingType2, type6);
            }
            if (typeProjection.isStarProjection()) {
                arrayList.add(c20009b2);
                arrayList2.add(c20009b2);
            } else {
                ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes3 = approximateCapturedTypes(c20009b2.f63328b);
                KotlinType kotlinTypeComponent1 = approximationBoundsApproximateCapturedTypes3.component1();
                KotlinType kotlinTypeComponent2 = approximationBoundsApproximateCapturedTypes3.component2();
                ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes4 = approximateCapturedTypes(c20009b2.f63329c);
                KotlinType kotlinTypeComponent3 = approximationBoundsApproximateCapturedTypes4.component1();
                KotlinType kotlinTypeComponent4 = approximationBoundsApproximateCapturedTypes4.component2();
                TypeParameterDescriptor typeParameterDescriptor2 = c20009b2.f63327a;
                ApproximationBounds approximationBounds = new ApproximationBounds(new C20009b(typeParameterDescriptor2, kotlinTypeComponent2, kotlinTypeComponent3), new C20009b(typeParameterDescriptor2, kotlinTypeComponent1, kotlinTypeComponent4));
                C20009b c20009b3 = (C20009b) approximationBounds.component1();
                C20009b c20009b4 = (C20009b) approximationBounds.component2();
                arrayList.add(c20009b3);
                arrayList2.add(c20009b4);
            }
        }
    }

    public static final TypeProjection approximateCapturedTypesIfNecessary(TypeProjection typeProjection, boolean z6) {
        if (typeProjection == null) {
            return null;
        }
        if (typeProjection.isStarProjection()) {
            return typeProjection;
        }
        KotlinType type = typeProjection.getType();
        AbstractC16544l.m18093f(type, "getType(...)");
        if (!TypeUtils.contains(type, C20008a.f63326Y)) {
            return typeProjection;
        }
        Variance projectionKind = typeProjection.getProjectionKind();
        AbstractC16544l.m18093f(projectionKind, "getProjectionKind(...)");
        if (projectionKind == Variance.OUT_VARIANCE) {
            return new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getUpper());
        }
        if (z6) {
            return new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getLower());
        }
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(new C16635x12aaa596());
        AbstractC16544l.m18093f(typeSubstitutorCreate, "create(...)");
        return typeSubstitutorCreate.substituteWithoutApproximation(typeProjection);
    }
}
