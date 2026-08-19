package p919o8;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: o8.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C18030z1 {

    /* JADX INFO: renamed from: a */
    public final C17881A1 f57550a;

    /* JADX INFO: renamed from: b */
    public final C18009s1 f57551b;

    /* JADX INFO: renamed from: c */
    public final String f57552c;

    /* JADX INFO: renamed from: d */
    public final long f57553d;

    /* JADX INFO: renamed from: e */
    public final List f57554e;

    /* JADX INFO: renamed from: f */
    public final C17923O1 f57555f;

    public C18030z1(C17881A1 c17881a1, C18009s1 c18009s1, String str, long j10, List list, C17923O1 c17923o1) {
        this.f57550a = c17881a1;
        this.f57551b = c18009s1;
        this.f57552c = str;
        this.f57553d = j10;
        this.f57554e = list;
        this.f57555f = c17923o1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18030z1)) {
            return false;
        }
        C18030z1 c18030z1 = (C18030z1) obj;
        return AbstractC16544l.m18089b(this.f57550a, c18030z1.f57550a) && AbstractC16544l.m18089b(this.f57551b, c18030z1.f57551b) && AbstractC16544l.m18089b(this.f57552c, c18030z1.f57552c) && this.f57553d == c18030z1.f57553d && AbstractC16544l.m18089b(this.f57554e, c18030z1.f57554e) && AbstractC16544l.m18089b(this.f57555f, c18030z1.f57555f);
    }

    public final int hashCode() {
        C17881A1 c17881a1 = this.f57550a;
        int iHashCode = (c17881a1 == null ? 0 : c17881a1.hashCode()) * 31;
        C18009s1 c18009s1 = this.f57551b;
        int iHashCode2 = (iHashCode + (c18009s1 == null ? 0 : c18009s1.hashCode())) * 31;
        String str = this.f57552c;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j10 = this.f57553d;
        int i10 = (((iHashCode2 + iHashCode3) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        List list = this.f57554e;
        int iHashCode4 = (i10 + (list == null ? 0 : list.hashCode())) * 31;
        C17923O1 c17923o1 = this.f57555f;
        return iHashCode4 + (c17923o1 != null ? c17923o1.hashCode() : 0);
    }

    public final String toString() {
        return "Dd(session=" + this.f57550a + ", configuration=" + this.f57551b + ", browserSdkVersion=" + this.f57552c + ", documentVersion=" + this.f57553d + ", pageStates=" + this.f57554e + ", replayStats=" + this.f57555f + Separators.RPAREN;
    }
}
