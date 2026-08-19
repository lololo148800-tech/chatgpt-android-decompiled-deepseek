package bj;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: bj.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C11463j extends AbstractC11452Q {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Method f34669k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Class f34670l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f34671m;

    public C11463j(Method method, Class cls, int i10) {
        this.f34669k = method;
        this.f34670l = cls;
        this.f34671m = i10;
    }

    @Override // bj.AbstractC11452Q
    /* JADX INFO: renamed from: e */
    public final Object mo12858e() {
        return this.f34669k.invoke(null, this.f34670l, Integer.valueOf(this.f34671m));
    }

    public final String toString() {
        return this.f34670l.getName();
    }
}
