package p891mf;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: mf.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C17244e implements InterfaceC17246g {

    /* JADX INFO: renamed from: a */
    public final String f55023a;

    public C17244e(String jawboneId) {
        AbstractC16544l.m18094g(jawboneId, "jawboneId");
        this.f55023a = jawboneId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17244e) {
            return AbstractC16544l.m18089b(this.f55023a, ((C17244e) obj).f55023a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f55023a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
