package p283L5;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1071w0.AbstractC20734X;

/* JADX INFO: renamed from: L5.t */
/* JADX INFO: loaded from: classes.dex */
public final class C4954t {

    /* JADX INFO: renamed from: a */
    public final String f16158a;

    /* JADX INFO: renamed from: b */
    public final String f16159b;

    /* JADX INFO: renamed from: c */
    public final C4953s f16160c;

    public C4954t(String str, String str2, C4953s c4953s) {
        this.f16158a = str;
        this.f16159b = str2;
        this.f16160c = c4953s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4954t)) {
            return false;
        }
        C4954t c4954t = (C4954t) obj;
        return AbstractC16544l.m18089b(this.f16158a, c4954t.f16158a) && AbstractC16544l.m18089b(this.f16159b, c4954t.f16159b) && AbstractC16544l.m18089b(this.f16160c, c4954t.f16160c) && AbstractC16544l.m18089b(null, null);
    }

    public final int hashCode() {
        return AbstractC20734X.m21250u(AbstractC0168G.m527p(this.f16158a.hashCode() * 31, 31, this.f16159b), 31, this.f16160c.f16157a);
    }

    public final String toString() {
        return "NetworkRequest(url=" + this.f16158a + ", method=" + this.f16159b + ", headers=" + this.f16160c + ", body=null)";
    }
}
