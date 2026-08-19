package p202I;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p414R.C6768b;

/* JADX INFO: renamed from: I.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3526b {

    /* JADX INFO: renamed from: a */
    public final C6768b f10662a;

    /* JADX INFO: renamed from: b */
    public final int f10663b;

    public C3526b(C6768b c6768b, int i10) {
        if (c6768b == null) {
            throw new NullPointerException("Null packet");
        }
        this.f10662a = c6768b;
        this.f10663b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3526b)) {
            return false;
        }
        C3526b c3526b = (C3526b) obj;
        return this.f10662a.equals(c3526b.f10662a) && this.f10663b == c3526b.f10663b;
    }

    public final int hashCode() {
        return ((this.f10662a.hashCode() ^ 1000003) * 1000003) ^ this.f10663b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("In{packet=");
        sb2.append(this.f10662a);
        sb2.append(", jpegQuality=");
        return AbstractC10763a.m11056n(sb2, this.f10663b, "}");
    }
}
