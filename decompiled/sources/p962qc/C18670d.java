package p962qc;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1439n;
import p204I1.C3582M;
import p229J0.AbstractC4025b1;
import p229J0.AbstractC4124r4;
import p349O0.C6021p;
import p774h1.C14365u;

/* JADX INFO: renamed from: qc.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C18670d extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C18670d f59425Z = new C18670d(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18670d f59426o0 = new C18670d(2, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59427Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18670d(int i10, int i11) {
        super(i10);
        this.f59427Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f59427Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                ((Number) obj2).intValue();
                c6021p.m6525T(-1935155269);
                C3582M c3582m = (C3582M) c6021p.m6548k(AbstractC4124r4.f13310a);
                c6021p.m6553p(false);
                return c3582m;
            default:
                C6021p c6021p2 = (C6021p) obj;
                ((Number) obj2).intValue();
                c6021p2.m6525T(659794844);
                long j10 = ((C14365u) c6021p2.m6548k(AbstractC4025b1.f12649a)).f45062a;
                c6021p2.m6553p(false);
                return new C14365u(j10);
        }
    }
}
