package p447S7;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: S7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7028d {

    /* JADX INFO: renamed from: a */
    public final int f22479a;

    /* JADX INFO: renamed from: b */
    public final long f22480b;

    /* JADX INFO: renamed from: c */
    public final Long f22481c;

    /* JADX INFO: renamed from: d */
    public final String f22482d;

    /* JADX INFO: renamed from: e */
    public final String f22483e;

    /* JADX INFO: renamed from: f */
    public final String f22484f;

    public C7028d(int i10, long j10, Long l4, String str, String str2, String str3) {
        this.f22479a = i10;
        this.f22480b = j10;
        this.f22481c = l4;
        this.f22482d = str;
        this.f22483e = str2;
        this.f22484f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7028d)) {
            return false;
        }
        C7028d c7028d = (C7028d) obj;
        return this.f22479a == c7028d.f22479a && this.f22480b == c7028d.f22480b && AbstractC16544l.m18089b(this.f22481c, c7028d.f22481c) && AbstractC16544l.m18089b(this.f22482d, c7028d.f22482d) && AbstractC16544l.m18089b(this.f22483e, c7028d.f22483e) && AbstractC16544l.m18089b(this.f22484f, c7028d.f22484f);
    }

    public final int hashCode() {
        int i10 = this.f22479a * 31;
        long j10 = this.f22480b;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        Long l4 = this.f22481c;
        return this.f22484f.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p((i11 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.f22482d), 31, this.f22483e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NdkCrashLog(signal=");
        sb2.append(this.f22479a);
        sb2.append(", timestamp=");
        sb2.append(this.f22480b);
        sb2.append(", timeSinceAppStartMs=");
        sb2.append(this.f22481c);
        sb2.append(", signalName=");
        sb2.append(this.f22482d);
        sb2.append(", message=");
        sb2.append(this.f22483e);
        sb2.append(", stacktrace=");
        return AbstractC9306j0.m9891j(this.f22484f, Separators.RPAREN, sb2);
    }
}
