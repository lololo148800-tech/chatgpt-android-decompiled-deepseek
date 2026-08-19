package p030B2;

import p523V9.AbstractC8178r0;
import p979r2.C18862c;

/* JADX INFO: renamed from: B2.q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0778q0 {

    /* JADX INFO: renamed from: a */
    public final C0794y0 f2179a;

    /* JADX INFO: renamed from: b */
    public C18862c[] f2180b;

    public AbstractC0778q0() {
        this(new C0794y0());
    }

    /* JADX INFO: renamed from: a */
    public final void m1747a() {
        C18862c[] c18862cArr = this.f2180b;
        if (c18862cArr != null) {
            C18862c c18862cMo1754f = c18862cArr[0];
            C18862c c18862cMo1754f2 = c18862cArr[1];
            C0794y0 c0794y0 = this.f2179a;
            if (c18862cMo1754f2 == null) {
                c18862cMo1754f2 = c0794y0.f2209a.mo1754f(2);
            }
            if (c18862cMo1754f == null) {
                c18862cMo1754f = c0794y0.f2209a.mo1754f(1);
            }
            mo1716g(C18862c.m20170a(c18862cMo1754f, c18862cMo1754f2));
            C18862c c18862c = this.f2180b[AbstractC8178r0.m8762c(16)];
            if (c18862c != null) {
                mo1731f(c18862c);
            }
            C18862c c18862c2 = this.f2180b[AbstractC8178r0.m8762c(32)];
            if (c18862c2 != null) {
                mo1730d(c18862c2);
            }
            C18862c c18862c3 = this.f2180b[AbstractC8178r0.m8762c(64)];
            if (c18862c3 != null) {
                mo1732h(c18862c3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract C0794y0 mo1714b();

    /* JADX INFO: renamed from: c */
    public void mo1741c(int i10, C18862c c18862c) {
        if (this.f2180b == null) {
            this.f2180b = new C18862c[9];
        }
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f2180b[AbstractC8178r0.m8762c(i11)] = c18862c;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo1715e(C18862c c18862c);

    /* JADX INFO: renamed from: g */
    public abstract void mo1716g(C18862c c18862c);

    public AbstractC0778q0(C0794y0 c0794y0) {
        this.f2179a = c0794y0;
    }

    /* JADX INFO: renamed from: d */
    public void mo1730d(C18862c c18862c) {
    }

    /* JADX INFO: renamed from: f */
    public void mo1731f(C18862c c18862c) {
    }

    /* JADX INFO: renamed from: h */
    public void mo1732h(C18862c c18862c) {
    }
}
