package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* JADX INFO: loaded from: classes2.dex */
public final class AbstractNullabilityChecker {
    public static final AbstractNullabilityChecker INSTANCE = new AbstractNullabilityChecker();

    /* JADX INFO: renamed from: a */
    public static boolean m18403a(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (typeSystemContext.isNothing(rigidTypeMarker)) {
            return true;
        }
        if (typeSystemContext.isMarkedNullable(rigidTypeMarker)) {
            return false;
        }
        if (typeCheckerState.isStubTypeEqualsToAnything() && typeSystemContext.isStubType(rigidTypeMarker)) {
            return true;
        }
        return typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(rigidTypeMarker), typeConstructorMarker);
    }

    public final boolean hasNotNullSupertype(TypeCheckerState typeCheckerState, RigidTypeMarker type, TypeCheckerState.SupertypesPolicy supertypesPolicy) {
        AbstractC16544l.m18094g(typeCheckerState, "<this>");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(supertypesPolicy, "supertypesPolicy");
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if ((typeSystemContext.isClassType(type) && !typeSystemContext.isMarkedNullable(type)) || typeSystemContext.isDefinitelyNotNullType(type)) {
            return true;
        }
        typeCheckerState.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        AbstractC16544l.m18091d(supertypesDeque);
        Set<RigidTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        AbstractC16544l.m18091d(supertypesSet);
        supertypesDeque.push(type);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
            AbstractC16544l.m18091d(rigidTypeMarkerPop);
            if (supertypesSet.add(rigidTypeMarkerPop)) {
                TypeCheckerState.SupertypesPolicy supertypesPolicy2 = typeSystemContext.isMarkedNullable(rigidTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.INSTANCE : supertypesPolicy;
                if (AbstractC16544l.m18089b(supertypesPolicy2, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy2 = null;
                }
                if (supertypesPolicy2 == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerMo22591transformType = supertypesPolicy2.mo22591transformType(typeCheckerState, it.next());
                        if ((typeSystemContext.isClassType(rigidTypeMarkerMo22591transformType) && !typeSystemContext.isMarkedNullable(rigidTypeMarkerMo22591transformType)) || typeSystemContext.isDefinitelyNotNullType(rigidTypeMarkerMo22591transformType)) {
                            typeCheckerState.clear();
                            return true;
                        }
                        supertypesDeque.add(rigidTypeMarkerMo22591transformType);
                    }
                }
            }
        }
        typeCheckerState.clear();
        return false;
    }

    public final boolean hasPathByNotMarkedNullableNodes(TypeCheckerState state, RigidTypeMarker start, TypeConstructorMarker end) {
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(start, "start");
        AbstractC16544l.m18094g(end, "end");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        INSTANCE.getClass();
        if (m18403a(state, start, end)) {
            return true;
        }
        state.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = state.getSupertypesDeque();
        AbstractC16544l.m18091d(supertypesDeque);
        Set<RigidTypeMarker> supertypesSet = state.getSupertypesSet();
        AbstractC16544l.m18091d(supertypesSet);
        supertypesDeque.push(start);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
            AbstractC16544l.m18091d(rigidTypeMarkerPop);
            if (supertypesSet.add(rigidTypeMarkerPop)) {
                TypeCheckerState.SupertypesPolicy supertypesPolicy = typeSystemContext.isMarkedNullable(rigidTypeMarkerPop) ? TypeCheckerState.SupertypesPolicy.None.INSTANCE : TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                if (AbstractC16544l.m18089b(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContext2 = state.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerMo22591transformType = supertypesPolicy.mo22591transformType(state, it.next());
                        INSTANCE.getClass();
                        if (m18403a(state, rigidTypeMarkerMo22591transformType, end)) {
                            state.clear();
                            return true;
                        }
                        supertypesDeque.add(rigidTypeMarkerMo22591transformType);
                    }
                }
            }
        }
        state.clear();
        return false;
    }

    public final boolean isPossibleSubtype(TypeCheckerState state, RigidTypeMarker subType, RigidTypeMarker superType) {
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(subType, "subType");
        AbstractC16544l.m18094g(superType, "superType");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        if (AbstractTypeChecker.RUN_SLOW_ASSERTIONS) {
            if (!typeSystemContext.isSingleClassifierType(subType) && !typeSystemContext.isIntersection(typeSystemContext.typeConstructor(subType))) {
                state.isAllowedTypeVariable(subType);
            }
            if (!typeSystemContext.isSingleClassifierType(superType)) {
                state.isAllowedTypeVariable(superType);
            }
        }
        if (typeSystemContext.isMarkedNullable(superType) || typeSystemContext.isDefinitelyNotNullType(subType) || typeSystemContext.isNotNullTypeParameter(subType)) {
            return true;
        }
        if ((subType instanceof CapturedTypeMarker) && typeSystemContext.isProjectionNotNull((CapturedTypeMarker) subType)) {
            return true;
        }
        AbstractNullabilityChecker abstractNullabilityChecker = INSTANCE;
        if (abstractNullabilityChecker.hasNotNullSupertype(state, subType, TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE)) {
            return true;
        }
        if (typeSystemContext.isDefinitelyNotNullType(superType) || abstractNullabilityChecker.hasNotNullSupertype(state, superType, TypeCheckerState.SupertypesPolicy.UpperIfFlexible.INSTANCE) || typeSystemContext.isClassType(subType)) {
            return false;
        }
        return abstractNullabilityChecker.hasPathByNotMarkedNullableNodes(state, subType, typeSystemContext.typeConstructor(superType));
    }
}
