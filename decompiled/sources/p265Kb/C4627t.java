package p265Kb;

import java.lang.reflect.Method;
import p001A.C0093v0;

/* JADX INFO: renamed from: Kb.t */
/* JADX INFO: loaded from: classes.dex */
public final class C4627t extends AbstractC4631x {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f15075b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f15076c;

    public C4627t(Method method, Object obj) {
        this.f15075b = method;
        this.f15076c = obj;
    }

    @Override // p265Kb.AbstractC4631x
    /* JADX INFO: renamed from: a */
    public final Object mo5373a(Class cls) {
        String strM334h = C0093v0.m334h(cls);
        if (strM334h == null) {
            return this.f15075b.invoke(this.f15076c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM334h));
    }
}
