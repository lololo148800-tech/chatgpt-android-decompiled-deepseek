package p243Jf;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p204I1.C3590f;

/* JADX INFO: renamed from: Jf.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C4336f implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final String f14120a;

    /* JADX INFO: renamed from: b */
    public final C3590f f14121b;

    public C4336f(C3590f c3590f, String messageId) {
        AbstractC16544l.m18094g(messageId, "messageId");
        this.f14120a = messageId;
        this.f14121b = c3590f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4336f)) {
            return false;
        }
        C4336f c4336f = (C4336f) obj;
        return AbstractC16544l.m18089b(this.f14120a, c4336f.f14120a) && AbstractC16544l.m18089b(this.f14121b, c4336f.f14121b);
    }

    public final int hashCode() {
        int iHashCode = this.f14120a.hashCode() * 31;
        C3590f c3590f = this.f14121b;
        return iHashCode + (c3590f == null ? 0 : c3590f.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
