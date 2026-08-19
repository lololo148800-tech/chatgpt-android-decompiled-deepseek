package p528Vg;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1155zi.C21891A;
import p349O0.C5997d;
import p349O0.C6021p;
import p594Y9.AbstractC9845Z2;
import p635a1.InterfaceC10459q;
import p870le.AbstractC16912v0;

/* JADX INFO: renamed from: Vg.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C8287f extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f25834Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f25835Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f25836o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f25837p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC10459q f25838q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f25839r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f25840s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8287f(C21891A c21891a, InterfaceC10459q interfaceC10459q, boolean z6, boolean z10, boolean z11, int i10) {
        super(2);
        this.f25840s0 = c21891a;
        this.f25838q0 = interfaceC10459q;
        this.f25835Z = z6;
        this.f25836o0 = z10;
        this.f25837p0 = z11;
        this.f25839r0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25834Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC9845Z2.m10491a((C21891A) this.f25840s0, this.f25838q0, this.f25835Z, this.f25836o0, this.f25837p0, (C6021p) obj, C5997d.m6447d0(this.f25839r0 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f25839r0 | 1);
                boolean z6 = this.f25836o0;
                boolean z10 = this.f25837p0;
                AbstractC16912v0.m18581a(this.f25835Z, z6, z10, (InterfaceC1436k) this.f25840s0, this.f25838q0, (C6021p) obj, iM6447d0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8287f(boolean z6, boolean z10, boolean z11, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10) {
        super(2);
        this.f25835Z = z6;
        this.f25836o0 = z10;
        this.f25837p0 = z11;
        this.f25840s0 = interfaceC1436k;
        this.f25838q0 = interfaceC10459q;
        this.f25839r0 = i10;
    }
}
