package p700d8;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p628Zk.GwZB.tpXhEMGxfXFVSh;

/* JADX INFO: renamed from: d8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13040a {

    /* JADX INFO: renamed from: a */
    public final long f41431a;

    /* JADX INFO: renamed from: b */
    public final long f41432b;

    /* JADX INFO: renamed from: c */
    public final long f41433c;

    /* JADX INFO: renamed from: d */
    public final long f41434d;

    /* JADX INFO: renamed from: e */
    public final long f41435e;

    /* JADX INFO: renamed from: f */
    public final long f41436f;

    /* JADX INFO: renamed from: g */
    public final long f41437g;

    /* JADX INFO: renamed from: h */
    public final long f41438h;

    /* JADX INFO: renamed from: i */
    public final long f41439i;

    /* JADX INFO: renamed from: j */
    public final long f41440j;

    public C13040a(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.f41431a = j10;
        this.f41432b = j11;
        this.f41433c = j12;
        this.f41434d = j13;
        this.f41435e = j14;
        this.f41436f = j15;
        this.f41437g = j16;
        this.f41438h = j17;
        this.f41439i = j18;
        this.f41440j = j19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13040a)) {
            return false;
        }
        C13040a c13040a = (C13040a) obj;
        return this.f41431a == c13040a.f41431a && this.f41432b == c13040a.f41432b && this.f41433c == c13040a.f41433c && this.f41434d == c13040a.f41434d && this.f41435e == c13040a.f41435e && this.f41436f == c13040a.f41436f && this.f41437g == c13040a.f41437g && this.f41438h == c13040a.f41438h && this.f41439i == c13040a.f41439i && this.f41440j == c13040a.f41440j;
    }

    public final int hashCode() {
        long j10 = this.f41431a;
        long j11 = this.f41432b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f41433c;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f41434d;
        int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f41435e;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f41436f;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f41437g;
        int i15 = (i14 + ((int) (j16 ^ (j16 >>> 32)))) * 31;
        long j17 = this.f41438h;
        int i16 = (i15 + ((int) (j17 ^ (j17 >>> 32)))) * 31;
        long j18 = this.f41439i;
        int i17 = (i16 + ((int) (j18 ^ (j18 >>> 32)))) * 31;
        long j19 = this.f41440j;
        return i17 + ((int) ((j19 >>> 32) ^ j19));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResourceTiming(dnsStart=");
        sb2.append(this.f41431a);
        sb2.append(", dnsDuration=");
        sb2.append(this.f41432b);
        sb2.append(", connectStart=");
        sb2.append(this.f41433c);
        sb2.append(", connectDuration=");
        sb2.append(this.f41434d);
        sb2.append(", sslStart=");
        sb2.append(this.f41435e);
        sb2.append(", sslDuration=");
        sb2.append(this.f41436f);
        sb2.append(", firstByteStart=");
        sb2.append(this.f41437g);
        sb2.append(", firstByteDuration=");
        sb2.append(this.f41438h);
        sb2.append(tpXhEMGxfXFVSh.UOKQZanNDmrPf);
        sb2.append(this.f41439i);
        sb2.append(", downloadDuration=");
        return AbstractC10763a.m11050h(this.f41440j, Separators.RPAREN, sb2);
    }
}
