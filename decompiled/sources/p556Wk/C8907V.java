package p556Wk;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: Wk.V */
/* JADX INFO: loaded from: classes3.dex */
public final class C8907V {

    /* JADX INFO: renamed from: a */
    public Long f27258a;

    /* JADX INFO: renamed from: b */
    public Long f27259b;

    /* JADX INFO: renamed from: c */
    public Long f27260c;

    static {
        AbstractC16526C.f51263a.mo5693b(C8907V.class);
        try {
            AbstractC16526C.m18075c(C8907V.class);
        } catch (Throwable unused) {
        }
        if (AbstractC21322p.m21681O("TimeoutConfiguration")) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public C8907V() {
        this.f27258a = 0L;
        this.f27259b = 0L;
        this.f27260c = 0L;
        this.f27258a = null;
        this.f27259b = null;
        this.f27260c = null;
    }

    /* JADX INFO: renamed from: a */
    public static void m9563a(Long l4) {
        if (l4 != null && l4.longValue() <= 0) {
            throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8907V.class != obj.getClass()) {
            return false;
        }
        C8907V c8907v = (C8907V) obj;
        return AbstractC16544l.m18089b(this.f27258a, c8907v.f27258a) && AbstractC16544l.m18089b(this.f27259b, c8907v.f27259b) && AbstractC16544l.m18089b(this.f27260c, c8907v.f27260c);
    }

    public final int hashCode() {
        Long l4 = this.f27258a;
        int iHashCode = (l4 != null ? l4.hashCode() : 0) * 31;
        Long l10 = this.f27259b;
        int iHashCode2 = (iHashCode + (l10 != null ? l10.hashCode() : 0)) * 31;
        Long l11 = this.f27260c;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }
}
