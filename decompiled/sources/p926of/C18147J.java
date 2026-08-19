package p926of;

import kotlin.jvm.internal.AbstractC16544l;
import p040Bd.C0937I1;

/* JADX INFO: renamed from: of.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C18147J implements InterfaceC18159W {

    /* JADX INFO: renamed from: a */
    public final String f57892a;

    /* JADX INFO: renamed from: b */
    public final C0937I1 f57893b;

    public C18147J(String messageId, C0937I1 c0937i1) {
        AbstractC16544l.m18094g(messageId, "messageId");
        this.f57892a = messageId;
        this.f57893b = c0937i1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18147J)) {
            return false;
        }
        C18147J c18147j = (C18147J) obj;
        return AbstractC16544l.m18089b(this.f57892a, c18147j.f57892a) && AbstractC16544l.m18089b(this.f57893b, c18147j.f57893b);
    }

    public final int hashCode() {
        return this.f57893b.hashCode() + (this.f57892a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
