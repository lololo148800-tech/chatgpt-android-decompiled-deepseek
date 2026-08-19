package p615Z6;

import cn.UfGr.EhBykzn;
import p001A.AbstractC0010F;
import p279L1.VOxZ.sVoFrD;

/* JADX INFO: renamed from: Z6.D */
/* JADX INFO: loaded from: classes.dex */
public final class C10173D implements Cloneable {

    /* JADX INFO: renamed from: Y */
    public final float f30117Y;

    /* JADX INFO: renamed from: Z */
    public final int f30118Z;

    public C10173D(int i10, float f10) {
        this.f30117Y = f10;
        this.f30118Z = i10;
    }

    /* JADX INFO: renamed from: a */
    public final float m10765a(C10252z0 c10252z0) {
        float fSqrt;
        if (this.f30118Z != 9) {
            return m10768d(c10252z0);
        }
        C10248x0 c10248x0 = (C10248x0) c10252z0.f30456o0;
        C10235r c10235r = c10248x0.f30438g;
        if (c10235r == null) {
            c10235r = c10248x0.f30437f;
        }
        float f10 = this.f30117Y;
        if (c10235r == null) {
            return f10;
        }
        float f11 = c10235r.f30392d;
        float f12 = c10235r.f30393e;
        if (f11 == f12) {
            fSqrt = f10 * f11;
        } else {
            fSqrt = f10 * ((float) (Math.sqrt((f12 * f12) + (f11 * f11)) / 1.414213562373095d));
        }
        return fSqrt / 100.0f;
    }

    /* JADX INFO: renamed from: b */
    public final float m10766b(C10252z0 c10252z0, float f10) {
        return this.f30118Z == 9 ? (this.f30117Y * f10) / 100.0f : m10768d(c10252z0);
    }

    /* JADX INFO: renamed from: c */
    public final float m10767c() {
        float f10;
        float f11;
        int iM24h = AbstractC0010F.m24h(this.f30118Z);
        float f12 = this.f30117Y;
        if (iM24h == 0) {
            return f12;
        }
        if (iM24h == 3) {
            return f12 * 96.0f;
        }
        if (iM24h == 4) {
            f10 = f12 * 96.0f;
            f11 = 2.54f;
        } else if (iM24h == 5) {
            f10 = f12 * 96.0f;
            f11 = 25.4f;
        } else if (iM24h == 6) {
            f10 = f12 * 96.0f;
            f11 = 72.0f;
        } else {
            if (iM24h != 7) {
                return f12;
            }
            f10 = f12 * 96.0f;
            f11 = 6.0f;
        }
        return f10 / f11;
    }

    /* JADX INFO: renamed from: d */
    public final float m10768d(C10252z0 c10252z0) {
        float f10;
        float f11;
        int iM24h = AbstractC0010F.m24h(this.f30118Z);
        float f12 = this.f30117Y;
        switch (iM24h) {
            case 1:
                return ((C10248x0) c10252z0.f30456o0).f30435d.getTextSize() * f12;
            case 2:
                return (((C10248x0) c10252z0.f30456o0).f30435d.getTextSize() / 2.0f) * f12;
            case 3:
                c10252z0.getClass();
                return f12 * 96.0f;
            case 4:
                c10252z0.getClass();
                f10 = f12 * 96.0f;
                f11 = 2.54f;
                break;
            case 5:
                c10252z0.getClass();
                f10 = f12 * 96.0f;
                f11 = 25.4f;
                break;
            case 6:
                c10252z0.getClass();
                f10 = f12 * 96.0f;
                f11 = 72.0f;
                break;
            case 7:
                c10252z0.getClass();
                f10 = f12 * 96.0f;
                f11 = 6.0f;
                break;
            case 8:
                C10248x0 c10248x0 = (C10248x0) c10252z0.f30456o0;
                C10235r c10235r = c10248x0.f30438g;
                if (c10235r == null) {
                    c10235r = c10248x0.f30437f;
                }
                if (c10235r == null) {
                    return f12;
                }
                f10 = f12 * c10235r.f30392d;
                f11 = 100.0f;
                break;
            default:
                return f12;
        }
        return f10 / f11;
    }

    /* JADX INFO: renamed from: e */
    public final float m10769e(C10252z0 c10252z0) {
        if (this.f30118Z != 9) {
            return m10768d(c10252z0);
        }
        C10248x0 c10248x0 = (C10248x0) c10252z0.f30456o0;
        C10235r c10235r = c10248x0.f30438g;
        if (c10235r == null) {
            c10235r = c10248x0.f30437f;
        }
        float f10 = this.f30117Y;
        return c10235r == null ? f10 : (f10 * c10235r.f30393e) / 100.0f;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10770f() {
        return this.f30117Y < 0.0f;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m10771g() {
        return this.f30117Y == 0.0f;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f30117Y));
        switch (this.f30118Z) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = EhBykzn.kEEDSFANhUgRhHf;
                break;
            case 8:
                str = "pc";
                break;
            case 9:
                str = sVoFrD.zJJ;
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public C10173D(float f10) {
        this.f30117Y = f10;
        this.f30118Z = 1;
    }
}
