package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p040Bd.C0937I1;

/* JADX INFO: renamed from: of.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C18185v implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final String f57999a;

    /* JADX INFO: renamed from: b */
    public final C0937I1 f58000b;

    public C18185v(String messageId, C0937I1 c0937i1) {
        AbstractC16544l.m18094g(messageId, "messageId");
        this.f57999a = messageId;
        this.f58000b = c0937i1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18185v)) {
            return false;
        }
        C18185v c18185v = (C18185v) obj;
        return AbstractC16544l.m18089b(this.f57999a, c18185v.f57999a) && AbstractC16544l.m18089b(this.f58000b, c18185v.f58000b);
    }

    public final int hashCode() {
        return this.f58000b.hashCode() + (this.f57999a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
