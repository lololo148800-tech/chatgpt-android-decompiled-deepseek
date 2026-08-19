package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import p025An.C0644w;
import p571X9.AbstractC9393x3;
import p630Zm.C10426b;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class AbstractTypeChecker {
    public static final AbstractTypeChecker INSTANCE = new AbstractTypeChecker();
    public static boolean RUN_SLOW_ASSERTIONS;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypeVariance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypeVariance.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m18406a(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        KotlinTypeMarker type;
        RigidTypeMarker rigidTypeMarkerUpperBoundIfFlexible;
        if (typeSystemContext.isIntegerLiteralType(rigidTypeMarker)) {
            return true;
        }
        return (rigidTypeMarker instanceof CapturedTypeMarker) && (type = typeSystemContext.getType(typeSystemContext.projection(typeSystemContext.typeConstructor((CapturedTypeMarker) rigidTypeMarker)))) != null && (rigidTypeMarkerUpperBoundIfFlexible = typeSystemContext.upperBoundIfFlexible(type)) != null && typeSystemContext.isIntegerLiteralType(rigidTypeMarkerUpperBoundIfFlexible);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m18407b(TypeSystemContext typeSystemContext, TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2, boolean z6) {
        Collection<KotlinTypeMarker> collectionPossibleIntegerTypes = typeSystemContext.possibleIntegerTypes(rigidTypeMarker);
        if ((collectionPossibleIntegerTypes instanceof Collection) && collectionPossibleIntegerTypes.isEmpty()) {
            return false;
        }
        for (KotlinTypeMarker kotlinTypeMarker : collectionPossibleIntegerTypes) {
            if (AbstractC16544l.m18089b(typeSystemContext.typeConstructor(kotlinTypeMarker), typeSystemContext.typeConstructor(rigidTypeMarker2)) || (z6 && isSubtypeOf$default(INSTANCE, typeCheckerState, rigidTypeMarker2, kotlinTypeMarker, false, 8, null))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static List m18408c(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicySubstitutionSupertypePolicy;
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        List<SimpleTypeMarker> listFastCorrespondingSupertypes = typeSystemContext.fastCorrespondingSupertypes(rigidTypeMarker, typeConstructorMarker);
        if (listFastCorrespondingSupertypes != null) {
            return listFastCorrespondingSupertypes;
        }
        boolean zIsClassTypeConstructor = typeSystemContext.isClassTypeConstructor(typeConstructorMarker);
        C17689w c17689w = C17689w.f56480Y;
        if (!zIsClassTypeConstructor && typeSystemContext.isClassType(rigidTypeMarker)) {
            return c17689w;
        }
        if (typeSystemContext.isCommonFinalClassConstructor(typeConstructorMarker)) {
            if (!typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(rigidTypeMarker), typeConstructorMarker)) {
                return c17689w;
            }
            RigidTypeMarker rigidTypeMarkerCaptureFromArguments = typeSystemContext.captureFromArguments(rigidTypeMarker, CaptureStatus.FOR_SUBTYPING);
            if (rigidTypeMarkerCaptureFromArguments != null) {
                rigidTypeMarker = rigidTypeMarkerCaptureFromArguments;
            }
            return AbstractC9393x3.m9974d(rigidTypeMarker);
        }
        SmartList smartList = new SmartList();
        typeCheckerState.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        AbstractC16544l.m18091d(supertypesDeque);
        Set<RigidTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        AbstractC16544l.m18091d(supertypesSet);
        supertypesDeque.push(rigidTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
            AbstractC16544l.m18091d(rigidTypeMarkerPop);
            if (supertypesSet.add(rigidTypeMarkerPop)) {
                RigidTypeMarker rigidTypeMarkerCaptureFromArguments2 = typeSystemContext.captureFromArguments(rigidTypeMarkerPop, CaptureStatus.FOR_SUBTYPING);
                if (rigidTypeMarkerCaptureFromArguments2 == null) {
                    rigidTypeMarkerCaptureFromArguments2 = rigidTypeMarkerPop;
                }
                if (typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(rigidTypeMarkerCaptureFromArguments2), typeConstructorMarker)) {
                    smartList.add(rigidTypeMarkerCaptureFromArguments2);
                    supertypesPolicySubstitutionSupertypePolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    supertypesPolicySubstitutionSupertypePolicy = typeSystemContext.argumentsCount(rigidTypeMarkerCaptureFromArguments2) == 0 ? TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE : typeCheckerState.getTypeSystemContext().substitutionSupertypePolicy(rigidTypeMarkerCaptureFromArguments2);
                }
                if (AbstractC16544l.m18089b(supertypesPolicySubstitutionSupertypePolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicySubstitutionSupertypePolicy = null;
                }
                if (supertypesPolicySubstitutionSupertypePolicy != null) {
                    TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        supertypesDeque.add(supertypesPolicySubstitutionSupertypePolicy.mo22591transformType(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.clear();
        return smartList;
    }

    /* JADX INFO: renamed from: d */
    public static List m18409d(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        List listM18408c = m18408c(typeCheckerState, rigidTypeMarker, typeConstructorMarker);
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (listM18408c.size() < 2) {
            return listM18408c;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM18408c) {
            TypeArgumentListMarker typeArgumentListMarkerAsArgumentList = typeSystemContext.asArgumentList((RigidTypeMarker) obj);
            int size = typeSystemContext.size(typeArgumentListMarkerAsArgumentList);
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    arrayList.add(obj);
                    break;
                }
                KotlinTypeMarker type = typeSystemContext.getType(typeSystemContext.get(typeArgumentListMarkerAsArgumentList, i10));
                if ((type != null ? typeSystemContext.asFlexibleType(type) : null) != null) {
                    break;
                }
                i10++;
            }
        }
        return !arrayList.isEmpty() ? arrayList : listM18408c;
    }

    /* JADX INFO: renamed from: e */
    public static TypeParameterMarker m18410e(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, RigidTypeMarker rigidTypeMarker) {
        KotlinTypeMarker type;
        int iArgumentsCount = typeSystemContext.argumentsCount(kotlinTypeMarker);
        int i10 = 0;
        while (true) {
            if (i10 >= iArgumentsCount) {
                return null;
            }
            TypeArgumentMarker argument = typeSystemContext.getArgument(kotlinTypeMarker, i10);
            TypeArgumentMarker typeArgumentMarker = typeSystemContext.isStarProjection(argument) ? null : argument;
            if (typeArgumentMarker != null && (type = typeSystemContext.getType(typeArgumentMarker)) != null) {
                boolean z6 = typeSystemContext.isCapturedType(typeSystemContext.lowerBoundIfFlexible(type)) && typeSystemContext.isCapturedType(typeSystemContext.lowerBoundIfFlexible(rigidTypeMarker));
                if (type.equals(rigidTypeMarker) || (z6 && AbstractC16544l.m18089b(typeSystemContext.typeConstructor(type), typeSystemContext.typeConstructor((KotlinTypeMarker) rigidTypeMarker)))) {
                    return typeSystemContext.getParameter(typeSystemContext.typeConstructor(kotlinTypeMarker), i10);
                }
                TypeParameterMarker typeParameterMarkerM18410e = m18410e(typeSystemContext, type, rigidTypeMarker);
                if (typeParameterMarkerM18410e != null) {
                    return typeParameterMarkerM18410e;
                }
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m18411f(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
        return (!typeSystemContext.isDenotable(typeSystemContext.typeConstructor(kotlinTypeMarker)) || typeSystemContext.isDynamic(kotlinTypeMarker) || typeSystemContext.isDefinitelyNotNullType(kotlinTypeMarker) || typeSystemContext.isNotNullTypeParameter(kotlinTypeMarker) || typeSystemContext.isFlexibleWithDifferentTypeConstructors(kotlinTypeMarker)) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m18412g(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, TypeConstructorMarker typeConstructorMarker) {
        TypeParameterMarker typeParameter;
        RigidTypeMarker rigidTypeMarkerAsRigidType = typeSystemContext.asRigidType(kotlinTypeMarker);
        if (!(rigidTypeMarkerAsRigidType instanceof CapturedTypeMarker)) {
            return false;
        }
        CapturedTypeMarker capturedTypeMarker = (CapturedTypeMarker) rigidTypeMarkerAsRigidType;
        if (typeSystemContext.isOldCapturedType(capturedTypeMarker) || !typeSystemContext.isStarProjection(typeSystemContext.projection(typeSystemContext.typeConstructor(capturedTypeMarker))) || typeSystemContext.captureStatus(capturedTypeMarker) != CaptureStatus.FOR_SUBTYPING) {
            return false;
        }
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(kotlinTypeMarker2);
        TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker = typeConstructorMarkerTypeConstructor instanceof TypeVariableTypeConstructorMarker ? (TypeVariableTypeConstructorMarker) typeConstructorMarkerTypeConstructor : null;
        return (typeVariableTypeConstructorMarker == null || (typeParameter = typeSystemContext.getTypeParameter(typeVariableTypeConstructorMarker)) == null || !typeSystemContext.hasRecursiveBounds(typeParameter, typeConstructorMarker)) ? false : true;
    }

    public static /* synthetic */ boolean isSubtypeOf$default(AbstractTypeChecker abstractTypeChecker, TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z6, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        return abstractTypeChecker.isSubtypeOf(typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, z6);
    }

    public final TypeVariance effectiveVariance(TypeVariance declared, TypeVariance useSite) {
        AbstractC16544l.m18094g(declared, "declared");
        AbstractC16544l.m18094g(useSite, "useSite");
        TypeVariance typeVariance = TypeVariance.INV;
        if (declared == typeVariance) {
            return useSite;
        }
        if (useSite == typeVariance || declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean equalTypes(TypeCheckerState state, KotlinTypeMarker a10, KotlinTypeMarker b) {
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(a10, "a");
        AbstractC16544l.m18094g(b, "b");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        if (a10 == b) {
            return true;
        }
        AbstractTypeChecker abstractTypeChecker = INSTANCE;
        abstractTypeChecker.getClass();
        if (m18411f(typeSystemContext, a10) && m18411f(typeSystemContext, b)) {
            KotlinTypeMarker kotlinTypeMarkerPrepareType = state.prepareType(state.refineType(a10));
            KotlinTypeMarker kotlinTypeMarkerPrepareType2 = state.prepareType(state.refineType(b));
            RigidTypeMarker rigidTypeMarkerLowerBoundIfFlexible = typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType);
            if (!typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(kotlinTypeMarkerPrepareType), typeSystemContext.typeConstructor(kotlinTypeMarkerPrepareType2))) {
                return false;
            }
            if (typeSystemContext.argumentsCount(rigidTypeMarkerLowerBoundIfFlexible) == 0) {
                return typeSystemContext.hasFlexibleNullability(kotlinTypeMarkerPrepareType) || typeSystemContext.hasFlexibleNullability(kotlinTypeMarkerPrepareType2) || typeSystemContext.isMarkedNullable(rigidTypeMarkerLowerBoundIfFlexible) == typeSystemContext.isMarkedNullable(typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType2));
            }
        }
        return isSubtypeOf$default(abstractTypeChecker, state, a10, b, false, 8, null) && isSubtypeOf$default(abstractTypeChecker, state, b, a10, false, 8, null);
    }

    public final List<RigidTypeMarker> findCorrespondingSupertypes(TypeCheckerState state, RigidTypeMarker subType, TypeConstructorMarker superConstructor) {
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(subType, "subType");
        AbstractC16544l.m18094g(superConstructor, "superConstructor");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        if (typeSystemContext.isClassType(subType)) {
            INSTANCE.getClass();
            return m18409d(state, subType, superConstructor);
        }
        if (!typeSystemContext.isClassTypeConstructor(superConstructor) && !typeSystemContext.isIntegerLiteralTypeConstructor(superConstructor)) {
            INSTANCE.getClass();
            return m18408c(state, subType, superConstructor);
        }
        SmartList<RigidTypeMarker> smartList = new SmartList();
        state.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = state.getSupertypesDeque();
        AbstractC16544l.m18091d(supertypesDeque);
        Set<RigidTypeMarker> supertypesSet = state.getSupertypesSet();
        AbstractC16544l.m18091d(supertypesSet);
        supertypesDeque.push(subType);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
            AbstractC16544l.m18091d(rigidTypeMarkerPop);
            if (supertypesSet.add(rigidTypeMarkerPop)) {
                if (typeSystemContext.isClassType(rigidTypeMarkerPop)) {
                    smartList.add(rigidTypeMarkerPop);
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                }
                if (AbstractC16544l.m18089b(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy != null) {
                    TypeSystemContext typeSystemContext2 = state.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        supertypesDeque.add(supertypesPolicy.mo22591transformType(state, it.next()));
                    }
                }
            }
        }
        state.clear();
        ArrayList arrayList = new ArrayList();
        for (RigidTypeMarker rigidTypeMarker : smartList) {
            AbstractTypeChecker abstractTypeChecker = INSTANCE;
            AbstractC16544l.m18091d(rigidTypeMarker);
            abstractTypeChecker.getClass();
            AbstractC17686t.m19398v(m18409d(state, rigidTypeMarker, superConstructor), arrayList);
        }
        return arrayList;
    }

    public final boolean isSubtypeForSameConstructor(TypeCheckerState typeCheckerState, TypeArgumentListMarker capturedSubArguments, RigidTypeMarker superType) {
        boolean zEqualTypes;
        AbstractC16544l.m18094g(typeCheckerState, "<this>");
        AbstractC16544l.m18094g(capturedSubArguments, "capturedSubArguments");
        AbstractC16544l.m18094g(superType, "superType");
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(superType);
        int size = typeSystemContext.size(capturedSubArguments);
        int iParametersCount = typeSystemContext.parametersCount(typeConstructorMarkerTypeConstructor);
        if (size != iParametersCount || size != typeSystemContext.argumentsCount(superType)) {
            return false;
        }
        for (int i10 = 0; i10 < iParametersCount; i10++) {
            TypeArgumentMarker argument = typeSystemContext.getArgument(superType, i10);
            KotlinTypeMarker type = typeSystemContext.getType(argument);
            if (type != null) {
                TypeArgumentMarker typeArgumentMarker = typeSystemContext.get(capturedSubArguments, i10);
                typeSystemContext.getVariance(typeArgumentMarker);
                TypeVariance typeVariance = TypeVariance.INV;
                KotlinTypeMarker type2 = typeSystemContext.getType(typeArgumentMarker);
                AbstractC16544l.m18091d(type2);
                AbstractTypeChecker abstractTypeChecker = INSTANCE;
                TypeVariance typeVarianceEffectiveVariance = abstractTypeChecker.effectiveVariance(typeSystemContext.getVariance(typeSystemContext.getParameter(typeConstructorMarkerTypeConstructor, i10)), typeSystemContext.getVariance(argument));
                if (typeVarianceEffectiveVariance == null) {
                    return typeCheckerState.isErrorTypeEqualsToAnything();
                }
                if (typeVarianceEffectiveVariance != typeVariance || (!m18412g(typeSystemContext, type2, type, typeConstructorMarkerTypeConstructor) && !m18412g(typeSystemContext, type, type2, typeConstructorMarkerTypeConstructor))) {
                    if (typeCheckerState.f53199g > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + type2).toString());
                    }
                    typeCheckerState.f53199g++;
                    int i11 = WhenMappings.$EnumSwitchMapping$0[typeVarianceEffectiveVariance.ordinal()];
                    if (i11 == 1) {
                        zEqualTypes = abstractTypeChecker.equalTypes(typeCheckerState, type2, type);
                    } else if (i11 == 2) {
                        zEqualTypes = isSubtypeOf$default(abstractTypeChecker, typeCheckerState, type2, type, false, 8, null);
                    } else {
                        if (i11 != 3) {
                            throw new C0644w();
                        }
                        zEqualTypes = isSubtypeOf$default(abstractTypeChecker, typeCheckerState, type, type2, false, 8, null);
                    }
                    typeCheckerState.f53199g--;
                    if (!zEqualTypes) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean isSubtypeOf(TypeCheckerState state, KotlinTypeMarker subType, KotlinTypeMarker superType) {
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(subType, "subType");
        AbstractC16544l.m18094g(superType, "superType");
        return isSubtypeOf$default(this, state, subType, superType, false, 8, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:133:0x0248  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:171:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:192:0x0335  */
    /* JADX WARN: Code duplicated, block: B:195:0x034a  */
    /* JADX WARN: Code duplicated, block: B:198:0x035b  */
    /* JADX WARN: Code duplicated, block: B:287:0x035c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:? A[LOOP:7: B:74:0x0137->B:297:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:? A[LOOP:8: B:90:0x0180->B:300:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0128  */
    /* JADX WARN: Code duplicated, block: B:73:0x0133  */
    /* JADX WARN: Code duplicated, block: B:76:0x013d  */
    /* JADX WARN: Code duplicated, block: B:80:0x015a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0162  */
    /* JADX WARN: Code duplicated, block: B:84:0x0168  */
    /* JADX WARN: Code duplicated, block: B:86:0x0172  */
    /* JADX WARN: Code duplicated, block: B:89:0x017c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0186  */
    /* JADX WARN: Code duplicated, block: B:95:0x0191  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.Collection, java.util.LinkedHashSet] */
    public final boolean isSubtypeOf(TypeCheckerState state, KotlinTypeMarker subType, KotlinTypeMarker superType, boolean z6) {
        Boolean boolValueOf;
        Boolean bool;
        ?? arrayList;
        RigidTypeMarker rigidTypeMarkerAsRigidType;
        boolean zIsNothingConstructor;
        KotlinTypeMarker type;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor2;
        TypeParameterMarker typeParameterMarkerM18410e;
        Collection<KotlinTypeMarker> collectionSupertypes;
        Iterator it;
        Collection<KotlinTypeMarker> collectionSupertypes2;
        Iterator it2;
        boolean z10;
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(subType, "subType");
        AbstractC16544l.m18094g(superType, "superType");
        if (subType == superType) {
            return true;
        }
        boolean z11 = false;
        if (!state.customIsSubtypeOf(subType, superType)) {
            return false;
        }
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        KotlinTypeMarker kotlinTypeMarkerPrepareType = state.prepareType(state.refineType(subType));
        KotlinTypeMarker kotlinTypeMarkerPrepareType2 = state.prepareType(state.refineType(superType));
        AbstractTypeChecker abstractTypeChecker = INSTANCE;
        RigidTypeMarker rigidTypeMarkerLowerBoundIfFlexible = typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType);
        RigidTypeMarker rigidTypeMarkerUpperBoundIfFlexible = typeSystemContext.upperBoundIfFlexible(kotlinTypeMarkerPrepareType2);
        abstractTypeChecker.getClass();
        TypeSystemContext typeSystemContext2 = state.getTypeSystemContext();
        if (typeSystemContext2.isError(rigidTypeMarkerLowerBoundIfFlexible) || typeSystemContext2.isError(rigidTypeMarkerUpperBoundIfFlexible)) {
            boolValueOf = state.isErrorTypeEqualsToAnything() ? Boolean.TRUE : (!typeSystemContext2.isMarkedNullable(rigidTypeMarkerLowerBoundIfFlexible) || typeSystemContext2.isMarkedNullable(rigidTypeMarkerUpperBoundIfFlexible)) ? Boolean.valueOf(AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(typeSystemContext2, typeSystemContext2.withNullability(rigidTypeMarkerLowerBoundIfFlexible, false), typeSystemContext2.withNullability(rigidTypeMarkerUpperBoundIfFlexible, false))) : Boolean.FALSE;
        } else if (typeSystemContext2.isStubTypeForBuilderInference(rigidTypeMarkerLowerBoundIfFlexible) && typeSystemContext2.isStubTypeForBuilderInference(rigidTypeMarkerUpperBoundIfFlexible)) {
            boolValueOf = Boolean.valueOf((typeSystemContext2.typeConstructor(rigidTypeMarkerLowerBoundIfFlexible) == typeSystemContext2.typeConstructor(rigidTypeMarkerUpperBoundIfFlexible) && ((typeSystemContext2.isDefinitelyNotNullType(rigidTypeMarkerLowerBoundIfFlexible) || !typeSystemContext2.isDefinitelyNotNullType(rigidTypeMarkerUpperBoundIfFlexible)) && (!typeSystemContext2.isMarkedNullable(rigidTypeMarkerLowerBoundIfFlexible) || typeSystemContext2.isMarkedNullable(rigidTypeMarkerUpperBoundIfFlexible)))) || state.isStubTypeEqualsToAnything());
        } else if (typeSystemContext2.isStubType(rigidTypeMarkerLowerBoundIfFlexible) || typeSystemContext2.isStubType(rigidTypeMarkerUpperBoundIfFlexible)) {
            boolValueOf = Boolean.valueOf(state.isStubTypeEqualsToAnything());
        } else {
            CapturedTypeMarker capturedTypeMarkerAsCapturedTypeUnwrappingDnn = typeSystemContext2.asCapturedTypeUnwrappingDnn(rigidTypeMarkerUpperBoundIfFlexible);
            KotlinTypeMarker kotlinTypeMarkerLowerType = capturedTypeMarkerAsCapturedTypeUnwrappingDnn != null ? typeSystemContext2.lowerType(capturedTypeMarkerAsCapturedTypeUnwrappingDnn) : null;
            if (capturedTypeMarkerAsCapturedTypeUnwrappingDnn == null || kotlinTypeMarkerLowerType == null) {
                typeConstructorMarkerTypeConstructor = typeSystemContext2.typeConstructor(rigidTypeMarkerUpperBoundIfFlexible);
                if (typeSystemContext2.isIntersection(typeConstructorMarkerTypeConstructor)) {
                    typeSystemContext2.isMarkedNullable(rigidTypeMarkerUpperBoundIfFlexible);
                    collectionSupertypes2 = typeSystemContext2.supertypes(typeConstructorMarkerTypeConstructor);
                    if (!(collectionSupertypes2 instanceof Collection) && collectionSupertypes2.isEmpty()) {
                        z10 = true;
                        break;
                    }
                    it2 = collectionSupertypes2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z10 = true;
                            break;
                        }
                        if (!isSubtypeOf$default(INSTANCE, state, rigidTypeMarkerLowerBoundIfFlexible, (KotlinTypeMarker) it2.next(), false, 8, null)) {
                            z10 = false;
                            break;
                        }
                    }
                    boolValueOf = Boolean.valueOf(z10);
                } else {
                    typeConstructorMarkerTypeConstructor2 = typeSystemContext2.typeConstructor(rigidTypeMarkerLowerBoundIfFlexible);
                    if (rigidTypeMarkerLowerBoundIfFlexible instanceof CapturedTypeMarker) {
                        AbstractTypeChecker abstractTypeChecker2 = INSTANCE;
                        TypeSystemContext typeSystemContext3 = state.getTypeSystemContext();
                        abstractTypeChecker2.getClass();
                        typeParameterMarkerM18410e = m18410e(typeSystemContext3, rigidTypeMarkerUpperBoundIfFlexible, rigidTypeMarkerLowerBoundIfFlexible);
                        if (typeParameterMarkerM18410e == null && typeSystemContext2.hasRecursiveBounds(typeParameterMarkerM18410e, typeSystemContext2.typeConstructor(rigidTypeMarkerUpperBoundIfFlexible))) {
                            boolValueOf = Boolean.TRUE;
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        if (typeSystemContext2.isIntersection(typeConstructorMarkerTypeConstructor2)) {
                            collectionSupertypes = typeSystemContext2.supertypes(typeConstructorMarkerTypeConstructor2);
                            if ((collectionSupertypes instanceof Collection) || !collectionSupertypes.isEmpty()) {
                                it = collectionSupertypes.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        AbstractTypeChecker abstractTypeChecker3 = INSTANCE;
                                        TypeSystemContext typeSystemContext4 = state.getTypeSystemContext();
                                        abstractTypeChecker3.getClass();
                                        typeParameterMarkerM18410e = m18410e(typeSystemContext4, rigidTypeMarkerUpperBoundIfFlexible, rigidTypeMarkerLowerBoundIfFlexible);
                                        if (typeParameterMarkerM18410e == null) {
                                        }
                                    } else if (!(((KotlinTypeMarker) it.next()) instanceof CapturedTypeMarker)) {
                                    }
                                }
                            } else {
                                AbstractTypeChecker abstractTypeChecker4 = INSTANCE;
                                TypeSystemContext typeSystemContext5 = state.getTypeSystemContext();
                                abstractTypeChecker4.getClass();
                                typeParameterMarkerM18410e = m18410e(typeSystemContext5, rigidTypeMarkerUpperBoundIfFlexible, rigidTypeMarkerLowerBoundIfFlexible);
                                if (typeParameterMarkerM18410e == null) {
                                }
                            }
                        }
                        boolValueOf = null;
                    }
                }
            } else {
                if (typeSystemContext2.isMarkedNullable(rigidTypeMarkerUpperBoundIfFlexible)) {
                    kotlinTypeMarkerLowerType = typeSystemContext2.withNullability(kotlinTypeMarkerLowerType, true);
                } else if (typeSystemContext2.isDefinitelyNotNullType(rigidTypeMarkerUpperBoundIfFlexible)) {
                    kotlinTypeMarkerLowerType = typeSystemContext2.makeDefinitelyNotNullOrNotNull(kotlinTypeMarkerLowerType);
                }
                KotlinTypeMarker kotlinTypeMarker = kotlinTypeMarkerLowerType;
                int i10 = WhenMappings.$EnumSwitchMapping$1[state.getLowerCapturedTypePolicy(rigidTypeMarkerLowerBoundIfFlexible, capturedTypeMarkerAsCapturedTypeUnwrappingDnn).ordinal()];
                if (i10 == 1) {
                    boolValueOf = Boolean.valueOf(isSubtypeOf$default(abstractTypeChecker, state, rigidTypeMarkerLowerBoundIfFlexible, kotlinTypeMarker, false, 8, null));
                } else if (i10 != 2) {
                    if (i10 != 3) {
                        throw new C0644w();
                    }
                    typeConstructorMarkerTypeConstructor = typeSystemContext2.typeConstructor(rigidTypeMarkerUpperBoundIfFlexible);
                    if (typeSystemContext2.isIntersection(typeConstructorMarkerTypeConstructor)) {
                        typeSystemContext2.isMarkedNullable(rigidTypeMarkerUpperBoundIfFlexible);
                        collectionSupertypes2 = typeSystemContext2.supertypes(typeConstructorMarkerTypeConstructor);
                        if (!(collectionSupertypes2 instanceof Collection)) {
                            it2 = collectionSupertypes2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z10 = true;
                                    break;
                                }
                                if (!isSubtypeOf$default(INSTANCE, state, rigidTypeMarkerLowerBoundIfFlexible, (KotlinTypeMarker) it2.next(), false, 8, null)) {
                                    z10 = false;
                                    break;
                                }
                            }
                        } else {
                            it2 = collectionSupertypes2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z10 = true;
                                    break;
                                }
                                if (!isSubtypeOf$default(INSTANCE, state, rigidTypeMarkerLowerBoundIfFlexible, (KotlinTypeMarker) it2.next(), false, 8, null)) {
                                    z10 = false;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z10);
                    } else {
                        typeConstructorMarkerTypeConstructor2 = typeSystemContext2.typeConstructor(rigidTypeMarkerLowerBoundIfFlexible);
                        if (rigidTypeMarkerLowerBoundIfFlexible instanceof CapturedTypeMarker) {
                            AbstractTypeChecker abstractTypeChecker5 = INSTANCE;
                            TypeSystemContext typeSystemContext6 = state.getTypeSystemContext();
                            abstractTypeChecker5.getClass();
                            typeParameterMarkerM18410e = m18410e(typeSystemContext6, rigidTypeMarkerUpperBoundIfFlexible, rigidTypeMarkerLowerBoundIfFlexible);
                            if (typeParameterMarkerM18410e == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = null;
                            }
                        } else {
                            if (typeSystemContext2.isIntersection(typeConstructorMarkerTypeConstructor2)) {
                                collectionSupertypes = typeSystemContext2.supertypes(typeConstructorMarkerTypeConstructor2);
                                if (collectionSupertypes instanceof Collection) {
                                    it = collectionSupertypes.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            AbstractTypeChecker abstractTypeChecker6 = INSTANCE;
                                            TypeSystemContext typeSystemContext7 = state.getTypeSystemContext();
                                            abstractTypeChecker6.getClass();
                                            typeParameterMarkerM18410e = m18410e(typeSystemContext7, rigidTypeMarkerUpperBoundIfFlexible, rigidTypeMarkerLowerBoundIfFlexible);
                                            if (typeParameterMarkerM18410e == null) {
                                            }
                                        } else if (!(((KotlinTypeMarker) it.next()) instanceof CapturedTypeMarker)) {
                                        }
                                    }
                                } else {
                                    it = collectionSupertypes.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            AbstractTypeChecker abstractTypeChecker7 = INSTANCE;
                                            TypeSystemContext typeSystemContext8 = state.getTypeSystemContext();
                                            abstractTypeChecker7.getClass();
                                            typeParameterMarkerM18410e = m18410e(typeSystemContext8, rigidTypeMarkerUpperBoundIfFlexible, rigidTypeMarkerLowerBoundIfFlexible);
                                            if (typeParameterMarkerM18410e == null) {
                                            }
                                        } else if (!(((KotlinTypeMarker) it.next()) instanceof CapturedTypeMarker)) {
                                        }
                                    }
                                }
                            }
                            boolValueOf = null;
                        }
                    }
                } else if (isSubtypeOf$default(abstractTypeChecker, state, rigidTypeMarkerLowerBoundIfFlexible, kotlinTypeMarker, false, 8, null)) {
                    boolValueOf = Boolean.TRUE;
                } else {
                    typeConstructorMarkerTypeConstructor = typeSystemContext2.typeConstructor(rigidTypeMarkerUpperBoundIfFlexible);
                    if (typeSystemContext2.isIntersection(typeConstructorMarkerTypeConstructor)) {
                        typeSystemContext2.isMarkedNullable(rigidTypeMarkerUpperBoundIfFlexible);
                        collectionSupertypes2 = typeSystemContext2.supertypes(typeConstructorMarkerTypeConstructor);
                        if (!(collectionSupertypes2 instanceof Collection)) {
                            it2 = collectionSupertypes2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z10 = true;
                                    break;
                                }
                                if (!isSubtypeOf$default(INSTANCE, state, rigidTypeMarkerLowerBoundIfFlexible, (KotlinTypeMarker) it2.next(), false, 8, null)) {
                                    z10 = false;
                                    break;
                                }
                            }
                        } else {
                            it2 = collectionSupertypes2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z10 = true;
                                    break;
                                }
                                if (!isSubtypeOf$default(INSTANCE, state, rigidTypeMarkerLowerBoundIfFlexible, (KotlinTypeMarker) it2.next(), false, 8, null)) {
                                    z10 = false;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z10);
                    } else {
                        typeConstructorMarkerTypeConstructor2 = typeSystemContext2.typeConstructor(rigidTypeMarkerLowerBoundIfFlexible);
                        if (rigidTypeMarkerLowerBoundIfFlexible instanceof CapturedTypeMarker) {
                            AbstractTypeChecker abstractTypeChecker8 = INSTANCE;
                            TypeSystemContext typeSystemContext9 = state.getTypeSystemContext();
                            abstractTypeChecker8.getClass();
                            typeParameterMarkerM18410e = m18410e(typeSystemContext9, rigidTypeMarkerUpperBoundIfFlexible, rigidTypeMarkerLowerBoundIfFlexible);
                            if (typeParameterMarkerM18410e == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = null;
                            }
                        } else {
                            if (typeSystemContext2.isIntersection(typeConstructorMarkerTypeConstructor2)) {
                                collectionSupertypes = typeSystemContext2.supertypes(typeConstructorMarkerTypeConstructor2);
                                if (collectionSupertypes instanceof Collection) {
                                    it = collectionSupertypes.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            AbstractTypeChecker abstractTypeChecker9 = INSTANCE;
                                            TypeSystemContext typeSystemContext10 = state.getTypeSystemContext();
                                            abstractTypeChecker9.getClass();
                                            typeParameterMarkerM18410e = m18410e(typeSystemContext10, rigidTypeMarkerUpperBoundIfFlexible, rigidTypeMarkerLowerBoundIfFlexible);
                                            if (typeParameterMarkerM18410e == null) {
                                            }
                                        } else if (!(((KotlinTypeMarker) it.next()) instanceof CapturedTypeMarker)) {
                                        }
                                    }
                                } else {
                                    it = collectionSupertypes.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            AbstractTypeChecker abstractTypeChecker10 = INSTANCE;
                                            TypeSystemContext typeSystemContext11 = state.getTypeSystemContext();
                                            abstractTypeChecker10.getClass();
                                            typeParameterMarkerM18410e = m18410e(typeSystemContext11, rigidTypeMarkerUpperBoundIfFlexible, rigidTypeMarkerLowerBoundIfFlexible);
                                            if (typeParameterMarkerM18410e == null) {
                                            }
                                        } else if (!(((KotlinTypeMarker) it.next()) instanceof CapturedTypeMarker)) {
                                        }
                                    }
                                }
                            }
                            boolValueOf = null;
                        }
                    }
                }
            }
        }
        if (boolValueOf != null) {
            boolean zBooleanValue = boolValueOf.booleanValue();
            state.addSubtypeConstraint(kotlinTypeMarkerPrepareType, kotlinTypeMarkerPrepareType2, z6);
            return zBooleanValue;
        }
        Boolean boolAddSubtypeConstraint = state.addSubtypeConstraint(kotlinTypeMarkerPrepareType, kotlinTypeMarkerPrepareType2, z6);
        if (boolAddSubtypeConstraint != null) {
            return boolAddSubtypeConstraint.booleanValue();
        }
        AbstractTypeChecker abstractTypeChecker11 = INSTANCE;
        RigidTypeMarker rigidTypeMarkerLowerBoundIfFlexible2 = typeSystemContext.lowerBoundIfFlexible(kotlinTypeMarkerPrepareType);
        RigidTypeMarker rigidTypeMarkerUpperBoundIfFlexible2 = typeSystemContext.upperBoundIfFlexible(kotlinTypeMarkerPrepareType2);
        abstractTypeChecker11.getClass();
        TypeSystemContext typeSystemContext12 = state.getTypeSystemContext();
        if (RUN_SLOW_ASSERTIONS) {
            if (!typeSystemContext12.isSingleClassifierType(rigidTypeMarkerLowerBoundIfFlexible2) && !typeSystemContext12.isIntersection(typeSystemContext12.typeConstructor(rigidTypeMarkerLowerBoundIfFlexible2))) {
                state.isAllowedTypeVariable(rigidTypeMarkerLowerBoundIfFlexible2);
            }
            if (!typeSystemContext12.isSingleClassifierType(rigidTypeMarkerUpperBoundIfFlexible2)) {
                state.isAllowedTypeVariable(rigidTypeMarkerUpperBoundIfFlexible2);
            }
        }
        if (AbstractNullabilityChecker.INSTANCE.isPossibleSubtype(state, rigidTypeMarkerLowerBoundIfFlexible2, rigidTypeMarkerUpperBoundIfFlexible2)) {
            TypeSystemContext typeSystemContext13 = state.getTypeSystemContext();
            if (!typeSystemContext13.isIntegerLiteralType(rigidTypeMarkerLowerBoundIfFlexible2) && !typeSystemContext13.isIntegerLiteralType(rigidTypeMarkerUpperBoundIfFlexible2)) {
                bool = null;
            } else if (m18406a(typeSystemContext13, rigidTypeMarkerLowerBoundIfFlexible2) && m18406a(typeSystemContext13, rigidTypeMarkerUpperBoundIfFlexible2)) {
                bool = Boolean.TRUE;
            } else if (typeSystemContext13.isIntegerLiteralType(rigidTypeMarkerLowerBoundIfFlexible2)) {
                if (m18407b(typeSystemContext13, state, rigidTypeMarkerLowerBoundIfFlexible2, rigidTypeMarkerUpperBoundIfFlexible2, false)) {
                    bool = Boolean.TRUE;
                } else {
                    bool = null;
                }
            } else if (typeSystemContext13.isIntegerLiteralType(rigidTypeMarkerUpperBoundIfFlexible2)) {
                TypeConstructorMarker typeConstructorMarkerTypeConstructor3 = typeSystemContext13.typeConstructor(rigidTypeMarkerLowerBoundIfFlexible2);
                if (typeConstructorMarkerTypeConstructor3 instanceof IntersectionTypeConstructorMarker) {
                    Collection<KotlinTypeMarker> collectionSupertypes3 = typeSystemContext13.supertypes(typeConstructorMarkerTypeConstructor3);
                    if (!(collectionSupertypes3 instanceof Collection) || !collectionSupertypes3.isEmpty()) {
                        Iterator it3 = collectionSupertypes3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                RigidTypeMarker rigidTypeMarkerAsRigidType2 = typeSystemContext13.asRigidType((KotlinTypeMarker) it3.next());
                                if (rigidTypeMarkerAsRigidType2 != null && typeSystemContext13.isIntegerLiteralType(rigidTypeMarkerAsRigidType2)) {
                                }
                            } else if (!m18407b(typeSystemContext13, state, rigidTypeMarkerUpperBoundIfFlexible2, rigidTypeMarkerLowerBoundIfFlexible2, true)) {
                                bool = null;
                            }
                        }
                    } else if (!m18407b(typeSystemContext13, state, rigidTypeMarkerUpperBoundIfFlexible2, rigidTypeMarkerLowerBoundIfFlexible2, true)) {
                        bool = null;
                    }
                } else if (!m18407b(typeSystemContext13, state, rigidTypeMarkerUpperBoundIfFlexible2, rigidTypeMarkerLowerBoundIfFlexible2, true)) {
                    bool = null;
                }
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
            if (bool != null) {
                zIsNothingConstructor = bool.booleanValue();
                TypeCheckerState.addSubtypeConstraint$default(state, rigidTypeMarkerLowerBoundIfFlexible2, rigidTypeMarkerUpperBoundIfFlexible2, false, 4, null);
            } else {
                TypeConstructorMarker typeConstructorMarkerTypeConstructor4 = typeSystemContext12.typeConstructor(rigidTypeMarkerUpperBoundIfFlexible2);
                if ((typeSystemContext12.areEqualTypeConstructors(typeSystemContext12.typeConstructor(rigidTypeMarkerLowerBoundIfFlexible2), typeConstructorMarkerTypeConstructor4) && typeSystemContext12.parametersCount(typeConstructorMarkerTypeConstructor4) == 0) || typeSystemContext12.isAnyConstructor(typeSystemContext12.typeConstructor(rigidTypeMarkerUpperBoundIfFlexible2))) {
                    zIsNothingConstructor = true;
                } else {
                    List<RigidTypeMarker> listFindCorrespondingSupertypes = INSTANCE.findCorrespondingSupertypes(state, rigidTypeMarkerLowerBoundIfFlexible2, typeConstructorMarkerTypeConstructor4);
                    int i11 = 10;
                    if (listFindCorrespondingSupertypes.size() > 1) {
                        TypeSystemContext typeSystemContext14 = state.getTypeSystemContext();
                        TypeSystemInferenceExtensionContext typeSystemInferenceExtensionContext = typeSystemContext14 instanceof TypeSystemInferenceExtensionContext ? (TypeSystemInferenceExtensionContext) typeSystemContext14 : null;
                        if (typeSystemInferenceExtensionContext == null || !typeSystemInferenceExtensionContext.isK2()) {
                            List<RigidTypeMarker> list = listFindCorrespondingSupertypes;
                            arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                            for (RigidTypeMarker rigidTypeMarker : list) {
                                rigidTypeMarkerAsRigidType = typeSystemContext12.asRigidType(state.prepareType(rigidTypeMarker));
                                if (rigidTypeMarkerAsRigidType == null) {
                                    rigidTypeMarker = rigidTypeMarkerAsRigidType;
                                }
                                arrayList.add(rigidTypeMarker);
                            }
                        } else {
                            arrayList = new LinkedHashSet();
                            for (RigidTypeMarker rigidTypeMarker2 : listFindCorrespondingSupertypes) {
                                RigidTypeMarker rigidTypeMarkerAsRigidType3 = typeSystemContext12.asRigidType(state.prepareType(rigidTypeMarker2));
                                if (rigidTypeMarkerAsRigidType3 != null) {
                                    rigidTypeMarker2 = rigidTypeMarkerAsRigidType3;
                                }
                                arrayList.add(rigidTypeMarker2);
                            }
                        }
                    } else {
                        List<RigidTypeMarker> list2 = listFindCorrespondingSupertypes;
                        arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                        while (r2.hasNext()) {
                            rigidTypeMarkerAsRigidType = typeSystemContext12.asRigidType(state.prepareType(rigidTypeMarker));
                            if (rigidTypeMarkerAsRigidType == null) {
                                rigidTypeMarker = rigidTypeMarkerAsRigidType;
                            }
                            arrayList.add(rigidTypeMarker);
                        }
                    }
                    int size = arrayList.size();
                    if (size != 0) {
                        boolean z12 = true;
                        if (size != 1) {
                            ArgumentList argumentList = new ArgumentList(typeSystemContext12.parametersCount(typeConstructorMarkerTypeConstructor4));
                            int iParametersCount = typeSystemContext12.parametersCount(typeConstructorMarkerTypeConstructor4);
                            int i12 = 0;
                            boolean z13 = false;
                            while (i12 < iParametersCount) {
                                z13 = (z13 || typeSystemContext12.getVariance(typeSystemContext12.getParameter(typeConstructorMarkerTypeConstructor4, i12)) != TypeVariance.OUT) ? z12 : z11;
                                if (!z13) {
                                    ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, i11));
                                    for (RigidTypeMarker rigidTypeMarker3 : arrayList) {
                                        TypeArgumentMarker argumentOrNull = typeSystemContext12.getArgumentOrNull(rigidTypeMarker3, i12);
                                        if (argumentOrNull != null) {
                                            if (typeSystemContext12.getVariance(argumentOrNull) != TypeVariance.INV) {
                                                argumentOrNull = null;
                                            }
                                            if (argumentOrNull != null && (type = typeSystemContext12.getType(argumentOrNull)) != null) {
                                                arrayList2.add(type);
                                            }
                                        }
                                        throw new IllegalStateException(("Incorrect type: " + rigidTypeMarker3 + ", subType: " + rigidTypeMarkerLowerBoundIfFlexible2 + ", superType: " + rigidTypeMarkerUpperBoundIfFlexible2).toString());
                                    }
                                    argumentList.add(typeSystemContext12.asTypeArgument(typeSystemContext12.intersectTypes(arrayList2)));
                                }
                                i12++;
                                i11 = 10;
                                z12 = true;
                                z11 = false;
                            }
                            if (z13 || !INSTANCE.isSubtypeForSameConstructor(state, argumentList, rigidTypeMarkerUpperBoundIfFlexible2)) {
                                zIsNothingConstructor = state.runForkingPoint(new C10426b(arrayList, state, typeSystemContext12, rigidTypeMarkerUpperBoundIfFlexible2, 1));
                            } else {
                                zIsNothingConstructor = true;
                            }
                        } else {
                            zIsNothingConstructor = INSTANCE.isSubtypeForSameConstructor(state, typeSystemContext12.asArgumentList((RigidTypeMarker) AbstractC17680n.m19340P(arrayList)), rigidTypeMarkerUpperBoundIfFlexible2);
                        }
                    } else {
                        INSTANCE.getClass();
                        TypeSystemContext typeSystemContext15 = state.getTypeSystemContext();
                        TypeConstructorMarker typeConstructorMarkerTypeConstructor5 = typeSystemContext15.typeConstructor(rigidTypeMarkerLowerBoundIfFlexible2);
                        if (typeSystemContext15.isClassTypeConstructor(typeConstructorMarkerTypeConstructor5)) {
                            zIsNothingConstructor = typeSystemContext15.isNothingConstructor(typeConstructorMarkerTypeConstructor5);
                        } else if (typeSystemContext15.isNothingConstructor(typeSystemContext15.typeConstructor(rigidTypeMarkerLowerBoundIfFlexible2))) {
                            zIsNothingConstructor = true;
                        } else {
                            state.initialize();
                            ArrayDeque<RigidTypeMarker> supertypesDeque = state.getSupertypesDeque();
                            AbstractC16544l.m18091d(supertypesDeque);
                            Set<RigidTypeMarker> supertypesSet = state.getSupertypesSet();
                            AbstractC16544l.m18091d(supertypesSet);
                            supertypesDeque.push(rigidTypeMarkerLowerBoundIfFlexible2);
                            loop3: while (true) {
                                if (supertypesDeque.isEmpty()) {
                                    state.clear();
                                    zIsNothingConstructor = false;
                                } else {
                                    RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
                                    AbstractC16544l.m18091d(rigidTypeMarkerPop);
                                    if (supertypesSet.add(rigidTypeMarkerPop)) {
                                        TypeCheckerState.SupertypesPolicy supertypesPolicy = typeSystemContext15.isClassType(rigidTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.INSTANCE : TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                                        if (AbstractC16544l.m18089b(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                                            supertypesPolicy = null;
                                        }
                                        if (supertypesPolicy == null) {
                                            continue;
                                        } else {
                                            TypeSystemContext typeSystemContext16 = state.getTypeSystemContext();
                                            Iterator<KotlinTypeMarker> it4 = typeSystemContext16.supertypes(typeSystemContext16.typeConstructor(rigidTypeMarkerPop)).iterator();
                                            while (it4.hasNext()) {
                                                RigidTypeMarker rigidTypeMarkerMo22591transformType = supertypesPolicy.mo22591transformType(state, it4.next());
                                                if (typeSystemContext15.isNothingConstructor(typeSystemContext15.typeConstructor(rigidTypeMarkerMo22591transformType))) {
                                                    state.clear();
                                                    break loop3;
                                                }
                                                supertypesDeque.add(rigidTypeMarkerMo22591transformType);
                                            }
                                        }
                                    }
                                }
                            }
                            zIsNothingConstructor = true;
                        }
                    }
                }
            }
        } else {
            zIsNothingConstructor = false;
        }
        return zIsNothingConstructor;
    }
}
