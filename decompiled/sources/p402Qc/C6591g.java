package p402Qc;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p381Pe.C6397h;

/* JADX INFO: renamed from: Qc.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C6591g {

    /* JADX INFO: renamed from: a */
    public final String f21293a;

    /* JADX INFO: renamed from: b */
    public final String f21294b;

    /* JADX INFO: renamed from: c */
    public final C6397h f21295c;

    public C6591g(String id2, String conversationId, C6397h messageNode) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(conversationId, "conversationId");
        AbstractC16544l.m18094g(messageNode, "messageNode");
        this.f21293a = id2;
        this.f21294b = conversationId;
        this.f21295c = messageNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6591g)) {
            return false;
        }
        C6591g c6591g = (C6591g) obj;
        return AbstractC16544l.m18089b(this.f21293a, c6591g.f21293a) && AbstractC16544l.m18089b(this.f21294b, c6591g.f21294b) && AbstractC16544l.m18089b(this.f21295c, c6591g.f21295c);
    }

    public final int hashCode() {
        return this.f21295c.hashCode() + AbstractC0168G.m527p(this.f21293a.hashCode() * 31, 31, this.f21294b);
    }

    public final String toString() {
        return "█";
    }
}
