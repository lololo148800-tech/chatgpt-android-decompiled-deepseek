package p870le;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1155zi.EnumC21974X0;
import p225Im.InterfaceC3759g;
import p544W9.AbstractC8614c3;
import p552Wg.C8846h;
import p553Wh.C8870f;
import p948pi.C18418a;

/* JADX INFO: renamed from: le.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C16899p extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54265Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18418a f54266Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8870f f54267o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC3759g f54268p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16899p(C18418a c18418a, C8870f c8870f, InterfaceC3759g interfaceC3759g, int i10) {
        super(0);
        this.f54265Y = i10;
        this.f54266Z = c18418a;
        this.f54267o0 = c8870f;
        this.f54268p0 = interfaceC3759g;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f54265Y) {
            case 0:
                AbstractC8614c3.m9262a(this.f54266Z, this.f54267o0, EnumC21974X0.f69557q0, new C8846h(this.f54268p0, 20));
                break;
            case 1:
                AbstractC8614c3.m9262a(this.f54266Z, this.f54267o0, EnumC21974X0.f69557q0, new C8846h(this.f54268p0, 21));
                break;
            case 2:
                AbstractC8614c3.m9262a(this.f54266Z, this.f54267o0, EnumC21974X0.f69557q0, new C8846h(this.f54268p0, 29));
                break;
            default:
                AbstractC8614c3.m9262a(this.f54266Z, this.f54267o0, EnumC21974X0.f69557q0, new C16862T(this.f54268p0, 0));
                break;
        }
        return C17296C.f55119a;
    }
}
