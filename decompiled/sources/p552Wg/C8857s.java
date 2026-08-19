package p552Wg;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2052a;

/* JADX INFO: renamed from: Wg.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C8857s implements InterfaceC2052a {

    /* JADX INFO: renamed from: a */
    public final String f27120a;

    /* JADX INFO: renamed from: b */
    public final String f27121b;

    public C8857s(String sharedId, String conversationId) {
        AbstractC16544l.m18094g(sharedId, "sharedId");
        AbstractC16544l.m18094g(conversationId, "conversationId");
        this.f27120a = sharedId;
        this.f27121b = conversationId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8857s)) {
            return false;
        }
        C8857s c8857s = (C8857s) obj;
        return AbstractC16544l.m18089b(this.f27120a, c8857s.f27120a) && AbstractC16544l.m18089b(this.f27121b, c8857s.f27121b);
    }

    public final int hashCode() {
        return this.f27121b.hashCode() + (this.f27120a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
