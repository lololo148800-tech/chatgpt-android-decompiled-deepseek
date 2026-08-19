package ge;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ge.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C14025F implements InterfaceC14052T {

    /* JADX INFO: renamed from: a */
    public final String f44112a;

    public C14025F(String conversationId) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        this.f44112a = conversationId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14025F) {
            return AbstractC16544l.m18089b(this.f44112a, ((C14025F) obj).f44112a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44112a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
