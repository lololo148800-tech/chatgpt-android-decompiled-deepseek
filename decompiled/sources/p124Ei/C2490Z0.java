package p124Ei;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p594Y9.AbstractC9833X2;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Ei.Z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2490Z0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7759Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f7760Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f7761o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f7762p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f7763q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2490Z0(InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f7759Y = i11;
        this.f7760Z = interfaceC1426a;
        this.f7761o0 = interfaceC1436k;
        this.f7762p0 = interfaceC10459q;
        this.f7763q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f7759Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC2511g1.m3594f(C5997d.m6447d0(this.f7763q0 | 1), this.f7760Z, this.f7761o0, c6021p, this.f7762p0);
                break;
            case 1:
                AbstractC9833X2.m10475a(C5997d.m6447d0(this.f7763q0 | 1), this.f7760Z, this.f7761o0, c6021p, this.f7762p0);
                break;
            default:
                AbstractC9833X2.m10476b(C5997d.m6447d0(this.f7763q0 | 1), this.f7760Z, this.f7761o0, c6021p, this.f7762p0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2490Z0(InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, int i10) {
        super(2);
        this.f7759Y = 0;
        this.f7761o0 = interfaceC1436k;
        this.f7760Z = interfaceC1426a;
        this.f7762p0 = interfaceC10459q;
        this.f7763q0 = i10;
    }
}
