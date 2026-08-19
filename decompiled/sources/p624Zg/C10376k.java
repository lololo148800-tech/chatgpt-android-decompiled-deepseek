package p624Zg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Zg.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C10376k {

    /* JADX INFO: renamed from: a */
    public final String f30747a;

    /* JADX INFO: renamed from: b */
    public final String f30748b;

    public C10376k(String text, String str) {
        AbstractC16544l.m18094g(text, "text");
        this.f30747a = text;
        this.f30748b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10376k)) {
            return false;
        }
        C10376k c10376k = (C10376k) obj;
        return AbstractC16544l.m18089b(this.f30747a, c10376k.f30747a) && AbstractC16544l.m18089b(this.f30748b, c10376k.f30748b);
    }

    public final int hashCode() {
        return this.f30748b.hashCode() + (this.f30747a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
