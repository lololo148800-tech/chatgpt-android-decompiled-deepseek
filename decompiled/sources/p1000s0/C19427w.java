package p1000s0;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8218w0;
import p635a1.C10450h;
import p635a1.InterfaceC10445c;
import p860l0.EnumC16673F0;
import p953q0.C18558P;

/* JADX INFO: renamed from: s0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C19427w extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f61575Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18558P f61576Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ long f61577o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C19426v f61578p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f61579q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ EnumC16673F0 f61580r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC10445c f61581s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C10450h f61582t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ boolean f61583u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ int f61584v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19427w(C18558P c18558p, long j10, C19426v c19426v, long j11, EnumC16673F0 enumC16673F0, InterfaceC10445c interfaceC10445c, C10450h c10450h, boolean z6, int i10, int i11) {
        super(1);
        this.f61575Y = i11;
        this.f61576Z = c18558p;
        this.f61577o0 = j10;
        this.f61578p0 = c19426v;
        this.f61579q0 = j11;
        this.f61580r0 = enumC16673F0;
        this.f61581s0 = interfaceC10445c;
        this.f61582t0 = c10450h;
        this.f61583u0 = z6;
        this.f61584v0 = i10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f61575Y) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                C18558P c18558p = this.f61576Z;
                return AbstractC8218w0.m8847b(c18558p, iIntValue, this.f61577o0, this.f61578p0, this.f61579q0, this.f61580r0, this.f61581s0, this.f61582t0, c18558p.f59128Z.getLayoutDirection(), this.f61583u0, this.f61584v0);
            default:
                int iIntValue2 = ((Number) obj).intValue();
                C18558P c18558p2 = this.f61576Z;
                return AbstractC8218w0.m8847b(c18558p2, iIntValue2, this.f61577o0, this.f61578p0, this.f61579q0, this.f61580r0, this.f61581s0, this.f61582t0, c18558p2.f59128Z.getLayoutDirection(), this.f61583u0, this.f61584v0);
        }
    }
}
