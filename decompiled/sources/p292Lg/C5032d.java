package p292Lg;

import androidx.compose.material3.AbstractC10859d;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p021Aj.C0537v;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C6013l;
import p349O0.C6021p;

/* JADX INFO: renamed from: Lg.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C5032d extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16461Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5054z f16462Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f16463o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5032d(C5054z c5054z, InterfaceC1436k interfaceC1436k, int i10) {
        super(2);
        this.f16461Y = i10;
        this.f16462Z = c5054z;
        this.f16463o0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16461Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C5054z c5054z = this.f16462Z;
                    Boolean bool = c5054z.f16517j;
                    Boolean bool2 = Boolean.TRUE;
                    boolean zM18089b = AbstractC16544l.m18089b(bool, bool2);
                    Boolean bool3 = c5054z.f16515h;
                    boolean z6 = zM18089b && AbstractC16544l.m18089b(bool3, bool2);
                    boolean zM18089b2 = AbstractC16544l.m18089b(bool3, bool2);
                    c6021p.m6524S(1084629705);
                    InterfaceC1436k interfaceC1436k = this.f16463o0;
                    boolean zM6542f = c6021p.m6542f(interfaceC1436k);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6542f || objM6514H == C6013l.f19514a) {
                        objM6514H = new C0537v(8, interfaceC1436k);
                        c6021p.m6537c0(objM6514H);
                    }
                    c6021p.m6553p(false);
                    AbstractC10859d.m11284a(z6, (InterfaceC1436k) objM6514H, null, null, zM18089b2, null, null, c6021p, 0, 108);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C5054z c5054z2 = this.f16462Z;
                    Boolean bool4 = c5054z2.f16519l;
                    Boolean bool5 = Boolean.TRUE;
                    boolean zM18089b3 = AbstractC16544l.m18089b(bool4, bool5);
                    Boolean bool6 = c5054z2.f16515h;
                    boolean z10 = zM18089b3 && AbstractC16544l.m18089b(bool6, bool5);
                    boolean zM18089b4 = AbstractC16544l.m18089b(bool6, bool5);
                    c6021p2.m6524S(1084655305);
                    InterfaceC1436k interfaceC1436k2 = this.f16463o0;
                    boolean zM6542f2 = c6021p2.m6542f(interfaceC1436k2);
                    Object objM6514H2 = c6021p2.m6514H();
                    if (zM6542f2 || objM6514H2 == C6013l.f19514a) {
                        objM6514H2 = new C0537v(9, interfaceC1436k2);
                        c6021p2.m6537c0(objM6514H2);
                    }
                    c6021p2.m6553p(false);
                    AbstractC10859d.m11284a(z10, (InterfaceC1436k) objM6514H2, null, null, zM18089b4, null, null, c6021p2, 0, 108);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
