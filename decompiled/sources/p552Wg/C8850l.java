package p552Wg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Wg.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C8850l implements InterfaceC8855q {

    /* JADX INFO: renamed from: a */
    public final String f27105a;

    public C8850l(String shareId) {
        AbstractC16544l.m18094g(shareId, "shareId");
        this.f27105a = shareId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8850l) && AbstractC16544l.m18089b(this.f27105a, ((C8850l) obj).f27105a);
    }

    public final int hashCode() {
        return this.f27105a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
