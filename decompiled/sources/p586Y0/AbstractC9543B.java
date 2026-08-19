package p586Y0;

import p349O0.C5999e;

/* JADX INFO: renamed from: Y0.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9543B implements InterfaceC9542A {

    /* JADX INFO: renamed from: Y */
    public final C5999e f28701Y = new C5999e(0);

    /* JADX INFO: renamed from: c */
    public final boolean m10037c(int i10) {
        return (i10 & this.f28701Y.get()) != 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m10038d(int i10) {
        C5999e c5999e;
        int i11;
        do {
            c5999e = this.f28701Y;
            i11 = c5999e.get();
            if ((i11 & i10) != 0) {
                return;
            }
        } while (!c5999e.compareAndSet(i11, i11 | i10));
    }

    @Override // p586Y0.InterfaceC9542A
    /* JADX INFO: renamed from: j */
    public /* synthetic */ AbstractC9544C mo6408j(AbstractC9544C abstractC9544C, AbstractC9544C abstractC9544C2, AbstractC9544C abstractC9544C3) {
        return null;
    }
}
