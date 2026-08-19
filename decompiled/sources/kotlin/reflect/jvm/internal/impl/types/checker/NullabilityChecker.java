package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: loaded from: classes2.dex */
public final class NullabilityChecker {
    public static final NullabilityChecker INSTANCE = new NullabilityChecker();

    public final boolean isSubtypeOfAny(UnwrappedType type) {
        AbstractC16544l.m18094g(type, "type");
        return AbstractNullabilityChecker.INSTANCE.hasNotNullSupertype(SimpleClassicTypeSystemContext.INSTANCE.newTypeCheckerState(false, true), FlexibleTypesKt.lowerIfFlexible(type), TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE);
    }
}
