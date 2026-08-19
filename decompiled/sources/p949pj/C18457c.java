package p949pj;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;

/* JADX INFO: renamed from: pj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C18457c {

    /* JADX INFO: renamed from: a */
    public final int f58899a;

    /* JADX INFO: renamed from: b */
    public final int f58900b;

    public C18457c(int i10, int i11) {
        this.f58899a = i10;
        this.f58900b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18457c)) {
            return false;
        }
        C18457c c18457c = (C18457c) obj;
        return this.f58899a == c18457c.f58899a && this.f58900b == c18457c.f58900b;
    }

    public final int hashCode() {
        return (((((this.f58899a * 31) + 16) * 31) + 2) * 31) + this.f58900b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioConfiguration(sampleRateInHz=");
        sb2.append(this.f58899a);
        sb2.append(", channelConfig=16, audioFormat=2, bufferSizeInBytes=");
        return AbstractC10763a.m11056n(sb2, this.f58900b, Separators.RPAREN);
    }
}
