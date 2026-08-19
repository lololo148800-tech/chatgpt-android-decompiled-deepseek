package gn;

import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* JADX INFO: renamed from: gn.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C14201f implements KotlinTypeChecker.TypeConstructorEquality {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15510a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
    public final boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        if (typeConstructor == null) {
            m15510a(0);
            throw null;
        }
        if (typeConstructor2 != null) {
            return typeConstructor.equals(typeConstructor2);
        }
        m15510a(1);
        throw null;
    }
}
