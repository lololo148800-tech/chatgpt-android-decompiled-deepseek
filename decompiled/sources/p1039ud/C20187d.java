package p1039ud;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ud.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C20187d implements InterfaceC20190g {

    /* JADX INFO: renamed from: a */
    public final String f63933a;

    public C20187d(String query) {
        AbstractC16544l.m18094g(query, "query");
        this.f63933a = query;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20187d) && AbstractC16544l.m18089b(this.f63933a, ((C20187d) obj).f63933a);
    }

    public final int hashCode() {
        return this.f63933a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
