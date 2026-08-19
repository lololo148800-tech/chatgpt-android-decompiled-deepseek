package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.AbstractStrictEqualityTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: loaded from: classes2.dex */
public final class StrictEqualityTypeChecker {
    public static final StrictEqualityTypeChecker INSTANCE = new StrictEqualityTypeChecker();

    public final boolean strictEqualTypes(UnwrappedType a10, UnwrappedType b) {
        AbstractC16544l.m18094g(a10, "a");
        AbstractC16544l.m18094g(b, "b");
        return AbstractStrictEqualityTypeChecker.INSTANCE.strictEqualTypes(SimpleClassicTypeSystemContext.INSTANCE, a10, b);
    }
}
