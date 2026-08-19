package p017Af;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p040Bd.C1203z0;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Af.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C0486q extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1576Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f1577Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1203z0 f1578o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f1579p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1439n f1580q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC10459q f1581r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f1582s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0486q(String str, C1203z0 c1203z0, InterfaceC1436k interfaceC1436k, InterfaceC1439n interfaceC1439n, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f1576Y = i11;
        this.f1577Z = str;
        this.f1578o0 = c1203z0;
        this.f1579p0 = interfaceC1436k;
        this.f1580q0 = interfaceC1439n;
        this.f1581r0 = interfaceC10459q;
        this.f1582s0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1576Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f1582s0 | 1);
                C1203z0 c1203z0 = this.f1578o0;
                InterfaceC1436k interfaceC1436k = this.f1579p0;
                AbstractC0490u.m1124a(this.f1577Z, c1203z0, interfaceC1436k, this.f1580q0, this.f1581r0, (C6021p) obj, iM6447d0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f1582s0 | 1);
                C1203z0 c1203z1 = this.f1578o0;
                InterfaceC1436k interfaceC1436k2 = this.f1579p0;
                AbstractC0490u.m1124a(this.f1577Z, c1203z1, interfaceC1436k2, this.f1580q0, this.f1581r0, (C6021p) obj, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }
}
