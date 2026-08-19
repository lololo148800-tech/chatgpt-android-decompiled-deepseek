package p265Kb;

import java.lang.reflect.Method;
import p001A.C0093v0;

/* JADX INFO: renamed from: Kb.u */
/* JADX INFO: loaded from: classes.dex */
public final class C4628u extends AbstractC4631x {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f15077b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f15078c;

    public C4628u(int i10, Method method) {
        this.f15077b = method;
        this.f15078c = i10;
    }

    @Override // p265Kb.AbstractC4631x
    /* JADX INFO: renamed from: a */
    public final Object mo5373a(Class cls) {
        String strM334h = C0093v0.m334h(cls);
        if (strM334h == null) {
            return this.f15077b.invoke(null, cls, Integer.valueOf(this.f15078c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM334h));
    }
}
