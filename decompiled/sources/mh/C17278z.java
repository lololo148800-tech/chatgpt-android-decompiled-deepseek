package mh;

import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;

/* JADX INFO: renamed from: mh.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C17278z implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17277y f55085a;

    public C17278z(InterfaceC17277y state) {
        AbstractC16544l.m18094g(state, "state");
        this.f55085a = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17278z) && AbstractC16544l.m18089b(this.f55085a, ((C17278z) obj).f55085a);
    }

    public final int hashCode() {
        return this.f55085a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
