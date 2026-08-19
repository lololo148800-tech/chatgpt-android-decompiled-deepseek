package androidx.compose.foundation;

import android.view.View;
import com.google.protobuf.AbstractC12107L1;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1436k;
import p1140z1.AbstractC21672S;
import p1140z1.AbstractC21690f;
import p156G1.C2974u;
import p492U1.C7540e;
import p492U1.InterfaceC7537b;
import p635a1.AbstractC10458p;
import p773h0.AbstractC14282f0;
import p773h0.C14280e0;
import p773h0.InterfaceC14304q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Lz1/S;", "Lh0/e0;", "foundation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MagnifierElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final AbstractC16546n f32403Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1436k f32404Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC1436k f32405o0;

    /* JADX INFO: renamed from: p0 */
    public final float f32406p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f32407q0;

    /* JADX INFO: renamed from: r0 */
    public final long f32408r0;

    /* JADX INFO: renamed from: s0 */
    public final float f32409s0;

    /* JADX INFO: renamed from: t0 */
    public final float f32410t0;

    /* JADX INFO: renamed from: u0 */
    public final boolean f32411u0;

    /* JADX INFO: renamed from: v0 */
    public final InterfaceC14304q0 f32412v0;

    /* JADX WARN: Multi-variable type inference failed */
    public MagnifierElement(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC1436k interfaceC1436k3, float f10, boolean z6, long j10, float f11, float f12, boolean z10, InterfaceC14304q0 interfaceC14304q0) {
        this.f32403Y = (AbstractC16546n) interfaceC1436k;
        this.f32404Z = interfaceC1436k2;
        this.f32405o0 = interfaceC1436k3;
        this.f32406p0 = f10;
        this.f32407q0 = z6;
        this.f32408r0 = j10;
        this.f32409s0 = f11;
        this.f32410t0 = f12;
        this.f32411u0 = z10;
        this.f32412v0 = interfaceC14304q0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        InterfaceC14304q0 interfaceC14304q0 = this.f32412v0;
        return new C14280e0(this.f32403Y, this.f32404Z, this.f32405o0, this.f32406p0, this.f32407q0, this.f32408r0, this.f32409s0, this.f32410t0, this.f32411u0, interfaceC14304q0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        return this.f32403Y == magnifierElement.f32403Y && this.f32404Z == magnifierElement.f32404Z && this.f32406p0 == magnifierElement.f32406p0 && this.f32407q0 == magnifierElement.f32407q0 && this.f32408r0 == magnifierElement.f32408r0 && C7540e.m7873a(this.f32409s0, magnifierElement.f32409s0) && C7540e.m7873a(this.f32410t0, magnifierElement.f32410t0) && this.f32411u0 == magnifierElement.f32411u0 && this.f32405o0 == magnifierElement.f32405o0 && this.f32412v0.equals(magnifierElement.f32412v0);
    }

    public final int hashCode() {
        int iHashCode = this.f32403Y.hashCode() * 31;
        InterfaceC1436k interfaceC1436k = this.f32404Z;
        int iM13819j = (AbstractC12107L1.m13819j(this.f32406p0, (iHashCode + (interfaceC1436k != null ? interfaceC1436k.hashCode() : 0)) * 31, 31) + (this.f32407q0 ? 1231 : 1237)) * 31;
        long j10 = this.f32408r0;
        int iM13819j2 = (AbstractC12107L1.m13819j(this.f32410t0, AbstractC12107L1.m13819j(this.f32409s0, (((int) (j10 ^ (j10 >>> 32))) + iM13819j) * 31, 31), 31) + (this.f32411u0 ? 1231 : 1237)) * 31;
        InterfaceC1436k interfaceC1436k2 = this.f32405o0;
        return this.f32412v0.hashCode() + ((iM13819j2 + (interfaceC1436k2 != null ? interfaceC1436k2.hashCode() : 0)) * 31);
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C14280e0 c14280e0 = (C14280e0) abstractC10458p;
        float f10 = c14280e0.f44800C0;
        long j10 = c14280e0.f44802E0;
        float f11 = c14280e0.f44803F0;
        boolean z6 = c14280e0.f44801D0;
        float f12 = c14280e0.f44804G0;
        boolean z10 = c14280e0.f44805H0;
        InterfaceC14304q0 interfaceC14304q0 = c14280e0.f44806I0;
        View view = c14280e0.f44807J0;
        InterfaceC7537b interfaceC7537b = c14280e0.f44808K0;
        c14280e0.f44815z0 = this.f32403Y;
        c14280e0.f44798A0 = this.f32404Z;
        float f13 = this.f32406p0;
        c14280e0.f44800C0 = f13;
        boolean z11 = this.f32407q0;
        c14280e0.f44801D0 = z11;
        long j11 = this.f32408r0;
        c14280e0.f44802E0 = j11;
        float f14 = this.f32409s0;
        c14280e0.f44803F0 = f14;
        float f15 = this.f32410t0;
        c14280e0.f44804G0 = f15;
        boolean z12 = this.f32411u0;
        c14280e0.f44805H0 = z12;
        c14280e0.f44799B0 = this.f32405o0;
        InterfaceC14304q0 interfaceC14304q1 = this.f32412v0;
        c14280e0.f44806I0 = interfaceC14304q1;
        View viewM22219x = AbstractC21690f.m22219x(c14280e0);
        InterfaceC7537b interfaceC7537b2 = AbstractC21690f.m22217v(c14280e0).f68633D0;
        if (c14280e0.f44809L0 != null) {
            C2974u c2974u = AbstractC14282f0.f44819a;
            if (((!Float.isNaN(f13) || !Float.isNaN(f10)) && f13 != f10 && !interfaceC14304q1.mo15595a()) || j11 != j10 || !C7540e.m7873a(f14, f11) || !C7540e.m7873a(f15, f12) || z11 != z6 || z12 != z10 || !interfaceC14304q1.equals(interfaceC14304q0) || !viewM22219x.equals(view) || !AbstractC16544l.m18089b(interfaceC7537b2, interfaceC7537b)) {
                c14280e0.m15568L0();
            }
        }
        c14280e0.m15569M0();
    }
}
