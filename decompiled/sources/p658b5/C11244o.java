package p658b5;

import com.google.protobuf.AbstractC12107L1;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p444S4.C6998d;
import p444S4.C7001g;
import p444S4.EnumC7019y;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: b5.o */
/* JADX INFO: loaded from: classes.dex */
public final class C11244o {

    /* JADX INFO: renamed from: a */
    public final String f34023a;

    /* JADX INFO: renamed from: b */
    public final EnumC7019y f34024b;

    /* JADX INFO: renamed from: c */
    public final C7001g f34025c;

    /* JADX INFO: renamed from: d */
    public final long f34026d;

    /* JADX INFO: renamed from: e */
    public final long f34027e;

    /* JADX INFO: renamed from: f */
    public final long f34028f;

    /* JADX INFO: renamed from: g */
    public final C6998d f34029g;

    /* JADX INFO: renamed from: h */
    public final int f34030h;

    /* JADX INFO: renamed from: i */
    public final int f34031i;

    /* JADX INFO: renamed from: j */
    public final long f34032j;

    /* JADX INFO: renamed from: k */
    public final long f34033k;

    /* JADX INFO: renamed from: l */
    public final int f34034l;

    /* JADX INFO: renamed from: m */
    public final int f34035m;

    /* JADX INFO: renamed from: n */
    public final long f34036n;

    /* JADX INFO: renamed from: o */
    public final int f34037o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f34038p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f34039q;

    public C11244o(String id2, EnumC7019y enumC7019y, C7001g c7001g, long j10, long j11, long j12, C6998d c6998d, int i10, int i11, long j13, long j14, int i12, int i13, long j15, int i14, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC14376f.m15825D(i11, "backoffPolicy");
        this.f34023a = id2;
        this.f34024b = enumC7019y;
        this.f34025c = c7001g;
        this.f34026d = j10;
        this.f34027e = j11;
        this.f34028f = j12;
        this.f34029g = c6998d;
        this.f34030h = i10;
        this.f34031i = i11;
        this.f34032j = j13;
        this.f34033k = j14;
        this.f34034l = i12;
        this.f34035m = i13;
        this.f34036n = j15;
        this.f34037o = i14;
        this.f34038p = arrayList;
        this.f34039q = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11244o)) {
            return false;
        }
        C11244o c11244o = (C11244o) obj;
        return AbstractC16544l.m18089b(this.f34023a, c11244o.f34023a) && this.f34024b == c11244o.f34024b && this.f34025c.equals(c11244o.f34025c) && this.f34026d == c11244o.f34026d && this.f34027e == c11244o.f34027e && this.f34028f == c11244o.f34028f && this.f34029g.equals(c11244o.f34029g) && this.f34030h == c11244o.f34030h && this.f34031i == c11244o.f34031i && this.f34032j == c11244o.f34032j && this.f34033k == c11244o.f34033k && this.f34034l == c11244o.f34034l && this.f34035m == c11244o.f34035m && this.f34036n == c11244o.f34036n && this.f34037o == c11244o.f34037o && this.f34038p.equals(c11244o.f34038p) && this.f34039q.equals(c11244o.f34039q);
    }

    public final int hashCode() {
        int iHashCode = (this.f34025c.hashCode() + ((this.f34024b.hashCode() + (this.f34023a.hashCode() * 31)) * 31)) * 31;
        long j10 = this.f34026d;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f34027e;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f34028f;
        int iM13820k = AbstractC12107L1.m13820k(this.f34031i, (((this.f34029g.hashCode() + ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f34030h) * 31, 31);
        long j13 = this.f34032j;
        int i12 = (iM13820k + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f34033k;
        int i13 = (((((i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f34034l) * 31) + this.f34035m) * 31;
        long j15 = this.f34036n;
        return this.f34039q.hashCode() + ((this.f34038p.hashCode() + ((((i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + this.f34037o) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("WorkInfoPojo(id=");
        sb2.append(this.f34023a);
        sb2.append(", state=");
        sb2.append(this.f34024b);
        sb2.append(", output=");
        sb2.append(this.f34025c);
        sb2.append(YladLSetV.xwOgolnOu);
        sb2.append(this.f34026d);
        sb2.append(", intervalDuration=");
        sb2.append(this.f34027e);
        sb2.append(", flexDuration=");
        sb2.append(this.f34028f);
        sb2.append(", constraints=");
        sb2.append(this.f34029g);
        sb2.append(", runAttemptCount=");
        sb2.append(this.f34030h);
        sb2.append(", backoffPolicy=");
        int i10 = this.f34031i;
        if (i10 != 1) {
            str = i10 != 2 ? "null" : "LINEAR";
        } else {
            str = "EXPONENTIAL";
        }
        sb2.append(str);
        sb2.append(", backoffDelayDuration=");
        sb2.append(this.f34032j);
        sb2.append(", lastEnqueueTime=");
        sb2.append(this.f34033k);
        sb2.append(", periodCount=");
        sb2.append(this.f34034l);
        sb2.append(", generation=");
        sb2.append(this.f34035m);
        sb2.append(", nextScheduleTimeOverride=");
        sb2.append(this.f34036n);
        sb2.append(", stopReason=");
        sb2.append(this.f34037o);
        sb2.append(", tags=");
        sb2.append(this.f34038p);
        sb2.append(", progress=");
        sb2.append(this.f34039q);
        sb2.append(')');
        return sb2.toString();
    }
}
