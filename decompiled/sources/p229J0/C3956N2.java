package p229J0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: J0.N2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3956N2 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC1426a f12275Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f12276Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f12277o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ float f12278p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f12279q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f12280r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ float f12281s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ int f12282t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3956N2(InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, long j10, float f10, long j11, int i10, float f11, int i11) {
        super(2);
        this.f12275Y = interfaceC1426a;
        this.f12276Z = interfaceC10459q;
        this.f12277o0 = j10;
        this.f12278p0 = f10;
        this.f12279q0 = j11;
        this.f12280r0 = i10;
        this.f12281s0 = f11;
        this.f12282t0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM6447d0 = C5997d.m6447d0(this.f12282t0 | 1);
        float f10 = this.f12278p0;
        long j10 = this.f12279q0;
        AbstractC3980S2.m4667a(this.f12275Y, this.f12276Z, this.f12277o0, f10, j10, this.f12280r0, this.f12281s0, (C6021p) obj, iM6447d0);
        return C17296C.f55119a;
    }
}
