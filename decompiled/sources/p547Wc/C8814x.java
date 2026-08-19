package p547Wc;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p477Tb.AbstractC7294a;
import p635a1.InterfaceC10459q;
import p637a3.C10484a;
import p637a3.C10487d;
import p637a3.InterfaceC10497n;

/* JADX INFO: renamed from: Wc.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C8814x extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26988Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f26989Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f26990o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f26991p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f26992q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f26993r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f26994s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8814x(C10484a c10484a, InterfaceC10497n interfaceC10497n, int i10, C10487d c10487d, int i11, int i12) {
        super(2);
        this.f26992q0 = c10484a;
        this.f26993r0 = interfaceC10497n;
        this.f26989Z = i10;
        this.f26994s0 = c10487d;
        this.f26990o0 = i11;
        this.f26991p0 = i12;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f26988Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f26991p0 | 1);
                AbstractC8815y.m9540d((List) this.f26992q0, this.f26989Z, this.f26990o0, (InterfaceC1436k) this.f26993r0, (InterfaceC10459q) this.f26994s0, c6021p, iM6447d0);
                break;
            default:
                int i11 = this.f26990o0 | 1;
                AbstractC7294a.m7744a((C10484a) this.f26992q0, (InterfaceC10497n) this.f26993r0, this.f26989Z, (C10487d) this.f26994s0, c6021p, i11, this.f26991p0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8814x(List list, int i10, int i11, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i12) {
        super(2);
        this.f26992q0 = list;
        this.f26989Z = i10;
        this.f26990o0 = i11;
        this.f26993r0 = interfaceC1436k;
        this.f26994s0 = interfaceC10459q;
        this.f26991p0 = i12;
    }
}
