package p193Hf;

import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p017Af.C0459F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C6013l;
import p349O0.C6021p;
import p523V9.AbstractC8120j6;
import p635a1.C10456n;

/* JADX INFO: renamed from: Hf.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C3315K extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10098Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f10099Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f10100o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3315K(InterfaceC1436k interfaceC1436k, boolean z6, int i10) {
        super(2);
        this.f10098Y = i10;
        this.f10099Z = interfaceC1436k;
        this.f10100o0 = z6;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10098Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    c6021p.m6524S(-810798512);
                    InterfaceC1436k interfaceC1436k = this.f10099Z;
                    boolean zM6542f = c6021p.m6542f(interfaceC1436k);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C0459F(14, interfaceC1436k);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC8120j6.m8623a(384, (InterfaceC1426a) objM6514H, c6021p, AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), this.f10100o0);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    c6021p2.m6524S(154158023);
                    InterfaceC1436k interfaceC1436k2 = this.f10099Z;
                    boolean zM6542f2 = c6021p2.m6542f(interfaceC1436k2);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6542f2 || objM6514H2 == C6013l.f19514a) {
                        objM6514H2 = new C0459F(15, interfaceC1436k2);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    c6021p2.m6553p(false);
                    AbstractC8120j6.m8623a(384, (InterfaceC1426a) objM6514H2, c6021p2, AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), this.f10100o0);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
