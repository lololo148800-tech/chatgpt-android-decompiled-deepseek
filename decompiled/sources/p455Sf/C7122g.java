package p455Sf;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Sf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C7122g {

    /* JADX INFO: renamed from: a */
    public final String f22669a;

    /* JADX INFO: renamed from: b */
    public final String f22670b;

    /* JADX INFO: renamed from: c */
    public final String f22671c;

    public C7122g(String title, String str, String conversationId) {
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(conversationId, "conversationId");
        this.f22669a = title;
        this.f22670b = str;
        this.f22671c = conversationId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7122g)) {
            return false;
        }
        C7122g c7122g = (C7122g) obj;
        return AbstractC16544l.m18089b(this.f22669a, c7122g.f22669a) && AbstractC16544l.m18089b(this.f22670b, c7122g.f22670b) && AbstractC16544l.m18089b(this.f22671c, c7122g.f22671c);
    }

    public final int hashCode() {
        int iHashCode = this.f22669a.hashCode() * 31;
        String str = this.f22670b;
        return this.f22671c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "█";
    }
}
