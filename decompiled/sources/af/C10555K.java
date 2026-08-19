package af;

import androidx.compose.foundation.lazy.C10845a;
import bf.C11363S;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;

/* JADX INFO: renamed from: af.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C10555K extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31330Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f31331Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11363S f31332o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10555K(InterfaceC1436k interfaceC1436k, C11363S c11363s, int i10) {
        super(3);
        this.f31330Y = i10;
        this.f31331Z = interfaceC1436k;
        this.f31332o0 = c11363s;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f31330Y) {
            case 0:
                C10845a item = (C10845a) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item, "$this$item");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    InterfaceC5985X interfaceC5985XM6435V = C5997d.m6435V(this.f31331Z, c6021p);
                    c6021p.m6524S(-1889575871);
                    boolean zM6542f = c6021p.m6542f(interfaceC5985XM6435V);
                    C11363S c11363s = this.f31332o0;
                    boolean zM6542f2 = zM6542f | c6021p.m6542f(c11363s);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f2 || objM6514H == C6013l.f19514a) {
                        objM6514H = new C10554J(c11363s, interfaceC5985XM6435V, null);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H, c6021p, c11363s);
                }
                break;
            default:
                C10845a item2 = (C10845a) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(item2, "$this$item");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    InterfaceC5985X interfaceC5985XM6435V2 = C5997d.m6435V(this.f31331Z, c6021p2);
                    c6021p2.m6524S(-362909517);
                    C11363S c11363s2 = this.f31332o0;
                    boolean zM6542f3 = c6021p2.m6542f(c11363s2) | c6021p2.m6542f(interfaceC5985XM6435V2);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6542f3 || objM6514H2 == C6013l.f19514a) {
                        objM6514H2 = new C10568Y(c11363s2, interfaceC5985XM6435V2, null);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    c6021p2.m6553p(false);
                    C5997d.m6450f((InterfaceC1439n) objM6514H2, c6021p2, c11363s2);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
