package p706df;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: df.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C13093m implements InterfaceC13096p {

    /* JADX INFO: renamed from: a */
    public final String f41587a;

    /* JADX INFO: renamed from: b */
    public final String f41588b;

    public C13093m(String conversationId, String name) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        AbstractC16544l.m18094g(name, "name");
        this.f41587a = conversationId;
        this.f41588b = name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13093m)) {
            return false;
        }
        C13093m c13093m = (C13093m) obj;
        return AbstractC16544l.m18089b(this.f41587a, c13093m.f41587a) && AbstractC16544l.m18089b(this.f41588b, c13093m.f41588b);
    }

    public final int hashCode() {
        return this.f41588b.hashCode() + (this.f41587a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
