package androidx.compose.material.ripple;

import androidx.compose.material3.C10856a;
import androidx.compose.material3.C10857b;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p005A3.C0326m;
import p025An.AbstractC0575H;
import p1095x1.InterfaceC21098s;
import p1140z1.AbstractC21690f;
import p1140z1.C21660F;
import p1140z1.InterfaceC21702l;
import p1140z1.InterfaceC21708o;
import p1140z1.InterfaceC21717v;
import p203I0.AbstractC3560q;
import p203I0.C3565v;
import p492U1.InterfaceC7537b;
import p571X9.AbstractC9113C4;
import p635a1.AbstractC10458p;
import p692d0.C12949B;
import p774h1.InterfaceC14366v;
import p894n0.C17408n;
import p894n0.C17409o;
import p894n0.C17410p;
import p894n0.InterfaceC17406l;
import p894n0.InterfaceC17411q;
import p909nm.AbstractC17678l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18067d2 = {"Landroidx/compose/material/ripple/RippleNode;", "La1/p;", "Lz1/l;", "Lz1/o;", "Lz1/v;", "Lh1/v;", "color", "Lh1/v;", "material-ripple_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class RippleNode extends AbstractC10458p implements InterfaceC21702l, InterfaceC21708o, InterfaceC21717v {

    /* JADX INFO: renamed from: A0 */
    public final boolean f32638A0;

    /* JADX INFO: renamed from: B0 */
    public final float f32639B0;

    /* JADX INFO: renamed from: C0 */
    public final C10857b f32640C0;

    /* JADX INFO: renamed from: D0 */
    public C0326m f32641D0;

    /* JADX INFO: renamed from: E0 */
    public float f32642E0;

    /* JADX INFO: renamed from: G0 */
    public boolean f32644G0;
    private final InterfaceC14366v color;

    /* JADX INFO: renamed from: z0 */
    public final InterfaceC17406l f32646z0;

    /* JADX INFO: renamed from: F0 */
    public long f32643F0 = 0;

    /* JADX INFO: renamed from: H0 */
    public final C12949B f32645H0 = new C12949B();

    public RippleNode(InterfaceC17406l interfaceC17406l, boolean z6, float f10, C10856a c10856a, C10857b c10857b) {
        this.f32646z0 = interfaceC17406l;
        this.f32638A0 = z6;
        this.f32639B0 = f10;
        this.color = c10856a;
        this.f32640C0 = c10857b;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        AbstractC0575H.m1156D(m10935y0(), null, null, new C3565v(this, null), 3);
    }

    /* JADX INFO: renamed from: K0 */
    public abstract void mo4227K0(C17409o c17409o, long j10, float f10);

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void mo427L() {
    }

    /* JADX INFO: renamed from: L0 */
    public abstract void mo4228L0(C21660F c21660f);

    /* JADX INFO: renamed from: M0 */
    public final long m11278M0() {
        return this.color.mo4719a();
    }

    /* JADX INFO: renamed from: N0 */
    public final void m11279N0(InterfaceC17411q interfaceC17411q) {
        if (interfaceC17411q instanceof C17409o) {
            mo4227K0((C17409o) interfaceC17411q, this.f32643F0, this.f32642E0);
        } else if (interfaceC17411q instanceof C17410p) {
            mo4229O0(((C17410p) interfaceC17411q).f55605a);
        } else if (interfaceC17411q instanceof C17408n) {
            mo4229O0(((C17408n) interfaceC17411q).f55603a);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public abstract void mo4229O0(C17409o c17409o);

    @Override // p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: e */
    public final void mo430e(C21660F c21660f) {
        c21660f.m22080a();
        C0326m c0326m = this.f32641D0;
        if (c0326m != null) {
            c0326m.m956n(c21660f, this.f32642E0, this.color.mo4719a());
        }
        mo4228L0(c21660f);
    }

    @Override // p1140z1.InterfaceC21717v
    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void mo11280l0(InterfaceC21098s interfaceC21098s) {
    }

    @Override // p1140z1.InterfaceC21717v
    /* JADX INFO: renamed from: q */
    public final void mo11281q(long j10) {
        this.f32644G0 = true;
        InterfaceC7537b interfaceC7537b = AbstractC21690f.m22217v(this).f68633D0;
        this.f32643F0 = AbstractC9113C4.m9645c(j10);
        float f10 = this.f32639B0;
        this.f32642E0 = Float.isNaN(f10) ? AbstractC3560q.m4234a(interfaceC7537b, this.f32638A0, this.f32643F0) : interfaceC7537b.mo7864b0(f10);
        C12949B c12949b = this.f32645H0;
        Object[] objArr = c12949b.f41115a;
        int i10 = c12949b.f41116b;
        for (int i11 = 0; i11 < i10; i11++) {
            m11279N0((InterfaceC17411q) objArr[i11]);
        }
        AbstractC17678l.m19311r(c12949b.f41115a, null, 0, c12949b.f41116b);
        c12949b.f41116b = 0;
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: z0 */
    public final boolean mo4774z0() {
        return false;
    }
}
