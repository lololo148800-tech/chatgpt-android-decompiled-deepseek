package p124Ei;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.C22057s2;

/* JADX INFO: renamed from: Ei.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2525l0 implements InterfaceC2548v0 {

    /* JADX INFO: renamed from: a */
    public final C22057s2 f7844a;

    public C2525l0(C22057s2 disclosureMessage) {
        AbstractC16544l.m18094g(disclosureMessage, "disclosureMessage");
        this.f7844a = disclosureMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2525l0) && AbstractC16544l.m18089b(this.f7844a, ((C2525l0) obj).f7844a);
    }

    public final int hashCode() {
        return this.f7844a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
