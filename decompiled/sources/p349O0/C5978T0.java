package p349O0;

import java.util.Iterator;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: O0.T0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5978T0 implements Iterable, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final C5943B0 f19458Y;

    /* JADX INFO: renamed from: Z */
    public final int f19459Z;

    /* JADX INFO: renamed from: o0 */
    public final C5997d f19460o0;

    public C5978T0(C5943B0 c5943b0, int i10, AbstractC5958J abstractC5958J, C5997d c5997d) {
        this.f19458Y = c5943b0;
        this.f19459Z = i10;
        this.f19460o0 = c5997d;
        abstractC5958J.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C5956I(this.f19458Y, this.f19459Z, null, this.f19460o0);
    }
}
