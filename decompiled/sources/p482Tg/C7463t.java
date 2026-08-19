package p482Tg;

import androidx.compose.material3.AbstractC10859d;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p072Ci.C1705j;
import p225Im.InterfaceC3759g;
import p244Jg.C4339c;
import p349O0.C6013l;
import p349O0.C6021p;

/* JADX INFO: renamed from: Tg.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C7463t extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23715Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7439X f23716Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC3759g f23717o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7463t(C7439X c7439x, InterfaceC3759g interfaceC3759g, int i10) {
        super(2);
        this.f23715Y = i10;
        this.f23716Z = c7439x;
        this.f23717o0 = interfaceC3759g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23715Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C1705j c1705j = this.f23716Z.f23549j;
                    boolean z6 = c1705j != null ? c1705j.f4885r : false;
                    c6021p.m6524S(-775948446);
                    InterfaceC3759g interfaceC3759g = this.f23717o0;
                    boolean zM6542f = c6021p.m6542f(interfaceC3759g);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C4339c(interfaceC3759g, 13);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC10859d.m11284a(z6, (InterfaceC1436k) objM6514H, null, null, false, null, null, c6021p, 0, 124);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    boolean z10 = this.f23716Z.f23548i;
                    c6021p2.m6524S(370749315);
                    InterfaceC3759g interfaceC3759g2 = this.f23717o0;
                    boolean zM6542f2 = c6021p2.m6542f(interfaceC3759g2);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6542f2 || objM6514H2 == C6013l.f19514a) {
                        objM6514H2 = new C4339c(interfaceC3759g2, 15);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    c6021p2.m6553p(false);
                    AbstractC10859d.m11284a(z10, (InterfaceC1436k) objM6514H2, null, null, false, null, null, c6021p2, 0, 124);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
