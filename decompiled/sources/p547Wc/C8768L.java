package p547Wc;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p1095x1.InterfaceC21098s;
import p492U1.C7543h;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9101A4;
import p860l0.C16670E0;
import p860l0.C16780t0;
import p860l0.C16782u;

/* JADX INFO: renamed from: Wc.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C8768L extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26740Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16782u f26741Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8768L(C16782u c16782u, int i10) {
        super(1);
        this.f26740Y = i10;
        this.f26741Z = c16782u;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f26740Y) {
            case 0:
                InterfaceC7537b offset = (InterfaceC7537b) obj;
                AbstractC16544l.m18094g(offset, "$this$offset");
                return new C7543h(AbstractC9101A4.m9631a(AbstractC2119a.m3195i(this.f26741Z.f53868j.m6409g()), 0));
            case 1:
                InterfaceC21098s pos = (InterfaceC21098s) obj;
                AbstractC16544l.m18094g(pos, "pos");
                C8795g0 c8795g0 = new C8795g0(pos, 0);
                C16780t0 c16780t0 = new C16780t0();
                c8795g0.invoke(c16780t0);
                C16782u.m18546h(this.f26741Z, new C16670E0(c16780t0.f53852a));
                return C17296C.f55119a;
            default:
                InterfaceC7537b offset2 = (InterfaceC7537b) obj;
                AbstractC16544l.m18094g(offset2, "$this$offset");
                return new C7543h(AbstractC9101A4.m9631a(0, (int) this.f26741Z.f53868j.m6409g()));
        }
    }
}
