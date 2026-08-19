package p202I;

import android.util.Size;
import p001A.C0005C0;
import p178H.C3162o0;
import p228J.AbstractC3842j;
import p414R.C6772f;
import p806ia.nJAW.FpwNpGDhomXHZ;

/* JADX INFO: renamed from: I.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3525a {

    /* JADX INFO: renamed from: b */
    public C3162o0 f10654b;

    /* JADX INFO: renamed from: d */
    public final Size f10656d;

    /* JADX INFO: renamed from: e */
    public final int f10657e;

    /* JADX INFO: renamed from: f */
    public final int f10658f;

    /* JADX INFO: renamed from: g */
    public final boolean f10659g;

    /* JADX INFO: renamed from: h */
    public final C6772f f10660h;

    /* JADX INFO: renamed from: i */
    public final C6772f f10661i;

    /* JADX INFO: renamed from: a */
    public AbstractC3842j f10653a = new C0005C0(1);

    /* JADX INFO: renamed from: c */
    public final C3162o0 f10655c = null;

    public C3525a(Size size, int i10, int i11, boolean z6, C6772f c6772f, C6772f c6772f2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f10656d = size;
        this.f10657e = i10;
        this.f10658f = i11;
        this.f10659g = z6;
        this.f10660h = c6772f;
        this.f10661i = c6772f2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3525a)) {
            return false;
        }
        C3525a c3525a = (C3525a) obj;
        return this.f10656d.equals(c3525a.f10656d) && this.f10657e == c3525a.f10657e && this.f10658f == c3525a.f10658f && this.f10659g == c3525a.f10659g && this.f10660h.equals(c3525a.f10660h) && this.f10661i.equals(c3525a.f10661i);
    }

    public final int hashCode() {
        return ((((((((((((this.f10656d.hashCode() ^ 1000003) * 1000003) ^ this.f10657e) * 1000003) ^ this.f10658f) * 1000003) ^ (this.f10659g ? 1231 : 1237)) * 583896283) ^ 35) * 1000003) ^ this.f10660h.hashCode()) * 1000003) ^ this.f10661i.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f10656d + ", inputFormat=" + this.f10657e + ", outputFormat=" + this.f10658f + FpwNpGDhomXHZ.heiEDYSuSi + this.f10659g + ", imageReaderProxyProvider=null, postviewSize=null, postviewImageFormat=35, requestEdge=" + this.f10660h + ", errorEdge=" + this.f10661i + "}";
    }
}
