package bj;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: bj.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C11462i extends AbstractC11452Q {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Method f34666k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f34667l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Class f34668m;

    public C11462i(Method method, Object obj, Class cls) {
        this.f34666k = method;
        this.f34667l = obj;
        this.f34668m = cls;
    }

    @Override // bj.AbstractC11452Q
    /* JADX INFO: renamed from: e */
    public final Object mo12858e() {
        return this.f34666k.invoke(this.f34667l, this.f34668m);
    }

    public final String toString() {
        return this.f34668m.getName();
    }
}
