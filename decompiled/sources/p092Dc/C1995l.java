package p092Dc;

import p248Jk.InterfaceC4478i;

/* JADX INFO: renamed from: Dc.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C1995l implements InterfaceC4478i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5896a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1996m f5897b;

    public /* synthetic */ C1995l(C1996m c1996m, int i10) {
        this.f5896a = i10;
        this.f5897b = c1996m;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f5896a) {
            case 0:
                C1996m c1996m = this.f5897b;
                return new C2003t(c1996m.f5940c, c1996m.f5942d, c1996m.f5944e);
            default:
                C1996m c1996m2 = this.f5897b;
                return new C1999p(c1996m2.f5940c, c1996m2.f5942d, c1996m2.f5944e);
        }
    }
}
