package p817j$.util;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: j$.util.i */
/* JADX INFO: loaded from: classes4.dex */
final class C15725i extends C15721g implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    @Override // p817j$.util.C15721g, java.util.List
    public final List subList(int i10, int i11) {
        C15725i c15725i;
        synchronized (this.f48956b) {
            c15725i = new C15725i(this.f48977c.subList(i10, i11), this.f48956b);
        }
        return c15725i;
    }

    private Object writeReplace() {
        return new C15721g(this.f48977c);
    }
}
