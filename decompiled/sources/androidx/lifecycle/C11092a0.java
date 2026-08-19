package androidx.lifecycle;

import mm.C17296C;
import p025An.C0624m;
import p124Ei.C2550w0;
import p349O0.C5972Q;
import p571X9.AbstractC9233X;

/* JADX INFO: renamed from: androidx.lifecycle.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11092a0 implements InterfaceC11110s {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC11105n f33461Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0624m f33462Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2550w0 f33463o0;

    public C11092a0(AbstractC11105n abstractC11105n, C0624m c0624m, C2550w0 c2550w0) {
        this.f33461Y = abstractC11105n;
        this.f33462Z = c0624m;
        this.f33463o0 = c2550w0;
    }

    @Override // androidx.lifecycle.InterfaceC11110s
    /* JADX INFO: renamed from: E */
    public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        Object objM9806b;
        C11101j c11101j = EnumC11103l.Companion;
        EnumC11104m enumC11104m = EnumC11104m.f33477p0;
        c11101j.getClass();
        EnumC11103l enumC11103lM12161c = C11101j.m12161c(enumC11104m);
        C0624m c0624m = this.f33462Z;
        AbstractC11105n abstractC11105n = this.f33461Y;
        if (enumC11103l != enumC11103lM12161c) {
            if (enumC11103l == EnumC11103l.ON_DESTROY) {
                abstractC11105n.mo7808c(this);
                c0624m.resumeWith(AbstractC9233X.m9806b(new C5972Q(null, 2)));
                return;
            }
            return;
        }
        abstractC11105n.mo7808c(this);
        try {
            this.f33463o0.invoke();
            objM9806b = C17296C.f55119a;
        } catch (Throwable th2) {
            objM9806b = AbstractC9233X.m9806b(th2);
        }
        c0624m.resumeWith(objM9806b);
    }
}
