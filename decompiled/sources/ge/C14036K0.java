package ge;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3984T1;
import p349O0.C6013l;
import p349O0.C6021p;
import sd.AbstractC19534b;

/* JADX INFO: renamed from: ge.K0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14036K0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44124Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f44125Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f44126o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14036K0(InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, int i10) {
        super(2);
        this.f44124Y = i10;
        this.f44125Z = interfaceC1426a;
        this.f44126o0 = interfaceC1426a2;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f44124Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    c6021p.m6524S(859308391);
                    InterfaceC1426a interfaceC1426a = this.f44125Z;
                    boolean zM6542f = c6021p.m6542f(interfaceC1426a);
                    InterfaceC1426a interfaceC1426a2 = this.f44126o0;
                    boolean zM6542f2 = zM6542f | c6021p.m6542f(interfaceC1426a2);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f2 || objM6514H == C6013l.f19514a) {
                        objM6514H = new C14101s0(interfaceC1426a, interfaceC1426a2, 1);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H, null, false, null, null, null, null, null, null, AbstractC14074f.f44290a, c6021p, 805306368, 510);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    c6021p2.m6524S(1712818966);
                    InterfaceC1426a interfaceC1426a3 = this.f44125Z;
                    boolean zM6542f3 = c6021p2.m6542f(interfaceC1426a3);
                    InterfaceC1426a interfaceC1426a4 = this.f44126o0;
                    boolean zM6542f4 = zM6542f3 | c6021p2.m6542f(interfaceC1426a4);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6542f4 || objM6514H2 == C6013l.f19514a) {
                        objM6514H2 = new C14101s0(interfaceC1426a3, interfaceC1426a4, 6);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    c6021p2.m6553p(false);
                    AbstractC3984T1.m4700s((InterfaceC1426a) objM6514H2, null, false, null, null, null, null, null, null, AbstractC19534b.f62054a, c6021p2, 805306368, 510);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
