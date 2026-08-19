package coil.compose;

import android.os.SystemClock;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1095x1.AbstractC21075b0;
import p1095x1.InterfaceC21090k;
import p349O0.C5975S;
import p349O0.C5994b0;
import p349O0.C5996c0;
import p349O0.C5997d;
import p349O0.C6002f0;
import p523V9.AbstractC8112i6;
import p530Vi.AbstractC8301I;
import p604Yk.C10077b;
import p759g1.C13803e;
import p774h1.C14356l;
import p821j1.InterfaceC16039d;
import p882m1.AbstractC17140a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcoil/compose/CrossfadePainter;", "Lm1/a;", "coil-compose-base_release"}, m18068k = 1, m18069mv = {2, 0, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CrossfadePainter extends AbstractC17140a {

    /* JADX INFO: renamed from: r0 */
    public AbstractC17140a f35891r0;

    /* JADX INFO: renamed from: s0 */
    public final AbstractC17140a f35892s0;

    /* JADX INFO: renamed from: t0 */
    public final InterfaceC21090k f35893t0;

    /* JADX INFO: renamed from: u0 */
    public final int f35894u0;

    /* JADX INFO: renamed from: v0 */
    public final boolean f35895v0;

    /* JADX INFO: renamed from: w0 */
    public final boolean f35896w0;

    /* JADX INFO: renamed from: z0 */
    public boolean f35899z0;

    /* JADX INFO: renamed from: x0 */
    public final C5996c0 f35897x0 = C5997d.m6429P(0);

    /* JADX INFO: renamed from: y0 */
    public long f35898y0 = -1;

    /* JADX INFO: renamed from: A0 */
    public final C5994b0 f35889A0 = C5997d.m6428O(1.0f);

    /* JADX INFO: renamed from: B0 */
    public final C6002f0 f35890B0 = C5997d.m6430Q(null, C5975S.f19448r0);

    public CrossfadePainter(AbstractC17140a abstractC17140a, AbstractC17140a abstractC17140a2, InterfaceC21090k interfaceC21090k, int i10, boolean z6, boolean z10) {
        this.f35891r0 = abstractC17140a;
        this.f35892s0 = abstractC17140a2;
        this.f35893t0 = interfaceC21090k;
        this.f35894u0 = i10;
        this.f35895v0 = z6;
        this.f35896w0 = z10;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: b */
    public final boolean mo11307b(float f10) {
        this.f35889A0.m6410h(f10);
        return true;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: e */
    public final boolean mo11308e(C14356l c14356l) {
        this.f35890B0.setValue(c14356l);
        return true;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: h */
    public final long getF38830r0() {
        AbstractC17140a abstractC17140a = this.f35891r0;
        long f38830r0 = abstractC17140a != null ? abstractC17140a.getF38830r0() : 0L;
        AbstractC17140a abstractC17140a2 = this.f35892s0;
        long f38830r1 = abstractC17140a2 != null ? abstractC17140a2.getF38830r0() : 0L;
        boolean z6 = f38830r0 != 9205357640488583168L;
        boolean z10 = f38830r1 != 9205357640488583168L;
        if (z6 && z10) {
            return AbstractC8112i6.m8603a(Math.max(C13803e.m15333e(f38830r0), C13803e.m15333e(f38830r1)), Math.max(C13803e.m15331c(f38830r0), C13803e.m15331c(f38830r1)));
        }
        if (this.f35896w0) {
            if (z6) {
                return f38830r0;
            }
            if (z10) {
                return f38830r1;
            }
        }
        return 9205357640488583168L;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: i */
    public final void mo11310i(InterfaceC16039d interfaceC16039d) {
        boolean z6 = this.f35899z0;
        C5994b0 c5994b0 = this.f35889A0;
        AbstractC17140a abstractC17140a = this.f35892s0;
        if (z6) {
            m13133j(interfaceC16039d, abstractC17140a, c5994b0.m6409g());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f35898y0 == -1) {
            this.f35898y0 = jUptimeMillis;
        }
        float f10 = (jUptimeMillis - this.f35898y0) / this.f35894u0;
        float fM6409g = c5994b0.m6409g() * AbstractC8301I.m8920k(f10, 0.0f, 1.0f);
        float fM6409g2 = this.f35895v0 ? c5994b0.m6409g() - fM6409g : c5994b0.m6409g();
        this.f35899z0 = f10 >= 1.0f;
        m13133j(interfaceC16039d, this.f35891r0, fM6409g2);
        m13133j(interfaceC16039d, abstractC17140a, fM6409g);
        if (this.f35899z0) {
            this.f35891r0 = null;
        } else {
            C5996c0 c5996c0 = this.f35897x0;
            c5996c0.m6413h(c5996c0.m6412g() + 1);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m13133j(InterfaceC16039d interfaceC16039d, AbstractC17140a abstractC17140a, float f10) {
        if (abstractC17140a == null || f10 <= 0.0f) {
            return;
        }
        long jMo17602i = interfaceC16039d.mo17602i();
        long f38830r0 = abstractC17140a.getF38830r0();
        long jM21571l = (f38830r0 == 9205357640488583168L || C13803e.m15334f(f38830r0) || jMo17602i == 9205357640488583168L || C13803e.m15334f(jMo17602i)) ? jMo17602i : AbstractC21075b0.m21571l(f38830r0, this.f35893t0.mo21575a(f38830r0, jMo17602i));
        C6002f0 c6002f0 = this.f35890B0;
        if (jMo17602i == 9205357640488583168L || C13803e.m15334f(jMo17602i)) {
            abstractC17140a.m18904g(interfaceC16039d, jM21571l, f10, (C14356l) c6002f0.getValue());
            return;
        }
        float f11 = 2;
        float fM15333e = (C13803e.m15333e(jMo17602i) - C13803e.m15333e(jM21571l)) / f11;
        float fM15331c = (C13803e.m15331c(jMo17602i) - C13803e.m15331c(jM21571l)) / f11;
        ((C10077b) interfaceC16039d.mo17601f0().f43259Z).m10659E(fM15333e, fM15331c, fM15333e, fM15331c);
        abstractC17140a.m18904g(interfaceC16039d, jM21571l, f10, (C14356l) c6002f0.getValue());
        float f12 = -fM15333e;
        float f13 = -fM15331c;
        ((C10077b) interfaceC16039d.mo17601f0().f43259Z).m10659E(f12, f13, f12, f13);
    }
}
