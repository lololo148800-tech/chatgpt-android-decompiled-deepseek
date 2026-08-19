package p870le;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1081wc.InterfaceC20904w;
import p225Im.InterfaceC3759g;
import p229J0.AbstractC4101o;
import p349O0.C5975S;
import p349O0.C6013l;
import p349O0.C6021p;
import p537W0.C8410b;
import p553Wh.C8870f;
import p911o0.C17794y;
import p948pi.C18418a;

/* JADX INFO: renamed from: le.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C16910u0 extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC20904w f54315Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f54316Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18418a f54317o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C8870f f54318p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC3759g f54319q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ boolean f54320r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ boolean f54321s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16910u0(InterfaceC20904w interfaceC20904w, InterfaceC1436k interfaceC1436k, C18418a c18418a, C8870f c8870f, InterfaceC3759g interfaceC3759g, boolean z6, boolean z10) {
        super(3);
        this.f54315Y = interfaceC20904w;
        this.f54316Z = interfaceC1436k;
        this.f54317o0 = c18418a;
        this.f54318p0 = c8870f;
        this.f54319q0 = interfaceC3759g;
        this.f54320r0 = z6;
        this.f54321s0 = z10;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C16910u0 c16910u0;
        C16910u0 c16910u1;
        C17794y DropdownMenu = (C17794y) obj;
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g(DropdownMenu, "$this$DropdownMenu");
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C8410b c8410b = AbstractC16889k.f54230a;
            c6021p.m6524S(2075813019);
            InterfaceC20904w interfaceC20904w = this.f54315Y;
            boolean zM6545h = c6021p.m6545h(interfaceC20904w);
            InterfaceC1436k interfaceC1436k = this.f54316Z;
            boolean zM6542f = zM6545h | c6021p.m6542f(interfaceC1436k);
            C18418a c18418a = this.f54317o0;
            boolean zM6545h2 = zM6542f | c6021p.m6545h(c18418a);
            C8870f c8870f = this.f54318p0;
            boolean zM6545h3 = zM6545h2 | c6021p.m6545h(c8870f);
            InterfaceC3759g interfaceC3759g = this.f54319q0;
            boolean zM6542f2 = zM6545h3 | c6021p.m6542f(interfaceC3759g);
            Object objM6514H = c6021p.m6514H();
            C5975S c5975s = C6013l.f19514a;
            if (zM6542f2 || objM6514H == c5975s) {
                objM6514H = new C16908t0(this.f54315Y, this.f54316Z, this.f54317o0, this.f54318p0, this.f54319q0, 0);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            AbstractC4101o.m4761b(c8410b, (InterfaceC1426a) objM6514H, null, AbstractC16889k.f54231b, null, this.f54320r0, null, null, null, c6021p, 3078, 468);
            C8410b c8410b2 = AbstractC16889k.f54232c;
            c6021p.m6524S(2075838618);
            boolean zM6545h4 = c6021p.m6545h(interfaceC20904w) | c6021p.m6542f(interfaceC1436k) | c6021p.m6545h(c18418a) | c6021p.m6545h(c8870f) | c6021p.m6542f(interfaceC3759g);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6545h4 || objM6514H2 == c5975s) {
                c16910u0 = this;
                objM6514H2 = new C16908t0(c16910u0.f54315Y, c16910u0.f54316Z, c16910u0.f54317o0, c16910u0.f54318p0, c16910u0.f54319q0, 1);
                c6021p.m6537c0(objM6514H2);
            } else {
                c16910u0 = this;
            }
            c6021p.m6553p(false);
            AbstractC4101o.m4761b(c8410b2, (InterfaceC1426a) objM6514H2, null, AbstractC16889k.f54233d, null, c16910u0.f54320r0, null, null, null, c6021p, 3078, 468);
            C8410b c8410b3 = AbstractC16889k.f54234e;
            c6021p.m6524S(2075864062);
            boolean zM6545h5 = c6021p.m6545h(c8870f) | c6021p.m6545h(interfaceC20904w) | c6021p.m6542f(interfaceC1436k) | c6021p.m6545h(c18418a) | c6021p.m6542f(interfaceC3759g);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6545h5 || objM6514H3 == c5975s) {
                c16910u1 = this;
                objM6514H3 = new C16908t0(c16910u1.f54315Y, c16910u1.f54316Z, c16910u1.f54317o0, c16910u1.f54318p0, c16910u1.f54319q0, 2);
                c6021p.m6537c0(objM6514H3);
            } else {
                c16910u1 = this;
            }
            c6021p.m6553p(false);
            AbstractC4101o.m4761b(c8410b3, (InterfaceC1426a) objM6514H3, null, AbstractC16889k.f54235f, null, c16910u1.f54321s0, null, null, null, c6021p, 3078, 468);
        }
        return C17296C.f55119a;
    }
}
