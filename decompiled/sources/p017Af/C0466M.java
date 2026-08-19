package p017Af;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p040Bd.C0901C1;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8122k0;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Af.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C0466M extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1508Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0901C1 f1509Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f1510o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f1511p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1439n f1512q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC10459q f1513r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f1514s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0466M(C0901C1 c0901c1, boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC1439n interfaceC1439n, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f1508Y = i11;
        this.f1509Z = c0901c1;
        this.f1510o0 = z6;
        this.f1511p0 = interfaceC1436k;
        this.f1512q0 = interfaceC1439n;
        this.f1513r0 = interfaceC10459q;
        this.f1514s0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1508Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f1514s0 | 1);
                boolean z6 = this.f1510o0;
                InterfaceC1436k interfaceC1436k = this.f1511p0;
                AbstractC8122k0.m8629b(this.f1509Z, z6, interfaceC1436k, this.f1512q0, this.f1513r0, (C6021p) obj, iM6447d0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f1514s0 | 1);
                boolean z10 = this.f1510o0;
                InterfaceC1436k interfaceC1436k2 = this.f1511p0;
                AbstractC8122k0.m8629b(this.f1509Z, z10, interfaceC1436k2, this.f1512q0, this.f1513r0, (C6021p) obj, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }
}
