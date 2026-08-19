package p265Kb;

import java.lang.reflect.Method;
import p001A.C0093v0;

/* JADX INFO: renamed from: Kb.v */
/* JADX INFO: loaded from: classes.dex */
public final class C4629v extends AbstractC4631x {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f15079b;

    public C4629v(Method method) {
        this.f15079b = method;
    }

    @Override // p265Kb.AbstractC4631x
    /* JADX INFO: renamed from: a */
    public final Object mo5373a(Class cls) {
        String strM334h = C0093v0.m334h(cls);
        if (strM334h == null) {
            return this.f15079b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM334h));
    }
}
