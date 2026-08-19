package p706df;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: df.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C13090j implements InterfaceC13096p {

    /* JADX INFO: renamed from: a */
    public final String f41584a;

    public C13090j(String conversationId) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        this.f41584a = conversationId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13090j) {
            return AbstractC16544l.m18089b(this.f41584a, ((C13090j) obj).f41584a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41584a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
