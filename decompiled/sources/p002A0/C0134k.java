package p002A0;

import android.os.Build;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p080D0.AbstractC1793a0;
import p1139z0.C21574A0;
import p1139z0.C21582E0;
import p1140z1.AbstractC21678Y;
import p1140z1.C21660F;
import p1140z1.InterfaceC21702l;
import p156G1.C2963j;
import p253K.AbstractC4502m;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p492U1.C7545j;
import p758g0.C13756d;
import p759g1.C13800b;
import p773h0.AbstractC14282f0;
import p773h0.C14280e0;
import p773h0.C14308s0;
import p773h0.C14312u0;

/* JADX INFO: renamed from: A0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0134k extends AbstractC0128e implements InterfaceC21702l {

    /* JADX INFO: renamed from: B0 */
    public C21582E0 f554B0;

    /* JADX INFO: renamed from: C0 */
    public C0120T f555C0;

    /* JADX INFO: renamed from: D0 */
    public C21574A0 f556D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f557E0;

    /* JADX INFO: renamed from: F0 */
    public final C6002f0 f558F0;

    /* JADX INFO: renamed from: G0 */
    public final C13756d f559G0;

    /* JADX INFO: renamed from: H0 */
    public final C14280e0 f560H0;

    /* JADX INFO: renamed from: I0 */
    public C0564B0 f561I0;

    public C0134k(C21582E0 c21582e0, C0120T c0120t, C21574A0 c21574a0, boolean z6) {
        this.f554B0 = c21582e0;
        this.f555C0 = c0120t;
        this.f556D0 = c21574a0;
        this.f557E0 = z6;
        C6002f0 c6002f0M6430Q = C5997d.m6430Q(new C7545j(0L), C5975S.f19448r0);
        this.f558F0 = c6002f0M6430Q;
        this.f559G0 = new C13756d(new C13800b(AbstractC4502m.m5242e(this.f554B0, this.f555C0, this.f556D0, ((C7545j) c6002f0M6430Q.getValue()).f23903a)), AbstractC1793a0.f5139b, new C13800b(AbstractC1793a0.f5140c), 8);
        C0129f c0129f = new C0129f(this, 0);
        C0129f c0129f2 = new C0129f(this, 1);
        if (!AbstractC14282f0.m15571a()) {
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
        C14280e0 c14280e0 = new C14280e0(c0129f, null, c0129f2, Float.NaN, true, 9205357640488583168L, Float.NaN, Float.NaN, true, Build.VERSION.SDK_INT == 28 ? C14308s0.f44922a : C14312u0.f44930a);
        m22223K0(c14280e0);
        this.f560H0 = c14280e0;
    }

    @Override // p002A0.AbstractC0128e, p1140z1.InterfaceC21701k0
    /* JADX INFO: renamed from: B */
    public final void mo424B(C2963j c2963j) {
        this.f560H0.mo424B(c2963j);
    }

    @Override // p635a1.AbstractC10458p
    /* JADX INFO: renamed from: C0 */
    public final void mo438C0() {
        m439O0();
    }

    @Override // p002A0.AbstractC0128e
    /* JADX INFO: renamed from: N0 */
    public final void mo423N0(C21582E0 c21582e0, C0120T c0120t, C21574A0 c21574a0, boolean z6) {
        C21582E0 c21582e1 = this.f554B0;
        C0120T c0120t2 = this.f555C0;
        C21574A0 c21574a1 = this.f556D0;
        boolean z10 = this.f557E0;
        this.f554B0 = c21582e0;
        this.f555C0 = c0120t;
        this.f556D0 = c21574a0;
        this.f557E0 = z6;
        if (AbstractC16544l.m18089b(c21582e0, c21582e1) && AbstractC16544l.m18089b(c0120t, c0120t2) && AbstractC16544l.m18089b(c21574a0, c21574a1) && z6 == z10) {
            return;
        }
        m439O0();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m439O0() {
        C0564B0 c0564b0 = this.f561I0;
        if (c0564b0 != null) {
            c0564b0.mo1275e(null);
        }
        this.f561I0 = null;
        if (AbstractC14282f0.m15571a()) {
            this.f561I0 = AbstractC0575H.m1156D(m10935y0(), null, null, new C0133j(this, null), 3);
        }
    }

    @Override // p002A0.AbstractC0128e, p1095x1.InterfaceC21063Q
    /* JADX INFO: renamed from: c */
    public final void mo429c(AbstractC21678Y abstractC21678Y) {
        this.f560H0.mo2143c(abstractC21678Y);
    }

    @Override // p002A0.AbstractC0128e, p1140z1.InterfaceC21708o
    /* JADX INFO: renamed from: e */
    public final void mo430e(C21660F c21660f) {
        c21660f.m22080a();
        this.f560H0.mo430e(c21660f);
    }
}
