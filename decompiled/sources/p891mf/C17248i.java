package p891mf;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: mf.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C17248i {

    /* JADX INFO: renamed from: a */
    public final String f55030a;

    /* JADX INFO: renamed from: b */
    public final boolean f55031b;

    /* JADX INFO: renamed from: c */
    public final String f55032c;

    public C17248i(String title, String str, boolean z6) {
        AbstractC16544l.m18094g(title, "title");
        this.f55030a = title;
        this.f55031b = z6;
        this.f55032c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17248i)) {
            return false;
        }
        C17248i c17248i = (C17248i) obj;
        return AbstractC16544l.m18089b(this.f55030a, c17248i.f55030a) && this.f55031b == c17248i.f55031b && AbstractC16544l.m18089b(this.f55032c, c17248i.f55032c);
    }

    public final int hashCode() {
        int iHashCode = ((this.f55030a.hashCode() * 31) + (this.f55031b ? 1231 : 1237)) * 31;
        String str = this.f55032c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
