package p655b2;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import livekit.org.webrtc.WebrtcBuildVersion;
import p571X9.AbstractC9306j0;
import p658b5.C11242m;

/* JADX INFO: renamed from: b2.b */
/* JADX INFO: loaded from: classes.dex */
public class C11218b {

    /* JADX INFO: renamed from: d */
    public final C11217a f33944d;

    /* JADX INFO: renamed from: a */
    public C11221e f33941a = null;

    /* JADX INFO: renamed from: b */
    public float f33942b = 0.0f;

    /* JADX INFO: renamed from: c */
    public final ArrayList f33943c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f33945e = false;

    public C11218b(C11242m c11242m) {
        this.f33944d = new C11217a(this, c11242m);
    }

    /* JADX INFO: renamed from: a */
    public final void m12447a(C11219c c11219c, int i10) {
        this.f33944d.m12445g(c11219c.m12466j(i10), 1.0f);
        this.f33944d.m12445g(c11219c.m12466j(i10), -1.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m12448b(C11221e c11221e, C11221e c11221e2, C11221e c11221e3, int i10) {
        boolean z6 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z6 = true;
            }
            this.f33942b = i10;
        }
        if (z6) {
            this.f33944d.m12445g(c11221e, 1.0f);
            this.f33944d.m12445g(c11221e2, -1.0f);
            this.f33944d.m12445g(c11221e3, -1.0f);
        } else {
            this.f33944d.m12445g(c11221e, -1.0f);
            this.f33944d.m12445g(c11221e2, 1.0f);
            this.f33944d.m12445g(c11221e3, 1.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12449c(C11221e c11221e, C11221e c11221e2, C11221e c11221e3, int i10) {
        boolean z6 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z6 = true;
            }
            this.f33942b = i10;
        }
        if (z6) {
            this.f33944d.m12445g(c11221e, 1.0f);
            this.f33944d.m12445g(c11221e2, -1.0f);
            this.f33944d.m12445g(c11221e3, 1.0f);
        } else {
            this.f33944d.m12445g(c11221e, -1.0f);
            this.f33944d.m12445g(c11221e2, 1.0f);
            this.f33944d.m12445g(c11221e3, -1.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public C11221e mo12450d(boolean[] zArr) {
        return m12452f(zArr, null);
    }

    /* JADX INFO: renamed from: e */
    public boolean mo12451e() {
        return this.f33941a == null && this.f33942b == 0.0f && this.f33944d.m12442d() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final C11221e m12452f(boolean[] zArr, C11221e c11221e) {
        int i10;
        int iM12442d = this.f33944d.m12442d();
        C11221e c11221e2 = null;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < iM12442d; i11++) {
            float fM12444f = this.f33944d.m12444f(i11);
            if (fM12444f < 0.0f) {
                C11221e c11221eM12443e = this.f33944d.m12443e(i11);
                if ((zArr == null || !zArr[c11221eM12443e.f33968Z]) && c11221eM12443e != c11221e && (((i10 = c11221eM12443e.f33978x0) == 3 || i10 == 4) && fM12444f < f10)) {
                    f10 = fM12444f;
                    c11221e2 = c11221eM12443e;
                }
            }
        }
        return c11221e2;
    }

    /* JADX INFO: renamed from: g */
    public final void m12453g(C11221e c11221e) {
        C11221e c11221e2 = this.f33941a;
        if (c11221e2 != null) {
            this.f33944d.m12445g(c11221e2, -1.0f);
            this.f33941a.f33969o0 = -1;
            this.f33941a = null;
        }
        float fM12446h = this.f33944d.m12446h(c11221e, true) * (-1.0f);
        this.f33941a = c11221e;
        if (fM12446h == 1.0f) {
            return;
        }
        this.f33942b /= fM12446h;
        C11217a c11217a = this.f33944d;
        int i10 = c11217a.f33938h;
        for (int i11 = 0; i10 != -1 && i11 < c11217a.f33931a; i11++) {
            float[] fArr = c11217a.f33937g;
            fArr[i10] = fArr[i10] / fM12446h;
            i10 = c11217a.f33936f[i10];
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m12454h(C11219c c11219c, C11221e c11221e, boolean z6) {
        if (c11221e == null || !c11221e.f33972r0) {
            return;
        }
        float fM12441c = this.f33944d.m12441c(c11221e);
        this.f33942b = (c11221e.f33971q0 * fM12441c) + this.f33942b;
        this.f33944d.m12446h(c11221e, z6);
        if (z6) {
            c11221e.m12479b(this);
        }
        if (this.f33944d.m12442d() == 0) {
            this.f33945e = true;
            c11219c.f33948a = true;
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo12455i(C11219c c11219c, C11218b c11218b, boolean z6) {
        C11217a c11217a = this.f33944d;
        c11217a.getClass();
        float fM12441c = c11217a.m12441c(c11218b.f33941a);
        c11217a.m12446h(c11218b.f33941a, z6);
        C11217a c11217a2 = c11218b.f33944d;
        int iM12442d = c11217a2.m12442d();
        for (int i10 = 0; i10 < iM12442d; i10++) {
            C11221e c11221eM12443e = c11217a2.m12443e(i10);
            c11217a.m12439a(c11221eM12443e, c11217a2.m12441c(c11221eM12443e) * fM12441c, z6);
        }
        this.f33942b = (c11218b.f33942b * fM12441c) + this.f33942b;
        if (z6) {
            c11218b.f33941a.m12479b(this);
        }
        if (this.f33941a == null || this.f33944d.m12442d() != 0) {
            return;
        }
        this.f33945e = true;
        c11219c.f33948a = true;
    }

    public String toString() {
        boolean z6;
        String strM11052j = AbstractC10763a.m11052j(this.f33941a == null ? WebrtcBuildVersion.maint_version : "" + this.f33941a, " = ");
        if (this.f33942b != 0.0f) {
            StringBuilder sbM9893l = AbstractC9306j0.m9893l(strM11052j);
            sbM9893l.append(this.f33942b);
            strM11052j = sbM9893l.toString();
            z6 = true;
        } else {
            z6 = false;
        }
        int iM12442d = this.f33944d.m12442d();
        for (int i10 = 0; i10 < iM12442d; i10++) {
            C11221e c11221eM12443e = this.f33944d.m12443e(i10);
            if (c11221eM12443e != null) {
                float fM12444f = this.f33944d.m12444f(i10);
                if (fM12444f != 0.0f) {
                    String string = c11221eM12443e.toString();
                    if (z6) {
                        if (fM12444f > 0.0f) {
                            strM11052j = AbstractC10763a.m11052j(strM11052j, " + ");
                        } else {
                            strM11052j = AbstractC10763a.m11052j(strM11052j, " - ");
                            fM12444f *= -1.0f;
                        }
                    } else if (fM12444f < 0.0f) {
                        strM11052j = AbstractC10763a.m11052j(strM11052j, "- ");
                        fM12444f *= -1.0f;
                    }
                    strM11052j = fM12444f == 1.0f ? AbstractC10763a.m11052j(strM11052j, string) : strM11052j + fM12444f + Separators.f31991SP + string;
                    z6 = true;
                }
            }
        }
        return !z6 ? AbstractC10763a.m11052j(strM11052j, "0.0") : strM11052j;
    }
}
