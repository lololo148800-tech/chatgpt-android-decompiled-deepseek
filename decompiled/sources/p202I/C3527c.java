package p202I;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p414R.C6772f;

/* JADX INFO: renamed from: I.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3527c {

    /* JADX INFO: renamed from: a */
    public final C6772f f10664a;

    /* JADX INFO: renamed from: b */
    public final C6772f f10665b;

    /* JADX INFO: renamed from: c */
    public final int f10666c;

    /* JADX INFO: renamed from: d */
    public final int f10667d;

    public C3527c(C6772f c6772f, C6772f c6772f2, int i10, int i11) {
        this.f10664a = c6772f;
        this.f10665b = c6772f2;
        this.f10666c = i10;
        this.f10667d = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3527c)) {
            return false;
        }
        C3527c c3527c = (C3527c) obj;
        return this.f10664a.equals(c3527c.f10664a) && this.f10665b.equals(c3527c.f10665b) && this.f10666c == c3527c.f10666c && this.f10667d == c3527c.f10667d;
    }

    public final int hashCode() {
        return ((((((this.f10664a.hashCode() ^ 1000003) * 1000003) ^ this.f10665b.hashCode()) * 1000003) ^ this.f10666c) * 1000003) ^ this.f10667d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("In{edge=");
        sb2.append(this.f10664a);
        sb2.append(", postviewEdge=");
        sb2.append(this.f10665b);
        sb2.append(", inputFormat=");
        sb2.append(this.f10666c);
        sb2.append(", outputFormat=");
        return AbstractC10763a.m11056n(sb2, this.f10667d, "}");
    }
}
