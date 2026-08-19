package p706df;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.InterfaceC17302e;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1042uh.C20263a0;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8047a5;
import p523V9.AbstractC8063c5;
import p635a1.InterfaceC10459q;
import p870le.AbstractC16912v0;

/* JADX INFO: renamed from: df.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C13101u extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f41603Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f41604Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f41605o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f41606p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f41607q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC17302e f41608r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f41609s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13101u(Object obj, boolean z6, boolean z10, InterfaceC1436k interfaceC1436k, Object obj2, int i10, int i11) {
        super(2);
        this.f41603Y = i11;
        this.f41607q0 = obj;
        this.f41604Z = z6;
        this.f41605o0 = z10;
        this.f41608r0 = interfaceC1436k;
        this.f41609s0 = obj2;
        this.f41606p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41603Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC8047a5.m8430c((C13087g) this.f41607q0, this.f41604Z, this.f41605o0, (InterfaceC1436k) this.f41608r0, (InterfaceC1436k) this.f41609s0, (C6021p) obj, C5997d.m6447d0(this.f41606p0 | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f41606p0 | 1);
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) this.f41607q0;
                InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) this.f41608r0;
                AbstractC16912v0.m18584d(this.f41604Z, this.f41605o0, interfaceC1426a, interfaceC1426a2, (InterfaceC10459q) this.f41609s0, (C6021p) obj, iM6447d0);
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC8063c5.m8463f((C20263a0) this.f41607q0, this.f41604Z, this.f41605o0, (InterfaceC1436k) this.f41608r0, (InterfaceC10459q) this.f41609s0, (C6021p) obj, C5997d.m6447d0(this.f41606p0 | 1));
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13101u(boolean z6, boolean z10, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, InterfaceC10459q interfaceC10459q, int i10) {
        super(2);
        this.f41603Y = 1;
        this.f41604Z = z6;
        this.f41605o0 = z10;
        this.f41607q0 = interfaceC1426a;
        this.f41608r0 = interfaceC1426a2;
        this.f41609s0 = interfaceC10459q;
        this.f41606p0 = i10;
    }
}
