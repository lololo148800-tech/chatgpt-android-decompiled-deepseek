package androidx.lifecycle;

import p1012t.C19711a;

/* JADX INFO: renamed from: androidx.lifecycle.E */
/* JADX INFO: loaded from: classes.dex */
public class C11069E extends AbstractC11067C {
    @Override // androidx.lifecycle.AbstractC11067C
    /* JADX INFO: renamed from: j */
    public void mo12122j(Object obj) {
        AbstractC11067C.m12116a("setValue");
        this.f33365g++;
        this.f33363e = obj;
        m12118c(null);
    }

    /* JADX INFO: renamed from: k */
    public final void m12124k(Object obj) {
        boolean z6;
        synchronized (this.f33359a) {
            z6 = this.f33364f == AbstractC11067C.f33358k;
            this.f33364f = obj;
        }
        if (z6) {
            C19711a.m20661e().m20662f(this.f33368j);
        }
    }
}
