package p193Hf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Hf.P0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3326P0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10147Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3337V0 f10148Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f10149o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f10150p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC1436k f10151q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1436k f10152r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC10459q f10153s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ boolean f10154t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ int f10155u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ int f10156v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3326P0(C3337V0 c3337v0, boolean z6, String str, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC10459q interfaceC10459q, boolean z10, int i10, int i11, int i12) {
        super(2);
        this.f10147Y = i12;
        this.f10148Z = c3337v0;
        this.f10149o0 = z6;
        this.f10150p0 = str;
        this.f10151q0 = interfaceC1436k;
        this.f10152r0 = interfaceC1436k2;
        this.f10153s0 = interfaceC10459q;
        this.f10154t0 = z10;
        this.f10155u0 = i10;
        this.f10156v0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10147Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f10155u0 | 1);
                InterfaceC10459q interfaceC10459q = this.f10153s0;
                InterfaceC1436k interfaceC1436k = this.f10152r0;
                AbstractC3333T0.m4170a(this.f10148Z, this.f10149o0, this.f10150p0, this.f10151q0, interfaceC1436k, interfaceC10459q, this.f10154t0, (C6021p) obj, iM6447d0, this.f10156v0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f10155u0 | 1);
                InterfaceC1436k interfaceC1436k2 = this.f10152r0;
                AbstractC3333T0.m4170a(this.f10148Z, this.f10149o0, this.f10150p0, this.f10151q0, interfaceC1436k2, this.f10153s0, this.f10154t0, (C6021p) obj, iM6447d1, this.f10156v0);
                break;
        }
        return C17296C.f55119a;
    }
}
