package p1140z1;

import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.C20714I0;
import p571X9.AbstractC9388w4;

/* JADX INFO: renamed from: z1.K */
/* JADX INFO: loaded from: classes.dex */
public final class C21665K {

    /* JADX INFO: renamed from: a */
    public final C21658D f68729a;

    /* JADX INFO: renamed from: b */
    public boolean f68730b;

    /* JADX INFO: renamed from: d */
    public boolean f68732d;

    /* JADX INFO: renamed from: e */
    public boolean f68733e;

    /* JADX INFO: renamed from: f */
    public boolean f68734f;

    /* JADX INFO: renamed from: g */
    public boolean f68735g;

    /* JADX INFO: renamed from: h */
    public boolean f68736h;

    /* JADX INFO: renamed from: i */
    public boolean f68737i;

    /* JADX INFO: renamed from: j */
    public int f68738j;

    /* JADX INFO: renamed from: k */
    public int f68739k;

    /* JADX INFO: renamed from: l */
    public boolean f68740l;

    /* JADX INFO: renamed from: m */
    public boolean f68741m;

    /* JADX INFO: renamed from: n */
    public int f68742n;

    /* JADX INFO: renamed from: o */
    public boolean f68743o;

    /* JADX INFO: renamed from: p */
    public boolean f68744p;

    /* JADX INFO: renamed from: q */
    public int f68745q;

    /* JADX INFO: renamed from: s */
    public C21663I f68747s;

    /* JADX INFO: renamed from: c */
    public int f68731c = 5;

    /* JADX INFO: renamed from: r */
    public final C21664J f68746r = new C21664J(this);

    /* JADX INFO: renamed from: t */
    public long f68748t = AbstractC9388w4.m9959b(0, 0, 15);

    /* JADX INFO: renamed from: u */
    public final C20714I0 f68749u = new C20714I0(this, 11);

    public C21665K(C21658D c21658d) {
        this.f68729a = c21658d;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC21678Y m22107a() {
        return (AbstractC21678Y) this.f68729a.f68638I0.f3469d;
    }

    /* JADX INFO: renamed from: b */
    public final void m22108b(int i10) {
        int i11 = this.f68742n;
        this.f68742n = i10;
        if ((i11 == 0) != (i10 == 0)) {
            C21658D c21658dM22009G = this.f68729a.m22009G();
            C21665K c21665kM22060t = c21658dM22009G != null ? c21658dM22009G.m22060t() : null;
            if (c21665kM22060t != null) {
                if (i10 == 0) {
                    c21665kM22060t.m22108b(c21665kM22060t.f68742n - 1);
                } else {
                    c21665kM22060t.m22108b(c21665kM22060t.f68742n + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m22109c(int i10) {
        int i11 = this.f68745q;
        this.f68745q = i10;
        if ((i11 == 0) != (i10 == 0)) {
            C21658D c21658dM22009G = this.f68729a.m22009G();
            C21665K c21665kM22060t = c21658dM22009G != null ? c21658dM22009G.m22060t() : null;
            if (c21665kM22060t != null) {
                if (i10 == 0) {
                    c21665kM22060t.m22109c(c21665kM22060t.f68745q - 1);
                } else {
                    c21665kM22060t.m22109c(c21665kM22060t.f68745q + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m22110d(boolean z6) {
        if (this.f68741m != z6) {
            this.f68741m = z6;
            if (z6 && !this.f68740l) {
                m22108b(this.f68742n + 1);
            } else {
                if (z6 || this.f68740l) {
                    return;
                }
                m22108b(this.f68742n - 1);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m22111e(boolean z6) {
        if (this.f68740l != z6) {
            this.f68740l = z6;
            if (z6 && !this.f68741m) {
                m22108b(this.f68742n + 1);
            } else {
                if (z6 || this.f68741m) {
                    return;
                }
                m22108b(this.f68742n - 1);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m22112f(boolean z6) {
        if (this.f68744p != z6) {
            this.f68744p = z6;
            if (z6 && !this.f68743o) {
                m22109c(this.f68745q + 1);
            } else {
                if (z6 || this.f68743o) {
                    return;
                }
                m22109c(this.f68745q - 1);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m22113g(boolean z6) {
        if (this.f68743o != z6) {
            this.f68743o = z6;
            if (z6 && !this.f68744p) {
                m22109c(this.f68745q + 1);
            } else {
                if (z6 || this.f68744p) {
                    return;
                }
                m22109c(this.f68745q - 1);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m22114h() {
        C21664J c21664j = this.f68746r;
        Object obj = c21664j.f68703D0;
        C21658D c21658d = this.f68729a;
        C21665K c21665k = c21664j.f68719T0;
        if ((obj != null || c21665k.m22107a().mo21534t() != null) && c21664j.f68702C0) {
            c21664j.f68702C0 = false;
            c21664j.f68703D0 = c21665k.m22107a().mo21534t();
            C21658D c21658dM22009G = c21658d.m22009G();
            if (c21658dM22009G != null) {
                C21658D.m22001s0(c21658dM22009G, false, 7);
            }
        }
        C21663I c21663i = this.f68747s;
        if (c21663i != null) {
            Object obj2 = c21663i.f68688I0;
            C21665K c21665k2 = c21663i.f68690K0;
            if (obj2 == null) {
                AbstractC21669O abstractC21669OMo22157H0 = c21665k2.m22107a().mo22157H0();
                AbstractC16544l.m18091d(abstractC21669OMo22157H0);
                if (abstractC21669OMo22157H0.f68765x0.mo21534t() == null) {
                    return;
                }
            }
            if (c21663i.f68687H0) {
                c21663i.f68687H0 = false;
                AbstractC21669O abstractC21669OMo22157H1 = c21665k2.m22107a().mo22157H0();
                AbstractC16544l.m18091d(abstractC21669OMo22157H1);
                c21663i.f68688I0 = abstractC21669OMo22157H1.f68765x0.mo21534t();
                if (AbstractC21690f.m22213r(c21658d)) {
                    C21658D c21658dM22009G2 = c21658d.m22009G();
                    if (c21658dM22009G2 != null) {
                        C21658D.m22001s0(c21658dM22009G2, false, 7);
                        return;
                    }
                    return;
                }
                C21658D c21658dM22009G3 = c21658d.m22009G();
                if (c21658dM22009G3 != null) {
                    C21658D.m22000q0(c21658dM22009G3, false, 7);
                }
            }
        }
    }
}
