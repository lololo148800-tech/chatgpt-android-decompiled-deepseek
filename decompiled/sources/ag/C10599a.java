package ag;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3984T1;
import p349O0.C6021p;
import p482Tg.C7443a0;
import p523V9.AbstractC8106i0;
import p537W0.AbstractC8411c;
import p882m1.AbstractC17140a;

/* JADX INFO: renamed from: ag.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C10599a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31450Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f31451Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC17140a f31452o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10599a(InterfaceC1426a interfaceC1426a, AbstractC17140a abstractC17140a, int i10) {
        super(2);
        this.f31450Y = i10;
        this.f31451Z = interfaceC1426a;
        this.f31452o0 = abstractC17140a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31450Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC8106i0.m8588c(this.f31451Z, this.f31452o0, null, c6021p, 0);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC3984T1.m4693l(this.f31451Z, null, false, null, null, AbstractC8411c.m8969c(811033000, c6021p2, new C7443a0(this.f31452o0, 9)), c6021p2, 196608, 30);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
