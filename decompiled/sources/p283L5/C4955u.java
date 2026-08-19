package p283L5;

import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.AbstractC20734X;
import p354O5.C6135e;

/* JADX INFO: renamed from: L5.u */
/* JADX INFO: loaded from: classes.dex */
public final class C4955u {

    /* JADX INFO: renamed from: a */
    public final int f16161a;

    /* JADX INFO: renamed from: b */
    public final long f16162b;

    /* JADX INFO: renamed from: c */
    public final long f16163c;

    /* JADX INFO: renamed from: d */
    public final C4953s f16164d;

    /* JADX INFO: renamed from: e */
    public final C6135e f16165e;

    /* JADX INFO: renamed from: f */
    public final Object f16166f;

    public C4955u(int i10, long j10, long j11, C4953s c4953s, C6135e c6135e, Object obj) {
        this.f16161a = i10;
        this.f16162b = j10;
        this.f16163c = j11;
        this.f16164d = c4953s;
        this.f16165e = c6135e;
        this.f16166f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4955u)) {
            return false;
        }
        C4955u c4955u = (C4955u) obj;
        return this.f16161a == c4955u.f16161a && this.f16162b == c4955u.f16162b && this.f16163c == c4955u.f16163c && AbstractC16544l.m18089b(this.f16164d, c4955u.f16164d) && AbstractC16544l.m18089b(this.f16165e, c4955u.f16165e) && AbstractC16544l.m18089b(this.f16166f, c4955u.f16166f);
    }

    public final int hashCode() {
        int i10 = this.f16161a * 31;
        long j10 = this.f16162b;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f16163c;
        int iM21250u = AbstractC20734X.m21250u((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31, 31, this.f16164d.f16157a);
        C6135e c6135e = this.f16165e;
        int iHashCode = (iM21250u + (c6135e == null ? 0 : c6135e.f19995Y.hashCode())) * 31;
        Object obj = this.f16166f;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkResponse(code=" + this.f16161a + ", requestMillis=" + this.f16162b + ", responseMillis=" + this.f16163c + ", headers=" + this.f16164d + ", body=" + this.f16165e + ", delegate=" + this.f16166f + ')';
    }
}
