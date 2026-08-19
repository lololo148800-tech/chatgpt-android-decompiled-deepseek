package p092Dc;

import p248Jk.InterfaceC4478i;

/* JADX INFO: renamed from: Dc.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C1997n implements InterfaceC4478i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5988a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1998o f5989b;

    public /* synthetic */ C1997n(C1998o c1998o, int i10) {
        this.f5988a = i10;
        this.f5989b = c1998o;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        switch (this.f5988a) {
            case 0:
                return new C2004u(this.f5989b.f6034b);
            default:
                return new C2006w(this.f5989b.f6034b);
        }
    }
}
