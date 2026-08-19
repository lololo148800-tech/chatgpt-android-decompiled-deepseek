package p926of;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: of.F */
/* JADX INFO: loaded from: classes3.dex */
public final class C18143F implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final String f57885a;

    public C18143F(String messageId) {
        AbstractC16544l.m18094g(messageId, "messageId");
        this.f57885a = messageId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18143F) {
            return AbstractC16544l.m18089b(this.f57885a, ((C18143F) obj).f57885a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f57885a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
