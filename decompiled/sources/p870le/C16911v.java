package p870le;

import kotlin.jvm.internal.AbstractC16544l;
import p044Bh.C1302o;
import p324Mn.C5551u;

/* JADX INFO: renamed from: le.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C16911v {

    /* JADX INFO: renamed from: a */
    public final C16892l0 f54322a;

    /* JADX INFO: renamed from: b */
    public final C1302o f54323b;

    /* JADX INFO: renamed from: c */
    public final C5551u f54324c;

    /* JADX INFO: renamed from: d */
    public final String f54325d;

    public C16911v(C16892l0 requestHashParameters, C1302o tokenConfig, C5551u timestamp) {
        AbstractC16544l.m18094g(requestHashParameters, "requestHashParameters");
        AbstractC16544l.m18094g(tokenConfig, "tokenConfig");
        AbstractC16544l.m18094g(timestamp, "timestamp");
        this.f54322a = requestHashParameters;
        this.f54323b = tokenConfig;
        this.f54324c = timestamp;
        this.f54325d = tokenConfig.f3437c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16911v)) {
            return false;
        }
        C16911v c16911v = (C16911v) obj;
        return AbstractC16544l.m18089b(this.f54322a, c16911v.f54322a) && AbstractC16544l.m18089b(this.f54323b, c16911v.f54323b) && AbstractC16544l.m18089b(this.f54324c, c16911v.f54324c);
    }

    public final int hashCode() {
        return this.f54324c.f18004Y.hashCode() + ((this.f54323b.hashCode() + (this.f54322a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
