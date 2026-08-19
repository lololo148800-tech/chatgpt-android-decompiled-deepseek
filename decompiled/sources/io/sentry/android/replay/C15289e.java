package io.sentry.android.replay;

import io.sentry.EnumC15527z1;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: io.sentry.android.replay.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C15289e {

    /* JADX INFO: renamed from: a */
    public final C15304r f47755a;

    /* JADX INFO: renamed from: b */
    public final C15294h f47756b;

    /* JADX INFO: renamed from: c */
    public final Date f47757c;

    /* JADX INFO: renamed from: d */
    public final int f47758d;

    /* JADX INFO: renamed from: e */
    public final long f47759e;

    /* JADX INFO: renamed from: f */
    public final EnumC15527z1 f47760f;

    /* JADX INFO: renamed from: g */
    public final String f47761g;

    /* JADX INFO: renamed from: h */
    public final List f47762h;

    public C15289e(C15304r c15304r, C15294h c15294h, Date date, int i10, long j10, EnumC15527z1 enumC15527z1, String str, List list) {
        this.f47755a = c15304r;
        this.f47756b = c15294h;
        this.f47757c = date;
        this.f47758d = i10;
        this.f47759e = j10;
        this.f47760f = enumC15527z1;
        this.f47761g = str;
        this.f47762h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15289e)) {
            return false;
        }
        C15289e c15289e = (C15289e) obj;
        return AbstractC16544l.m18089b(this.f47755a, c15289e.f47755a) && AbstractC16544l.m18089b(this.f47756b, c15289e.f47756b) && AbstractC16544l.m18089b(this.f47757c, c15289e.f47757c) && this.f47758d == c15289e.f47758d && this.f47759e == c15289e.f47759e && this.f47760f == c15289e.f47760f && AbstractC16544l.m18089b(this.f47761g, c15289e.f47761g) && AbstractC16544l.m18089b(this.f47762h, c15289e.f47762h);
    }

    public final int hashCode() {
        int iHashCode = (((this.f47757c.hashCode() + ((this.f47756b.hashCode() + (this.f47755a.hashCode() * 31)) * 31)) * 31) + this.f47758d) * 31;
        long j10 = this.f47759e;
        int iHashCode2 = (this.f47760f.hashCode() + ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31;
        String str = this.f47761g;
        return this.f47762h.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "LastSegmentData(recorderConfig=" + this.f47755a + ", cache=" + this.f47756b + ", timestamp=" + this.f47757c + ", id=" + this.f47758d + ", duration=" + this.f47759e + ", replayType=" + this.f47760f + ", screenAtStart=" + this.f47761g + ", events=" + this.f47762h + ')';
    }
}
