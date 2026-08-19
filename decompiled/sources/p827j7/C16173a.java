package p827j7;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8531O3;

/* JADX INFO: renamed from: j7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16173a extends AbstractC8531O3 {

    /* JADX INFO: renamed from: a */
    public final String f50204a;

    /* JADX INFO: renamed from: b */
    public final Throwable f50205b;

    /* JADX INFO: renamed from: c */
    public final long f50206c;

    /* JADX INFO: renamed from: d */
    public final String f50207d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f50208e;

    public C16173a(String str, Throwable throwable, long j10, String message, ArrayList arrayList) {
        AbstractC16544l.m18094g(throwable, "throwable");
        AbstractC16544l.m18094g(message, "message");
        this.f50204a = str;
        this.f50205b = throwable;
        this.f50206c = j10;
        this.f50207d = message;
        this.f50208e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16173a)) {
            return false;
        }
        C16173a c16173a = (C16173a) obj;
        return this.f50204a.equals(c16173a.f50204a) && AbstractC16544l.m18089b(this.f50205b, c16173a.f50205b) && this.f50206c == c16173a.f50206c && AbstractC16544l.m18089b(this.f50207d, c16173a.f50207d) && this.f50208e.equals(c16173a.f50208e);
    }

    public final int hashCode() {
        int iHashCode = (this.f50205b.hashCode() + (this.f50204a.hashCode() * 31)) * 31;
        long j10 = this.f50206c;
        return this.f50208e.hashCode() + ((((this.f50207d.hashCode() + ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31) + 94921639) * 31);
    }

    public final String toString() {
        return "Logs(threadName=" + this.f50204a + ", throwable=" + this.f50205b + ", timestamp=" + this.f50206c + ", message=" + this.f50207d + ", loggerName=crash, threads=" + this.f50208e + Separators.RPAREN;
    }
}
