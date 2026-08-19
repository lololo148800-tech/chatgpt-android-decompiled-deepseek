package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* JADX INFO: loaded from: classes2.dex */
public final class AbstractStrictEqualityTypeChecker {
    public static final AbstractStrictEqualityTypeChecker INSTANCE = new AbstractStrictEqualityTypeChecker();

    /* JADX INFO: renamed from: a */
    public static boolean m18404a(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        if (typeSystemContext.argumentsCount(rigidTypeMarker) != typeSystemContext.argumentsCount(rigidTypeMarker2) || typeSystemContext.isMarkedNullable(rigidTypeMarker) != typeSystemContext.isMarkedNullable(rigidTypeMarker2) || typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker) != typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker2) || !typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(rigidTypeMarker), typeSystemContext.typeConstructor(rigidTypeMarker2))) {
            return false;
        }
        if (typeSystemContext.identicalArguments(rigidTypeMarker, rigidTypeMarker2)) {
            return true;
        }
        int iArgumentsCount = typeSystemContext.argumentsCount(rigidTypeMarker);
        for (int i10 = 0; i10 < iArgumentsCount; i10++) {
            TypeArgumentMarker argument = typeSystemContext.getArgument(rigidTypeMarker, i10);
            TypeArgumentMarker argument2 = typeSystemContext.getArgument(rigidTypeMarker2, i10);
            if (typeSystemContext.isStarProjection(argument) != typeSystemContext.isStarProjection(argument2)) {
                return false;
            }
            if (!typeSystemContext.isStarProjection(argument)) {
                if (typeSystemContext.getVariance(argument) != typeSystemContext.getVariance(argument2)) {
                    return false;
                }
                KotlinTypeMarker type = typeSystemContext.getType(argument);
                AbstractC16544l.m18091d(type);
                KotlinTypeMarker type2 = typeSystemContext.getType(argument2);
                AbstractC16544l.m18091d(type2);
                if (!m18405b(typeSystemContext, type, type2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18405b(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        RigidTypeMarker rigidTypeMarkerAsRigidType = typeSystemContext.asRigidType(kotlinTypeMarker);
        RigidTypeMarker rigidTypeMarkerAsRigidType2 = typeSystemContext.asRigidType(kotlinTypeMarker2);
        if (rigidTypeMarkerAsRigidType != null && rigidTypeMarkerAsRigidType2 != null) {
            return m18404a(typeSystemContext, rigidTypeMarkerAsRigidType, rigidTypeMarkerAsRigidType2);
        }
        FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType = typeSystemContext.asFlexibleType(kotlinTypeMarker);
        FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType2 = typeSystemContext.asFlexibleType(kotlinTypeMarker2);
        if (flexibleTypeMarkerAsFlexibleType == null || flexibleTypeMarkerAsFlexibleType2 == null) {
            return false;
        }
        return m18404a(typeSystemContext, typeSystemContext.lowerBound(flexibleTypeMarkerAsFlexibleType), typeSystemContext.lowerBound(flexibleTypeMarkerAsFlexibleType2)) && m18404a(typeSystemContext, typeSystemContext.upperBound(flexibleTypeMarkerAsFlexibleType), typeSystemContext.upperBound(flexibleTypeMarkerAsFlexibleType2));
    }

    public final boolean strictEqualTypes(TypeSystemContext context, KotlinTypeMarker a10, KotlinTypeMarker b) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(a10, "a");
        AbstractC16544l.m18094g(b, "b");
        return m18405b(context, a10, b);
    }
}
