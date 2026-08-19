package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import p001A.AbstractC0010F;
import p379Pb.LVf.efyhmdM;
import pn.C18525l;
import pn.C18526m;

/* JADX INFO: loaded from: classes2.dex */
public class TypeSubstitutor {
    public static final TypeSubstitutor EMPTY = create(TypeSubstitution.EMPTY);

    /* JADX INFO: renamed from: a */
    public final TypeSubstitution f53215a;

    public TypeSubstitutor(TypeSubstitution typeSubstitution) {
        if (typeSubstitution != null) {
            this.f53215a = typeSubstitution;
        } else {
            m18428a(7);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18428a(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    i11 = 2;
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i11 = 2;
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i11 = 2;
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i11 = 2;
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = efyhmdM.yUiZGtx;
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i10 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i10 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i10 == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i10 != 37) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static int m18429b(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        if (variance == variance3 && variance2 == Variance.OUT_VARIANCE) {
            return 3;
        }
        return (variance == Variance.OUT_VARIANCE && variance2 == variance3) ? 2 : 1;
    }

    /* JADX INFO: renamed from: c */
    public static String m18430c(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (ExceptionUtilsKt.isProcessCanceledException(th2)) {
                throw th2;
            }
            return "[Exception while computing toString(): " + th2 + "]";
        }
    }

    public static Variance combine(Variance variance, TypeProjection typeProjection) {
        if (variance == null) {
            m18428a(35);
            throw null;
        }
        if (typeProjection == null) {
            m18428a(36);
            throw null;
        }
        if (!typeProjection.isStarProjection()) {
            return combine(variance, typeProjection.getProjectionKind());
        }
        Variance variance2 = Variance.OUT_VARIANCE;
        if (variance2 != null) {
            return variance2;
        }
        m18428a(37);
        throw null;
    }

    public static TypeSubstitutor create(TypeSubstitution typeSubstitution) {
        if (typeSubstitution != null) {
            return new TypeSubstitutor(typeSubstitution);
        }
        m18428a(0);
        throw null;
    }

    public static TypeSubstitutor createChainedSubstitutor(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            m18428a(3);
            throw null;
        }
        if (typeSubstitution2 != null) {
            return create(DisjointKeysUnionTypeSubstitution.create(typeSubstitution, typeSubstitution2));
        }
        m18428a(4);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public final TypeProjection m18431d(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor, int i10) throws C18526m {
        char c9;
        if (typeProjection == null) {
            m18428a(18);
            throw null;
        }
        TypeSubstitution typeSubstitution = this.f53215a;
        if (i10 > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + m18430c(typeProjection) + "; substitution: " + m18430c(typeSubstitution));
        }
        if (typeProjection.isStarProjection()) {
            return typeProjection;
        }
        KotlinType type = typeProjection.getType();
        if (type instanceof TypeWithEnhancement) {
            TypeWithEnhancement typeWithEnhancement = (TypeWithEnhancement) type;
            UnwrappedType origin = typeWithEnhancement.getOrigin();
            KotlinType enhancement = typeWithEnhancement.getEnhancement();
            TypeProjection typeProjectionM18431d = m18431d(new TypeProjectionImpl(typeProjection.getProjectionKind(), origin), typeParameterDescriptor, i10 + 1);
            return typeProjectionM18431d.isStarProjection() ? typeProjectionM18431d : new TypeProjectionImpl(typeProjectionM18431d.getProjectionKind(), TypeWithEnhancementKt.wrapEnhancement(typeProjectionM18431d.getType().unwrap(), substitute(enhancement, typeProjection.getProjectionKind())));
        }
        if (!DynamicTypesKt.isDynamic(type) && !(type.unwrap() instanceof RawType)) {
            TypeProjection typeProjectionMo22592get = typeSubstitution.mo22592get(type);
            if (typeProjectionMo22592get == null) {
                typeProjectionMo22592get = null;
            } else if (type.getAnnotations().hasAnnotation(StandardNames.FqNames.unsafeVariance)) {
                TypeConstructor constructor = typeProjectionMo22592get.getType().getConstructor();
                if (constructor instanceof NewCapturedTypeConstructor) {
                    TypeProjection projection = ((NewCapturedTypeConstructor) constructor).getProjection();
                    Variance projectionKind = projection.getProjectionKind();
                    if (m18429b(typeProjection.getProjectionKind(), projectionKind) == 3) {
                        typeProjectionMo22592get = new TypeProjectionImpl(projection.getType());
                    } else if (typeParameterDescriptor != null && m18429b(typeParameterDescriptor.getVariance(), projectionKind) == 3) {
                        typeProjectionMo22592get = new TypeProjectionImpl(projection.getType());
                    }
                }
            }
            Variance projectionKind2 = typeProjection.getProjectionKind();
            if (typeProjectionMo22592get == null && FlexibleTypesKt.isFlexible(type) && !TypeCapabilitiesKt.isCustomTypeParameter(type)) {
                FlexibleType flexibleTypeAsFlexibleType = FlexibleTypesKt.asFlexibleType(type);
                int i11 = i10 + 1;
                TypeProjection typeProjectionM18431d2 = m18431d(new TypeProjectionImpl(projectionKind2, flexibleTypeAsFlexibleType.getLowerBound()), typeParameterDescriptor, i11);
                TypeProjection typeProjectionM18431d3 = m18431d(new TypeProjectionImpl(projectionKind2, flexibleTypeAsFlexibleType.getUpperBound()), typeParameterDescriptor, i11);
                return (typeProjectionM18431d2.getType() == flexibleTypeAsFlexibleType.getLowerBound() && typeProjectionM18431d3.getType() == flexibleTypeAsFlexibleType.getUpperBound()) ? typeProjection : new TypeProjectionImpl(typeProjectionM18431d2.getProjectionKind(), KotlinTypeFactory.flexibleType(TypeSubstitutionKt.asSimpleType(typeProjectionM18431d2.getType()), TypeSubstitutionKt.asSimpleType(typeProjectionM18431d3.getType())));
            }
            if (!KotlinBuiltIns.isNothing(type) && !KotlinTypeKt.isError(type)) {
                if (typeProjectionMo22592get != null) {
                    int iM18429b = m18429b(projectionKind2, typeProjectionMo22592get.getProjectionKind());
                    if (!CapturedTypeConstructorKt.isCaptured(type)) {
                        int iM24h = AbstractC0010F.m24h(iM18429b);
                        if (iM24h == 1) {
                            return new TypeProjectionImpl(Variance.OUT_VARIANCE, type.getConstructor().getBuiltIns().getNullableAnyType());
                        }
                        if (iM24h == 2) {
                            throw new C18526m("Out-projection in in-position");
                        }
                    }
                    CustomTypeParameter customTypeParameter = TypeCapabilitiesKt.getCustomTypeParameter(type);
                    if (typeProjectionMo22592get.isStarProjection()) {
                        return typeProjectionMo22592get;
                    }
                    KotlinType kotlinTypeSubstitutionResult = customTypeParameter != null ? customTypeParameter.substitutionResult(typeProjectionMo22592get.getType()) : TypeUtils.makeNullableIfNeeded(typeProjectionMo22592get.getType(), type.isMarkedNullable());
                    if (!type.getAnnotations().isEmpty()) {
                        Annotations annotationsFilterAnnotations = typeSubstitution.filterAnnotations(type.getAnnotations());
                        if (annotationsFilterAnnotations == null) {
                            m18428a(33);
                            throw null;
                        }
                        if (annotationsFilterAnnotations.hasAnnotation(StandardNames.FqNames.unsafeVariance)) {
                            annotationsFilterAnnotations = new FilteredAnnotations(annotationsFilterAnnotations, new C18525l());
                        }
                        kotlinTypeSubstitutionResult = TypeUtilsKt.replaceAnnotations(kotlinTypeSubstitutionResult, new CompositeAnnotations(kotlinTypeSubstitutionResult.getAnnotations(), annotationsFilterAnnotations));
                    }
                    if (iM18429b == 1) {
                        projectionKind2 = combine(projectionKind2, typeProjectionMo22592get.getProjectionKind());
                    }
                    return new TypeProjectionImpl(projectionKind2, kotlinTypeSubstitutionResult);
                }
                KotlinType type2 = typeProjection.getType();
                Variance projectionKind3 = typeProjection.getProjectionKind();
                if (type2.getConstructor().mo22589getDeclarationDescriptor() instanceof TypeParameterDescriptor) {
                    return typeProjection;
                }
                SimpleType abbreviation = SpecialTypesKt.getAbbreviation(type2);
                KotlinType kotlinTypeSubstitute = abbreviation != null ? replaceWithNonApproximatingSubstitution().substitute(abbreviation, Variance.INVARIANT) : null;
                List<TypeParameterDescriptor> parameters = type2.getConstructor().getParameters();
                List<TypeProjection> arguments = type2.getArguments();
                ArrayList arrayList = new ArrayList(parameters.size());
                boolean z6 = false;
                for (int i12 = 0; i12 < parameters.size(); i12++) {
                    TypeParameterDescriptor typeParameterDescriptor2 = parameters.get(i12);
                    TypeProjection typeProjection2 = arguments.get(i12);
                    TypeProjection typeProjectionM18431d4 = m18431d(typeProjection2, typeParameterDescriptor2, i10 + 1);
                    int iM24h2 = AbstractC0010F.m24h(m18429b(typeParameterDescriptor2.getVariance(), typeProjectionM18431d4.getProjectionKind()));
                    if (iM24h2 != 0) {
                        if (iM24h2 != 1) {
                            c9 = 2;
                            if (iM24h2 == 2) {
                            }
                        } else {
                            c9 = 2;
                        }
                        typeProjectionM18431d4 = TypeUtils.makeStarProjection(typeParameterDescriptor2);
                    } else {
                        c9 = 2;
                        Variance variance = typeParameterDescriptor2.getVariance();
                        Variance variance2 = Variance.INVARIANT;
                        if (variance != variance2 && !typeProjectionM18431d4.isStarProjection()) {
                            typeProjectionM18431d4 = new TypeProjectionImpl(variance2, typeProjectionM18431d4.getType());
                        }
                    }
                    if (typeProjectionM18431d4 != typeProjection2) {
                        z6 = true;
                    }
                    arrayList.add(typeProjectionM18431d4);
                }
                if (z6) {
                    arguments = arrayList;
                }
                KotlinType kotlinTypeReplace = TypeSubstitutionKt.replace(type2, arguments, typeSubstitution.filterAnnotations(type2.getAnnotations()));
                if ((kotlinTypeReplace instanceof SimpleType) && (kotlinTypeSubstitute instanceof SimpleType)) {
                    kotlinTypeReplace = SpecialTypesKt.withAbbreviation((SimpleType) kotlinTypeReplace, (SimpleType) kotlinTypeSubstitute);
                }
                return new TypeProjectionImpl(projectionKind3, kotlinTypeReplace);
            }
        }
        return typeProjection;
    }

