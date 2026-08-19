package p298Lm;

import java.lang.reflect.Constructor;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8704r3;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Lm.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C5180i extends AbstractC8704r3 {

    /* JADX INFO: renamed from: a */
    public final Constructor f16862a;

    public C5180i(Constructor constructor) {
        AbstractC16544l.m18094g(constructor, "constructor");
        this.f16862a = constructor;
    }

    @Override // p544W9.AbstractC8704r3
    /* JADX INFO: renamed from: a */
    public final String mo5750a() {
        Class<?>[] parameterTypes = this.f16862a.getParameterTypes();
        AbstractC16544l.m18093f(parameterTypes, "getParameterTypes(...)");
        return AbstractC17678l.m19283F(parameterTypes, "", "<init>(", ")V", C5166b.f16830t0, 24);
    }
}
