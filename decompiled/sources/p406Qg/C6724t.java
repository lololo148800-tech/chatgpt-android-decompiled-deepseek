package p406Qg;

import androidx.compose.material3.AbstractC10859d;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p225Im.InterfaceC3759g;
import p244Jg.C4339c;
import p349O0.C6013l;
import p349O0.C6021p;
import p594Y9.AbstractC9818V;
import p635a1.C10456n;

/* JADX INFO: renamed from: Qg.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C6724t extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21593Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f21594Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC3759g f21595o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6725u f21596p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6724t(boolean z6, InterfaceC3759g interfaceC3759g, C6725u c6725u, int i10) {
        super(2);
        this.f21593Y = i10;
        this.f21594Z = z6;
        this.f21595o0 = interfaceC3759g;
        this.f21596p0 = c6725u;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21593Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    c6021p.m6524S(1867778241);
                    InterfaceC3759g interfaceC3759g = this.f21595o0;
                    boolean zM6542f = c6021p.m6542f(interfaceC3759g);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C4339c(interfaceC3759g, 8);
                        c6021p.m6537c0(objM6514H);
                    }
                    InterfaceC1436k interfaceC1436k = (InterfaceC1436k) objM6514H;
                    c6021p.m6553p(false);
                    AbstractC10859d.m11284a(this.f21594Z, interfaceC1436k, AbstractC9818V.m10458b(C10456n.f30959Y, this.f21596p0.f21597a == null, false, 0.0f, 14), null, false, null, null, c6021p, 0, 120);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    c6021p2.m6524S(1867816455);
                    InterfaceC3759g interfaceC3759g2 = this.f21595o0;
                    boolean zM6542f2 = c6021p2.m6542f(interfaceC3759g2);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6542f2 || objM6514H2 == C6013l.f19514a) {
                        objM6514H2 = new C4339c(interfaceC3759g2, 9);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    c6021p2.m6553p(false);
                    AbstractC10859d.m11284a(this.f21594Z, (InterfaceC1436k) objM6514H2, null, null, AbstractC16544l.m18089b(this.f21596p0.f21597a, Boolean.TRUE), null, null, c6021p2, 0, 108);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
