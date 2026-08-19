package kotlin.reflect.jvm.internal.impl.types;

import com.statsig.androidsdk.StatsigLoggerKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public class TypeUtils {
    public static final SimpleType DONT_CARE = ErrorUtils.createErrorType(ErrorTypeKind.DONT_CARE, new String[0]);
    public static final SimpleType CANNOT_INFER_FUNCTION_PARAM_TYPE = ErrorUtils.createErrorType(ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);
    public static final SimpleType NO_EXPECTED_TYPE = new SpecialType("NO_EXPECTED_TYPE");
    public static final SimpleType UNIT_EXPECTED_TYPE = new SpecialType("UNIT_EXPECTED_TYPE");

    public static class SpecialType extends DelegatingSimpleType {

        /* JADX INFO: renamed from: Z */
        public final String f53217Z;

        public SpecialType(String str) {
            this.f53217Z = str;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0030  */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m18434a(int i10) {
            String str = (i10 == 1 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else if (i10 == 2) {
                objArr[0] = "delegate";
            } else if (i10 == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i10 != 4) {
                objArr[0] = "newAttributes";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            }
            if (i10 == 1) {
                objArr[1] = "toString";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i10 == 3) {
                    objArr[2] = "refine";
                } else if (i10 != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        public final SimpleType getDelegate() {
            throw new IllegalStateException(this.f53217Z);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
        public SpecialType refine(KotlinTypeRefiner kotlinTypeRefiner) {
            if (kotlinTypeRefiner != null) {
                return this;
            }
            m18434a(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        public DelegatingSimpleType replaceDelegate(SimpleType simpleType) {
            if (simpleType != null) {
                throw new IllegalStateException(this.f53217Z);
            }
            m18434a(2);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
        public String toString() {
            String str = this.f53217Z;
            if (str != null) {
                return str;
            }
            m18434a(1);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        public SimpleType makeNullableAsSpecified(boolean z6) {
            throw new IllegalStateException(this.f53217Z);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        public SimpleType replaceAttributes(TypeAttributes typeAttributes) {
            if (typeAttributes != null) {
                throw new IllegalStateException(this.f53217Z);
            }
            m18434a(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18432a(int i10) {
        String str;
        int i11;
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 56:
                case 57:
                case 58:
                case 59:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i10 == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i10 == 11 || i10 == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i10 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i10 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i10 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i10 == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i10 == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i10 != 53) {
            if (i10 != 6 && i10 != 7) {
                switch (i10) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i10) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 48 && i10 != 53 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean acceptsNullable(KotlinType kotlinType) {
        if (kotlinType == null) {
            m18432a(28);
            throw null;
        }
        if (kotlinType.isMarkedNullable()) {
            return true;
        }
        return FlexibleTypesKt.isFlexible(kotlinType) && acceptsNullable(FlexibleTypesKt.asFlexibleType(kotlinType).getUpperBound());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18433b(KotlinType kotlinType, InterfaceC1436k interfaceC1436k, SmartSet smartSet) {
        if (interfaceC1436k == null) {
            m18432a(44);
            throw null;
        }
        if (kotlinType == null) {
            return false;
        }
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (noExpectedType(kotlinType)) {
            return ((Boolean) interfaceC1436k.invoke(unwrappedTypeUnwrap)).booleanValue();
        }
        if (smartSet != null && smartSet.contains(kotlinType)) {
            return false;
        }
        if (((Boolean) interfaceC1436k.invoke(unwrappedTypeUnwrap)).booleanValue()) {
            return true;
        }
        if (smartSet == null) {
            smartSet = SmartSet.create();
        }
        smartSet.add(kotlinType);
        FlexibleType flexibleType = unwrappedTypeUnwrap instanceof FlexibleType ? (FlexibleType) unwrappedTypeUnwrap : null;
        if (flexibleType != null && (m18433b(flexibleType.getLowerBound(), interfaceC1436k, smartSet) || m18433b(flexibleType.getUpperBound(), interfaceC1436k, smartSet))) {
            return true;
        }
        if ((unwrappedTypeUnwrap instanceof DefinitelyNotNullType) && m18433b(((DefinitelyNotNullType) unwrappedTypeUnwrap).getOriginal(), interfaceC1436k, smartSet)) {
            return true;
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof IntersectionTypeConstructor) {
            Iterator<KotlinType> it = ((IntersectionTypeConstructor) constructor).getSupertypes().iterator();
            while (it.hasNext()) {
                if (m18433b(it.next(), interfaceC1436k, smartSet)) {
                    return true;
                }
            }
            return false;
        }
        for (TypeProjection typeProjection : kotlinType.getArguments()) {
            if (!typeProjection.isStarProjection()) {
                if (m18433b(typeProjection.getType(), interfaceC1436k, smartSet)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean contains(KotlinType kotlinType, InterfaceC1436k interfaceC1436k) {
        if (interfaceC1436k != null) {
            return m18433b(kotlinType, interfaceC1436k, null);
        }
        m18432a(43);
        throw null;
    }

    public static KotlinType createSubstitutedSupertype(KotlinType kotlinType, KotlinType kotlinType2, TypeSubstitutor typeSubstitutor) {
        if (kotlinType == null) {
            m18432a(20);
            throw null;
        }
        if (kotlinType2 == null) {
            m18432a(21);
            throw null;
        }
        if (typeSubstitutor == null) {
            m18432a(22);
            throw null;
        }
        KotlinType kotlinTypeSubstitute = typeSubstitutor.substitute(kotlinType2, Variance.INVARIANT);
        if (kotlinTypeSubstitute != null) {
            return makeNullableIfNeeded(kotlinTypeSubstitute, kotlinType.isMarkedNullable());
        }
        return null;
    }

    public static ClassDescriptor getClassDescriptor(KotlinType kotlinType) {
        if (kotlinType == null) {
            m18432a(30);
            throw null;
        }
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor;
        }
        return null;
    }

    public static List<TypeProjection> getDefaultTypeProjections(List<TypeParameterDescriptor> list) {
        if (list == null) {
            m18432a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new TypeProjectionImpl(it.next().getDefaultType()));
        }
        return AbstractC17680n.m19322C0(arrayList);
    }

    public static List<KotlinType> getImmediateSupertypes(KotlinType kotlinType) {
        if (kotlinType == null) {
            m18432a(18);
            throw null;
        }
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(kotlinType);
        Collection<KotlinType> supertypes = kotlinType.getConstructor().getSupertypes();
        ArrayList arrayList = new ArrayList(supertypes.size());
        Iterator<KotlinType> it = supertypes.iterator();
        while (it.hasNext()) {
            KotlinType kotlinTypeCreateSubstitutedSupertype = createSubstitutedSupertype(kotlinType, it.next(), typeSubstitutorCreate);
            if (kotlinTypeCreateSubstitutedSupertype != null) {
                arrayList.add(kotlinTypeCreateSubstitutedSupertype);
            }
        }
        return arrayList;
    }

    public static TypeParameterDescriptor getTypeParameterDescriptorOrNull(KotlinType kotlinType) {
        if (kotlinType == null) {
            m18432a(63);
            throw null;
        }
        if (kotlinType.getConstructor().mo22589getDeclarationDescriptor() instanceof TypeParameterDescriptor) {
            return (TypeParameterDescriptor) kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        }
        return null;
    }

    public static boolean hasNullableSuperType(KotlinType kotlinType) {
        if (kotlinType == null) {
            m18432a(29);
            throw null;
        }
        if (kotlinType.getConstructor().mo22589getDeclarationDescriptor() instanceof ClassDescriptor) {
            return false;
        }
        Iterator<KotlinType> it = getImmediateSupertypes(kotlinType).iterator();
        while (it.hasNext()) {
            if (isNullableType(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDontCarePlaceholder(KotlinType kotlinType) {
        return kotlinType != null && kotlinType.getConstructor() == DONT_CARE.getConstructor();
    }

    public static boolean isNullableType(KotlinType kotlinType) {
        if (kotlinType == null) {
            m18432a(27);
            throw null;
        }
        if (kotlinType.isMarkedNullable()) {
            return true;
        }
        if (FlexibleTypesKt.isFlexible(kotlinType) && isNullableType(FlexibleTypesKt.asFlexibleType(kotlinType).getUpperBound())) {
            return true;
        }
        if (SpecialTypesKt.isDefinitelyNotNullType(kotlinType)) {
            return false;
        }
        if (isTypeParameter(kotlinType)) {
            return hasNullableSuperType(kotlinType);
        }
        if (kotlinType instanceof AbstractStubType) {
            TypeParameterDescriptor originalTypeParameter = ((AbstractStubType) kotlinType).getOriginalTypeVariable().getOriginalTypeParameter();
            return originalTypeParameter == null || hasNullableSuperType(originalTypeParameter.getDefaultType());
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof IntersectionTypeConstructor) {
            Iterator<KotlinType> it = constructor.getSupertypes().iterator();
            while (it.hasNext()) {
                if (isNullableType(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isTypeParameter(KotlinType kotlinType) {
        if (kotlinType != null) {
            return getTypeParameterDescriptorOrNull(kotlinType) != null || (kotlinType.getConstructor() instanceof NewTypeVariableConstructor);
        }
        m18432a(60);
        throw null;
    }

    public static KotlinType makeNotNullable(KotlinType kotlinType) {
        if (kotlinType != null) {
            return makeNullableAsSpecified(kotlinType, false);
        }
        m18432a(2);
        throw null;
    }

    public static KotlinType makeNullable(KotlinType kotlinType) {
        if (kotlinType != null) {
            return makeNullableAsSpecified(kotlinType, true);
        }
        m18432a(1);
        throw null;
    }

    public static KotlinType makeNullableAsSpecified(KotlinType kotlinType, boolean z6) {
        if (kotlinType == null) {
            m18432a(3);
            throw null;
        }
        UnwrappedType unwrappedTypeMakeNullableAsSpecified = kotlinType.unwrap().makeNullableAsSpecified(z6);
        if (unwrappedTypeMakeNullableAsSpecified != null) {
            return unwrappedTypeMakeNullableAsSpecified;
        }
        m18432a(4);
        throw null;
    }

    public static SimpleType makeNullableIfNeeded(SimpleType simpleType, boolean z6) {
        if (simpleType == null) {
            m18432a(5);
            throw null;
        }
        if (!z6) {
            if (simpleType != null) {
                return simpleType;
            }
            m18432a(7);
            throw null;
        }
        SimpleType simpleTypeMakeNullableAsSpecified = simpleType.makeNullableAsSpecified(true);
        if (simpleTypeMakeNullableAsSpecified != null) {
            return simpleTypeMakeNullableAsSpecified;
        }
        m18432a(6);
        throw null;
    }

    public static TypeProjection makeStarProjection(TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor != null) {
            return new StarProjectionImpl(typeParameterDescriptor);
        }
        m18432a(45);
        throw null;
    }

    public static SimpleType makeUnsubstitutedType(ClassifierDescriptor classifierDescriptor, MemberScope memberScope, InterfaceC1436k interfaceC1436k) {
        if (!ErrorUtils.isError(classifierDescriptor)) {
            return makeUnsubstitutedType(classifierDescriptor.getTypeConstructor(), memberScope, interfaceC1436k);
        }
        ErrorType errorTypeCreateErrorType = ErrorUtils.createErrorType(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, classifierDescriptor.toString());
        if (errorTypeCreateErrorType != null) {
            return errorTypeCreateErrorType;
        }
        m18432a(11);
        throw null;
    }

    public static boolean noExpectedType(KotlinType kotlinType) {
        if (kotlinType != null) {
            return kotlinType == NO_EXPECTED_TYPE || kotlinType == UNIT_EXPECTED_TYPE;
        }
        m18432a(0);
        throw null;
    }

    public static TypeProjection makeStarProjection(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
        if (typeParameterDescriptor != null) {
            if (erasureTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) {
                return new TypeProjectionImpl(StarProjectionImplKt.starProjectionType(typeParameterDescriptor));
            }
            return new StarProjectionImpl(typeParameterDescriptor);
        }
        m18432a(46);
        throw null;
    }

    public static KotlinType makeNullableIfNeeded(KotlinType kotlinType, boolean z6) {
        if (kotlinType == null) {
            m18432a(8);
            throw null;
        }
        if (z6) {
            return makeNullable(kotlinType);
        }
        if (kotlinType != null) {
            return kotlinType;
        }
        m18432a(9);
        throw null;
    }

    public static SimpleType makeUnsubstitutedType(TypeConstructor typeConstructor, MemberScope memberScope, InterfaceC1436k interfaceC1436k) {
        if (typeConstructor == null) {
            m18432a(12);
            throw null;
        }
        if (memberScope == null) {
            m18432a(13);
            throw null;
        }
        if (interfaceC1436k != null) {
            SimpleType simpleTypeSimpleTypeWithNonTrivialMemberScope = KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), typeConstructor, getDefaultTypeProjections(typeConstructor.getParameters()), false, memberScope, interfaceC1436k);
            if (simpleTypeSimpleTypeWithNonTrivialMemberScope != null) {
                return simpleTypeSimpleTypeWithNonTrivialMemberScope;
            }
            m18432a(15);
            throw null;
        }
        m18432a(14);
        throw null;
    }
}
