package p135F5;

import p110E4.C2307e;

/* JADX INFO: renamed from: F5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2670f {

    /* JADX INFO: renamed from: a */
    public final C2307e f8207a;

    public C2670f(C2307e c2307e) {
        this.f8207a = c2307e;
    }

    /* JADX INFO: renamed from: a */
    public final C2671g m3653a() {
        C2666b c2666bM3650k;
        C2307e c2307e = this.f8207a;
        C2669e c2669e = (C2669e) c2307e.f7161q0;
        synchronized (c2669e.f8200t0) {
            c2307e.m3396f(true);
            c2666bM3650k = c2669e.m3650k(((C2665a) c2307e.f7159o0).f8176a);
        }
        if (c2666bM3650k != null) {
            return new C2671g(c2666bM3650k);
        }
        return null;
    }
}
