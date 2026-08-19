package p044Bh;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: Bh.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C1302o {

    /* JADX INFO: renamed from: a */
    public final String f3435a;

    /* JADX INFO: renamed from: b */
    public final String f3436b;

    /* JADX INFO: renamed from: c */
    public final String f3437c;

    /* JADX INFO: renamed from: d */
    public final String f3438d;

    public C1302o(String str, String requestHash, String str2, String deviceId) {
        AbstractC16544l.m18094g(requestHash, "requestHash");
        AbstractC16544l.m18094g(deviceId, "deviceId");
        this.f3435a = str;
        this.f3436b = requestHash;
        this.f3437c = str2;
        this.f3438d = deviceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1302o)) {
            return false;
        }
        C1302o c1302o = (C1302o) obj;
        return AbstractC16544l.m18089b(this.f3435a, c1302o.f3435a) && AbstractC16544l.m18089b(this.f3436b, c1302o.f3436b) && AbstractC16544l.m18089b(this.f3437c, c1302o.f3437c) && AbstractC16544l.m18089b(this.f3438d, c1302o.f3438d);
    }

    public final int hashCode() {
        return this.f3438d.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(this.f3435a.hashCode() * 31, 31, this.f3436b), 31, this.f3437c);
    }

    public final String toString() {
        return "█";
    }
}
