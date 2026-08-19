package p963qd;

import kotlin.jvm.internal.AbstractC16544l;
import p324Mn.C5551u;

/* JADX INFO: renamed from: qd.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C18687p {

    /* JADX INFO: renamed from: a */
    public final C5551u f59496a;

    /* JADX INFO: renamed from: b */
    public final boolean f59497b;

    /* JADX INFO: renamed from: c */
    public final String f59498c;

    public C18687p(C5551u c5551u, boolean z6, String sharedConversationId) {
        AbstractC16544l.m18094g(sharedConversationId, "sharedConversationId");
        this.f59496a = c5551u;
        this.f59497b = z6;
        this.f59498c = sharedConversationId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18687p)) {
            return false;
        }
        C18687p c18687p = (C18687p) obj;
        return AbstractC16544l.m18089b(this.f59496a, c18687p.f59496a) && this.f59497b == c18687p.f59497b && AbstractC16544l.m18089b(this.f59498c, c18687p.f59498c);
    }

    public final int hashCode() {
        C5551u c5551u = this.f59496a;
        return this.f59498c.hashCode() + ((((c5551u == null ? 0 : c5551u.f18004Y.hashCode()) * 31) + (this.f59497b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
