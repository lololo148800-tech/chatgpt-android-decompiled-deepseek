package p706df;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: df.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C13089i implements InterfaceC13096p {

    /* JADX INFO: renamed from: a */
    public final String f41583a;

    public C13089i(String conversationId) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        this.f41583a = conversationId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13089i) {
            return AbstractC16544l.m18089b(this.f41583a, ((C13089i) obj).f41583a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41583a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
