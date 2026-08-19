package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p449S9.C7042K;
import p648an.C10755c;
import p826j6.C16137F;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeEnhancement {

    /* JADX INFO: renamed from: a */
    public final JavaResolverSettings f51978a;

    public JavaTypeEnhancement(JavaResolverSettings javaResolverSettings) {
        AbstractC16544l.m18094g(javaResolverSettings, "javaResolverSettings");
        this.f51978a = javaResolverSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX INFO: renamed from: a */
    public final C7042K m18230a(SimpleType simpleType, InterfaceC1436k interfaceC1436k, int i10, TypeComponentPosition typeComponentPosition, boolean z6, boolean z10) {
        TypeConstructor constructor;
        boolean z11;
        boolean z12;
        C16137F c16137f;
        TypeProjection typeProjectionMakeStarProjection;
        boolean zShouldEnhance = TypeComponentPositionKt.shouldEnhance(typeComponentPosition);
        ?? r6 = 0;
        boolean z13 = (z10 && z6) ? false : true;
        Object obj = null;
        if (!zShouldEnhance && simpleType.getArguments().isEmpty()) {
            return new C7042K(null, 1, false);
        }
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = simpleType.getConstructor().mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor == null) {
            return new C7042K(null, 1, false);
        }
        JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) interfaceC1436k.invoke(Integer.valueOf(i10));
        ClassifierDescriptor classifierDescriptorAccess$enhanceMutability = TypeEnhancementKt.access$enhanceMutability(classifierDescriptorMo22589getDeclarationDescriptor, javaTypeQualifiers, typeComponentPosition);
        Boolean boolAccess$getEnhancedNullability = TypeEnhancementKt.access$getEnhancedNullability(javaTypeQualifiers, typeComponentPosition);
        if (classifierDescriptorAccess$enhanceMutability == null || (constructor = classifierDescriptorAccess$enhanceMutability.getTypeConstructor()) == null) {
            constructor = simpleType.getConstructor();
        }
        TypeConstructor typeConstructor = constructor;
        int i11 = i10 + 1;
        List<TypeProjection> arguments = simpleType.getArguments();
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        AbstractC16544l.m18093f(parameters, "getParameters(...)");
        List<TypeParameterDescriptor> list = parameters;
        Iterator<T> it = arguments.iterator();
        Iterator<T> it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC17682p.m19389r(arguments, 10), AbstractC17682p.m19389r(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
            TypeProjection typeProjection = (TypeProjection) next;
            if (z13) {
                z12 = z13;
                if (!typeProjection.isStarProjection()) {
                    c16137f = m18231b(typeProjection.getType().unwrap(), interfaceC1436k, i11, z10);
                } else if (((JavaTypeQualifiers) interfaceC1436k.invoke(Integer.valueOf(i11))).getNullability() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                    UnwrappedType unwrappedTypeUnwrap = typeProjection.getType().unwrap();
                    c16137f = new C16137F(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(unwrappedTypeUnwrap).makeNullableAsSpecified((boolean) r6), FlexibleTypesKt.upperIfFlexible(unwrappedTypeUnwrap).makeNullableAsSpecified(true)), 1, 7);
                } else {
                    c16137f = new C16137F(null, 1, 7);
                }
            } else {
                z12 = z13;
                c16137f = new C16137F(obj, r6, 7);
            }
            i11 += c16137f.f50063Z;
            UnwrappedType unwrappedType = (UnwrappedType) c16137f.f50064o0;
            if (unwrappedType != null) {
                Variance projectionKind = typeProjection.getProjectionKind();
                AbstractC16544l.m18093f(projectionKind, "getProjectionKind(...)");
                typeProjectionMakeStarProjection = TypeUtilsKt.createProjection(unwrappedType, projectionKind, typeParameterDescriptor);
            } else if (classifierDescriptorAccess$enhanceMutability == null || typeProjection.isStarProjection()) {
                typeProjectionMakeStarProjection = classifierDescriptorAccess$enhanceMutability != null ? TypeUtils.makeStarProjection(typeParameterDescriptor) : null;
            } else {
                KotlinType type = typeProjection.getType();
                AbstractC16544l.m18093f(type, "getType(...)");
                Variance projectionKind2 = typeProjection.getProjectionKind();
                AbstractC16544l.m18093f(projectionKind2, "getProjectionKind(...)");
                typeProjectionMakeStarProjection = TypeUtilsKt.createProjection(type, projectionKind2, typeParameterDescriptor);
            }
            arrayList.add(typeProjectionMakeStarProjection);
            z13 = z12;
            r6 = 0;
            obj = null;
        }
        int i12 = i11 - i10;
        if (classifierDescriptorAccess$enhanceMutability == null && boolAccess$getEnhancedNullability == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((TypeProjection) it3.next()) == null);
            }
            return new C7042K(null, i12, false);
        }
        Annotations annotations = simpleType.getAnnotations();
        C10755c c10755c = TypeEnhancementKt.f52008b;
        if (classifierDescriptorAccess$enhanceMutability == null) {
            c10755c = null;
        }
        TypeAttributes defaultAttributes = TypeAttributesKt.toDefaultAttributes(TypeEnhancementKt.access$compositeAnnotationsOrSingle(AbstractC17678l.m19315v(new Annotations[]{annotations, c10755c, boolAccess$getEnhancedNullability != null ? TypeEnhancementKt.getENHANCED_NULLABILITY_ANNOTATIONS() : null})));
        List<TypeProjection> arguments2 = simpleType.getArguments();
        Iterator it4 = arrayList.iterator();
        Iterator<T> it5 = arguments2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(AbstractC17682p.m19389r(arrayList, 10), AbstractC17682p.m19389r(arguments2, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            TypeProjection typeProjection2 = (TypeProjection) it5.next();
            TypeProjection typeProjection3 = (TypeProjection) next2;
            if (typeProjection3 != null) {
                typeProjection2 = typeProjection3;
            }
            arrayList2.add(typeProjection2);
        }
        SimpleType simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(defaultAttributes, typeConstructor, arrayList2, boolAccess$getEnhancedNullability != null ? boolAccess$getEnhancedNullability.booleanValue() : simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
        if (!javaTypeQualifiers.getDefinitelyNotNull()) {
            z11 = true;
        } else if (this.f51978a.getCorrectNullabilityForNotNullTypeParameter()) {
            z11 = true;
            simpleTypeSimpleType$default = SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleTypeSimpleType$default, true);
        } else {
            z11 = true;
            simpleTypeSimpleType$default = new NotNullTypeParameterImpl(simpleTypeSimpleType$default);
        }
        return new C7042K(simpleTypeSimpleType$default, i12, (boolAccess$getEnhancedNullability == null || !javaTypeQualifiers.isNullabilityQualifierForWarning()) ? false : z11);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX INFO: renamed from: b */
    public final C16137F m18231b(UnwrappedType unwrappedType, InterfaceC1436k interfaceC1436k, int i10, boolean z6) {
        UnwrappedType unwrappedType2;
        SimpleType simpleType;
        SimpleType lowerBound;
        SimpleType lowerBound2;
        Object objWrapEnhancement = null;
        if (KotlinTypeKt.isError(unwrappedType)) {
            return new C16137F(null, 1, 7);
        }
        if (!(unwrappedType instanceof FlexibleType)) {
            if (!(unwrappedType instanceof SimpleType)) {
                throw new C0644w();
            }
            C7042K c7042kM18230a = m18230a((SimpleType) unwrappedType, interfaceC1436k, i10, TypeComponentPosition.INFLEXIBLE, false, z6);
            boolean z10 = c7042kM18230a.f22495b;
            KotlinType kotlinTypeWrapEnhancement = (SimpleType) c7042kM18230a.f22496c;
            if (z10) {
                kotlinTypeWrapEnhancement = TypeWithEnhancementKt.wrapEnhancement(unwrappedType, kotlinTypeWrapEnhancement);
            }
            return new C16137F(kotlinTypeWrapEnhancement, c7042kM18230a.f22494a, 7);
        }
        boolean z11 = unwrappedType instanceof RawType;
        FlexibleType flexibleType = (FlexibleType) unwrappedType;
        C7042K c7042kM18230a2 = m18230a(flexibleType.getLowerBound(), interfaceC1436k, i10, TypeComponentPosition.FLEXIBLE_LOWER, z11, z6);
        C7042K c7042kM18230a3 = m18230a(flexibleType.getUpperBound(), interfaceC1436k, i10, TypeComponentPosition.FLEXIBLE_UPPER, z11, z6);
        SimpleType simpleType2 = (SimpleType) c7042kM18230a2.f22496c;
        SimpleType upperBound = (SimpleType) c7042kM18230a3.f22496c;
        if (simpleType2 != null || upperBound != null) {
            if (c7042kM18230a2.f22495b || c7042kM18230a3.f22495b) {
                if (upperBound == null) {
                    AbstractC16544l.m18091d(simpleType2);
                    unwrappedType2 = simpleType2;
                } else {
                    UnwrappedType unwrappedTypeFlexibleType = KotlinTypeFactory.flexibleType(simpleType2 == null ? upperBound : simpleType2, upperBound);
                    if (unwrappedTypeFlexibleType == null) {
                        AbstractC16544l.m18091d(simpleType2);
                        unwrappedType2 = simpleType2;
                    } else {
                        unwrappedType2 = unwrappedTypeFlexibleType;
                    }
                }
                objWrapEnhancement = TypeWithEnhancementKt.wrapEnhancement(unwrappedType, unwrappedType2);
            } else if (z11) {
                SimpleType simpleType3 = simpleType2;
                if (simpleType2 == null) {
                    lowerBound2 = flexibleType.getLowerBound();
                }
                if (upperBound == null) {
                    simpleType3 = lowerBound2;
                    upperBound = flexibleType.getUpperBound();
                }
                simpleType3 = lowerBound2;
                objWrapEnhancement = new RawTypeImpl(simpleType3, upperBound);
            } else {
                if (simpleType2 == null) {
                    lowerBound = flexibleType.getLowerBound();
                }
                if (upperBound == null) {
                    simpleType = lowerBound;
                    upperBound = flexibleType.getUpperBound();
                }
                simpleType = lowerBound;
                objWrapEnhancement = KotlinTypeFactory.flexibleType(simpleType, upperBound);
            }
        }
        return new C16137F(objWrapEnhancement, c7042kM18230a2.f22494a, 7);
    }

    public final KotlinType enhance(KotlinType kotlinType, InterfaceC1436k qualifiers, boolean z6) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        AbstractC16544l.m18094g(qualifiers, "qualifiers");
        return (UnwrappedType) m18231b(kotlinType.unwrap(), qualifiers, 0, z6).f50064o0;
    }
}
