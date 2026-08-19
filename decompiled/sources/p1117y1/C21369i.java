package p1117y1;

import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p523V9.AbstractC8005U5;
import p523V9.AbstractC8111i5;

/* JADX INFO: renamed from: y1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C21369i extends AbstractC8005U5 {

    /* JADX INFO: renamed from: b */
    public final C21368h f67843b;

    /* JADX INFO: renamed from: c */
    public final C6002f0 f67844c = C5997d.m6430Q(null, C5975S.f19448r0);

    public C21369i(C21368h c21368h) {
        this.f67843b = c21368h;
    }

    @Override // p523V9.AbstractC8005U5
    /* JADX INFO: renamed from: b */
    public final boolean mo8311b(C21368h c21368h) {
        return c21368h == this.f67843b;
    }

    @Override // p523V9.AbstractC8005U5
    /* JADX INFO: renamed from: c */
    public final Object mo8312c(C21368h c21368h) {
        if (!(c21368h == this.f67843b)) {
            AbstractC8111i5.m8592c("Check failed.");
            throw null;
        }
        Object value = this.f67844c.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
