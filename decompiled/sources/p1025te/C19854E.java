package p1025te;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: te.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C19854E implements InterfaceC19862M {

    /* JADX INFO: renamed from: a */
    public final String f62946a;

    public C19854E(String url) {
        AbstractC16544l.m18094g(url, "url");
        this.f62946a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19854E) && AbstractC16544l.m18089b(this.f62946a, ((C19854E) obj).f62946a);
    }

    public final int hashCode() {
        return this.f62946a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
