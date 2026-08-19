package p406Qg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Qg.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C6694E implements InterfaceC6699J {

    /* JADX INFO: renamed from: a */
    public final String f21523a;

    public C6694E(String query) {
        AbstractC16544l.m18094g(query, "query");
        this.f21523a = query;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6694E) && AbstractC16544l.m18089b(this.f21523a, ((C6694E) obj).f21523a);
    }

    public final int hashCode() {
        return this.f21523a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
