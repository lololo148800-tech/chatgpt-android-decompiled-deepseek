package p232J3;

import io.sentry.internal.debugmeta.C15384c;
import p031B3.C0803g;
import p1016t3.C19787n;
import p1016t3.C19788o;

/* JADX INFO: renamed from: J3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4228b implements InterfaceC4220U {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC4220U f13818Y;

    /* JADX INFO: renamed from: Z */
    public boolean f13819Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4230c f13820o0;

    public C4228b(C4230c c4230c, InterfaceC4220U interfaceC4220U) {
        this.f13820o0 = c4230c;
        this.f13818Y = interfaceC4220U;
    }

    @Override // p232J3.InterfaceC4220U
    /* JADX INFO: renamed from: a */
    public final boolean mo4941a() {
        return !this.f13820o0.m5000n() && this.f13818Y.mo4941a();
    }

    @Override // p232J3.InterfaceC4220U
    /* JADX INFO: renamed from: b */
    public final void mo4942b() {
        this.f13818Y.mo4942b();
    }

    @Override // p232J3.InterfaceC4220U
    /* JADX INFO: renamed from: c */
    public final int mo4943c(long j10) {
        if (this.f13820o0.m5000n()) {
            return -3;
        }
        return this.f13818Y.mo4943c(j10);
    }

    @Override // p232J3.InterfaceC4220U
    /* JADX INFO: renamed from: d */
    public final int mo4944d(C15384c c15384c, C0803g c0803g, int i10) {
        C4230c c4230c = this.f13820o0;
        if (c4230c.m5000n()) {
            return -3;
        }
        if (this.f13819Z) {
            c0803g.f2213Z = 4;
            return -4;
        }
        long jMo4925l = c4230c.mo4925l();
        int iMo4944d = this.f13818Y.mo4944d(c15384c, c0803g, i10);
        if (iMo4944d != -5) {
            long j10 = c4230c.f13826r0;
            if (j10 == Long.MIN_VALUE || ((iMo4944d != -4 || c0803g.f2228s0 < j10) && !(iMo4944d == -3 && jMo4925l == Long.MIN_VALUE && !c0803g.f2227r0))) {
                return iMo4944d;
            }
            c0803g.mo1834n();
            c0803g.f2213Z = 4;
            this.f13819Z = true;
            return -4;
        }
        C19788o c19788o = (C19788o) c15384c.f47968o0;
        c19788o.getClass();
        int i11 = c19788o.f62733E;
        int i12 = c19788o.f62732D;
        if (i12 != 0 || i11 != 0) {
            if (c4230c.f13825q0 != 0) {
                i12 = 0;
            }
            if (c4230c.f13826r0 != Long.MIN_VALUE) {
                i11 = 0;
            }
            C19787n c19787nM20747a = c19788o.m20747a();
            c19787nM20747a.f62696C = i12;
            c19787nM20747a.f62697D = i11;
            c15384c.f47968o0 = new C19788o(c19787nM20747a);
        }
        return -5;
    }
}