    public TypeSubstitution getSubstitution() {
        TypeSubstitution typeSubstitution = this.f53215a;
        if (typeSubstitution != null) {
            return typeSubstitution;
        }
        m18428a(8);
        throw null;
    }

    public boolean isEmpty() {
        return this.f53215a.isEmpty();
    }

    public TypeSubstitutor replaceWithNonApproximatingSubstitution() {
        TypeSubstitution typeSubstitution = this.f53215a;
        return ((typeSubstitution instanceof IndexedParametersSubstitution) && typeSubstitution.approximateContravariantCapturedTypes()) ? new TypeSubstitutor(new IndexedParametersSubstitution(((IndexedParametersSubstitution) typeSubstitution).getParameters(), ((IndexedParametersSubstitution) typeSubstitution).getArguments(), false)) : this;
    }

    public KotlinType safeSubstitute(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            m18428a(9);
            throw null;
        }
        if (variance == null) {
            m18428a(10);
            throw null;
        }
        if (isEmpty()) {
            if (kotlinType != null) {
                return kotlinType;
            }
            m18428a(11);
            throw null;
        }
        try {
            KotlinType type = m18431d(new TypeProjectionImpl(variance, kotlinType), null, 0).getType();
            if (type != null) {
                return type;
            }
            m18428a(12);
            throw null;
        } catch (C18526m e10) {
            ErrorType errorTypeCreateErrorType = ErrorUtils.createErrorType(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e10.getMessage());
            if (errorTypeCreateErrorType != null) {
                return errorTypeCreateErrorType;
            }
            m18428a(13);
            throw null;
        }
    }

    public KotlinType substitute(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            m18428a(14);
            throw null;
        }
        if (variance == null) {
            m18428a(15);
            throw null;
        }
        TypeProjection typeProjectionSubstitute = substitute(new TypeProjectionImpl(variance, getSubstitution().prepareTopLevelType(kotlinType, variance)));
        if (typeProjectionSubstitute == null) {
            return null;
        }
        return typeProjectionSubstitute.getType();
    }

    public TypeProjection substituteWithoutApproximation(TypeProjection typeProjection) {
        if (typeProjection == null) {
            m18428a(17);
            throw null;
        }
        if (isEmpty()) {
            return typeProjection;
        }
        try {
            return m18431d(typeProjection, null, 0);
        } catch (C18526m unused) {
            return null;
        }
    }

    public static TypeSubstitutor create(KotlinType kotlinType) {
        if (kotlinType != null) {
            return create(TypeConstructorSubstitution.create(kotlinType.getConstructor(), kotlinType.getArguments()));
        }
        m18428a(6);
        throw null;
    }

    public static Variance combine(Variance variance, Variance variance2) {
        if (variance == null) {
            m18428a(38);
            throw null;
        }
        if (variance2 != null) {
            Variance variance3 = Variance.INVARIANT;
            if (variance == variance3) {
                if (variance2 != null) {
                    return variance2;
                }
                m18428a(40);
                throw null;
            }
            if (variance2 == variance3) {
                if (variance != null) {
                    return variance;
                }
                m18428a(41);
                throw null;
            }
            if (variance == variance2) {
                if (variance2 != null) {
                    return variance2;
                }
                m18428a(42);
                throw null;
            }
            throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
        }
        m18428a(39);
        throw null;
    }

    public TypeProjection substitute(TypeProjection typeProjection) {
        if (typeProjection != null) {
            TypeProjection typeProjectionSubstituteWithoutApproximation = substituteWithoutApproximation(typeProjection);
            TypeSubstitution typeSubstitution = this.f53215a;
            return (typeSubstitution.approximateCapturedTypes() || typeSubstitution.approximateContravariantCapturedTypes()) ? CapturedTypeApproximationKt.approximateCapturedTypesIfNecessary(typeProjectionSubstituteWithoutApproximation, typeSubstitution.approximateContravariantCapturedTypes()) : typeProjectionSubstituteWithoutApproximation;
        }
        m18428a(16);
        throw null;
    }
}
