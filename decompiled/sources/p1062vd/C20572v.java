package p1062vd;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: vd.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C20572v implements InterfaceC20576z {

    /* JADX INFO: renamed from: a */
    public final String f65300a;

    public C20572v(String remoteConversationId) {
        AbstractC16544l.m18094g(remoteConversationId, "remoteConversationId");
        this.f65300a = remoteConversationId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20572v) {
            return AbstractC16544l.m18089b(this.f65300a, ((C20572v) obj).f65300a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f65300a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
