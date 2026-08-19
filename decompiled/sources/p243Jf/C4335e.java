package p243Jf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p204I1.C3582M;
import p204I1.C3590f;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C6021p;
import p537W0.AbstractC8411c;

/* JADX INFO: renamed from: Jf.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C4335e extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14118Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4336f f14119Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4335e(C4336f c4336f, int i10) {
        super(2);
        this.f14118Y = i10;
        this.f14119Z = c4336f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14118Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C3590f c3590f = this.f14119Z.f14121b;
                    if (c3590f == null) {
                        c3590f = new C3590f(6, "", null);
                    }
                    AbstractC4124r4.m4769c(c3590f, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c6021p, 0, 0, 262142);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4767a(C3582M.m4274b(((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12154j, 0L, 0L, null, null, 0L, null, 0, 3, 0L, null, null, 16711679), AbstractC8411c.m8969c(2092538757, c6021p2, new C4335e(this.f14119Z, 0)), c6021p2, 48);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
