package p722e8;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p523V9.AbstractC8119j5;
import p677c8.C11691c;

/* JADX INFO: renamed from: e8.m */
/* JADX INFO: loaded from: classes.dex */
public final class C13329m extends AbstractC8119j5 {

    /* JADX INFO: renamed from: b */
    public final C11691c f42295b;

    /* JADX INFO: renamed from: c */
    public final long f42296c;

    public C13329m(C11691c c11691c, long j10) {
        this.f42295b = c11691c;
        this.f42296c = j10;
    }

    @Override // p523V9.AbstractC8119j5
    /* JADX INFO: renamed from: a */
    public final C11691c mo8622a() {
        return this.f42295b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13329m)) {
            return false;
        }
        C13329m c13329m = (C13329m) obj;
        return AbstractC16544l.m18089b(this.f42295b, c13329m.f42295b) && this.f42296c == c13329m.f42296c;
    }

    public final int hashCode() {
        int iHashCode = this.f42295b.hashCode() * 31;
        long j10 = this.f42296c;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "ApplicationStarted(eventTime=" + this.f42295b + ", applicationStartupNanos=" + this.f42296c + Separators.RPAREN;
    }
}
