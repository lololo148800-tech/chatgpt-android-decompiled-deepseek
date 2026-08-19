package p722e8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.l */
/* JADX INFO: loaded from: classes.dex */
public final class C13328l extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final long f42292b;

    /* JADX INFO: renamed from: c */
    public final String f42293c;

    /* JADX INFO: renamed from: d */
    public final C11691c f42294d;

    public C13328l(long j10, String target) {
        C11691c c11691c = new C11691c();
        AbstractC16544l.m18094g(target, "target");
        this.f42292b = j10;
        this.f42293c = target;
        this.f42294d = c11691c;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42294d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13328l)) {
            return false;
        }
        C13328l c13328l = (C13328l) obj;
        return this.f42292b == c13328l.f42292b && AbstractC16544l.m18089b(this.f42293c, c13328l.f42293c) && AbstractC16544l.m18089b(this.f42294d, c13328l.f42294d);
    }

    public final int hashCode() {
        long j10 = this.f42292b;
        return this.f42294d.hashCode() + AbstractC0168G.m527p(((int) (j10 ^ (j10 >>> 32))) * 31, 31, this.f42293c);
    }

    public final String toString() {
        return "AddLongTask(durationNs=" + this.f42292b + ", target=" + this.f42293c + ", eventTime=" + this.f42294d + Separators.RPAREN;
    }
}
