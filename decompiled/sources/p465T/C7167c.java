package p465T;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.opengl.EGLSurface;

/* JADX INFO: renamed from: T.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7167c {

    /* JADX INFO: renamed from: a */
    public final EGLSurface f22781a;

    /* JADX INFO: renamed from: b */
    public final int f22782b;

    /* JADX INFO: renamed from: c */
    public final int f22783c;

    public C7167c(EGLSurface eGLSurface, int i10, int i11) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f22781a = eGLSurface;
        this.f22782b = i10;
        this.f22783c = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7167c)) {
            return false;
        }
        C7167c c7167c = (C7167c) obj;
        return this.f22781a.equals(c7167c.f22781a) && this.f22782b == c7167c.f22782b && this.f22783c == c7167c.f22783c;
    }

    public final int hashCode() {
        return ((((this.f22781a.hashCode() ^ 1000003) * 1000003) ^ this.f22782b) * 1000003) ^ this.f22783c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutputSurface{eglSurface=");
        sb2.append(this.f22781a);
        sb2.append(", width=");
        sb2.append(this.f22782b);
        sb2.append(", height=");
        return AbstractC10763a.m11056n(sb2, this.f22783c, "}");
    }
}
