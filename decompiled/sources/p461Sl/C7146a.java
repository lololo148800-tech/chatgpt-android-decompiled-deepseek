package p461Sl;

import java.util.Date;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Sl.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C7146a {

    /* JADX INFO: renamed from: a */
    public final String f22726a;

    /* JADX INFO: renamed from: b */
    public final String f22727b;

    /* JADX INFO: renamed from: c */
    public final String f22728c;

    /* JADX INFO: renamed from: d */
    public final boolean f22729d;

    /* JADX INFO: renamed from: e */
    public final long f22730e;

    /* JADX INFO: renamed from: f */
    public final long f22731f;

    public C7146a(String str, String str2, String str3, boolean z6, long j10) {
        long time = new Date().getTime();
        this.f22726a = str;
        this.f22727b = str2;
        this.f22728c = str3;
        this.f22729d = z6;
        this.f22730e = j10;
        this.f22731f = time;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7146a)) {
            return false;
        }
        C7146a c7146a = (C7146a) obj;
        return AbstractC16544l.m18089b(this.f22726a, c7146a.f22726a) && AbstractC16544l.m18089b(this.f22727b, c7146a.f22727b) && AbstractC16544l.m18089b(this.f22728c, c7146a.f22728c) && this.f22729d == c7146a.f22729d && this.f22730e == c7146a.f22730e && this.f22731f == c7146a.f22731f;
    }

    public final int hashCode() {
        return this.f22726a.hashCode();
    }

    public final String toString() {
        return "TranscriptionSegment(id=" + this.f22726a + ", text=" + this.f22727b + ", language=" + this.f22728c + ", final=" + this.f22729d + ", firstReceivedTime=" + this.f22730e + ", lastReceivedTime=" + this.f22731f + ')';
    }
}
